
public class Collect implements Comparable<Collect> {
  private int id;
  private String s;
public Collect(int id, String s) {
	super();
	this.id = id;
	this.s = s;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getS() {
	return s;
}
public void setS(String s) {
	this.s = s;
}
  public String toString() {
	  return id + " " +s;
  }
@Override
public int compareTo(Collect that) {
	return Integer.compare(this.id,that.id);
}
  
}
