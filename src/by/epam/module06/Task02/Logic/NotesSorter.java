package by.epam.module06.Task02.Logic;

import java.util.ArrayList;
import java.util.Collections;

import by.epam.module06.Task02.Entity.ComparatorNotesByDate;
import by.epam.module06.Task02.Entity.ComparatorNotesByEmail;
import by.epam.module06.Task02.Entity.ComparatorNotesByTopic;
import by.epam.module06.Task02.Entity.Note;

public class NotesSorter {
	
	public static void sortByDateByAscending() throws Exception {
		
		ArrayList<Note> notes = NotesFileHandler.loadNotesFromFile();
		
		ComparatorNotesByDate comparatorNotesByData = new ComparatorNotesByDate();
		Collections.sort(notes, comparatorNotesByData);
		
		View.viewAllNotes(notes);
		
	}
	
	public static void sortByDateByDescending() throws Exception {
		
		ArrayList<Note> notes = NotesFileHandler.loadNotesFromFile();
		
		ComparatorNotesByDate comparatorNotesByData = new ComparatorNotesByDate();
		Collections.sort(notes, comparatorNotesByData);
		Collections.reverse(notes);
		
		View.viewAllNotes(notes);
		
	}
	
	public static void sortByTopic() throws Exception {
		
		ArrayList<Note> notes = NotesFileHandler.loadNotesFromFile();
		
		ComparatorNotesByTopic comparatorNotesByTopic = new ComparatorNotesByTopic();
		Collections.sort(notes, comparatorNotesByTopic);
		
		View.viewAllNotes(notes);
		
	}
	
	public static void sortByEmail() throws Exception {
		
		ArrayList<Note> notes = NotesFileHandler.loadNotesFromFile();
		
		ComparatorNotesByEmail comparatorNotesByEmail = new ComparatorNotesByEmail();
		Collections.sort(notes, comparatorNotesByEmail);
		
		View.viewAllNotes(notes);
		
	}

}
