package test;

public class TestIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkIncrement();

	}

	public static void checkIncrement()
	{
	   /*int i = 5; 
	   i = i++; 
	   System.out.println(i);
	   System.out.println(i);

       int x = 10;
       System.out.println(x++);
       System.out.println(x);*/
       
       int a = 0;
       int i = 0;
       
       a = i++ + i++;

       //i++ - берём значение 0
       //его уже ВЗЯЛИ, поэтому это 1ое слагаемое остаётся до конца вычисления i=0
       //пока переходим ко 2му слагемому i инкрементируется первым инкрементатором и становится i=1
       //на втором слагаемом мы берём второе значение i=1
       //его уже ВЗЯЛИ, поэтому это 2ое слагаемое остаётся до конца вычисления i=1
       //пока переходим ко 3му слагемому i инкрементируется вторым инкрементатором и становится i=2
       
       //далее вычисляется сумма 0 + 1 + 2 = 3      
       
       System.out.println(a); 
       System.out.println(i); 
       
       
       /*
        * tests
        */
       
       
     System.out.println("tests:");//5 
     // (1)
       int b = 5; 
       b = b++; 
       System.out.println(b);//5 
       
     //  (2)
       b = 5; 
       b = b++ + b++; 
       System.out.println(b); //5 + 6 = 11
       
      // (3)
       b = 5; 
       b = b++ + ++b; 
       System.out.println(b); //5 + 7 = 12
       
      // (4)
       b = 5; 
       b = ++b + ++b; 
       System.out.println(b); //6 + 7 = 13
       
       
       /*
        * test2
        */
       System.out.println("test2:");
       int d = 0;
       d = d-- + --d;
       System.out.println(d);//0 + -2 = -2
       
       d = 0;
       d = ++d + ++d + d++;
       
       System.out.println(d);//1 + 2 + 2 = 5

	}
}
