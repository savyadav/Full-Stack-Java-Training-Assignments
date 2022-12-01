package lambdaExample;

public class LambdaExample {
	public static boolean checker(PerformOperation p, int num) {
		  return p.check(num);
		 }
	PerformOperation isOdd()
	{
		PerformOperation op=(int a)->a%2==0? false: true;
		return op;
	}
	PerformOperation isPrime()
	{
		PerformOperation op=(int a)->
		{
			if(a==1)
				return true;
			else
			{
				for(int i=2;i<Math.sqrt(a);i++)
					if(a%i==0)
						return false;
				return true;
			}
			
		};
		return op;
	}
	PerformOperation isPalindrome()
	{
		PerformOperation op=(int a)->
		{
			String str=Integer.toString(a);
		     String reverse="";
		     for(int i=str.length()-1;i>0;i--)
		     {
		    	 reverse=reverse+str.charAt(i);
		     }
		     if(str.equals(reverse))
		    	 return true;
		     return false;
		};
		return op;
	}

	public static void main(String[] args) {
		LambdaExample ob=new LambdaExample();
		PerformOperation op;
		
		System.out.println("odd number result=");
		op=ob.isOdd();
		 boolean ret = ob.checker(op,13);
		 System.out.println(ret);
		 System.out.println("Paldindrome result=");
			op=ob.isPalindrome();
			  ret = ob.checker(op,1231);
			  System.out.println(ret);
			  System.out.println("Prime result=");
				op=ob.isPrime();
				  ret = ob.checker(op,12);
				  System.out.println(ret);

	}

}
