package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        Integer[] temp = new Integer[intArray.length];
        int j = 0;

        for (int i = 0; i < intArray.length-1; i++) {
            if(intArray[i] != intArray[i+1]){
                temp[j++] = intArray[i];
            }
        } temp[j++] = intArray[intArray.length-1];
        for (int k = 0; k < j; k++) {
            System.out.println(temp[k]);
        }
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new Integer[0];
    }
}
