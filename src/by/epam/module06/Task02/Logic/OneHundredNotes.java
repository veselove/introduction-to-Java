package by.epam.module06.Task02.Logic;

import java.time.LocalDate;
import java.util.ArrayList;

import by.epam.module06.Task02.Entity.Note;

public class OneHundredNotes {
	
	public static void sample() throws Exception {
		
		ArrayList<Note> notes = NotesFileHandler.loadNotesFromFile();
		
		for (int i = 0; i < 10; i++) {
			Note note = new Note();
			note.setTopic("Topic" + (i));
			note.setEmail("email" + (i) + "@mail.com");
			note.setMessage("Message" + (i));
			LocalDate date = LocalDate.of(2020, 11, 7);
			note.setDateOfCreation(date);
			notes.add(note);
		}
		
		NotesFileHandler.saveNotesToFile(notes);
		
	}

}
