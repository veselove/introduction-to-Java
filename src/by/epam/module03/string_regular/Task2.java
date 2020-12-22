package by.epam.module03.string_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Дана строка, содержащая следующий текст (xml-документ):
<notes>
<note id = "1">
<to>Вася</to>
<from>Света</from>
<heading>Напоминание</heading>
<body>Позвони мне завтра!</body>
</note>
<note id = "2">
<to>Петя</to>
<from>Маша</from>
<heading>Важное напоминание</heading>
<body/>
</note>
</notes>
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа
 и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела). 
 Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

public class Task2 {

	public static void main(String[] args) {

        String xmlDoc = "<notes>\n" +
                " <note id = \"1\">\n" +
                " <to>Вася</to>\n" +
                " <from>Света</from>\n" +
                " <heading>Напоминание</heading>\n" +
                " <body>Позвони мне завтра!</body>\n" +
                " </note>\n" +
                " <note id = \"2\">\n" +
                " <to>Петя</to>\n" +
                " <from>Маша</from>\n" +
                " <heading>Важное напоминание</heading>\n" +
                " <body/>\n" +
                " </note>\n" +
                " </notes>";

        Pattern pattern1 = Pattern.compile("((?<openTag><[^/][^>]*[^/]>)(?<body>.*)(?<closeTag><[/][^>]*[^/]>))|(?<OnlyOpenTag><[^/][^>]*[^/]>)|(?<onlyCloseTag><[/][^>]*[^/]>)|(?<noBodyTag><[^>]*[/]>)");

		System.out.println(xmlDoc);

		Matcher matcher1 = pattern1.matcher(xmlDoc);

		while (matcher1.find()) {
			if (matcher1.group("openTag") != null && matcher1.group("closeTag") != null) {
				System.out.print("Open tag is: " + matcher1.group("openTag") + ". Close tag is: "
						+ matcher1.group("closeTag") + ". Body is: " + matcher1.group("body") + "\n");
			} else if (matcher1.group("OnlyOpenTag") != null) {
				System.out.print("Open tag is: " + matcher1.group("OnlyOpenTag") + "\n");
			} else if (matcher1.group("onlyCloseTag") != null) {
				System.out.print("Close tag is: " + matcher1.group("onlyCloseTag") + "\n");
			} else if (matcher1.group("noBodyTag") != null) {
				System.out.print("No body tag is: " + matcher1.group("noBodyTag") + "\n");
			}
		}

	}

}
