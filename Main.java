/**
* The Combo TargSum Program Finds all of the possible *combinations in the array that add up to a target
* 
* @author:  Eva Achim
* @Occupation: Howard University Student
* @Student ID: @02903226
* @Usage: CSCI 363
* @When: January 18th 2020
* @Customer: Bernard Wolfolk
* @Expectations: User interacts with interface
* @Test Cases in Test Cases.txt
*/
//different classes
import UserInter. *;
import TargComboSum. *;
//libraries to be used in this program
import java.io.*; 
import java.lang.*; 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.InputMismatchException;

//array class
class ArrIn {

         /**
   * This method is used to allow the user to manuakky enter the array elements
   * @param 1: theCount. This is the first parameter of the getMyArr method. It is the length of the array, as provided by the user. 
   * @param 2: len. This is the second paramter of the method. It is the integer value of param 1.
   @param 3: my_arr. This is the third parameter of the method. It is the array that the user populates
   @param 4: i. This is the fourth parameter of the method. It is an loop variable.
   @param 5: j: parameter of the method. It is an loop variable.
   * @return the array as entered by user. 
   */
  public static int[] getMyArr()
  {
    //prompt user
  System.out.println("Enter the number of elements in array");
  Scanner myGet = new Scanner(System.in); 
  //get the number of elements
  String theCount = myGet.nextLine();
  //if the input is not numeric
  while (!User.numOrNo(theCount)){
    System.out.println("Sorry. That was not a number! Enter a count number");
    //accept new input if previous was wrong
    theCount = myGet.nextLine(); 
  }
  
  //cast to int
  int len = Integer.parseInt(theCount);
  //if length is invalid
  while (len==0 || len <= -1){
    System.out.println("Sorry. You cannot have an array with less than 1 element. Enter a different number!");
    //prompt the user again
    theCount = myGet.nextLine(); 
  }
          int [] my_arr = new int[len+1];
        System.out.println("Enter elements in array. Must be " + theCount + " elements");
       //populate the array
        for (int i = 0; i < len; i++) {
                try{
                my_arr[i] = myGet.nextInt();
                }
                //in case the input is not numeric
                catch (InputMismatchException exception) 
              { 
    System.out.println("Integers only, please."); 
    myGet.next();
    //allow new input if previous was wrong
    my_arr[i]=myGet.nextInt();
          }
            }
          int []an_arr = new int[len];
          for (int j = 0; j < len; j++) {
           
                an_arr[j] = my_arr[j];
            }
            //show array
        System.out.println("Your array is: " + Arrays.toString(an_arr));
        //return it
        return my_arr; 
            }
        }
        
  
//main class aka "driver class"
  //wanted to rename Driver but Repl.it does not allow me to rename the file to Driver.java from Main.java
class Main {
  /* This is the main method. It implements the program
  *@call 1: public static sayHello method
  *@param inOp: first parameter of the method. Takes in user input to stay or quit.
  *@call 2: public static getTarget method
  *
  */
  public static void main(String args[]) {
  //greet user
   User.sayHello();
   //input for stay or go
   String inOp = "";
  // get input 
   Scanner sc = new Scanner(System.in);
        while (!inOp.toUpperCase().equals("Q"))
{
       //implement all program here
        System.out.println(Combo.getSum(ArrIn.getMyArr(), User.getTarget()));
        //ask user to press something
        System.out.println("Press Q or q to quit. Any key to continue ...");
        //get input
        inOp = sc.next();
        //make it all uppercase so it is easier to check it
        if(!inOp.toUpperCase().equals("Q"))
        {
          //a new round started
          System.out.println("***** New Round ! *******");
        }
}
//end of program
System.out.println("***** BYE !!! *******");
//stop everything
System.exit(0);
  }
}
