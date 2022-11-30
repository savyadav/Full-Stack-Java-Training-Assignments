package question2;

public class Assesment2 {
	
	Assesment2()
	{
		System.out.println("first constructor");
	}
	Assesment2(int a)
	{
		this();
		System.out.println("value of a="+a);
	}
	Assesment2(int a,int b)
	{
		this(10);
		System.out.println("value of a="+a+"value of b"+b);
	}
	Assesment2(String a)
	{
		this(20,30);
		System.out.println("value of a="+a);
	}
	public static void main(String[] args) {
		Assesment2 assesment2=new Assesment2("savita");
		
		

	}

}
