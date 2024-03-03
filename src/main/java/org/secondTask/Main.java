package org.secondTask;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String a;
        String b;

        Scanner string = new Scanner(System.in);
        System.out.print("Введите a: ");
        a = string.nextLine();

        System.out.print("Введите b: ");
        b = string.nextLine();

        if(a.equals(b)){
            System.out.println("Строки индентичны");
        }else{
            System.out.println("Строки неиндентичны");
        }
    }
}