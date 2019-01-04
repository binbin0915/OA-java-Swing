package com.mmciel.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mmciel.tool.DataIni;
/**
 * 
 * @author mmciel
 * 2018年12月17日17:12:57
 * 完成对javaoa本地数据库的连接  增删改查与关闭
 * update：
 */
public class MysqlLink {
    //声明Connection对象
    private Connection con;
    //2.创建statement类对象，用来执行SQL语句！！
    private Statement statement;
    
  /**
   * 拿到连接
   */
    public Connection getCon() {
    	return con;
    }
    public Statement getSta() {
    	return statement;
    }
	public MysqlLink() {

        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = DataIni.mmciel_web_db_ip;
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "123456";
        //遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url,user,password);
//            if(!con.isClosed())
//                System.out.println("Succeeded connecting to the Database!");
            statement = con.createStatement();
        } catch(ClassNotFoundException e) {   
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");   
            e.printStackTrace();   
        } catch(SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();  
        }catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void Close() {
		try {
			statement.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("mysql close not success");
			e.printStackTrace();
		}
		
		
	}
//	public static void main(String[] args) {
//		new MysqlLink();
//	}
}
