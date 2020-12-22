package by.epam.module06.Task01.Logic;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import by.epam.module06.Task01.Entity.User;

public class UserDatabaseLogic {
	
	

	public static String encodePassword(String string) {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < string.length(); i++) {
			int tmp = (int) string.charAt(i) - 4;
			char tmpChar = (char) tmp;
			builder.append(tmpChar);
		}

		String result = builder.toString();

		return result;

	}

	public static ArrayList<User> getUserDatabaseFromTXT() throws Exception {

		ArrayList<User> users = new ArrayList<User>();

		File file = new File("src\\by\\epam\\module06\\Task01\\UserList.txt");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String temp = sc.nextLine();
			User user = new User();
			Scanner sc2 = new Scanner(temp).useDelimiter(" ");
			user.setUsername(sc2.next());
			user.setPassword(sc2.next());
			user.setEmail(sc2.next());
			user.setStatus(sc2.next());
			users.add(user);
			sc2.close();
		}
		return users;
	}

	public static void viewUsers(ArrayList<User> users) { // временный метод
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
		}

	}

	public static User validation(String login, String password) throws Exception {

		String encodedPassword = encodePassword(password);

		ArrayList<User> users = getUserDatabaseFromTXT();

		User searchedUser = new User();

		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equals(login) && users.get(i).getPassword().equals(encodedPassword)) {
				searchedUser = users.get(i);
			}
		}
		return searchedUser;
	}

}
