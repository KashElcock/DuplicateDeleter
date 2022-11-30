package com.zipcodewilmington.looplabs;

import java.util.Objects;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {super(intArray);}
    public int counter(){
        int count = 0;
        for (String i :array) for (String j: array) if (Objects.equals(j, i)) count++;
        return count;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] temp = new String[array.length];
        int j = 0;
        for (int i = 0; i < array.length-1; i++) {
                if(array[i] != array[i+1]){
                    temp[j++] = array[i];
                }
            } temp[j++] = array[array.length - 1];
        return new String[0];
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new String[0];
    }
}
