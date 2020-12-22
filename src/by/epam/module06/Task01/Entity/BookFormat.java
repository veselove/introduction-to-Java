package by.epam.module06.Task01.Entity;

public enum BookFormat {
	
	PRINTED("printed"),
	DIGITAL("digital");
	
	private String bookFormat;
	
	BookFormat(String bookFormat) {
		this.bookFormat = bookFormat;
	}
	
	public String getBookFormat() {
		return bookFormat;
	}
	
	@Override
	public String toString() {
		return bookFormat;
	}
}
