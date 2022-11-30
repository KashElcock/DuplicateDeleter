package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
        Integer[] temp = new Integer[intArray.length];
        int j = 0;

        for (int i = 0; i < intArray.length-1; i++) {
            if(intArray[i] != intArray[i+1]){
                temp[j++] = Integer.valueOf(intArray[i]);
            }
        } temp[j++] = Integer.valueOf(intArray[intArray.length-1]);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        return new String[0];
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new String[0];
    }
}
