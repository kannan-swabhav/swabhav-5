package com.techlabs.basic;

public class UrlExtractionSubString {
	public static void main(String args[]) {

		String str = "http//swabhavtechlabs.com?developer=jay@role=architect";
		 //String str = "http//swabhavtechlabs.com?developer=jay";
		 //String str = "http//swabhavtechlabs.com?@role=architect";
		// String str = "";

		int start = -1, end = -1;

		start = str.indexOf("http//");
		end = str.indexOf(".com");

		if (start != -1)
			if (end != -1) {

				System.out.println("company name is :" + str.substring(start + 6, end));
			} else {
				System.out.println("String is emopty");
			}
		start = str.indexOf("per=");
		end = str.indexOf("@role"); 

		if (start != -1)
			if (end != -1) {
				System.out.println("Developer is :" + str.substring(start + 4, end ));
			} else {
				System.out.println("Developer is : " + str.substring(start + 4));
			}
		else {
			System.out.println("Developer field is emopty");
		}

		start = str.indexOf("role");
		end = str.indexOf("architect");
		if (start != -1)
			if (end != -1) {
				System.out.println("Role :" + str.substring(start + 5));
			} else {
				System.out.println("Developer is : " + str.substring(start + 5));
			}
		else {
			System.out.println("Role field is emopty");
		}


	}

}
