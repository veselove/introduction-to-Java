package by.epam.module06.Task02.Logic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import by.epam.module06.Task02.Entity.Note;

public class NoteCreator {
		
	public static void createNewNote() {

		Note newNote = new Note();
		
		LocalDate date = LocalDate.now();
		newNote.setDateOfCreation(date);
		
		System.out.println("Enter the topic of the note");
		for (;;) {
			String topic = getString();
			if (newNote.setTopic(topic)) {
				break;
			} else {
				System.out.println("Input field cannot be empty, try again");
			}
		}

		System.out.println("Enter E-mail");
		for (;;) {
			String email = getString();
			if (newNote.setEmail(email)) {
				break;
			} else {
				System.out.println("Invalid input, try again");
			}
		}

		System.out.println("Enter your message");
		for (;;) {
			String message = getString();
			if (newNote.setMessage(message)) {
				break;
			} else {
				System.out.println("Input field cannot be empty, try again");
			}
		}

		ArrayList<Note> notes = null;
		try {
			notes = NotesFileHandler.loadNotesFromFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		notes.add(newNote);
		try {
			NotesFileHandler.saveNotesToFile(notes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done! Note added");
	}
	
	
	public static String getString() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		return string;
	}

}
