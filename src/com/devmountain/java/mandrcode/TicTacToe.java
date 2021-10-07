package com.devmountain.java.mandrcode;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
	char[][] gameBoard = {{' ', '|', ' ', '|',' '},//2D array
            {'-', '+','-', '+','-'},
            {' ', '|', ' ', '|',' '},
            {'-', '+','-', '+','-'},
            {' ', '|', ' ', '|',' '}};
//prints out game board
		printGameBoard(gameBoard);

		//to make this all keep running and listening continuously to a user we often add a while true statment


		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your placement(1-9):");
			int playerPos = scan.nextInt();


			placePiece(gameBoard, playerPos, "player");

			//could use AI but for simplicity using randomizer
			Random random = new Random();
			int cpuPosition = random.nextInt(9) + 1;
			placePiece(gameBoard, cpuPosition, "cpu");

			printGameBoard(gameBoard);
		}
    }
	    public static void printGameBoard(char[] [] gameBoard){
		for (char[] row : gameBoard){
			for (char c: row){
				System.out.print(c);
			}
			System.out.println();
		}
	}
public static void placePiece(char[][] gameBoard, int pos, String user){

    	char symbol = ' ';
    	if (user.equals("player")){
    		symbol = 'X';
		}else if (user.equals("cpu")){
    		symbol = 'O';
		}


	switch (pos){
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4]  = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol ;
			break;
		default:
			break;
	}

}

public static String checkWinner(){
    	return "";
}


}

