package com.utils;

import org.assertj.core.api.*;
import org.assertj.core.api.SoftAssertions;

import java.awt.image.BufferedImage;
import java.io.File;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SoftAssertionUtils {

    private static final ThreadLocal<SoftAssertions> softAssertion = new ThreadLocal() {
        public Object initialValue() {
            return new SoftAssertions();
        }
    };


    public static BigDecimalAssert softlyAssertThat(BigDecimal actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static BooleanAssert softlyAssertThat(Boolean actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static BooleanArrayAssert softlyAssertThat(boolean[] actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static ObjectAssert softlyAssertThat(BufferedImage actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static ByteAssert softlyAssertThat(byte actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static ByteAssert softlyAssertThat(Byte actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static ByteArrayAssert softlyAssertThat(byte[] actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static CharacterAssert softlyAssertThat(char actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static CharacterAssert softlyAssertThat(Character actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static CharArrayAssert softlyAssertThat(char[] actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static IterableAssert softlyAssertThat(Collection<?> actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static ListAssert softlyAssertThat(List<?> actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static DoubleAssert softlyAssertThat(double actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static DoubleAssert softlyAssertThat(Double actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static DoubleArrayAssert softlyAssertThat(double[] actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static FileAssert softlyAssertThat(File actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static FloatAssert softlyAssertThat(float actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static FloatAssert softlyAssertThat(Float actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static FloatArrayAssert softlyAssertThat(float[] actual) {
        return softAssertion.get().assertThat(actual);
    }

    public static IntegerAssert softlyAssertThat(int actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static IntegerAssert softlyAssertThat(Integer actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static IntArrayAssert softlyAssertThat(int[] actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static IterableAssert softlyAssertThat(Iterable<?> actual) {
        Iterator<?> iterator = actual == null ? null : actual.iterator();
        return softAssertion.get().assertThat(iterator);
    }

    public static IterableAssert softlyAssertThat(Iterator<?> actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static LongAssert softlyAssertThat(long actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static LongAssert softlyAssertThat(Long actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static LongArrayAssert softlyAssertThat(long[] actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static MapAssert softlyAssertThat(Map<?, ?> actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static ObjectAssert softlyAssertThat(Object actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static ObjectArrayAssert softlyAssertThat(Object[] actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static ShortAssert softlyAssertThat(short actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static ShortAssert softlyAssertThat(Short actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static ShortArrayAssert softlyAssertThat(short[] actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static StringAssert softlyAssertThat(String actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static ThrowableAssert softlyAssertThat(Throwable actual) {
        return  softAssertion.get().assertThat(actual);
    }

    public static void softlyAssertAll() {
        softAssertion.get().assertAll();
    }

    public static void removeSoftAssertion(){
        softAssertion.remove();
    }

}
