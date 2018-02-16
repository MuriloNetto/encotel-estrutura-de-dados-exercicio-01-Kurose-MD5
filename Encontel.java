import java.util.*;

public class Encontel {
	public static void main(String[] args) {

		Scanner entry = new Scanner(System.in);
		String in = "";
		
		while (entry.hasNext()) {
			System.out.print("Informe a frase pra buscar");
			in = entry.next().toUpperCase();
			String out = "";
			for (int i = 0; i < in.length(); i++) {

				if (in.charAt(i) == 'A' | in.charAt(i) == 'B' | in.charAt(i) == 'C') {
					out += 2;
				} else if (in.charAt(i) == 'D' | in.charAt(i) == 'E' | in.charAt(i) == 'F') {
					out += 3;
				} else if (in.charAt(i) == 'G' | in.charAt(i) == 'H' | in.charAt(i) == 'I') {
					out += 4;
				} else if (in.charAt(i) == 'J' | in.charAt(i) == 'K' | in.charAt(i) == 'L') {
					out += 5;
				} else if (in.charAt(i) == 'M' | in.charAt(i) == 'N' | in.charAt(i) == 'O') {
					out += 6;
				} else if (in.charAt(i) == 'P' | in.charAt(i) == 'Q' | in.charAt(i) == 'R' | in.charAt(i) == 'S') {
					out += 7;
				} else if (in.charAt(i) == 'T' | in.charAt(i) == 'U' | in.charAt(i) == 'V') {
					out += 8;
				} else if (in.charAt(i) == 'W' | in.charAt(i) == 'X' | in.charAt(i) == 'Y' | in.charAt(i) == 'Z') {
					out += 9;
				} else {
					out += in.charAt(i);
				}
			}

			System.out.println(out);

		}
	}
}
