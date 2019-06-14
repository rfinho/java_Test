package org.nationwide.adventure;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		int startPoint = 5;

		Scanner input = new Scanner(System.in);

		System.out.println("You awaken to find yourself in a barren moor. Try 'look' " );

		String word = input.nextLine();

		if(word.equals("look")) {
			System.out.println("Grey foggy clouds float oppressively close to you, reflected in the murky grey water which reaches up your shins. Some black plants barely poke out of the shallow water. Try “north”,”south”,”east”,or “west”You notice a small watch-like device in your left hand. It has hands like a watch, but the hands don’t seem to tell time. ");

		}
		else{
			System.out.println("My friend, start again and type  'Look' :) ");
		}


		System.out.println("The dial read '5m' ");

		String dir = input.nextLine();

		if(dir.equals("west")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}
		else if (dir.equals("east")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}
		else if(dir.equals("south")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}
		else if(dir.equals("north")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}

		String dir2= input.nextLine();

		if(dir2.equals("west")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}
		else if (dir2.equals("east")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}
		else if(dir2.equals("south")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}
		else if(dir2.equals("north")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}

		String dir3= input.nextLine();

		if(dir3.equals("west")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}
		else if (dir3.equals("east")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}
		else if(dir3.equals("south")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}
		else if(dir3.equals("north")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}

		String dir4= input.nextLine();

		if(dir4.equals("west")) {
			System.out.println("you went west");
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}
		else if (dir4.equals("east")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}
		else if(dir4.equals("south")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}
		else if(dir4.equals("north")) {
			startPoint--;
			System.out.println("The dial reads " + startPoint + "m");
		}

		String dir5= input.nextLine();
		if(dir5.equals("west") || dir5.equals("east") || dir5.equals("south") || dir5.equals("north")) {
			System.out.println("You win! The end!");
			input.close();
		}

	}

}
