package com.iquest.week5.pr3;

public class Factory {

	private SimpleClassLoader loader = new SimpleClassLoader(SimpleClassLoader.class.getClassLoader());
	
	public MyClass getOriginalClass(){
		return new MyClass();
	}
	
	public Object getReloadedClass(){
		Class obj = null;
		try {
			obj = loader.loadClass(MyClass.class.getName());
			return obj.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Object getReloadedSubclass(){
		getReloadedClass();
		Class obj = null;
		try {
			obj = loader.loadClass(MySubclass.class.getName());
			return obj.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
