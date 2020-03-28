package staticblock.model.test;

import staticblock.model.StaticBlock;

public class StaticBlockTest {
	public static void main (String args []) {
		StaticBlock s1 = new StaticBlock();
		System.out.println(s1.getI());
		
		StaticBlock s2 = new StaticBlock();
		System.out.println(s2.getStr() + s2.getI());
		
	}

}
