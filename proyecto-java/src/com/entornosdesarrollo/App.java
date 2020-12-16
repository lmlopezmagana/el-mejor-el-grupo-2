package com.entornosdesarrollo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Hola Mundo!");
	}
	
	
	public static String leerStringPorConsola() {
		Scanner sc = new Scanner(System.in);
		String result = sc.next();
		sc.close();
		return result;
	}

}
