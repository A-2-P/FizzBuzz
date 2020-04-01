package org.example;

public class FizzBuzz implements IFizzBuzz {

    @Override
    public String fizzbuzz(int n) {
        String result = "";

        for (int i = 1; i <= n; i++) {
            if(i%3 == 0 && i%5 == 0){
                result += "Fizz Buzz";
                if(i!=n) result += ", ";
            }else {
                if (i % 3 == 0) {
                    result += "Fizz";
                    if(i!=n) result += ", ";
                } else if (i % 5 == 0) {
                    result += "Buzz";
                    if(i!=n) result += ", ";
                } else {
                    result =result +""+i;
                    if(i!=n) result += ", ";
                }
            }

        }


        return result;
    }
}
