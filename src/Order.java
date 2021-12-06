
import java.util.HashMap;


public class Order {
public static void main(String args[]) {
	String str = " my name is madhu";
	HashMap<Character,Integer> n=new HashMap<>();
	char[] ch=str.toCharArray();
	for(char c:ch)
	{
		Integer integer=n.get(c);
		if(integer==null)
		{
			n.put(c,1);
		}
		else
		{
			n.put(c,integer+1);
		}
	}
	
	System.out.println(n);
}
}