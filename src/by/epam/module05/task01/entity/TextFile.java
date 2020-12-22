package by.epam.module05.task01.entity;

import java.util.Objects;

public class TextFile extends File {
	
	private String content;

	public TextFile(String name, String extension, Directory directory) {
		super(name, extension, directory);
	}
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this ==o ) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		TextFile textFile = (TextFile) o;
		return Objects.equals(content, textFile.content);
	}
	
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), content);
    }
    
    @Override
    public String toString() {
        return this.getDirectory() + "\\" + this.getName() + "." + this.getExtension() + "\n" +
                content;
    }
	
}
