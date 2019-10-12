import java.lang.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
public class Guessing
{
  public static void main(String[] args)                                                                               //main()
 {
        int computerNumber=(int)(Math.random()*100+1);    			 				                                	//generate random num
        int userAnswer=0; 																						          	                        //initializing the user answer 
       	System.out.println("The Computer number choosed a number:____\n");	 	                         // displaying the computer assumed number
        System.out.println("Guess the number in the dialog box that computer has choosed");
        int count=1; 																										                                //initialize the user attempts
        																															                                  // Display input dialog until the user guesses the correct number 
        while(userAnswer!=computerNumber)										                                                          //check the user answer with computer generated number
        {
            String response=JOptionPane.showInputDialog(null,"Enter a guess between 1 and 100","Guessing Game",3);       // display initial input dialog to user
            userAnswer=Integer.parseInt(response); 					                                                  				//convert string to int for use in check method below
            																									                                              		//dispalys user answer along with computer number
            JOptionPane.showMessageDialog(null,""+determineGuess(userAnswer,computerNumber,count)); 
            count++; 	
																                                              					                      	//increment number of tries for each attempt
        if(userAnswer==computerNumber)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter name");
	String s=in.nextLine();
	count=count-1;
	System.out.println("Name:\t\tHighScore:");
	System.out.println(s+"\t\t"+count);       
 } 
		}  
    }
    
    //Determine guess function to check how close number is to generated number and display try count
    public static String determineGuess(int userAnswer,int computerNumber,int count)
    {
        if(userAnswer<=0||userAnswer>100) 
        {
            return"Your guess is invalid";
        }
        else if(userAnswer==computerNumber)
        {
            return"Correct!\nTotal Guesses:"+count;
        }
        else if(userAnswer>computerNumber)
        {
		if(userAnswer>0&&userAnswer<=10)
            return"You are near to it try below 10.\nTry Number:"+count;
		else if(userAnswer>10&&userAnswer<=20)
	    return"You are near to it try below 20.\nTry Number:"+count;
		else if(userAnswer>20&&userAnswer<=30)
	return"You are near to it try below 30.\nTry Number:"+count;
		else if(userAnswer>30&&userAnswer<=40)
return"You are near to it try below 40.\nTry Number:"+count;
		else if(userAnswer>40&&userAnswer<=50)
return"You are near to it try below 50.\nTry Number:"+count;
		else if(userAnswer>50&&userAnswer<=60)
return"You are near to it try below 60.\nTry Number:"+count;
		else if(userAnswer>60&&userAnswer<=70)
return"You are near to it try below 70.\nTry Number:"+count;
		else if(userAnswer>70&&userAnswer<=80)
return"You are near to it try below 80.\nTry Number:"+count;
		else if(userAnswer>80&&userAnswer<=90)
return"You are near to it try below 90.\nTry Number:"+count;
		else if(userAnswer>90&&userAnswer<100)
return"You are near to it try below 100.\nTry Number:"+count;
		else
return"in valid \nTry Number:"+count;
        }
        else if(userAnswer<computerNumber)
        {       if(userAnswer>0&&userAnswer<=10)//{if(userAnswer==5)
		
            return"You are near to it try above 10.\nTry Number:"+count;
		else if(userAnswer>10&&userAnswer<=20)
	    return"You are near to it try above 20.\nTry Number:"+count;
		else if(userAnswer>20&&userAnswer<=30)
	return"You are near to it try above 30.\nTry Number:"+count;
		else if(userAnswer>30&&userAnswer<=40)
return"You are near to it try above 40.\nTry Number:"+count;
		else if(userAnswer>40&&userAnswer<=50)
return"You are near to it try above 50.\nTry Number:"+count;
		else if(userAnswer>50&&userAnswer<=60)
return"You are near to it try above 60.\nTry Number:"+count;
		else if(userAnswer>60&&userAnswer<=70)
return"You are near to it try above 70.\nTry Number:"+count;
		else if(userAnswer>70&&userAnswer<=80)
return"You are near to it try above 80.\nTry Number:"+count;
		else if(userAnswer>80&&userAnswer<=90)
return"You are near to it try above 90.\nTry Number:"+count;
		else if(userAnswer>90&&userAnswer<100)
return"You are near to it try above 100.\nTry Number:"+count;
		else
return"in valid \nTry Number:"+count;

        }
        else 
        {
            return"Your guess is incorrect\nTry Number:"+count;   
        }
    }
}
