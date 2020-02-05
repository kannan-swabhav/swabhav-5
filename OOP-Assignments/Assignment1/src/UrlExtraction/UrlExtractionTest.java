package UrlExtraction;

public class UrlExtractionTest {

	public static void main(String[] args) {

		String str = "http://www.swabhavtechlabs.com?developer=jay@role=architect";
		// String str = "http://www.swabhavtechlabs.com?developer=jay";
		// String str = "http://www.swabhavtechlabs.com?role=architect";
		// String str = "http://www.swabhavtechlabs.com?role=architect@developer=jay";

		String[] terms = str.split("[@&?$+-]+");


		int start = str.indexOf("www.");
		int end = str.indexOf(".com");
		System.out.println("Company = " + str.substring(start + 4, end));

		for (int i = 1; i < terms.length; i++) {
			System.out.println(terms[i]);
		}
	}
}