package by.epam.module03.string_regular;

/*
 * 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять 
 * с текстом три различных операции: отсортировать абзацы по количеству предложений; 
 * в каждом предложении отсортировать слова по длине; 
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) throws IOException {

		String text = "Чтобы дать вам понятие о том, как велика Земля, скажу лишь, что, пока не изобрели "
				+ "электричество, на всех шести континентах приходилось держать целую армию фонарщиков "
				+ "- четыреста шестьдесят две тысячи пятьсот одиннадцать человек.\n"
				+ "Если поглядеть со стороны, это было великолепное зрелище. Движения этой армии подчинялись "
				+ "точнейшему ритму, совсем как в балете.\n"
				+ "Первыми выступали фонарщики Новой Зеландии и Австралии. Засветив свои огни, они отправлялись"
				+ " спать. За ними наступал черед фонарщиков Китая. Исполнив свой танец, они тоже скрывались "
				+ "за кулисами. Потом приходил черед фонарщиков в России и в Индии. Потом - в Африке и Европе. "
				+ "Затем в Южной Америке. Затем в Северной Америке. И никогда они не ошибались, никто не "
				+ "выходил на сцену не вовремя. Да, это было блистательно.\n"
				+ "Только тому фонарщику, что должен был зажигать единственный фонарь на Северном полюсе, "
				+ "да еще его собрату на Южном полюсе - только этим двоим жилось легко и беззаботно: им "
				+ "приходилось заниматься своим делом всего два раза в год.";

		System.out.println("Нажмите клавишу, соответствующую необходимой операции:"
				+ "\n[1] - чтобы отсортировать абзацы по количеству предложений;"
				+ "\n[2] - чтобы в каждом предложении отсортировать слова по длине;"
				+ "\n[3] - чтобы отсортировать лексемы в предложении по убыванию количества вхождений"
				+ "\n      заданного символа, а в случае равенства - по алфавиту.");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n = reader.readLine();

		switch (n) {
		case "1":
			System.out.println(sortParagraphs(text));
			break;
		case "2":
			System.out.println(sortWords(text));
			break;
		case "3":
			System.out.println(sortTextByLexeme(text));
			break;
		}

	}

	private static String sortParagraphs(String text) {

		String[] paragraphs = text.split("\n", 0);

		int MaxQttOfSentences = 0;

		for (int i = 0; i < paragraphs.length; i++) {
			String[] sentencesOfParagraph = paragraphs[i].split("[!?.]", 0);
			if (sentencesOfParagraph.length > MaxQttOfSentences)
				MaxQttOfSentences = sentencesOfParagraph.length;
		}

		StringBuilder Builder = new StringBuilder();

		for (int i = 1; i <= MaxQttOfSentences; i++) {
			for (int j = 0; j < paragraphs.length; j++) {
				String[] sentencesOfParagraph = paragraphs[j].split("[!?.]", 0);
				if (sentencesOfParagraph.length == i)
					Builder.append(paragraphs[j]).append("\n");
			}
		}

		return Builder.toString();
	}

	private static String sortWords(String text) {

		StringBuilder Builder = new StringBuilder();

		String[] paragraphs = text.split("\n", 0);

		for (int i = 0; i < paragraphs.length; i++) {
			String[] sentencesOfParagraph = paragraphs[i].split("[!?.]", 0);
			for (int j = 0; j < sentencesOfParagraph.length; j++) {
				String[] wordsOfSentence = sentencesOfParagraph[j].split("[\\s]", 0);
				Builder.append(sortByLengthInSentence(wordsOfSentence));
			}
			Builder.append("\n");
		}

		return Builder.toString();

	}

	private static String sortByLengthInSentence(String[] arrayOfWords) {

		StringBuilder Builder = new StringBuilder();

		int maxLengthValue = 0;

		for (int i = 0; i < arrayOfWords.length; i++) {
			if (arrayOfWords[i].length() > maxLengthValue)
				maxLengthValue = arrayOfWords[i].length();
		}

		for (int i = 1; i <= maxLengthValue; i++) {
			for (int j = 0; j < arrayOfWords.length; j++) {
				if (arrayOfWords[j].length() == i)
					Builder.append(arrayOfWords[j]).append(" ");
			}
		}

		Builder.setLength(Builder.length() - 1);

		Builder.append(". ");

		return Builder.toString();

	}

	private static String sortTextByLexeme(String text) throws IOException {

		System.out.println("Set symbol:");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String lexeme = reader.readLine();

		StringBuilder Builder = new StringBuilder();

		String[] paragraphs = text.split("\n", 0);

		for (int i = 0; i < paragraphs.length; i++) {
			String[] sentencesOfParagraph = paragraphs[i].split("[!?.]", 0);
			for (int j = 0; j < sentencesOfParagraph.length; j++) {
				String[] wordsOfSentence = sentencesOfParagraph[j].split("[\\s]", 0);
				Builder.append(sortWordsByLexeme(wordsOfSentence, lexeme));
			}
			Builder.append("\n");
		}

		return Builder.toString();
	}

	private static String sortWordsByLexeme(String[] wordsOfSentence, String lexeme) {

		Arrays.sort(wordsOfSentence);

		int maxQttCounter = 0;

		Pattern pattern = Pattern.compile(lexeme);

		for (int i = 0; i < wordsOfSentence.length; i++) {
			Matcher matcher = pattern.matcher(wordsOfSentence[i]);
			int counter = 0;
			while (matcher.find())
				counter++;
			if (counter > maxQttCounter)
				maxQttCounter = counter;
		}

		StringBuilder Builder = new StringBuilder();

		for (int i = 0; i <= maxQttCounter; i++) {
			for (int j = 0; j < wordsOfSentence.length; j++) {
				Matcher matcher = pattern.matcher(wordsOfSentence[j]);
				int counter = 0;
				while (matcher.find())
					counter++;
				if (counter == maxQttCounter - i)
					Builder.append(wordsOfSentence[j] + " ");
			}
		}

		return Builder.toString();
	}

}
