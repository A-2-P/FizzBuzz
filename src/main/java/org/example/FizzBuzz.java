package org.example;

public class FizzBuzz implements IFizzBuzz {

    @Override
    public String fizzbuzz(int n) {
        String result = " ";

        for (int i = 1; i <= n; i++) {
            if(i%3 == 0 && i%5 == 0){
                result += " Fizz Buzz,";
            }else {
                if (i % 3 == 0) {
                    result += " Fizz,";
                } else if (i % 5 == 0) {
                    result += " Buzz,";
                } else {
                    result =result + " "+i+",";
                }
            }

        }


        return result;
    }
}
