package edu;


public class TestSwitchCase {

	enum enumVegetable { potato, tomato, cucmber };
	
	public static void main(String[] args) 
	{
		/**
		 * Если с чем-то совпадёт - и после этого совпадения не будет стоять break - он пойдёт далее и независимо от условий будет
		 * выполнять действия из каждого case
		 * 
		 * Дубликатов case не любит - Duplicate case
		 * 
		 * Могут учавствовать int, String (c 7 jdk), enum (перечисления, они появились с jdk 1,5), short byte char
		 * int
		 * 
		 * /**
		 * In Java SE 7  and later, you can use a String object in the switch statement's expression.
		 *
		 * The String comared as if the String.equals - Т.е.по значению
		 * Дубликатов case не любит - Duplicate case
		 * 
		 * чувствителен к регистру
		 * 
		 * null - java.lang.NullPointerException
		 */

		
		StringBuffer sb = null;
		
		int i = 2;
		
	
		
		/*
		 * 1. Default первый стоит, без break - в него зайдёт и далее по всем условиям. До первого break 
		 */
		/*switch(i)
		{
		    default:
			case (0):
				System.out.println(0);
			case (1):
				System.out.println(1);
			case (3):
				System.out.println(3);break;
		}*/

		/*
		 * 2. Здесь ни с чем не совпадает, потому никуда не заходит
		 */
		/*i = 2;
		switch(i)
		{
		    //default:
			case (0):
				System.out.println(0);
			case (1):
				System.out.println(1);
			case (3):
				System.out.println(3);break;
			case (3):
				System.out.println(3);break;
		}*/
			
		
		/*
		 * null
		 */

		/*String caseTest = null;
		
		switch(caseTest)
		{
			case ("oca - 2020"):
				System.out.println(0);
			case ("OCA - 2021"):
				System.out.println(1);
			case ("OCA - 2019"):
				System.out.println(3);
        }*/

		/**
		 * enum
		 */
		enumVegetable p = enumVegetable.potato;
		switch (p) {
		    case potato:
		        System.out.println("vegetable");
		}
		
		
		
		/*
		 * int
enum
short
byte
char
String (начиная с Java 7)
		 */
		
		char number = 13;
		switch (number) {
		    case 13:System.out.println("13");
		    case 129:System.out.println("129");
		}
}
	
}
