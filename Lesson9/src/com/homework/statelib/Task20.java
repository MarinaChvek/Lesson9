package com.homework.statelib;

public class Task20 {

        public static void main(String[] args) {
            String sentence = "Я помню чудное мгновение: "
                    + "Передо мной явилась ты, "
                    + "Как мимолетное видение, "
                    + "Как гений чистой красоты. ";

            sentence = sentence.replaceAll("[!.,:;-]", "");

            String[] words = sentence.split(" ");
            StringBuilder newSentence = new StringBuilder();

            for(String word : words) {
                newSentence.append(word.charAt(word.length()-1));
            }

            System.out.println(newSentence);
        }
    }

