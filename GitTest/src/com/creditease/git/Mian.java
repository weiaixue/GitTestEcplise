package com.creditease.git;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("git");
		System.out.println("hello");
		
		Agent agent = new Agent();
		Core c = new Core();
		
		System.out.println(c.c);
		agent.test(c);
		System.out.println(c.c);
		
		StringBuffer a=new StringBuffer("I am a ");
		StringBuffer b=a;
		a.append("after append");
		a=b;
		System.out.println("a="+a);
	}

}
