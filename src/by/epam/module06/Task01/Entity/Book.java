package by.epam.module06.Task01.Entity;

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private String description;
	private int yearOfPublication;
	private BookFormat bookFormat;

	public Book() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public BookFormat getBookFormat() {
		return bookFormat;
	}

	public void setBookFormat(BookFormat bookFormat) {
		this.bookFormat = bookFormat;
	}
	
	public void setBookFormat(String bookFormat) {
		
		if (bookFormat.equals("printed")) {
		this.bookFormat = BookFormat.PRINTED;
		}
		else this.bookFormat = BookFormat.DIGITAL;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bookFormat == null) ? 0 : bookFormat.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearOfPublication;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookFormat != other.bookFormat)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearOfPublication != other.yearOfPublication)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return title + "\nAuthor(s): " + author + "\nPublisher: " + publisher + "\nDescriprion: " + 
	description + "\nYear of publication: " + yearOfPublication + "\nBook format: " + bookFormat + "\n"; 
	}
	
}
