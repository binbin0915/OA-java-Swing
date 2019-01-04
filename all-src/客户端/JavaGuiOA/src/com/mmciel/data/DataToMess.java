package com.mmciel.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataToMess {
	private String id;
	private String text;
	private String time;
	private String from;
	private String up;
	private MysqlLink link;
	public DataToMess() {
		link = new MysqlLink();
	}
	public DataToMess(String id,String text,boolean isup,DataToLogin temp) {
		link = new MysqlLink();
		this.id = id;
		this.text = text;
		if(isup) {
			this.up = "1";
		}else {
			this.up = "0";
		}
		DataToUser userdata = new DataToUser();
		userdata = userdata.getUserData(temp);
		this.from = userdata.getName();
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.time = dateFormat.format( now ); 
	}
	public void setMessData(DataToMess temp) {
		Connection con = link.getCon();
		Statement state;
		try {
			state = con.createStatement();
	        String sql="insert into messdata values('"+
	        			temp.id+"','"+
	        			temp.text+"','"+
	        			temp.time+"','"+
	        			temp.from+"','"+
	        			temp.up+
	        			"')"; 
	        state.executeUpdate(sql);         //sql”Ôæ‰…œ¥´
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static Object[][] getObjectDataUp() {
		Connection conn = new MysqlLink().getCon();
		//Statement state;
		int num=0;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ResultSet res=null;
		try {
		     String sql="select count(*) from messdata";
		     ps = conn.prepareStatement(sql);
		     rs = ps.executeQuery();
		     PreparedStatement pre=null;
		     while(rs.next()){
		         num=rs.getInt(1);
		     }
		     Object[][] obj = new Object[num][5];
		     sql = "select * from messdata ";
		     pre=conn.prepareStatement(sql);
	         res=pre.executeQuery();
	         //int col = res.getMetaData().getColumnCount();
	         int iline = 0;
	         while (res.next()){
	        	if(res.getString(5).equals("0")) {
	        		num--;
	        		continue;
	        	}
                obj[iline][0] = res.getString(1);
                obj[iline][1] = res.getString(2);
                obj[iline][2] = res.getString(3);
                obj[iline][3] = res.getString(4);
                obj[iline][4] = res.getString(5);
                iline++;
	         }
	         Object[][] upobj = new Object[num][5];
	         for(int i=0;i<num;i++) {
	        	upobj[i] = obj[i];
	         }
	         
		     return upobj;
		} catch (SQLException e) {
		     throw new RuntimeException(e);
		}
	}

	public static Object[][] getObjectData() {
		Connection conn = new MysqlLink().getCon();
		//Statement state;
		int num=0;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ResultSet res=null;
		try {
		     String sql="select count(*) from messdata";
		     ps = conn.prepareStatement(sql);
		     rs = ps.executeQuery();
		     PreparedStatement pre=null;
		     while(rs.next()){
		         num=rs.getInt(1);
		     }
		     Object[][] obj = new Object[num][5];
		     sql = "select * from messdata ";
		     pre=conn.prepareStatement(sql);
	         res=pre.executeQuery();
	         //int col = res.getMetaData().getColumnCount();
	         int iline = 0;
	         while (res.next()){
                obj[iline][0] = res.getString(1);
                obj[iline][1] = res.getString(2);
                obj[iline][2] = res.getString(3);
                obj[iline][3] = res.getString(4);
                obj[iline][4] = res.getString(5);
                iline++;
	         }

		     return obj;
		} catch (SQLException e) {
		     throw new RuntimeException(e);
		}
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getUp() {
		return up;
	}
	public void setUp(String up) {
		this.up = up;
	}

	
}
