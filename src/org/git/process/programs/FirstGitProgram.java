package org.git.process.programs;

public class FirstGitProgram {
	
	public void git1() {
		System.out.println("1st git method");
	}
	
	public void git2() {
		System.out.println("2nd git method");	
	}
	
	public void git3() {
		System.out.println("3rd git method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method print statement");
		
		FirstGitProgram ref=new FirstGitProgram();
		ref.git1();
		ref.git2();
		ref.git3();
		
	}

}
