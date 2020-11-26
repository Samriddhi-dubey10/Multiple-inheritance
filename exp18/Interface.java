package exp18;
interface Bookname{
	void name();
}
interface Bookauthor{
	void author();
	
}
class Book implements  Bookname ,Bookauthor{
	
	public void name() {
		System.out.println("Book name is Hamlet.");
	}
	public void author() {
		System.out.println("Author name is William Shakespeare.");
	}
	
}

public class Interface {
	public static void main(String[] args) {
		Book b = new Book();
		b.name();
		b.author();
	}

}
