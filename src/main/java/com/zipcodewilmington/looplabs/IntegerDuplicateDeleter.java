package com.zipcodewilmington.looplabs;

import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {super(intArray);}

    public int counter(){
        int count = 0;
        for (Integer i :array) for (Integer j: array) if (Objects.equals(j, i)) count++;
        return count;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int j = 0;
        Integer[] temp = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            if(array[i] != array[i+1]){
                temp[j++] = array[i];
            }
        } temp[j++] = array[array.length-1];
        for (int k = 0; k < j; k++) System.out.println(temp[k]);
        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
//        Integer[] temp = new Integer[array.length];
//        int j = 0;
//
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] != array[i + 1]) {
//                temp[j++] = array[i];
//            }
//        }
//        temp[j++] = array[array.length - 1];
//        for (int k = 0; k < j; k++) {
//            System.out.println(temp[k]);
//            return new Integer[0];
//        }
        return new Integer[0];
    }
}
