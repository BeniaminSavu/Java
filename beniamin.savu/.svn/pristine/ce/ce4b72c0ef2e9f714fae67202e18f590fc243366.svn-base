package com.iquest.week7pr4;



import java.util.HashMap;
import java.util.List;
import java.util.Map;


// With the hashcode returning a constant value the performance was 749956ns
// With the hashcode not returning a constant value the performance was 462489ns
public class App {
    public static void main( String[] args ){
    	Map<Train, List<Integer>> map = new HashMap<Train, List<Integer>>();
    	HashMapGenerator generator = new HashMapGenerator();
    	
    	
    	
    	generator.generate(map, 10000);
    	long start = System.nanoTime();
    	System.out.println(map.get(new Train("Type", 9000, 20)));
    	long end = System.nanoTime();
    	System.out.println(map.size());
    	System.out.println(end-start);
    }
}
