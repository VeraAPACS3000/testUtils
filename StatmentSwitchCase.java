package test;

public class StatmentSwitchCase {

	public static void main(String[] args) 
	{
		/**
		 * Если с чем-то совпадёт - и после этого совпадения не будет стоять break - он пойдёт далее и независимо от условий будет
		 * выполнять действия из каждого case
		 */
		
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
		i = 2;
		switch(i)
		{
		    //default:
			case (0):
				System.out.println(0);
			case (1):
				System.out.println(1);
			case (3):
				System.out.println(3);break;
		}
			
	}

}
