package com.sakshi.practice;
import java.util.*;
import java.util.stream.Collector;

public final class CustomCollectors{
    private CustomCollectors(){}

    public static Collector<String,?,Set<String>>toImmutableSortedLowerCase(){
        return Collector.of(
                TreeSet<String>::new,(set,s)->{
                    if(s!=null){
                        set.add(s.toLowerCase());

                    }
                },
                (left,right)->{
                    left.addAll(right);
                    return left;
                },set->Collections.unmodifiableSet(set)
        );
    }
}
