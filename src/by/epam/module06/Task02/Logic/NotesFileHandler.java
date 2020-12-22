package by.epam.module06.Task02.Logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import by.epam.module06.Task02.Entity.Note;

public class NotesFileHandler {
	
	final static File NOTES_FILE_PATH = new File("src\\by\\epam\\module06\\Task02\\Resources\\Notes.ser");

	
	public static ArrayList<Note> loadNotesFromFile() throws Exception {
		
		if (!NOTES_FILE_PATH.exists()) {
			ArrayList<Note> notes = new ArrayList<Note>();
			saveNotesToFile(notes);
		}
		
		
		FileInputStream fileInputStream = new FileInputStream(NOTES_FILE_PATH);
	    @SuppressWarnings("resource")
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

	    @SuppressWarnings("unchecked")
		ArrayList<Note> notes = (ArrayList<Note>) objectInputStream.readObject();
	    
	    return notes;

	}
 
	
	public static void saveNotesToFile(ArrayList<Note> notes) throws Exception {
		
		FileOutputStream outputStream = new FileOutputStream(NOTES_FILE_PATH);

	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
	    objectOutputStream.writeObject(notes);
	    objectOutputStream.close();

	}

}
