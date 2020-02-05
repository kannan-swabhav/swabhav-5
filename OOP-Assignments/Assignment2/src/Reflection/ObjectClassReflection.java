package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ObjectClassReflection {

	public static void main(String[] args) {
		Class reflectionClass = Object.class;

		String className = reflectionClass.getName();
		System.out.println("Class name is : " + className);
		
		System.out.println();
		System.out.println("List of Methods are :");		
		Method [] classMethods = reflectionClass.getMethods();
		for (Method a : classMethods) {
			System.out.println(a);
			if(a.getName().startsWith("get")) {
				System.out.println("method type is getter");
			}
			else if(a.getName().startsWith("set")) {
				System.out.println("Method is setter");
			}
			
		}
		System.out.println();
		System.out.println("List of Constructors are : ");
		Constructor[] construcor= reflectionClass.getConstructors();
		for (Constructor a : construcor) {
			System.out.println(a);
		}

	}

}
