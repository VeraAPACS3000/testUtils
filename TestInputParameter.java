/**
 *
 *Java передает все по значению. ВСЁ.
 *
 *В случае примитивов - передает копию значения примитива
 *В случае ссылки - передает копию ссылки, т.е. значение ссылки. Значение ссылки - это значит куда на какой обьект указывает.
 *Ссылка = пульт. Но НЕ содержание обьекта, на который ссылается ссылка
 *
 *Изменить ссылку - значит смотреть на другой обьект
 *
 *Для примитивных типов — вы передаете копию текущего значения, для ссылок на объекты — вы передаете копию ссылки 
 *(дистанционного управления). Вы никогда не передаете объект. Все объекты хранятся в куче. Всегда.
 *
 */

public class TestInputParameter implements Exceptions
{
	//StringBuffer - мы кладём в него как в корзинку, apend("");
	//т.е. не изменяем ссылку как в String
	
	public static void main(String[] args) throws ClassCastException, CBException 
	{
		StringBuffer strBufferInput = new StringBuffer("0");
		String strInput = new String("0");
		String strInput2 = "0";
				
		checkParameter(strBufferInput, strInput, strInput2);
		
		System.out.println("strBufferInput:" + strBufferInput);
		System.out.println("strInput:" + strInput);
		System.out.println("strInput2:" + strInput2);
		System.out.println("insert:" + strBufferInput);
	}
	public static void checkParameter(StringBuffer strBufferInput, String strInput, String strInput2) throws CBException
	{
		//берем копию ссылки
		//копия ссылки смотрит туда же куда и предыдущая ссылка
		//по ней проходим и кладём новое значение в обьект, на который смотрит ссылка
		strBufferInput.append("1");
		
		//береём копию ссылки
		//она смотрит на тот же обьект, что и предыдущая переданная
		//потом ссылку изменяем (="1"), изменили значит ссылка теперь смотрит на другой обьект
		//но обьект не изменился, значит в out будет предыдущее значение уйдёт
		strInput="1";
		
		strInput2 = "1";
		
		//strBufferInput.delete(0, 2);
		//strBufferInput.append("1");
		
		strBufferInput = new StringBuffer("1");
		
		System.out.println("insert2:" + strBufferInput);
	}

}

//------------------------------------------------------------------------------------------------------------------------------

public class TestInputParameter {

	public static void main(String[] args) 
	{
		int a = 0;
		
		checkParameters(a);

		System.out.println(a);
		
		System.out.println(checkParameters("0"));
	}
	
	static public void checkParameters(int a)
	{
		a = 1;
	}
	
	static public String checkParameters(String a)
	{
		a = "1";
		
		return a;
	}

}
