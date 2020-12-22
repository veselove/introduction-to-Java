package by.epam.module06.Task02.Entity;

import java.util.Comparator;

public class ComparatorNotesByEmail implements Comparator<Note> {

	@Override
	public int compare(Note o1, Note o2) {
		String email1 = o1.getEmail();
		String email2 = o2.getEmail();
		
		int result = email1.compareTo(email2);
		if (result != 0) {
			return result;
		}
		return 0;

	}
}
