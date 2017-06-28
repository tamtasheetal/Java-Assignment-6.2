package ExceptionHandling;

import java.util.Scanner;

public class AgeException
{
	static void checkAge(int inputAge) throws NegativeAgeException     
//This Function is to check the Age and to throws Exception if it is negative. 
	
	{
		if(inputAge < 0)      
		{
			throw new NegativeAgeException();     
		}
		else
		{
			System.out.println("User's Age is :-"+inputAge);
		}
		
	}
	
//Declaration of main function and the execution will start from main, because it is Static.
public static void main(String[] args)     

{
	int ageOfUser;           
	
	System.out.println("Hello, Please Enter your Age Here :-");
 
	Scanner sc=new Scanner(System.in);       
	
	ageOfUser=sc.nextInt();    
	
	try       
	{
		checkAge(ageOfUser);  
	}
	catch(NegativeAgeException e)          
	{
		System.out.println(e);     
	}
	
	sc.close();          
}      

}    
