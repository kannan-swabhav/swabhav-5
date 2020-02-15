package getterandsetter;

public class GetterAndSetter {

	private int rollno;
	private String name;

	public int getRollNo() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int setRollno(int prollno) {
		rollno = prollno;
		return rollno;

	}

	public String setName(String pname) {
		name = pname;
		return name;
	}

}
