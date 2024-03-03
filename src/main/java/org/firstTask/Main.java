package org.firstTask;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner number = new Scanner(System.in);
        System.out.print("Введите a: ");
        a = Integer.parseInt(number.nextLine());

        System.out.print("Введите b: ");
        b = Integer.parseInt(number.nextLine());

        if(a>b){
            System.out.println("а>b");
        }
        if(a<b){
            System.out.println("а<b");
        }
        if(a==b){
            System.out.println("а=b");
        }
        number.close();

        System.out.print("а+b=");
        System.out.println(a+b);

        System.out.print("а-b=");
        System.out.println(a-b);

        System.out.print("а*b=");
        System.out.println(a*b);

        System.out.print("а/b=");
        double del = (double) a /b;
        if(b==0){
            System.out.println("ая-яй-яй, а на ноль делить нельзя");
        } else {
            System.out.println(del);
        }
    }
}