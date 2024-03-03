package org.thirdTask;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for(int i=0; i<number.length; i++){
            if(number[i]%2==0){
                System.out.println(number[i]);
            }
        }
    }
}