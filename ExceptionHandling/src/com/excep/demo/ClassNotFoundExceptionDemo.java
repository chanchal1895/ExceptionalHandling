package com.excep.demo;

import java.lang.System.Logger;

public class ClassNotFoundExceptionDemo {
	
	public static void main(String[] args) {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			  
		}
	}

}
