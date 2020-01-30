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
package TargComboSum;
//libraries to be used in this program
import java.io.*; 
import java.lang.*; 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.InputMismatchException;
//combo targSum class
class Combo {
  //class that finds all of the combos 
  public static List<List<Integer>> getSum(int[] my_arr, int my_target) {
     /**
   * This method is used to create arraylists and calls the CreateCombo method.
   * @param 1: add_elem. This is the first paramter to GetSum method. It is an ArrayList of integers
   * @param 2: ret. This is the second paramter to GetSum method. It is the second ArrayList of integers, to be returned.
   * @return int This returns the array with all of the indices whose elements add up to target.
   */
            //array of the indices of elements that add up to targSum
            List<Integer> add_elem = new ArrayList<Integer>();
            //the array of arrays
            List<List<Integer>> ret = new ArrayList<List<Integer>>();
            //message for user
            System.out.println("Your Combinations are: ");
            createCombo(0, my_arr, my_target, add_elem,ret);
            //check if it is empty and let user know if so. 
            if (ret.isEmpty()){
              System.out.println("Sorry. Your array does NOT have elements that can add up to your desired target! It's the empty set...");
            }
     //return the result
            return ret;
        }


    private static void createCombo(int pos, int[] my_arr, int my_target,  List<Integer> add_elem,List<List<Integer>> ret) {
            /**
   * This method is used to populate the ret array with all of the indices that add up to my_target.
   * this method will be private, only for User class 
   * @param 1: n. This is the first parameter of the CreateCombo method. It is the length of the original array. 
   * @param 2: sum. This is the second paramter of the method. It is the sum of the elements in the original array.
   @param 3: i. This is the third parameter of the method. It is an iterator.
   @param 4: my_target. This is the fourth parameter of the method. It is the target sum that the method is looking for.
   @param 5: ret: the array to be returned from the GetSum method, where CreateCombo is called. It is an array of arrays.
   @param 6: add_elem. This is the 6th parameter of the method. It adds the indices tht add up to target into individual arrays. 
   * @return nothing. This is a void method. 
   */
   //the length of the array
                int n = my_arr.length;
                int targSum = 0;
                for (int i: add_elem) {
                  if (targSum<=my_target)
                  {
                    //keep adding elements up until target is reached
                        targSum += my_arr[i];
                  }
                }
                //loop to check if target was indeed reached
                    for (int i = pos; i < n; i++)
                    {
                       if (targSum == my_target) {
                         //when target is reached, add the entire array to the array of arrays
                        ret.add(new ArrayList<Integer>(add_elem));
                        return;
                }
                //the base case
                 if (targSum < my_target)
                {
                  //or else add elements to each array
                        add_elem.add(i);
                        //recurssively call method here
                        createCombo(i+1, my_arr, my_target,  add_elem, ret);
                       add_elem.remove(add_elem.size() - 1);
                    }
                    //end of base clase
                }
            }
}
//end of class
