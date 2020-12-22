package by.epam.module06.TEST;

import java.io.*;
import java.net.*;

public class Client {
    String serverHost; // имя сервера
    int serverPort; // порт сервера

    private Socket clientSocket; // наш сокет для общения
    private BufferedReader readConsole; // поток считывания с консоли
    private BufferedReader readSocket; // поток считывания из сокета
    private BufferedWriter writeSocket; // поток записи в сокет
    private String message; // вспомогательная

    public Client(String serverHost, int serverPort) {
        // конструктор, задаем адрес/порт сервера, к которому будем подключаться
        this.serverHost = serverHost;
        this.serverPort = serverPort;
    }

    public void start() {
        try {
            try {
                clientSocket = new Socket(serverHost, serverPort); // подключаемся к серверу
                //создаем потоки
                readConsole = new BufferedReader(new InputStreamReader(System.in));
                readSocket = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                writeSocket = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                // бесконечный цикл
                while (true) {
                    message = readConsole.readLine(); // считываем из консоли
                    writeSocket.write(message + "\n"); // записываем в сокет
                    writeSocket.flush(); // "сбрасываем" буфер

                    message = readSocket.readLine(); // считываем ответ из сокета
                    System.out.println(message); // пишем ответ в консоль
                }
            } finally { // если произошла ошибка, то закрываем все потоки
                readConsole.close();
                readSocket.close();
                writeSocket.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}