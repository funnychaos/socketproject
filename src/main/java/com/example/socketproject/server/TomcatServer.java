package com.example.socketproject.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 通过BIO模式写非阻塞的NIO服务器
 * @Author: solar
 * @Date: 2020-02-14 22:41
 * @Version: 1.00
 */
public class TomcatServer {

	//新建为静态的是因为可以
	static byte[] bs = new byte[1024];

	public static void main(String[] args) {


		try {
			//新建socket对象 主要用于监听是否有连接
			ServerSocket serverSocketsocket = new ServerSocket(8080);
			//socket连接 阻塞
			Socket socket = serverSocketsocket.accept();

			socket.getInputStream().read(bs);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
