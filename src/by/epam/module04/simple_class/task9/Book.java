package by.epam.module04.simple_class.task9;

public class Book {

	private String title;
	private String author;
	private String publisher;
	private int year;
	private int numberOfPages;
	private double price;
	private String bindingType;

	public Book(String title, String author, String publisher, int year, int numberOfPages, double price,
			String bindingType) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getYear() {
		return year;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public String getBindingType() {
		return bindingType;
	}

	@Override
	public String toString() {
		return this.getTitle() + ", " + this.getAuthor() + ", издательство " + this.getPublisher() + ", "
				+ this.getYear() + " г., " + this.getNumberOfPages() + "стр., " + this.getPrice() + "р., "
				+ this.getBindingType();
	}

}
