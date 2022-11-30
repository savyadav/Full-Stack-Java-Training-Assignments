package question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exam {
	
	 public static void main(String args[]) throws Exception
	 {
	     Question[] Ques_Ans= new Question[6];
	     Ques_Ans[0] = new Question(1,"What is the size of float variable? \n"," A. 8 bit \n"," B. 16 bit \n"," C. 32 bit \n","D. 64\n",3);
		  Ques_Ans[1] = new Question(2,"Which one of these is not a primitive data type? \n ","A. integer \n"," B. char \n"," C. float \n","D. double\n",2);
		  Ques_Ans[2] = new Question(3,"Which data type is used to create a variable that should store text? \n"," A. myString \n"," B. string \n ","C. character \n"," D. String64\n",4);
		  Ques_Ans[3] = new Question(4,"How do you create a variable with the numeric value 5? \",\"\\n"," A. num x = 5; \\n ","B. float x = 5; \\n"," C. x = 5; \\n"," D. int x = 5;\\n",1);
		  Ques_Ans[4] = new Question(5,"Which method can be used to find the length of a string in JAVA?\n"," A. length()\n"," B. getlength() \n"," C. len \n"," D. getsize()\n",1);
		  Ques_Ans[5] = new Question(6,"What is the size of float variable? \n"," A. 8 bit \n"," B. 16 bit \n"," C. 32 bit \n","D. 64\n",3);

				  
	System.out.println("Welcome to Exam.Are you Ready? (y-start,n-stop)");
		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();
    Scanner cin = new Scanner(System.in);
    if(name.equals("n")||name.equals("N"))
    {
    	System.out.println("stop and Thank you");
    }
    else  if(name.equals("y")||name.equals("Y"))
    {
    	 for(int i=0;i<6;i++)
    	  {
    		System.out.print(""+Ques_Ans[i].getQuestionId()+"."+Ques_Ans[i].getQuestion()+"\n"+
    		Ques_Ans[i].getOption1()+"\n"+Ques_Ans[i].getOption2()+"\n"+Ques_Ans[i].getOption3()+"\n"+Ques_Ans[i].getOption4());
    		int user_ans=cin.nextInt();
    		  if(Ques_Ans[i].getRightOption()==user_ans) 
    		    {
                  System.out.println("\n Correct!");
                  continue;
                }
    		  else
    		  {
                  System.out.println("\n Your answer is not correct. Do you want to try again? (y-yes,n-no)");
                  String name1 = reader.readLine();
                  if(name1.equals("y")||name1.equals("Y")) 
                  {
                	 i--;
                  }
                  else
                	  continue;
              }
    		  System.out.print("\n");

              

         } 
    
    	
}
}

}
