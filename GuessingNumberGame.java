/*
 * My name is Ruita Ubale
 * Guessing number program
 */
package game86491;
import java.util.*;
/**
 *
 * @author rui
 */
public class Game86491 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic 
       
       int win=0,loses=0,game=0;
        int randNumber,trialNumbers=0,count,input;
          
        ArrayList<Integer> trialNumber= new ArrayList<>();
        ArrayList<Integer> secretNumber= new ArrayList<>();
        Scanner in=new Scanner(System.in);
        boolean done=false;
        
        
        System.out.println("Welcome to the number guessing game.\nFor each game, you have at most 3 chances to guess a secret number from 1 to 10.");
        //Generate random number between 1 to 10
        randNumber = (int) (Math.random() * 10 + 1);
                  
        do
       
         { 
                 //System.out.println(randNumber);
                      
                  System.out.print("\nEnter a number from 1 to 10. Enter -1 to exit: ");
                  input = in.nextInt();
                  trialNumbers++;
                  if(input==randNumber)
                  {
                       
                       System.out.println("Congratulation, correct! Let’s start a new game.");
                       count=trialNumbers;
                       secretNumber.add(randNumber);
                       trialNumber.add(count);
                       win++;
                       game++;
                   trialNumbers=count-trialNumbers;
                   //if condition is true then it generate new random number between 1 to 10
                   randNumber = (int) (Math.random() * 10 + 1);
                  }
                  else if(input!=randNumber && trialNumbers<3)
                  {
                      int x=3-trialNumbers;
                      System.out.println("Not correct, try again you have only "+x+ " more chance");
                     
                  }
                  
                  
                 else if(input!=randNumber && trialNumbers>=3)
                  {
                   
                    System.out.println("Not correct. You have reached your third trial. The correct number is:"+randNumber+".\nLets start a new game");  
                   
                    loses++;
                    
                    game++;
                    count=trialNumbers+1;
                    trialNumber.add(count);
                    secretNumber.add(randNumber);
                    trialNumbers=count-trialNumbers-1;
                    //generate new random number between 1 to 10
                    randNumber = (int) (Math.random() * 10 + 1);
                    //System.out.println(randNumber);
                    
                  }
           }
        
        while(input!=-1);
        {
         //print the game summary       
         System.out.println("\nTotal number of games: " +game);
         System.out.println("\nTotal win games: " +win);
         System.out.println("\nTotal loses games: " +loses); 
         System.out.println("Game:      secretNumbers:     trialNumbers:");
         int i=0,j=0;
         for(;j<trialNumber.size();)
        {
         for(;i<secretNumber.size();i++)
         {
           System.out.println(""+(i+1)+"           "+secretNumber.get(i)+"                   "+trialNumber.get(j));
           j++;
         
         }  
       }
      }
    } 
}  

