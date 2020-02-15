package objectcalisthenics;

public class ObjectCalisthenicsRule2Test {
	public static void main(String args[]) {
		//int obj = 1000;
		//int obj = -1;
		int obj = 10 ;
		withoutRule2(obj);
		withRule2(obj);

	}

	public static void withoutRule2(int obj) {
		if(obj<0) {
			obj=1;
		}else if (obj > 100) {
			obj = 100;
		}else 
			System.out.println(obj);

	}
	public static void withRule2(int obj) {
		if(obj < 0) {
			obj =1;
		}if(obj>100) {
			obj = 100;
		}
		System.out.println(obj);
	}
}