package src;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = new PrintStream(System.out);
		Surface surface = new Surface(10, 10);
		Rover rover = new NormalRover(0, 0, Direction.N, surface);
		
		while(scanner.hasNext()) {
			String command = scanner.nextLine();
			char[] instructions = command.toCharArray();
			for(char i : instructions) {
				switch (i) {
				case 'F':
					rover.move();
					break;
				case 'B':
					rover.rotate(Rotation.LEFT);
					rover.rotate(Rotation.RIGHT);
					rover.move();
					break;
				default:
					break;
				}
			}
		}
	}

}
