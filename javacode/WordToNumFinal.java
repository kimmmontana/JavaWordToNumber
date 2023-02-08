package javacode;

import java.util.HashMap;

public class WordToNumFinal {

    static HashMap<String, Integer> numbers = new HashMap<String, Integer>();

    static HashMap<String, Integer> onumbers = new HashMap<String, Integer>();
    static HashMap<String, Integer> tnumbers = new HashMap<String, Integer>();

    static {
        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);
        numbers.put("ten", 10);
        numbers.put("eleven", 11);
        numbers.put("twelve", 12);
        numbers.put("thirteen", 13);
        numbers.put("fourteen", 14);
        numbers.put("fifteen", 15);
        numbers.put("sixteen", 16);
        numbers.put("seventeen", 17);
        numbers.put("eighteen", 18);
        numbers.put("nineteen", 19);
        numbers.put("twenty", 20);
        numbers.put("thirty", 30);
        numbers.put("forty", 40);
        numbers.put("fifty", 50);
        numbers.put("sixty", 60);
        numbers.put("seventy", 70);
        numbers.put("eighty", 80);
        numbers.put("ninety", 90);
        
        tnumbers.put("hundred", 100);
        
        onumbers.put("thousand", 1000);
        onumbers.put("million", 1000000);
        onumbers.put("billion", 1000000000);

    }


    public void wordToNumber(String input) {
        System.out.println("===========\nInput string = " + input);
        int result = 0;
        boolean IsValid = true;
        boolean flag = true;
        long finalResult =0;
        String[] splitted = null;

        if (input != null && input.length() > 0) {
            input = input.replaceAll("-", " ");
            input = input.toLowerCase().replaceAll(" and", " ");
            splitted = input.trim().split("\\s+");
        
            for (String word : splitted) {
                if (numbers.get(word) == null && onumbers.get(word) == null && tnumbers.get(word) == null) {
                    if (flag) {
                        System.out.print("Invalid word/s found : ");
                        flag = false;
                    }
                    System.out.print(word + " ");
                    IsValid = false;
                }

            }

            if (IsValid){
                for(String word : splitted){
                    if(numbers.get(word) != null ){
                        result += numbers.get(word);
                    }
                    else if(tnumbers.get(word) != null){
                        result *= tnumbers.get(word);
                    }

                    else if(onumbers.get(word) != null){
                        result *= onumbers.get(word);
                        finalResult += result;
                        result = 0;
                    }
                }
                finalResult += result;
                result = 0;
                System.out.println(finalResult);
            }
            
        }   
    }
}