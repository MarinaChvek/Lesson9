package com.homework.statelib;

import java.sql.SQLOutput;

public class Task21 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        String[] fields = new String[]{"a", "b", "c", "d", "e", "f", "g"};
        String s = "";
        for (int i = 0; i < fields.length; i++) {
            s = s + fields[i];
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Execution time in milliseconds  : " + totalTime);

        long startTime1 = System.nanoTime();
        String[] fields1= new String[]{"a", "b", "c", "d", "e", "f", "g"};
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < fields1.length; i++) {
            s1.append(fields[i]);
        }
        long endTime1 = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;
        System.out.println("Execution time in milliseconds  : " + totalTime1);

    }
}