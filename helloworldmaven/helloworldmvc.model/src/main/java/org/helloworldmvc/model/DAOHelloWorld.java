package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAOHelloWorld {
	
	private static String Filename = "HelloWorld.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
		
	private Model model;
	
	public DAOHelloWorld(String helloWorldMessage) {
		super();
		this.helloWorldMessage = helloWorldMessage;
	}
	
	public String toString() {
		try {
			readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.toString();
	}
	
	
	public static DAOHelloWorld getInstance() {
		return instance;
	}

	private static void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}

	private void readFile() throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(Filename), "UTF-8"));
		String line = read.readLine();
		read.close();
		System.out.println(line);

	}
	
	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}
	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
	
	
}
