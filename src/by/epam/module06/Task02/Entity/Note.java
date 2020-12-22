package by.epam.module06.Task02.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Note implements Serializable {

	public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	private static final long serialVersionUID = 1L;
	private String topic;
	private LocalDate dateOfCreation;
	private String email;
	private String message;

	public Note() {

	}

	public String getTopic() {
		return topic;
	}

	public boolean setTopic(String topic) {
		String regex = "^\\s*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(topic);
		if (matcher.find()) {
			return false;
		} else {
			this.topic = topic;
			return true;
		}

	}

	public LocalDate getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(LocalDate dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {
		String regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.find()) {
			this.email = email;
			return true;
		} else {
			return false;
		}

	}

	public String getMessage() {
		return message;
	}

	public boolean setMessage(String message) {
		String regex = "^\\s*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(message);
		if (matcher.find()) {
			return false;
		} else {
			this.message = message;
			return true;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfCreation == null) ? 0 : dateOfCreation.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		if (dateOfCreation == null) {
			if (other.dateOfCreation != null)
				return false;
		} else if (!dateOfCreation.equals(other.dateOfCreation))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Topic: " + topic + "\nDate of creation: " + FORMATTER.format(dateOfCreation) + "\nE-mail: " + email
				+ "\n" + message;
	}

}
