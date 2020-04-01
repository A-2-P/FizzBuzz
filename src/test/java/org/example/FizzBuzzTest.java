package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    IFizzBuzz fizzy;
    @Before
    public void init(){
        fizzy = new FizzBuzz();

    }

    @Test
    public void FizzBuzzTest_1(){
        String result = "1";
        assertThat(result).isEqualTo(fizzy.fizzbuzz(1));
    }
    @Test
    public void FizzBuzzTest_7(){
        String result = "1, 2, Fizz, 4, Buzz, Fizz, 7";
        assertThat(result).isEqualTo(fizzy.fizzbuzz(7));
    }
    @Test
    public void FizzBuzzTest_36(){
        String result = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz";
        assertThat(result).isEqualTo(fizzy.fizzbuzz(36));
    }

}
