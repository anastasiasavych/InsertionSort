package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[7];

        for (int i = 0; i < arr.length; i++){
            Scanner in = new Scanner(System.in);
            System.out.println("Input '" +(i+1)+ "' number to sort...");
            int n = in.nextInt();
            arr[i] = n;
        }
        System.out.println(Arrays.toString(arr));
        int[] sortArr = insertionSort(arr);
        System.out.println(Arrays.toString(sortArr));

    }

    private static int[] insertionSort(int[] arr) {

        for(int i = 1; i< arr.length; i++){
            int k = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > k){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = k;
        }
        return arr;
    }
}

