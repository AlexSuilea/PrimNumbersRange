package com.alexsuilea;

public class PrimNumbers {
    public static boolean isPrim(int number){
        if(number < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void rangeNumbers(int start, int end){
        if(start < 0 || end < 0 || start > end){
            System.out.println("Invalid Value");
            return;
        }
        for(int i = start; i <= end; i++){
            if(isPrim(i)){
                System.out.print(i + " ");
            }
        }
    }
}
