package com.example.assignment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {
    public int nextHighestNumber(String input) {
//        System.out.println("You entered number: " + input);
        try{
            // If the input string cannot be parsed to an integer,
            // an exception is thrown since it's an invalid integer.
            Integer.parseInt(input);
        } catch (Exception e) {
            log.error("Not a valid integer");
            return 0;
        }
        return findNextHighestNumber(input);
    }

    private int findNextHighestNumber(String input) {
        char[] inputArr = input.toCharArray();
        int i = inputArr.length-2;

        while(i >=0 && inputArr[i] >= inputArr[i+1]) {
            i--;
        }

        if(i < 0){
            return 0;
        }

        int j = inputArr.length-1;
        while(j >= 0 && inputArr[j] <= inputArr[i]) {
            j--;
        }

        swap(inputArr, i, j);
        reverse(inputArr, i+1);

        return Integer.parseInt(new String(inputArr));
    }


    private void swap(char[] inputArr, int i, int j) {
        char temp = inputArr[i];
        inputArr[i] = inputArr[j];
        inputArr[j] = temp;
    }

    private void reverse(char[] inputArr, int start) {
        int i = start, j = inputArr.length-1;
        while(i < j) {
            swap(inputArr, i, j);
            i++;
            j--;
        }
    }
}
