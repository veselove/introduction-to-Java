package by.epam.module06.TEST;

import java.io.*;
import java.net.*;

public class Server {
    private ServerSocket serverSocket;

    public Server() {
        try {
            // выделяем порт, 0 значит, что выбирается любой свободный порт
            serverSocket = new ServerSocket(0);
            System.out.println("port: " + serverSocket.getLocalPort()); // выводим номер порта
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void start() {
        try {
            while (true) { // бесконечный цикл, ждем новые подключения
                // новое подключение - метод .accept() возвращает Socket для него
                // который мы указываем в конструкторе нового потока
                new clientThread(serverSocket.accept());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    class clientThread extends Thread { // наш поток для каждого клиента
        private Socket clientSocket; // сокет для общения
        private BufferedReader readSocket; // считывание из сокета
        private BufferedWriter writeSocket; // запись в сокет
        private String message; // вспомогательная

        public clientThread(Socket clientSocket) { // конструктор
            this.clientSocket = clientSocket; // запоминаем сокет
            try {
                // создаем потоки (которые STREAM)
                readSocket = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                writeSocket = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                start(); // запускаем этот поток (который THREAD)
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        public void run() { // сам поток
            try {
                try {
                    while (true) { // бесконечно
                        message = readSocket.readLine(); // считываем
                        message = message.toUpperCase(); // сообщение переводим в верхний регистр

                        writeSocket.write("server: " + message + "\n"); // отсылаем
                        writeSocket.flush(); // "чистим" буфер
                    }
                } finally { // если произошла ошибка, то закрываем все потоки
                    clientSocket.close();
                    readSocket.close();
                    writeSocket.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}