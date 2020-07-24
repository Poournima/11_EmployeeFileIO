package com.montran.util;

import java.io.*;

public class EmpInputStream {

	private byte[] data;
	private int fileLength;
	private InputStream inputStream;

	public byte[] getFileData(File file) {
		try {
			fileLength = (int) file.length();
			data = new byte[fileLength];
			inputStream = new FileInputStream(file);
			inputStream.read(data);
			return data;
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("IO Exception");
			System.out.println(e.getMessage());
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("IO Exception");
				System.out.println(e.getMessage());
			}
		}

		return null;

	}

}
