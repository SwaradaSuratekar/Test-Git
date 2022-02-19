package com.GitHub.Git_Demo;

public class AdminTest {
int id;
static String s= "Welcome";
	public static void main(String[] args) {
		System.out.println("Admin class");
		AdminTest a=new AdminTest();
		a.id=10;
		System.out.println(a.id);
		m1();
	}
	public static void m1() {
		System.out.println(s);
	}
}
