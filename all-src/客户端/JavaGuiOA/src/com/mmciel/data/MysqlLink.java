package com.mmciel.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mmciel.tool.DataIni;
/**
 * 
 * @author mmciel
 * 2018��12��17��17:12:57
 * ��ɶ�javaoa�������ݿ������  ��ɾ�Ĳ���ر�
 * update��
 */
public class MysqlLink {
    //����Connection����
    private Connection con;
    //2.����statement���������ִ��SQL��䣡��
    private Statement statement;
    
  /**
   * �õ�����
   */
    public Connection getCon() {
    	return con;
    }
    public Statement getSta() {
    	return statement;
    }
	public MysqlLink() {

        //����������
        String driver = "com.mysql.jdbc.Driver";
        //URLָ��Ҫ���ʵ����ݿ���mydata
        String url = DataIni.mmciel_web_db_ip;
        //MySQL����ʱ���û���
        String user = "root";
        //MySQL����ʱ������
        String password = "123456";
        //������ѯ�����
        try {
            //������������
            Class.forName(driver);
            //1.getConnection()����������MySQL���ݿ⣡��
            con = DriverManager.getConnection(url,user,password);
//            if(!con.isClosed())
//                System.out.println("Succeeded connecting to the Database!");
            statement = con.createStatement();
        } catch(ClassNotFoundException e) {   
            //���ݿ��������쳣����
            System.out.println("Sorry,can`t find the Driver!");   
            e.printStackTrace();   
        } catch(SQLException e) {
            //���ݿ�����ʧ���쳣����
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
