package com.sakshi.practice;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class App {
    public static void main(String[]args){
        List<String>words = Arrays.asList("Java","HELLO","Streams","java",null,"COLLECTOR");
        Set<String>result = words.stream().collect(CustomCollectors.toImmutableSortedLowerCase());
        System.out.println("Input:"+words);
        System.out.println("Output:"+result);

        try{
            result.add("test");

        }catch(UnsupportedOperationException e){
            System.out.println("Set is unmodifiable");
        }

    }
}
