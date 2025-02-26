package com.example.project.Insertion_Sort;


import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ArrayList<String> words = InsertionSort.loadWordsInto(new ArrayList<String>());
        InsertionSort.selectionSortWordList(words);
        boolean pass = true;
        for(int i=1; i < words.size();i++){
            if(words.get(i).compareTo(words.get(i-1))<0){ //not in alphabetical order
                pass = false; 
                break;
            }
        }


        ArrayList<String> word = InsertionSort.loadWordsInto(new ArrayList<String>());
        word = InsertionSort.insertionSortWordList(word);
        boolean passes = true;
        for(int i=1; i < word.size();i++){
            if(word.get(i).compareTo(word.get(i-1))<0){ //not in alphabetical order
                passes = false; 
                break;
            }
        }
  
    }}