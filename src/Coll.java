import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coll {
        public static void main(String args[]) {
        	List x1=List.of(new Collect(20,"madhu"),new Collect(2,"sad"),new Collect(100,"happy"));
        	List x2=new ArrayList(x1);
        	System.out.println(x2);
        	Collections.sort(x2);
        	System.out.println(x2);
        }
     
}
