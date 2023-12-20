package Codsoft;
import java.util.Scanner;
import java.util.Random;
public class GuessingNumber {

	public static void main(String[]args){
		 Scanner sc=new Scanner(System.in);		       
	       boolean playagain=true;
	       while(playagain) {
	    	    game();
	    	    System.out.println("Do you want to play the game : Press Y for (yes) and N for (no)");
	    	    String decesion=sc.next().toLowerCase().toUpperCase();
	    	    
	    	    if(!decesion.equals("Y")) {
	    	    	playagain=false;
	    	    }
	    	    
	       }
	       
	       System.out.println("Thanks for playing........");
	       
}	       
	  

private static void game() {
     Random random =new  Random();
     Scanner sc=new Scanner(System.in);
	   int exactnum=random.nextInt(100)+1;
     int attempt=0;
     int maxattempt=10;
     boolean guessedcorrect=false;
     while(!guessedcorrect&&attempt<maxattempt) {
     System.out.print("Enter Your Guess : Between (1-100) : ");
	   int guessnum=sc.nextInt();
	   attempt++;
     if(guessnum == exactnum) {
  	   guessedcorrect=true;
  	   break;
     }
     else if(guessnum > exactnum) {
  	   System.out.println("Oops! too high.... ");
     }
     else {
  	   System.out.println("Oops! too low....");
     }
     }
     
     if(guessedcorrect) {
  	   System.out.println("Congrats! you've guessed the number "+exactnum+" correctly in "+attempt+" times");
     }else {
  	   System.out.println("You reached out of limit! The correct answer is :"+exactnum);
     }
    
}
}
	




