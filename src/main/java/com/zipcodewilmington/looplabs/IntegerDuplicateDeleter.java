package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {super(intArray);}

    public int counter(Integer integer){
        int count = 0;
        for (Integer i : array) if (Objects.equals(i, integer)) count++;
        return count;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int numberOfEInNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (counter(array[i]) < (maxNumberOfDuplications)) {
                numberOfEInNewArray++;
            }
        }
        int k =0;
        Integer[] result = new Integer[numberOfEInNewArray];
        for (int j = 0; j < array.length; j++) {
            if (counter(array[j]) < maxNumberOfDuplications) {
                result[k] = array[j];
                k++;
            }
        } return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int numberOfEInNewArray = 0;
        for (Integer value : array) {
            if (counter(value) != (exactNumberOfDuplications)) numberOfEInNewArray++;
        }
        Integer[] result = new Integer[numberOfEInNewArray];
        int k =0;
        for (Integer integer : array) {
            if (counter(integer) != exactNumberOfDuplications) {
                result[k] = integer;
                k++;
            }
        } return result;
    }
}
