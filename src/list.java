import java.util.ArrayList;
import java.util.List;

public class list extends ArrayList
{
public static void main(String args[]) {
	ArrayList<String> li=new ArrayList<String>(5);
	li.add("ball");
	li.add("set");
	System.out.println(li);
	List l=List.of("sit","run","walk");
	System.out.println(l);
	List ar=new ArrayList(l);
	ar.add("go");
	System.out.println(ar);
}
	
	
}
