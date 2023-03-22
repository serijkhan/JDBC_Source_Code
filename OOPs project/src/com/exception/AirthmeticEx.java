package com.exception;

public class AirthmeticEx {

	public static void main(String[] args)throws ArithmeticException {

		System.out.println("HI main Start::");

		try {
			System.out.println("try block");
			int a = 10;
			int b = 0;
			System.out.println(a / b);

		} /*
			 * catch (ArrayIndexOutOfBoundsException e1) {
			 * System.out.println("Please check your input length"); } catch
			 * (NullPointerException e2) { System.out.println("Please check exact value"); }
			 *//*
				 * catch (ArithmeticException e3) {
				 * System.out.println("digit npt divided by zore::"); e3.printStackTrace();
				 * 
				 * } catch (Exception e) { System.out.println("All Exception catch"); }
				 */

		finally {
			System.out.println("Any how execute::");
		}

	}

}
