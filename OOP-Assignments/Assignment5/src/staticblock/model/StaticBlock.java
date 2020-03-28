package staticblock.model;

public class StaticBlock {
	private static String str ;
	private static int i ;
	
	static {
		i = 0;
		str = "this is static block";
		System.out.println(str + i);
	}
	
	public StaticBlock() {
		i++;

	}
	
	public String getStr() {
		return str;
	}
	
	public int getI() {
		return i;
	}

}
