package by.epam.module05.task01.entity;

import java.util.Objects;

public class File {
	private String name;
	private String extension;
	private Directory directory;

	public File(String name, String extension, Directory directory) {
		this.name = name;
		this.extension = extension;
		this.directory = directory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Directory getDirectory() {
		return directory;
	}
	public void setDirectory(Directory directory) {
		this.directory = directory;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		File file = (File) o;
		return Objects.equals(name, file.name) &&
				Objects.equals(extension, file.extension) &&
				Objects.equals(directory, file.directory);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, directory, extension);
	}
	
}
