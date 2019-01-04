package com.mmciel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ipip = staticname.getRemortIP(request);
		if(ipip.equals(staticname.ip) == false ) {
			
	        request.setAttribute("message","系统正在排队，请稍后重新提交！");
	        request.getRequestDispatcher("/message.jsp").forward(request, response);
	        return;
		}
        String savePath = this.getServletContext().getRealPath("/WEB-INF/upload");

        String tempPath = this.getServletContext().getRealPath("/WEB-INF/temp");
        File tmpFile = new File(tempPath);
        if (!tmpFile.exists()) {
            tmpFile.mkdir();
        }
        File file = new File(savePath);
        if(!file.exists()){
            file.mkdirs();
        }
        String message = "";
        try{
            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setSizeThreshold(1024*100);
            factory.setRepository(tmpFile);
            ServletFileUpload upload = new ServletFileUpload(factory);
            upload.setProgressListener(new ProgressListener() {
				@Override
				public void update(long pBytesRead, long pContentLength, int arg2) {
					// TODO Auto-generated method stub
					if(pBytesRead%51 == 3)
						System.out.println(pBytesRead+ "/" +pContentLength);
				}
			});
            upload.setHeaderEncoding("UTF-8"); 
            if(!ServletFileUpload.isMultipartContent(request)){
                return;
            }
            upload.setFileSizeMax(1024*1024*10);
            upload.setSizeMax(1024*1024*30);
            @SuppressWarnings("unchecked")
			List<FileItem> list = upload.parseRequest(request);
            for(FileItem item : list){
                if(item.isFormField()){
                    String name = item.getFieldName();
                    String value = item.getString("UTF-8");
                    System.out.println(name + "=" + value);
                }else{
                    String filename = item.getName();
                    System.out.println(filename);
                    if(filename==null || filename.trim().equals("")){
                        continue;
                    }
                    filename = filename.substring(filename.lastIndexOf("\\")+1);
                    InputStream in = item.getInputStream();
                    String saveFilename = makeFileName(filename);
                    FileOutputStream out = new FileOutputStream(savePath + "\\" + saveFilename);
                    byte buffer[] = new byte[1024];
                    int len = 0;
                    while((len=in.read(buffer))>0){
                        out.write(buffer, 0, len);
                    }
                    in.close();
                    out.close();
                    item.delete();
                    message = "文件上传成功！";
                }
            }
        }catch (FileUploadBase.FileSizeLimitExceededException e) {
            
            request.setAttribute("message", "单个文件超出最大值！！！");
            request.getRequestDispatcher("/message.jsp").forward(request, response);
            e.printStackTrace();
            return;
        }catch (FileUploadBase.SizeLimitExceededException e) {
           
            request.setAttribute("message", "上传文件的总的大小超出限制的最大值！！！");
            request.getRequestDispatcher("/message.jsp").forward(request, response);
            e.printStackTrace();
            return;
        }catch (Exception e) {
            message= "文件上传失败！";
            e.printStackTrace();
            
        }
        request.setAttribute("message",message);
        request.getRequestDispatcher("/message.jsp").forward(request, response);
	}
	private String makeFileName(String filename) {
		String fn = filename.substring(filename.lastIndexOf("."));
		FileNameStudent hehe = new FileNameStudent(); 
		//String key = staticname.key;
		String val = hehe.getValue();
		String name = val;
		System.out.println("最终文件："+name+fn);
		return name+fn;
	}
}
