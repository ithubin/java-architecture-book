package com.itedu.chapter4.answer5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServler {

	public static void main(String[] args) {
		try {
			// ��ʼ�������socket���Ұ�9999�˿�
			ServerSocket serverSocket  =new ServerSocket(9999);
			 // �ȴ��ͻ��˵�����
			Socket socket = serverSocket.accept();
			// ��ȡ������,����ָ��ͳһ�ı����ʽ
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			// ��ȡһ������
			String str; 
			// ͨ��whileѭ�����϶�ȡ��Ϣ
			while ((str = bufferedReader.readLine()) != null) {
			System.out.println("Hi,"+str);
			}
			} catch (IOException e) {
			e.printStackTrace();
			}

	}

}
