package com.example.socketproject.server;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Description:
 * @Author: solar
 * @Date: 2020-02-14 22:45
 * @Version: 1.00
 */
public class BIOMysqlClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1",9098);

			//直接发送数据
			socket.getOutputStream().write("world".getBytes());

			//通过键盘输入
			Scanner scanner = new Scanner(System.in);
			String next = scanner.next();
			socket.getOutputStream().write(next.getBytes());

			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
