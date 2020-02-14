package com.techlabs.basic;

import java.awt.List;
import java.util.Arrays;

public class OperationsOnStringArgsParameters {
	public static void main(String[] args) {
		int sum = 0, evennumber, numberofparameters = args.length, i;
		float average;
		/*
		 * if (args[numberofparameters - 1] == "even") { for (i = 0; i <
		 * numberofparameters - 2; i++) { evennumber = Integer.parseInt(args[i]); if
		 * (evennumber%2 == 0) { for (i = 0; i < numberofparameters; i++) { sum = sum +
		 * Integer.parseInt(args[i]);
		 * 
		 * 
		 * } } }
		 * 
		 * 
		 * }
		 */
		System.out.println("Array passed is :");
		for (String arg : args ) {
			System.out.print(arg + " ");
			
		}
		System.out.println();
		System.out.println("Operation done on :");
		int flag = ifConatinsEvenOrOdd(args, numberofparameters);
	//	System.out.println(flag);
		toCheckEvenOrOdd(args, numberofparameters, flag);

		// System.out.println("sum is :" + sum);

		// average = sum / numberofparameters;
		// System.out.println("Average is :" + average);

	}

	public static int ifConatinsEvenOrOdd(String[] args, int numberofparameters) {
		int flag = 0;
		if (args[numberofparameters - 1].contains("even")) {
			flag = 1;
		}
		if (args[numberofparameters - 1].contains("odd")) {
			flag = 2;
		}

		return flag;
	}

	public static void toCheckEvenOrOdd(String args[], int numberofparameters, int flag) {
		int i, num, sum = 0, count = 0;
		if (flag != 0) {
			numberofparameters = numberofparameters - 1;
		}

		for (i = 0; i < numberofparameters; i++) {
			num = Integer.parseInt(args[i]);
			if (flag == 1) {
				if (num % 2 == 0) {
					count = count + 1;
					sum = sumOfArgs( args[i], numberofparameters, i, sum, flag, count);
					System.out.print ( num + " ");
					
				}
			}

			if (flag == 2) {
				if (num % 2 != 0) {
					count = count + 1;
					sum = sumOfArgs( args[i], numberofparameters, i, sum, flag, count);
					System.out.print ( num + " " );
				
				}
			} else if (flag == 0) {
				sum = sumOfArgs( args[i], numberofparameters, i, sum, flag, count);
				System.out.print ( num + " " );

			}

		}
		System.out.println();
		float average = averageOfArgs(numberofparameters, count, i, sum);
		System.out.println("average is : " + average);
		System.out.println("sum is :" + sum);
	}

	public static int sumOfArgs( String args, int numberofparameters, int i, int sum, int flag,
			int count) {

		sum = sum + Integer.parseInt(args);
		return sum;
	}

	public static float averageOfArgs(int numberofparameters, int count, int i, int sum) {
		float average;
		 
			if (count != 0) {
				numberofparameters = count;
			}
			average =  (float)sum / (numberofparameters);
			return average;
		 

	}

}
