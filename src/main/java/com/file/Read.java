package com.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.TreeMap;

import com.managment.Employee;

public class Read {
	@SuppressWarnings("unchecked")
	public static TreeMap<String,Employee>  readAll(String file) throws ClassNotFoundException, IOException {
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(new FileReader("D:/LMS/EmployeeManagment/DB/file.txt"));
		if(br.read()==-1)
			return null;
		@SuppressWarnings("resource")
		ObjectInputStream oos=new ObjectInputStream(new FileInputStream("D:/LMS/EmployeeManagment/DB/file.txt"));
		return (TreeMap<String, Employee>) oos.readObject();
		
	}
}
