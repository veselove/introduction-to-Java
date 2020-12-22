package by.epam.module05.task01.logic;

import by.epam.module05.task01.entity.Directory;
import by.epam.module05.task01.entity.TextFile;

public class TextFileLogic {

	public static TextFile createTextFile(String name, String extension, Directory directory) {
		return new TextFile(name, extension, directory);
	}

	public static void viewFile(TextFile file) {
		System.out.print(file);
	}

	public static void renameFile(TextFile file, String newName) {
		file.setName(newName);
	}
	
	public static void addFile(TextFile file, String addition) {
		String originalContent = file.getContent();
		file.setContent(originalContent + " " + addition);
	}
	
	public static void clearFile(TextFile file) {
		file.setContent("");
	}
}
