package com.file;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.TreeMap;

import com.managment.Employee;



public class Write {
	public static void write(Employee e,String file) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		TreeMap<String,Employee> map1=(TreeMap<String, Employee>) Read.readAll(file);
		if(map1==null) {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream (file));
			TreeMap<String,Employee> map=new TreeMap<String,Employee>();
			map.put(e.getEmp_id(), e);
			oos.writeObject(map);
			oos.close();
		}
		else {
			String str=e.getEmp_id();
			map1.put(str,e);
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream (file));
			oos.writeObject(map1);
			oos.close();
			
		}
		
		
	}

	public static void write(TreeMap<String, Employee> map, String file) throws IOException {
		
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream (file));
			oos.writeObject(map);
			oos.close();
		
	}
}
