package com.mmciel;

import javax.servlet.http.HttpServletRequest;

public class staticname {
	public static String key=null;
	
	public static String ip = null;

	public static String getRemortIP(HttpServletRequest request) {  
	    if (request.getHeader("x-forwarded-for") == null) {  
	        return request.getRemoteAddr();  
	    }  
	    return request.getHeader("x-forwarded-for");  
	}
	public static String ans=null;
}
