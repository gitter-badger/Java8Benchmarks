package de.hawhamburg.java8.helper;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Init on 23.11.2014.
 */
public class RandomNumberArrays {

    private static final Random rand = new Random();

    private RandomNumberArrays(){
        super();
    }

    public static List<Integer> generateArrayAtGivenSize(int size){
        if (size < 0){
            throw new IllegalArgumentException();
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < size; i++){
            result.add(randInt(0, 10000000));
        }
        return result;
    }

    private static Integer randInt(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

}
