package app;

public class Book {
	private String title;
	private String category;
	public Book(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public String getTitle(String title) {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", category=" + category + "]";
	}
}
