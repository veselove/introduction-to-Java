package by.epam.module05.task01.main;

import by.epam.module05.task01.entity.TextFile;
import by.epam.module05.task01.logic.TextFileLogic;
import by.epam.module05.task01.entity.Directory;

/*
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Create a text file:");
		
		TextFile textFile = TextFileLogic.createTextFile("About Python", "txt", new Directory("C:\\Info"));
		
		textFile.setContent(
				"Java is a class-based, object-oriented programming language that is "
				+ "designed to have as few implementation dependencies as possible.");
		
		TextFileLogic.viewFile(textFile);
		
		System.out.println("\n\nRename the text file:");
		
		TextFileLogic.renameFile(textFile, "About Java");
		
		TextFileLogic.viewFile(textFile);
		
		System.out.println("\n\nAdd text file");
		
		TextFileLogic.addFile(textFile, "Let's add some text!");
		
		TextFileLogic.viewFile(textFile);
		
		System.out.println("\n\nClear the text file");
		
		TextFileLogic.clearFile(textFile);
		
		TextFileLogic.viewFile(textFile);
		
	}

}
