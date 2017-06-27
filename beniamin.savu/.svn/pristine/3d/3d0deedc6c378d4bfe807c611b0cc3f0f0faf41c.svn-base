package com.iquest.week5.pr3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SimpleClassLoader extends ClassLoader {
	
	public SimpleClassLoader(ClassLoader parent) {
        super(parent);
    }

	public Class getClass(String name){
		String className = name.substring(21);
		String file = "src/resource/" + className + ".class";
		byte[] bytes = null;
		try{
			bytes = loadClassData(file);
			return defineClass(name, bytes, 0, bytes.length);
		} catch (IOException e){
			e.printStackTrace();
			return null;
		}
	}
	
	public Class loadClass(String name) throws ClassNotFoundException {
        if (name.startsWith("com.iquest")) {
            return getClass(name);
        }
        return super.loadClass(name);
    }
	
	private byte[] loadClassData(String name) throws IOException{
		File file = new File(name);
		int length = (int)file.length();
		
		byte[] byteCode = new byte[length];
		FileInputStream fileInputStream = new FileInputStream(file);
		fileInputStream.read(byteCode);
		fileInputStream.close();
		
		return byteCode;
	}
	
}
