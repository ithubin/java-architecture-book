package com.itedu.chapter4.answer3;

import java.io.File;

public class TraverseMain {

	public static void main(String[] args) {
		traverseFolder("C:\\temp");
	}
	
	private static  void traverseFolder(String path) {

        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null == files || files.length == 0) {
                System.out.println("�ļ����ǿյ�!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("�ļ���:" + file2.getAbsolutePath());
                        traverseFolder(file2.getAbsolutePath());
                    } else {
                        System.out.println("�ļ�:" + file2.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("�ļ�������!");
        }
    }

}
