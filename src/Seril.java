import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Seril {
public static void main(String args[]) throws Exception
{
	B xr=new B();
	xr.i=10;
	
	File f=new File("obj.txt");
	FileOutputStream fos=new FileOutputStream(f);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(xr);
	System.out.println(String.valueOf(xr));
	

	
	
	
}
}
class B implements Serializable
{
	int i;
	
}

