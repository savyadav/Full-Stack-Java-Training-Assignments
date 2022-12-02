package com.java;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//import com.java.ui.Tester;

public class LambdaExample {
	private static final Log logger= LogFactory.getLog(LambdaExample.class);
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
		//Log logger = LogFactory.getLog(LambdaExample.class);
		LambdaExample ob=new LambdaExample();
		PerformOperation op;
		logger.info(" logged in successfully");
		logger.info(" odd number result=");
		//System.out.println("odd number result=");
		op=ob.isOdd();
		 boolean ret = ob.checker(op,13);
		 logger.info(ret);
		 //System.out.println(ret);
		 logger.info("Paldindrome result=");
		// System.out.println("Paldindrome result=");
			op=ob.isPalindrome();
			  ret = ob.checker(op,1231);
			  logger.info(ret);
			  System.out.println(ret);
			  logger.info("Prime result=");
			 // System.out.println("Prime result=");
				op=ob.isPrime();
				  ret = ob.checker(op,12);
				  logger.info(ret);
				  //System.out.println(ret);

	}

}
