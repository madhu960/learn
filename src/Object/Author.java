package Object;

public class Author {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book(12,"oops","ranga");
		b.addReview(new Review(10,"Greatbook",5));
		System.out.println(b);

	}

}
