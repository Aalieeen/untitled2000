package com.company;


import javax.jws.soap.SOAPMessageHandlers;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner w1 = new Scanner(System.in);
		System.out.println("Какой сейчас год?");
		int w2 = w1.nextInt();
		while (w2 != 2018 ){
			System.out.println("Не правильно");
			w2 = w1.nextInt();
		}
		System.out.println(  "Правильно ");
	}


}

























