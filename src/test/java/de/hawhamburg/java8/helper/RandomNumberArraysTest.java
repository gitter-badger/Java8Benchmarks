package de.hawhamburg.java8.helper;

import org.hamcrest.collection.IsCollectionWithSize;
import org.hamcrest.collection.IsEmptyCollection;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

public class RandomNumberArraysTest {

    @Test
    public void testRandomArrayEmptySize(){
        List<Integer> randomArray = RandomNumberArrays.generateArrayAtGivenSize(0);

        Assert.assertThat(randomArray, IsNot.not(IsNull.nullValue()));
        Assert.assertThat(randomArray, Is.is(IsEmptyCollection.empty()));
    }

    @Test
    public void testRandomArrayWithSize1(){
        final int number = 10;
        List<Integer> randomArray = RandomNumberArrays.generateArrayAtGivenSize(number);

        Assert.assertThat(randomArray, IsNot.not(IsNull.nullValue()));
        Assert.assertThat(randomArray, IsNot.not(IsEmptyCollection.empty()));
        Assert.assertThat(randomArray, IsCollectionWithSize.hasSize(number));
    }

    @Test
    public void testRandomArrayWithSize2(){
        final int number = 100;
        List<Integer> randomArray = RandomNumberArrays.generateArrayAtGivenSize(number);

        Assert.assertThat(randomArray, IsNot.not(IsNull.nullValue()));
        Assert.assertThat(randomArray, IsNot.not(IsEmptyCollection.empty()));
        Assert.assertThat(randomArray, IsCollectionWithSize.hasSize(number));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomArrayGivenSizeNegative(){
        List<Integer> randomArray = RandomNumberArrays.generateArrayAtGivenSize(-1);
    }
}
