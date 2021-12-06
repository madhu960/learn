
public class Sequence {

	public static void main(String[] args) {
	    int i,j,k[];
	    int a[]= {1,2,3,5,5,7,7,7,8};
	    
		for(i=0;i<=10;i++) {
			for(j=i+1;j<=i+1;j++) {
				
			
			if(a[i]<j)
			{
				a[i]=a[i]+1;
			
			}
			if(a[i]==j)
			{
				System.out.println(a[i]);
			}
	
		}
	}
	            
		
	
	}
}
