package by.epam.module04.agregation_composition.task1;

class Sentence {

	private String sentence;

	Sentence(String sentence) {
		this.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	@Override
	public String toString() {
		return sentence;
	}
}
