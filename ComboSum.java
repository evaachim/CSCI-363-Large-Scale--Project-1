package ComboSum;
//libraries to be used in this program
import java.io.*; 
import java.lang.*; 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.InputMismatchException;
//combo sum class
class Combo {
  public static List<List<Integer>> getSum(int[] my_arr, int my_target) {
     /**
   * This method is used to create arraylists and calls the CreateCombo method.
   * @param 1: add_elem. This is the first paramter to GetSum method. It is an ArrayList of integers
   * @param 2: ret. This is the second paramter to GetSum method. It is the second ArrayList of integers, to be returned.
   * @return int This returns the array with all of the indices whose elements add up to target.
   */
            List<Integer> add_elem = new ArrayList<Integer>();
            List<List<Integer>> ret = new ArrayList<List<Integer>>();
            //message for user
            System.out.println("Your Combinations are: ");
            createCombo(ret, add_elem, my_arr, my_target, 0);
            //check if it is empty and let user know if so. 
            if (ret.isEmpty()){
              System.out.println("Sorry. Your array does NOT have elements that can add up to your desired target! It's the empty set...");
            }
     //return the result
            return ret;
        }
         
        private static void createCombo(List<List<Integer>> ret, List<Integer> add_elem, int[] my_arr, int my_target,int pos) {
            /**
   * This method is used to populate the ret array with all of the indices that add up to my_target.
   * @param 1: n. This is the first parameter of the CreateCombo method. It is the length of the original array. 
   * @param 2: sum. This is the second paramter of the method. It is the sum of the elements in the original array.
   @param 3: i. This is the third parameter of the method. It is an iterator.
   @param 4: my_target. This is the fourth parameter of the method. It is the target sum that the method is looking for.
   @param 5: ret: the array to be returned from the GetSum method, where CreateCombo is called. It is an array of arrays.
   @param 6: add_elem. This is the 6th parameter of the method. It adds the indices tht add up to target into individual arrays. 
   * @return nothing. This is a void method. 
   */
                int n = my_arr.length;
                int sum = 0;
                for (int i: add_elem) {
                  if (sum<=my_target)
                  {
                    //keep adding elements up until target is reached
                        sum += my_arr[i];
                  }
                }
                    for (int i = pos; i < n; i++)
                    {
                       if (sum == my_target) {
                         //when target is reached, add the entire array to the array of arrays
                        ret.add(new ArrayList<Integer>(add_elem));
                        return;
                }
                 if (sum < my_target)
                {
                  //or else add elements to each array
                        add_elem.add(i);
                        //call method here
                        createCombo(ret, add_elem, my_arr, my_target, i+1);
                       add_elem.remove(add_elem.size() - 1);
                    }
                }
            }
}
