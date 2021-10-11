package com.company;
import java.util.Scanner;
public class Main {
    //Main input to print all the info
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        sumToTen();
        firstAndLastTwo();
        printOneHundred();
        createEvenNumber( false);
        createEvenArrayList(true);
        returnLetter("Hello");
        createAlternatingArray();
        System.out.print("hi");
    }
    //Question 0
    static double sumToTen() {
        double num = 10;
        double sum = 0;
        //find the sum of 10
        for (int i = 1; i <= num; i++) {
            sum = i / 2;
        }
        System.out.println("Sum is: " + sum);
        return sum;
    }
    //Question 1
    static String firstAndLastTwo() {
    Scanner input =new Scanner(System.in);
    System.out.println("Write a word: ");
       String word= input.nextLine();
        String f = "";
        if (word.length() > 4) {
            f = word.substring(0, 4);

        } else {
            return word;
        }
        return f;
    }
    //Question 2
    static void printOneHundred() {
        int sum = 0;
        int i;
        //This confusing loop explains if it <= 100 it will then find the sum to then
        //make sure it is a positive number
        for (i = 1; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    //Question 5
    static String returnLetter(String str) {
        str = "Hello";
        char[] letter = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            letter[i] = str.charAt(i);
        }
        for (char w : letter) {
            System.out.println(letter);
        }
        return str;
    }
    //Question 6
    static void createAlternatingArray() {
        int[] loop = new int[5];
        int[] loop2= new int[5];
        for (int i = 0; i < 5; i++) {
            loop[i] = i + 1;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(loop[i] + " ");
        }
        System.out.println();
        int reversenumbers = loop2[0];
        loop2[0] = loop2[loop2.length - 1];
        loop2[loop2.length - 1] = reversenumbers;
        for (int i = 0; i < 5; i++) {
            System.out.print(loop2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(loop[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(loop2[i] + " ");
        }
        System.out.println();
    }
    ///Stuff needed to be finished
    //Question 3
    static boolean createEvenNumber(boolean b) {

        Scanner in =new Scanner(System.in);
        System.out.println("Write a number: ");
        int num=  in.nextInt();
        for (int i = 0; i <= num - 1; i++) {
            if (num % 2 == 0) {
                System.out.println("This is an Even Number:" + num);
                return true;
            }
        }
        System.out.println("This is an Odd Number:" + num);
        return false;
    }
    //Still working on it got half of it 3 &4
    //Question 4
    static boolean createEvenArrayList(boolean b) {

        int input = 0;
        int i[]={0,2,4,6,8,10,12,14,16,18};
        int w[]={1,3,5,7,9,11,13,15,17,19};
        if (input % 2 == 0) {
            System.out.println("This is an even number"+ i);

            return (true);
        }
        System.out.println("This is an odd number"+ w);
        return false;
    }
}
