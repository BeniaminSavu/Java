package com.iquest.week7.pr3;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Set<Train> set = new HashSet<Train>();
        set.add(new Train("asd",1,1));
        set.add(new Train("dgdf",1,2));
        set.add(new Train("asgshg",4,23));
        set.add(new Train("asd",1,1));
        
        System.out.println(set);
        System.out.println(set.size());
    }
}
