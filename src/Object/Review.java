package Object;

public class Review {
	private Review review;
	private int c;
	private int y;
	private String z;

	public Review(int c,String z,int y) {
		super();
		this.c=c;
		this.z=z;
		this.y=y;
	}
	
	public String toString() {
		return c + " "+ z + " " + y;
	}
}
