package by.epam.module04.agregation_composition.task1;

class Word {

	private String word;

	Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return word;
	}

}