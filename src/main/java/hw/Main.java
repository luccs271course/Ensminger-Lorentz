package hw;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Main {

    public static void main(String[] args) {

            int max;
            if(args.length>0){
                try{
                    max=Integer.parseInt(args[0]);
                }catch(NumberFormatException e)
                {
                    System.err.println("The argument entered must be an integer ");
                    System.exit(1);
                }
            }
            fizzBuzz(max);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> storage = new ArrayList<>();
        String message = "The integer entered must be greater than or equal to 1";
        if (n>0) {
            for (int i = 1; i < n + 1; i++) {
                if ((i % 3 == 0 && i % 5 == 0) && i != 0) {
                    storage.add("fizz buzz");
                } else if ((i % 3 == 0) && i != 0)

                {
                    storage.add("fizz");
                } else if ((i % 5 == 0) && i != 0) {
                    storage.add("buzz");
                } else {
                    storage.add(Integer.toString(i));
                }
                String output = storage.get(i - 1);
                System.out.println(output);
            }
            return storage;
        }
        else{
            return message;
        }
    }
}

