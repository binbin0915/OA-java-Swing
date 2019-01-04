package com.mmciel.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataToUser {
	private String username;//用户名
	private String number;//编号
	private String name;//姓名
	private String age;//年龄
	private String sex;//性别
	private String data;//数据
	private String ad;//权限
	
	
	private String pos;
	private String adress;
	private String tel;
	private String qq;
	
	private MysqlLink link;
	/**
	 * 补充用户信息
	 */
	public void UpdateUserData(DataToUser data) {
		Connection con = link.getCon();
		Statement state;
		try {
			state = con.createStatement();
			String sql = "UPDATE userdata SET "+
						"username = '" + data.getUsername() +"', "+
						"number = '" + data.getNumber() +"', "+
						"name = '" + data.getName() +"', "+
						"age = '" + data.getAge() +"', "+
						"sex = '" + data.getSex() +"', "+
						"ad = '" + data.getAd() +"', "+
						"pos = '" + data.getPos() +"', "+
						"adress = '" + data.getAdress() +"', "+
						"tel = '" + data.getTel() +"', "+
						"qq=" + data.getQq()+
						" where username='"+data.getUsername()+"' ";
	        state.executeUpdate(sql);         //sql语句上传
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	/**
	 * 提取用户信息
	 */
	public DataToUser getUserData(DataToLogin temp) {
		Connection con = link.getCon();
		Statement state;
	    String sql="select * from userdata";   
	    DataToUser data = new DataToUser();
	    try {
			state = con.createStatement();
			 ResultSet rs=state.executeQuery(sql);
		    while(rs.next()){ 
		    	if(rs.getString(1).equals(temp.getUsername())) {
		    		data.setUsername(rs.getString(1));
		    		data.setNumber(rs.getString(2));
		    		data.setName(rs.getString(3));
		    		data.setAge(rs.getString(4));
		    		data.setSex(rs.getString(5));
		    		data.setAd(rs.getString(6));
		    		data.setPos(rs.getString(7));
		    		data.setAdress(rs.getString(8));
		    		data.setTel(rs.getString(9));
		    		data.setQq(rs.getString(10));
		    		break;
		    	}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return data;
	}
	/**
	 * 注册信息写入
	 */
	public void setUserData(DataToUser data) {
		Connection con = link.getCon();
		Statement state;
		try {
			state = con.createStatement();
	        String sql="insert into userdata values('"+
	        		data.username+"','"+
	        		data.number+"','"+
	        		data.name+"','"+
	        		data.age+"','"+
	        		data.sex+"','"+
	        		data.ad+"','"+
	        		data.pos+"','"+
	        		data.adress+"','"+
	        		data.tel+"','"+
	        		data.qq+
	        		"')"; 
	        state.executeUpdate(sql);         //sql语句上传
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public DataToUser() {
		link = new MysqlLink();
		pos = "";
		adress = "";
		tel = "";
		qq = "";
	}
	
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}

	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
}
