import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tree {
     public static void main(String args[])
     {
    	 HashMap m1=new HashMap();
    	 m1.put(1,new Student(1,"madhu",87));
    	 m1.put(2,new Student(2,"ashu",67));
    	 System.out.println(m1);
    	 System.out.println(m1.keySet());
    	 System.out.println(m1.values());
    	 System.out.println(m1.get(2));
    	 System.out.println(m1.containsKey(3));
    	
    	m1.put(3,new Student(3,"x",45));
    	 System.out.println(m1.values());
    	}
     }
     
 
    

