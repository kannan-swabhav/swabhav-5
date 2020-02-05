package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.lang.invoke.MethodType;

public class StringClassReflection {
	public static void main(String[] args) {
		Class reflectionclass = String.class;

		String classname = reflectionclass.getName();
		System.out.println("Name of class is : " + classname);
		
		System.out.println();
		System.out.println("List of Methods are :");	
		Method[] classmethods = reflectionclass.getMethods();
		for (Method a : classmethods) {
			System.out.println(a);
			if (a.getName().startsWith("get")) {
				System.out.println("Method is getter");
			} else if (a.getName().startsWith("get")) {
				System.out.println("Method is getter");
			}
		}
		
		System.out.println();
		System.out.println("List of Constructors are :");	
		Constructor[] contructor = reflectionclass.getConstructors();
		for (Constructor  a : contructor) {
			System.out.println(a);
			
		}

	}

}
