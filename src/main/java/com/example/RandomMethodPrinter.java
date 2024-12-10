package com.example;

import java.util.Random;

public class RandomMethodPrinter {

    public static void main(String[] args) {
        // Array of method comments and method calls
        String[][] methods = {
                {
                        "/**\n * Separate odd and even numbers in a list of integers.\n" +
                                " * Given a list of integers, write a Java 8 program to separate\n" +
                                " * the odd and even numbers into two separate lists.\n */",
                        "separationOfEvenOddNumberInMap();"
                },
                {
                        "/**\n * Remove duplicate elements from a list using Java 8 streams\n" +
                                " * Write a Java 8 program to remove duplicate elements from a list\n" +
                                " * using the stream API and lambda expressions.\n */",
                        "removeDuplicateFromList();"
                },
                {
                        "/**\n * Find the frequency of each character in a string using Java 8 streams\n" +
                                " * Write a Java 8 program to find the frequency of each character in\n" +
                                " * a given string using the stream API and collectors.\n */",
                        "characterFrequency();"
                },
                {
                        "/**\n * Find the frequency of each element in an array or a list\n" +
                                " * Write a Java 8 program to find the frequency of\n" +
                                " * each element in an array or a list using streams and collectors.\n */",
                        "wordFrequency();"
                },
                {
                        "/**\n * Sort a given list of decimals in reverse order\n" +
                                " * Write a Java 8 program to sort a given list of decimal numbers in reverse order.\n */",
                        "reverseSortedList();"
                },
                {
                        "/**\n * Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter\n" +
                                " * Given a list of strings, write a Java 8 program to join the strings\n" +
                                " * with '[' as a prefix, ']' as a suffix, and ',' as a delimiter.\n */",
                        "joinListOfStrings();"
                },
                {
                        "/**\n * Print the numbers from a given list of integers that are multiples of 5\n" +
                                " * Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.\n */",
                        "multipleOf5();"
                },
                {
                        "/**\n * Find the maximum and minimum of a list of integers\n" +
                                " * Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.\n */",
                        "minMaxFromList();"
                },
                {
                        "/**\n * Merge two unsorted arrays into a single sorted array using Java 8 streams\n" +
                                " * Write a Java 8 program to merge two unsorted arrays into a single-sorted array using the stream API.\n */",
                        "mergeUnsortedArrayIntoSorted();"
                },
                {
                        "/**\n * Merge two unsorted arrays into a single sorted array without duplicates\n" +
                                " * Write a Java 8 program to merge two unsorted arrays into a single-sorted array without duplicates.\n */",
                        "mergeUnsortedArrayIntoSortedWithoutDuplicate();"
                },
                {
                        "/**\n * Get the three maximum and three minimum numbers from a given list of integers\n" +
                                " * Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.\n */",
                        "min3max3();"
                },
                {
                        "/**\n * Check if two strings are anagrams or not using Java 8 streams\n" +
                                " * Write a Java 8 program to check if two strings are anagrams or not using the stream API and lambda expressions.\n */",
                        "isAnagram();"
                },
                {
                        "/**\n * Find the sum of all digits of a number in Java 8\n" +
                                " * Write a Java 8 program to find the sum of all digits of a given number.\n */",
                        "sumOf();"
                },
                {
                        "/**\n * Find the second-largest number in an integer array\n" +
                                " * Write a Java 8 program to find the second-largest number in an integer array.\n */",
                        "secondLargestNumberFromList();"
                },
                {
                        "/**\n * Sort a list of strings according to the increasing order of their length\n" +
                                " * Write a Java 8 program to sort a given list of strings according to the increasing order of their length.\n */",
                        "sortByLengthOfList();"
                },
                {
                        "/**\n * Find the sum and average of all elements in an integer array\n" +
                                " * Write a Java 8 program to find the sum and average of all elements in an integer array.\n */",
                        "calculateAndSumAndAverage();"
                },
                {
                        "/**\n * Find the common elements between two arrays\n" +
                                " * Write a Java 8 program to find the common elements between two arrays using streams.\n */",
                        "commonElements();"
                },
                {
                        "/**\n * Reverse each word of a string using Java 8 streams\n" +
                                " * Write a Java 8 program to reverse each word of a given string using the stream API and lambda expressions.\n */",
                        "reverseEachWord();"
                },
                {
                        "/**\n * Find the sum of the first 10 natural numbers\n" +
                                " * Write a Java 8 program to find the sum of the first 10 natural numbers using streams.\n */",
                        "sumOf10NaturalNumber();"
                },
                {
                        "/**\n * Reverse an integer array\n" +
                                " * Write a Java 8 program to reverse an integer array.\n */",
                        "reversedArray();"
                },
                {
                        "/**\n * Find the most repeated element in an array\n" +
                                " * Write a Java 8 program to find the most repeated element in an array.\n */",
                        "mostRepeatedElement();"
                },
                {
                        "/**\n * Check if a string is a palindrome using Java 8 streams\n" +
                                " * Write a Java 8 program to check if a given string is a palindrome using the stream API and lambda expressions.\n */",
                        "checkIsTheStringPalindrome();"
                },
                {
                        "/**\n * Find strings in a list that start with a number\n" +
                                " * Given a list of strings, write a Java 8 program to find the strings that start with a number.\n */",
                        "stringsStartsWithNumber();"
                },
                {
                        "/**\n * Extract duplicate elements from an array\n" +
                                " * Write a Java 8 program to extract duplicate elements from an array.\n */",
                        "extractDuplicateElements();"
                },
                {
                        "/**\n * Print duplicate characters in a string\n" +
                                " * Write a Java 8 program to print the duplicate characters in a string.\n */",
                        "duplicateCharactersInString();"
                },
                {
                        "/**\n * Find the first repeated character in a string\n" +
                                " * Write a Java 8 program to find the first repeated character in a string.\n */",
                        "firstRepeatedCharacter();"
                },
                {
                        "/**\n * Find the first non-repeated character in a string\n" +
                                " * Write a Java 8 program to find the first non-repeated character in a string.\n */",
                        "firstNonRepeatingCharacter();"
                },
                {
                        "/**\n * Generate the Fibonacci series\n" +
                                " * Write a Java 8 program to generate the Fibonacci series.\n */",
                        "generateFibonacciSeries();"
                },
                {
                        "/**\n * Print the first 10 odd numbers\n" +
                                " * Write a Java 8 program to print the first 10 odd numbers.\n */",
                        "firstTenOddNumbers();"
                },
                {
                        "/**\n * Get the last element of an array\n" +
                                " * Write a Java 8 program to get the last element of an array.\n */",
                        "lastElementInTheArray();"
                },
                {
                        "/**\n * Calculate the age of a person in years\n" +
                                " * Write a Java 8 program to calculate the age of a person in years given their birthday.\n */",
                        "calculatePersonAgeInYear();"
                }
        };

        // Randomly select a method
        Random random = new Random();
        int randomIndex = random.nextInt(methods.length);

        // Print the selected method comment and call
        System.out.println(methods[randomIndex][0]);
        System.out.println(methods[randomIndex][1]);
    }
}

