package test.unit;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.*;
import org.junit.Test;
import org.mockito.Mockito;

import app.Book;
import app.BookDB;
import app.Library;
import com.sun.tools.javac.util.List;

public class BookTest {
	@Test
	public void test() {
		// Mock object
		BookDB db = Mockito.mock(BookDB.class);
		Library lib = new Library(db);
		List<Book> fictionBooks = new ArrayList<>();
		Book book1 = new Book("abc", "Fiction");
		Book book2 = new Book("xyz", "Fiction");
		fictionBooks.add(book1);
		fictionBooks.add(book2);
		
		// Stub
		when(db.getFictionBooks()).thenReturn(fictionBooks);
		List<Book> actlist = lib.getBooksByCategory("Fiction");
		assertEquals(fictionBooks,actlist);
		
	}
}
