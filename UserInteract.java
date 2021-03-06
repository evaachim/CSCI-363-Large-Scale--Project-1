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
//package it 
package UserInter;

//get all necessary libtaries
import java.io.*; 
import java.lang.*; 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.InputMismatchException;
//user class
class User {
  //public variables
  public static String target;
  public static int my_target;
  /**
   * This method is used to greet the user.
   * @return nothing.
   */
  public static void sayHello()
  {
    System.out.println("\n*** Hello! Welcome! *** \n *** Today we Play Combo-Target-Sum! *** \n *** Have Fun *** \n");
  }

  /**
   * This method is used to check if user input is numeric or not
   * This method is private only accessible in User class
   * @param userInput This is the first paramter to numOrNo method. It takes the user's input and checks if it is numeric or not.
   * @param check is the second parameter of the numOrNo method. It is used in a try catch statement.
   * @return boolean. True or false. 
   */
private static boolean numOrNo(String userInput) {
    if (userInput == null) {
        return false;
    }
    //try catch for wrong inputs
    try {
        int check = Integer.parseInt(userInput);
    } catch (NumberFormatException nfe) {
        return false;
    }
    //everything is allright 
    return true;
}

  /**
   * This method is used to ask and get the target from user input
   * @param target This is the first paramter to GetTarget method. It takes the user's input
   * @param my_target is the second parameter of the GetTarget. It casts the user input to an integer
   * @return int This returns my_target.
   */
  public static int getTarget(){
  Scanner myGetTarget = new Scanner(System.in); 
  System.out.println("Enter a target sum");
  target = myGetTarget.nextLine(); 
  //in case the input is not numeric
  while (!numOrNo(target)){
    //keep asking the user to try again
    System.out.println("Sorry. That was not a number! Enter a target sum");
  target = myGetTarget.nextLine(); 
  }
  //cast to integer
  my_target = Integer.parseInt(target);	
  //return it to be used as the target for targSum
  return my_target;
      }
}
