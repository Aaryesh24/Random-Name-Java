package com.wyvern.java;

public class Main {
    public static void main(String[] args){
        String[][] names = {{"Aaryesh", "Shivaroop", "Tarandip"},{"Aaditya", "Abhinav", "Sohan"}};
        int max = 2;
        int min = 0;
        int max1 = 1;
        int min1 = 0;
        int randomNum = (int) Math.floor(Math.random() * (max-min+1) + min);
        int randomNum2 = (int) Math.floor(Math.random() * (max1-min1+1) + min);
        System.out.println(names[randomNum2][randomNum]);
    }
}
