package com.mmciel.tool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveTableData {
	//���ݴ洢���ļ�
	public static void SaveTableDataToTxtFile(String filepath,Object[][] obj) {
        File writename = new File(filepath); // ���·�������û����Ҫ����һ���µ�output��txt�ļ�  
        try {
			writename.createNewFile();
	        BufferedWriter out = new BufferedWriter(new FileWriter(writename));  
	        out.write("���\t\t"+"����\t\t"+"����\t\t"+ "�Ա�\t\t"+ "ְλ\t\t"+"��ַ\t\t"+ "�绰\t\t" +"QQ\t\t"+"\r\n"); 
	        
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
