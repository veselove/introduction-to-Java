package by.epam.module06.TEST;

public class Main {

	public static void main(String[] args) {
		// первый аргумент при вызове определяет, вызываем мы сервер или клиент
        if (args[0].equals("-s")) {
            Server s = new Server();
            s.start();
        } else if (args[0].equals("-c")) {
            // 2-ой и 3-й - адрес и порт сервера, к которому будет подключаться клиент
            Client c = new Client(args[1], Integer.parseInt(args[2]));
            c.start();
        } else {
            System.out.println("[тип(-s/-c)] [адрес сервера(опционально)] [порт сервера(опционально)]");
        }
	}

}
