package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int place;
        int count=0;
        for(int i=0; i<elements.length;i++){ ///Ex 5, 2, 9, 1, 5... 2,5,9,1,5
            while(i-1>=0&&elements[i-1]>elements[i]){
                count++;
                place = elements[i-1];
                elements[i-1]=elements[i];
                elements[i]=place;
                i--;
            }
        }
        System.out.println("insertion loops "+ count);
        return elements;
        }
    

   
    public static void selectionSort(int[] elements) {
        int min;
        int minidx;
        int place;
        int count=0;
         for(int i=0; i<elements.length-1;i++ ){ ///1, 10, 7, 3, 5, 2, 4, 9, 6, 8
             min=elements[i];
             minidx=i;
             for(int j=i;j<elements.length;j++){
                count++;
                 if(min>elements[j]){
                     min=elements[j];
                     minidx=j;
                 }
             }
             place= elements[i];
             elements[i]=min;
             elements[minidx]=place;
         }
         System.out.println("selection loops "+ count);
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        String place;
        int count=0;
        for(int i=0; i<words.size();i++){
            while(i-1>=0&&words.get(i-1).compareTo(words.get(i))>0){
                count++;
                place = words.set(i-1, words.get(i));
                words.set(i,place);
                i--;
            }
        }
        System.out.println("insertion loops "+ count);

        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        String before;
        int bidx;
        String place;
        int count=0;

         for(int i=0; i<words.size()-1;i++ ){ 
             before=words.get(i);
             bidx=i;
             for(int j=i;j<words.size();j++){
                count++;
                 if(before.compareTo(words.get(j))>0){
                     before=words.get(j);
                     bidx=j;
                 }
             }
             place= words.get(i);
             words.set(i, before);
             words.set(bidx, place);
         }
         System.out.println("selection loops "+ count);

    }

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