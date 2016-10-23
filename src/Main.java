package src;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = new PrintStream(System.out);
		Surface surface = new Surface(10, 10);
		Rover rover = new NormalRover(0, 0, Direction.N, surface);

		String command = scanner.nextLine();
		char[] instructions = command.toCharArray();
		for (char i : instructions) {
			System.out.println(i);
			switch (i) {
			case 'F':
				rover.move();
				break;
			case 'B':
				rover.rotate(Rotation.LEFT);
				rover.rotate(Rotation.RIGHT);
				rover.move();
				break;
			case 'R':
				rover.rotate(Rotation.RIGHT);
				break;
			case 'L':
				rover.rotate(Rotation.LEFT);
				break;
			}
		}
		ps.print(surface);

	}

}
