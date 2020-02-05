package dryprinciples;

public class UrlExtractionWithDryPrinciplesTest {
	public static void main(String args[]) {

		// String str = "http//swabhavtechlabs.com?developer=jay@role=architect";
		// String str = "http//swabhavtechlabs.com?developer=jay";
		String str = "http//swabhavtechlabs.com?@role=architect";
		// String str = "http//swabhavtechlabs.com?role=architect@developer=jay";
		// String str = "";

		int start = -1, end = -1;

		UrlExtraction(str, "http//", ".com", "company name is :", start, end, 6);
		UrlExtraction(str, "per=", "@role", "Developer name is :", start, end, 4);
		UrlExtraction(str, "role=", "architect", "role is :", start, end, 5);
	}

	public static void PrintInfo(String message, String str, int moveindex, int start, int end) {
		System.out.println(message + str.substring(start + moveindex, end));
	}

	public static void PrintInfo(String message, String str, int moveindex, int start) {
		System.out.println(message + str.substring(start + moveindex));
	}

	public static void PrintInfo(String message, String str) {
		System.out.println(message + "Field is empty");
	}

	public static void UrlExtraction(String str, String startstring, String endstring, String message, int start,
			int end, int moveindex) {
		start = str.indexOf(startstring);
		end = str.indexOf(endstring);

		if (start != -1)
			if (end != -1)
				if (endstring != "architect") {
					PrintInfo(message, str, moveindex, start, end);
				} else {
					PrintInfo(message, str, moveindex, start);
				}
			else {
				PrintInfo(message, str, moveindex, start);
			}
		else {
			System.out.println(message + "field is empty");

		}

	}



}
