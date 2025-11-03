
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */


    public static int maxDiff(int[] nums) {
        // TODO: implement this
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int diff;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] > largest) {
                largest = nums[i];
            }
            if(nums[i] < smallest){
                smallest = nums[i];
            }
        }
        diff = largest - smallest;
        return diff;
    }


    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.



    public static String longestWordArrayList(ArrayList<String> words, char let){
        int longest = Integer.MIN_VALUE;
        String lWord = "";
        for(String word : words){
            if(word.charAt(0) == let && word.length() > longest){
                longest = word.length();
                lWord = word;
            }
        }

        return lWord;
    }


    public static int wordsLongerNShorterMHashSet(HashSet<String> words, int n, int m){
        int count = 0;
        for(String word : words){
            if(word.length() > n && word.length() < m){
                count ++;
            }
        }
        return count;
    }



    public static int diffOddAndEvenHashMapValues(HashMap<Integer, Integer> nums){
        int diff;
        int oddCount = 0;
        int evenCount = 0;
        for(int num : nums.values()){
            if(num % 2 == 0){
                evenCount++;
            } else{
                oddCount++;
            }
        }
        diff = evenCount - oddCount;
        return diff;
    }



    public static int findSecondLargestNumberHashMapKeys(HashMap<Integer, Integer> nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : nums.keySet()){
            if( num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }








}