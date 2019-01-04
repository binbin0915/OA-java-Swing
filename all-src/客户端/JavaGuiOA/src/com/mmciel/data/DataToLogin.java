package com.mmciel.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author mmciel
 * 2018年12月17日17:19:38
 * 登录数据对象
 * 内置方法生成数据库相关操作语句
 * 相关数据表 logindata
 */
public class DataToLogin {

	private String username;
	private String password;
	private MysqlLink link;
	public DataToLogin(String username,String password) {
		this.username = username;
		this.password = password;
		link = new MysqlLink();
	}
	public DataToLogin() {
		link = new MysqlLink();
	}
	/**
	 * 更新账号密码
	 */
	public void UpdateLoginData(DataToLogin data) {
		Connection con = link.getCon();
		Statement state;
		try {
			state = con.createStatement();
			String sql = "UPDATE logindata SET "+
						"password = '" + data.getPassword() +"' "+
						" where username='"+data.getUsername()+"'";
	        state.executeUpdate(sql);         //sql语句上传
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	/**
	 * 注册信息
	 * 
	 */
	public void setLoginData(DataToLogin logindata) {
		Connection con = link.getCon();
		Statement state;
		try {
			state = con.createStatement();
	        String sql="insert into logindata values('"+logindata.username+"','"+logindata.password+"')"; 
	        state.executeUpdate(sql);         //sql语句上传
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}
	/**
	 * 登录结果获取
	 */
	public boolean getLoginResult() {
		
		//Connection con = link.getCon();
		Statement sta = link.getSta();
		
		String sql="select * from logindata";
		try {
			ResultSet rs = sta.executeQuery(sql);
		    while(rs.next()){    //next（）获取里面的内容
		    	//System.out.println(rs.getString(1)+rs.getString(2));
		    	if(username.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
		    		return true;
		    	}else {
		    		continue;
		    	}
		   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return false;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Object[][] getObjectData() {
		Connection conn = link.getCon();
		//Statement state;
		int num=0;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ResultSet res=null;
		try {
		     String sql="select count(*) from userdata";
		     ps = conn.prepareStatement(sql);
		     rs = ps.executeQuery();
		     PreparedStatement pre=null;
		     while(rs.next()){
		         num=rs.getInt(1);
		     }
		     Object[][] obj = new Object[num][8];
		     sql = "select * from userdata ";
		     pre=conn.prepareStatement(sql);
	         res=pre.executeQuery();
	         //int col = res.getMetaData().getColumnCount();
	         int iline = 0;
	         while (res.next()){
                obj[iline][0] = res.getString(2);
                obj[iline][1] = res.getString(3);
                obj[iline][2] = res.getString(4);
                obj[iline][3] = res.getString(5);
                obj[iline][4] = res.getString(7);
                obj[iline][5] = res.getString(8);
                obj[iline][6] = res.getString(9);
                obj[iline][7] = res.getString(10);
                iline++;
	         }

		     
		     
		     
		     return obj;
		} catch (SQLException e) {
		     throw new RuntimeException(e);
		}
	}
}
