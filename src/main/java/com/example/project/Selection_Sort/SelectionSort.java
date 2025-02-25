package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
       int min;
       int minidx;
       int place;
        for(int i=0; i<elements.length-1;i++ ){ ///1, 10, 7, 3, 5, 2, 4, 9, 6, 8
            min=elements[i];
            minidx=i;
            for(int j=i;j<elements.length;j++){
                if(min>elements[j]){
                    min=elements[j];
                    minidx=j;
                }
            }
            place= elements[i];
            elements[i]=min;
            elements[minidx]=place;
        }
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        String before;
       int bidx;
       String place;
        for(int i=0; i<words.size()-1;i++ ){ 
            before=words.get(i);
            bidx=i;
            for(int j=i;j<words.size();j++){
                if(before.compareTo(words.get(j))>0){
                    before=words.get(j);
                    bidx=j;
                }
            }
            place= words.get(i);
            words.set(i, before);
            words.set(bidx, place);
        }
       
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}
