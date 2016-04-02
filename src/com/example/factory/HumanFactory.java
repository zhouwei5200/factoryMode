package com.example.factory;

public class HumanFactory {
	public static Human creatHuman(Class c) {
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//传的类没有
			e.printStackTrace();
		}
		return human;
	}

}
