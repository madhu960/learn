
public class Student {
	int marks;
	String name;
	int rollno;
	Student(){
	
	}
  Student(int rollno,String name,int marks)
  {
	  this.marks=marks;
	  this.name=name;
	  this.rollno=rollno;
  }
  public String toString() {
		return rollno+" "+name+" "+marks;
		
  }
}