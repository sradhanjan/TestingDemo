package app;
import java.util.List;

public class Library {
	BookDB db;
	
	public Library(List<Book> books) {
		this.db = db;
	}
	public List<Book> getBooksByCategory(String category)
	{
		if(category.equals("Fiction"))
		{
			return db.getFictionBooks();
		}
		else
		{
			return null;
		}
	}
}
