package com.epam.sort;

import com.epam.sort.ForkJoinMergeSort;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void mergeSortTest() {
        int[] testData = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual =  ForkJoinMergeSort.sort(testData);
        for (int i=0;i<actual.length-1;i++){
            System.out.println(actual[i]);
        }
    }
}