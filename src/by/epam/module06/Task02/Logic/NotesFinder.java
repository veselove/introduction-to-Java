package by.epam.module06.Task02.Logic;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.module06.Task02.Entity.Note;

public class NotesFinder {

	public static void findNote() throws Exception {

		ArrayList<Note> notes = NotesFileHandler.loadNotesFromFile();

		selectionNotesByTopic(notes);
		selectionNotesByEmail(notes);
		selectionNotesByMessage(notes);
		selectionNotesByDate(notes);

		if (notes.size() == 0) {
			System.out.println("No results");
		} else {
			View.viewAllNotes(notes);
		}
	}

	private static void selectionNotesByTopic(ArrayList<Note> notes) {
		System.out.println(
				"Enter the topic of the note you are looking for. Leave this parameter blank to skip this parameter");
		String topic = getString();
		if (!topic.isEmpty()) {
			for (int i = 0; i < notes.size(); i++) {
				if (!searchFragmentInText(topic, notes.get(i).getTopic())) {
					notes.remove(i);
					i--;
				}
			}
		}
	}

	private static void selectionNotesByEmail(ArrayList<Note> notes) {
		System.out.println(
				"Enter the email of the note you are looking for. Leave this parameter blank to skip this parameter");
		String email = getString();
		if (!email.isEmpty()) {
			for (int i = 0; i < notes.size(); i++) {
				if (!searchFragmentInText(email, notes.get(i).getEmail())) {
					notes.remove(i);
					i--;
				}
			}
		}
	}

	private static void selectionNotesByMessage(ArrayList<Note> notes) {
		System.out.println(
				"Enter the message of the note you are looking for. Leave this parameter blank to skip this parameter");
		String message = getString();
		if (!message.isEmpty()) {
			for (int i = 0; i < notes.size(); i++) {
				if (!searchFragmentInText(message, notes.get(i).getMessage())) {
					notes.remove(i);
					i--;
				}
			}
		}
	}

	private static void selectionNotesByDate(ArrayList<Note> notes) throws ParseException {
		System.out.println(
				"Enter the date of the note you are looking for in \"dd.mm.yyyy\". Leave this parameter blank to skip this parameter");
		String date = getString();
		while (!isValidDate(date)) {
			System.out.println("Wrong input. Please enter the date in the format \"dd.mm.yyyy\"");
			date = getString();
		}
		for (int i = 0; i < notes.size(); i++) {
			LocalDate tmpDate = LocalDate.parse(date, Note.FORMATTER);
			if (!tmpDate.equals(notes.get(i).getDateOfCreation())) {
				notes.remove(i);
				i--;
			}
		}
	}

	private static boolean searchFragmentInText(String searchedFragment, String text) {
		Pattern pattern = Pattern.compile(searchedFragment);
		Matcher matcher = pattern.matcher(text);
		return matcher.find();

	}

	private static boolean isValidDate(String date) {
		try {
			LocalDate.parse(date, Note.FORMATTER);
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	private static String getString() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		return string;
	}

}
