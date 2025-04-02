package com.zipcodewilmington.arrayutility;


import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    private T[] array;
//
    public ArrayUtility(T[] array){
        this.array = array;
    }
    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        int count = 0;
        for (T item : arrayToMerge) {
            if (Objects.equals(item, valueToEvaluate)) {
                count++;
            }

        }
        for (T item : this.array) {
            if (Objects.equals(item, valueToEvaluate)) {
                count++;
            }

        }
        return count;
    }

    public T[] removeValue(T valueToRemove){
        ArrayList<T> newArr = new ArrayList<>();
        for (int i = 0; i < this.array.length; i++) {
            if (!this.array[i].equals(valueToRemove)){
                newArr.add(this.array[i]);
            }
        }
        T[] result = (T[]) Array.newInstance(this.array[0].getClass(), newArr.size());
        return newArr.toArray(result);
    }
        public Integer getNumberOfOccurrences(T valueToEvaluate) {
            Integer count = 0;
            for (int i = 0; i < this.array.length; i++) {
                if (this.array[i].equals(valueToEvaluate)) {
                    count++;
                }
            }
            return count;
        }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        int count = 0;
        T track = null;
        for (int i = 0; i< arrayToMerge.length; i++ ) {
            int k = 0;
            for (int j = 0; j < arrayToMerge.length; j++) {
                if (arrayToMerge[j].equals(arrayToMerge[i])) {
                    k++;
                }
            }
            if (k > count) {
                count = k;
                track = arrayToMerge[i];
            }
        }
        for (int i = 0; i< this.array.length; i++ ) {
            int k = 0;
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[j] == this.array[i]) {
                    k++;
                }
            }
            if (k > count) {
                count = k;
                track = arrayToMerge[i];
            }
        }
        
        return track;
    }


}
