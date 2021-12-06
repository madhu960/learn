package Object;

public class Book {
	private int num;
    private String bookname;
    private String authorname;
    
	
        public Book(int num, String bookname, String authorname) {
		super();
		this.num = num;
		this.bookname = bookname;
		this.authorname = authorname;
	}


		public void addReview(Review review) {
			System.out.println(review);
			
		}
public String toString() {
	return num + " " + bookname + " " + authorname;
}

		
}
