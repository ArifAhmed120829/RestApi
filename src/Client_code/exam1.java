package Client_code;

import java.util.*;

public class exam1 {

	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i<t; i++){
		    String s = in.next();
		char letter = s.charAt(0);
		String two = String.valueOf(s.charAt(1));
		int number = Integer.parseInt(two);
		int col = characterToNumber(letter);
		int row = number-1;
		int[][] board = new int[8][8];//4,3->row,col->5d
		//left
		col--;
		while(row>=0 && row<8 && col>=0 && col<8) {
			System.out.println(numberToCharacter(col)+""+(row+1));
			col--;
		}
		col = characterToNumber(letter);
		row = number-1;
		//right
		col++;
		while(row>=0 && row<8 && col>=0 && col<8) {
			System.out.println(numberToCharacter(col)+""+(row+1));
			col++;
		}
		col = characterToNumber(letter);
		row = number-1;
		//up
		row++;
		while(row>=0 && row<8 && col>=0 && col<8) {
			System.out.println(numberToCharacter(col)+""+(row+1));
			row++;
			
		}
		col = characterToNumber(letter);
		row = number-1;
		//down
		row--;
		while(row>=0 && row<8 && col>=0 && col<8) {
			System.out.println(numberToCharacter(col)+""+(row+1));
			row--;
			
		}
		
		}
		
		

	}

	private static int characterToNumber(char letter) {
		if(letter == 'b') return 1;
		if(letter == 'c') return 2;
		if(letter == 'd') return 3;
		if(letter == 'e') return 4;
		if(letter == 'f') return 5;
		if(letter == 'g') return 6;
		if(letter == 'h') return 7;
		return 0;
	}
	private static char numberToCharacter(int num) {
		if(num == 1) return 'b';
		if(num == 2) return 'c';
		if(num == 3) return 'd';
		if(num == 4) return 'e';
		if(num == 5) return 'f';
		if(num == 6) return 'g';
		if(num == 7) return 'h';
		return 'a';
	}

}
