package com.example.socketproject.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:不支持并发的BIO服务器  JDK1.4之前的版本
 * @Author: solar
 * @Date: 2020-02-14 22:40
 * @Version: 1.00
 */
public class BIOMysqlServer {

	static byte[] bs = new byte[1024];

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9098);
			while(true){
				System.out.println("wait for connection:\n");
				//阻塞：放弃cpu 等待连接
				Socket clientSocket = serverSocket.accept();
				System.out.println("connect success!\n");

				System.out.println("wait for data:\n");
				clientSocket.getInputStream().read(bs);
				System.out.println("assess data success!\n");
				System.out.println("data:" + new String(bs) + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
