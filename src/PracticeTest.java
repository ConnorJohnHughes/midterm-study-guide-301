import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }


    @Test
    void testDifferenceArray(){
        //arrange
        int[] numbers = {4,5,6,8,3,9};

        //act
        int actual = Practice.maxDiff(numbers);

        //assert
        assertEquals(6, actual);


    }



    @Test
    void testlongestWordArrayList(){
        //arrange
        ArrayList<String> words = new ArrayList<>(Arrays.asList("cat","dogs", "caterpillar", "sheep"));
        char let = 'c';
        //act
        String actual = Practice.longestWordArrayList(words, let);
        //assert
        assertEquals("caterpillar", actual);
    }




    @Test
    void testwordsLongerNShorterMHashSet() {
        //arrange
        HashSet<String> words = new HashSet<>(Arrays.asList("cat","dogs", "caterpillar", "sheep"));
        int n = 3;
        int m = 5;
        //act
        int actual = Practice.wordsLongerNShorterMHashSet(words, n, m);
        //assert
        assertEquals(1, actual);
    }



    @Test
    void testdiffOddAndEvenHashMapValues(){
        //arrange
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 2);
        numbers.put(2, 4);
        numbers.put(3, 5);
        numbers.put(4, 6);
        numbers.put(5, 7);
        numbers.put(6, 9);
        numbers.put(7, 8);
        numbers.put(8, 8);
        numbers.put(9, 8);
        numbers.put(10, 10);
        //act
        int actual = Practice.diffOddAndEvenHashMapValues(numbers);
        //assert
        assertEquals(4, actual);

    }


    @Test
    void testfindSecondLargestNumberHashMapKeys(){
        //arrange
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(2, 1);
        numbers.put(4, 2);
        numbers.put(5, 3);
        numbers.put(6, 4);
        numbers.put(7, 5);
        numbers.put(9, 6);
        numbers.put(8, 7);
        numbers.put(8, 8);
        numbers.put(8, 9);
        numbers.put(10, 10);
        //act
        int actual = Practice.findSecondLargestNumberHashMapKeys(numbers);
        //assert
        assertEquals(9, actual);


    }






}


