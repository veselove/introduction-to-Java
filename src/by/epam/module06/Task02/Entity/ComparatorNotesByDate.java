package by.epam.module06.Task02.Entity;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparatorNotesByDate implements Comparator<Note> {
	
	@Override
	public int compare(Note o1, Note o2) {
		LocalDate date1 = o1.getDateOfCreation();
		LocalDate date2 = o2.getDateOfCreation();
		
		int result = date1.compareTo(date2);
		if (result != 0) {
			return result;
		}
		return 0;
	}

}
