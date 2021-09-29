package com.workspace;

import java.util.Scanner;

// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class Patterns {
    public static void main(String[] args) {
        int choice;
        System.out.print("Enter your choice >> ");
        Scanner in = new Scanner(System.in);
        choice = in.nextInt();
        System.out.print("Enter number of lines >> ");
        switch (choice){
            case 1 -> pattern1(in.nextInt());
            case 2 -> pattern2(in.nextInt());
            case 3 -> pattern3(in.nextInt());
            case 4 -> pattern4(in.nextInt());
            case 5 -> pattern5(in.nextInt());
            case 6 -> pattern6(in.nextInt());
            case 7 -> pattern7(in.nextInt());
            case 8 -> pattern8(in.nextInt());
            case 9 -> pattern9(in.nextInt());
            case 10 -> pattern10(in.nextInt());
            case 11 -> pattern11(in.nextInt());
            case 12 -> pattern12(in.nextInt());
            case 13 -> pattern13(in.nextInt());
            case 14 -> pattern14(in.nextInt());
            case 15 -> pattern15(in.nextInt());
            case 16 -> pattern16(in.nextInt());
            case 17 -> pattern17(in.nextInt());
            case 18 -> pattern18(in.nextInt());
            case 19 -> pattern19(in.nextInt());
            case 28 -> pattern28(in.nextInt());
            case 30 -> pattern30(in.nextInt());
            case 31 -> pattern31(in.nextInt());
        }
    }
    static void pattern1(int n){
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 1; i < (2*n); i++) {
            if(i <= n) {
                for (int j = 1; j < i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = (2*n) - i; j > 0; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int i = 0; i <= n; i++) {
            int noOfSpaces = n - i;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (n - noOfSpaces - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int i = n; i >= 0; i--) {
            int noOfSpaces = n - i;
            for (int j = noOfSpaces; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = (n - noOfSpaces - 1); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for (int i = 0; i < n; i++) {
            int noOfSpaces = n - i;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for (int i = n; i > 0; i--) {
            int noOfSpaces = n - i;
            for (int j = noOfSpaces; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for (int i = n; i > 0; i--) {
            int noOfSpaces = n - i;
            for (int j = noOfSpaces; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            int noOfSpaces = n - i;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        for (int i=1; i<= n ; i++)
        {
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || i == n || k==(2*i-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        for (int i=n; i>= 1 ; i--)
        {
            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i -1); k >= 1 ;k--) {
                if( k==1 || i == n || k==(2*i-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for (int i=1; i< n ; i++)
        {
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || k==(2*i-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=n; i>= 1 ; i--)
        {
            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i -1); k >= 1 ;k--) {
                if( k==1 || k==(2*i-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern16(int n){
        // Pascal's triangle
        int c = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0){
                    c = 1;
                } else {
                    c = c * (i - j + 1) / j;
                }
                System.out.print(c + " ");
            }
            System.out.println();
            }
        }
    static void pattern17(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern18(int n){
        for (int i = 0; i <= 2 * n; i++) {
            int totalColInRow = i > n ? 2 * n - i : i;
            int noOfSpaces = n - totalColInRow;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < totalColInRow; j++) {
                if(i != (n)) {
                    System.out.print(" ");
                }
            }
            for (int j = totalColInRow; j > 0; j--) {
                if(i != (n)) {
                    System.out.print(" ");
                }
            }
            for (int j = noOfSpaces; j > 0; j--) {
                System.out.print("*");
            }
            if(i != (n)) {
                System.out.println();
            }
        }
    }
    static void pattern19(int n){

    }
    static void pattern28(int n){
        for (int i = 0; i < 2 * n; i++) {
            int totalColInRow = i > n ? 2 * n - i : i;
            int noOfSpaces = n - totalColInRow;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalColInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        int originalN = n;
        n = 2 * n;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int atEveryIndex = originalN - Math.min(i, Math.min(j, Math.min((n - i), (n - j))));
                System.out.print((atEveryIndex + 1 )+ " ");
            }
            System.out.println();
        }
    }
}
