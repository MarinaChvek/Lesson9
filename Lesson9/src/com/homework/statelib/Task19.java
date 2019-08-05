package com.homework.statelib;

public class Task19 {


    /* метод позволяет сравнить массив символов
     * с символом переданнвм из вне
     * и выдает значение TRUE or FALSE
     */

    public static boolean compareChars(String sPattern, char ch) {

        boolean b = true;
        char sString;
        for (int i = 0; i < sPattern.length(); i++) {
            sString = sPattern.charAt(i);
            if (ch == sString) {
                b = false;
                break;
            }
        }
        return b;
    }
            public static int calcWordsFromStr (String s, String sP)
        {
            char symbol;  // хранит значения элементов массвиа символов обрабатываемой строки
            int sum = 0;
            String sn = ""; // создаем переменную для захвата слов
            for (int i = 0; i < s.length(); i++) {
                symbol = s.charAt(i);
                boolean b = compareChars(sP, symbol); //вызов функции, позволяющей сравнивать обрабатываемый символ с массивом символов
                if (b) {
                    sn += symbol;//
                } else {
                    if (!sn.equals("")) {
                        sum++;

                        System.out.println(sn);
                        sn = "";
                    }
                }
            }
            if (!sn.equals("")) {
                sum++;
                System.out.println(sn + "\n");
            }
            return sum;

        }

    public static void main (String[]args)
    {

        String s = "  Здесь есть\t и в начале  :  и в конце  . ";

        String sP = "\\W123456789`~!@#$%^&*()_-=+<>?/\\|'\":;{}[].,№;?/ ";
        int sum = calcWordsFromStr(s, sP); // вызов метода для подсчета слов в строке

        System.out.println("\nКоличество слов sum = " + sum + "\n");
        char[] sPa = sP.toCharArray();



    }


    }



