
public class AuthorMain {

	public static void main(String[] args) {
		Author author=new Author("ABJ","abj@gmail.com",'m');
		Book b=new Book("ABJ","abj@gmail.com",'m',"India 2020",author,120.25,2);
		System.out.println(b.toString());
	}

}
