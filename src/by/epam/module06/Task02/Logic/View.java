package by.epam.module06.Task02.Logic;

import java.util.ArrayList;

import by.epam.module06.Task02.Entity.Note;

public class View {

	public static void viewAllNotes() throws Exception {

		ArrayList<Note> notes = NotesFileHandler.loadNotesFromFile();
	
		for (int i = 0; i < notes.size(); i++) {
			System.out.println("\n***\n");
			System.out.println(notes.get(i));
		}
		
		if (notes.size() == 0) {
			System.out.println("*** No notes ***");
		}
	}
	
	public static void viewAllNotes(ArrayList<Note> notes) {
				
		for (int i = 0; i < notes.size(); i++) {
			System.out.println("\n***\n");
			System.out.println(notes.get(i));
		}
		
		if (notes.size() == 0) {
			System.out.println("*** No notes ***");
		}
	}
	
	

}
