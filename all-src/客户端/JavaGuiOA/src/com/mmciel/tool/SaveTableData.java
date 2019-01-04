package com.mmciel.tool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveTableData {
	//数据存储到文件
	public static void SaveTableDataToTxtFile(String filepath,Object[][] obj) {
        File writename = new File(filepath); // 相对路径，如果没有则要建立一个新的output。txt文件  
        try {
			writename.createNewFile();
	        BufferedWriter out = new BufferedWriter(new FileWriter(writename));  
	        out.write("编号\t\t"+"姓名\t\t"+"年龄\t\t"+ "性别\t\t"+ "职位\t\t"+"地址\t\t"+ "电话\t\t" +"QQ\t\t"+"\r\n"); 
	        
	        for(int i=0;i<obj.length;i++) {
	        	String temp = "";
	        	for(int j = 0;j<obj[i].length;j++) {
	        		temp +=  obj[i][j]+ "\t\t";
	        	}
	        	out.write(temp);
	        	out.write("\r\n");
	        }
	        out.flush(); // 
	        out.close(); // 
		} catch (IOException e) {
			
			e.printStackTrace();
		} 

        
        
	}


}
