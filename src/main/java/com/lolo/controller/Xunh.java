package com.lolo.controller;

public class Xunh {
    public static void main(String[] args) {
        int lay=7; //表示有多少层
        for(int i=1;i<=7;i++) {
            for(int k=1;k<=7-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println( ); //打出一个换行
        }

    }
    }



