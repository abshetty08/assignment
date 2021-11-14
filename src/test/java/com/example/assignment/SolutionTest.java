package com.example.assignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void nextHighestNumberValidSolution() {
        Solution solution = new Solution();

        String input = "12354";
        int expected = 12435;
        int result = solution.nextHighestNumber(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void nextHighestNumber2() {
        Solution solution = new Solution();

        String input = "12";
        int expected = 21;
        int result = solution.nextHighestNumber(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void nextHighestNumberNoSolution() {
        Solution solution = new Solution();

        String input = "54321";
        int expected = 0;
        int result = solution.nextHighestNumber(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void nextHighestNumberNoSolution2() {
        Solution solution = new Solution();

        String input = "21";
        int expected = 0;
        int result = solution.nextHighestNumber(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void nextHighestNumberWithInvalidInput() {
        Solution solution = new Solution();

        // When there is no solution return 0
        String input = "abc";
        int expected = 0;
        int result = solution.nextHighestNumber(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void nextHighestNumberWithInvalidInput2() {
        Solution solution = new Solution();

        // When there is no solution return 0
        String input = "123abc";
        int expected = 0;
        int result = solution.nextHighestNumber(input);
        Assertions.assertEquals(expected, result);
    }
}