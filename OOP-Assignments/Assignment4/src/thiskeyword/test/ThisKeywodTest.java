package thiskeyword.test;

import thiskeyword.model.ThisKeyword;

public class ThisKeywodTest {
	public static void main(String args[]) {
		ThisKeyword testcase1 = new ThisKeyword("Jay", 20);
		printInfo(testcase1);
		
		ThisKeyword testcase2 = new ThisKeyword("jay", 20, 30);
		printInfo(testcase2);

	}

	public static void printInfo(ThisKeyword testcase) {
		System.out.println("Name is : " + testcase.getName() + " Age is : " + testcase.getAge() + " Rollno is : " + testcase.getRollno());

	}

}
