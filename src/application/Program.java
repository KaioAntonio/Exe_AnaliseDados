package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Cursos;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Cursos> set = new HashSet<>();
		System.out.println("How many students for course A: ");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {

			int student = sc.nextInt();
			set.add(new Cursos(student));
		}
		System.out.println("How many students for course B: ");
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {

			int student = sc.nextInt();
			set.add(new Cursos(student));
		}
		System.out.println("How many students for course C: ");
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {

			int student = sc.nextInt();
			set.add(new Cursos(student));
		}
		System.out.println("Total users: " + set.size());
		sc.close();

	}

}
