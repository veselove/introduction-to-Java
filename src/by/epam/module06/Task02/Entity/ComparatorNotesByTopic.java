package by.epam.module06.Task02.Entity;

import java.util.Comparator;

public class ComparatorNotesByTopic implements Comparator<Note> {

	@Override
	public int compare(Note o1, Note o2) {
		String topic1 = o1.getTopic();
		String topic2 = o2.getTopic();
		
		int result = topic1.compareTo(topic2);
		if (result != 0) {
			return result;
		}
		return 0;

	}
}
