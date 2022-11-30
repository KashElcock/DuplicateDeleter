package com.zipcodewilmington.looplabs;

import java.util.Objects;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public int counter(String input){
        int count = 0;
        for (String string : array) if (Objects.equals(string, input)) count++;
        return count;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int numberOfEInNewArray = 0;
        for (String s : array) {
            if (counter(s) < (maxNumberOfDuplications)) {
                numberOfEInNewArray++;
            }
        }
        int k =0;
        String[] result = new String[numberOfEInNewArray];
        for (String s : array) {
            if (counter(s) < maxNumberOfDuplications) {
                result[k] = s;
                k++;
            }
        }
        return result;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int numberOfEInNewArray = 0;
        for (String value : array) {
            if (counter(value) != (exactNumberOfDuplications)) numberOfEInNewArray++;
        }
        String[] result = new String[numberOfEInNewArray];
        int k =0;
        for (String s : array) {
            if (counter(s) != exactNumberOfDuplications) {
                result[k] = s;
                k++;
            }
        } return result;
    }
}
