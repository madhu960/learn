package Object;

public class Address {
     private String line1;
     private String line2;
     
     public Address(String line1,String line2){
    	 this.line1=line1;
    	 this.line2=line2;
     }

	
	public String toString() {
		return line1 + " " + line2;
	}
      
}
