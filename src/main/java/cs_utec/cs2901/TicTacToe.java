package cs_utec.cs2901;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    String[][] matrix =  {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
    Scanner scanner = new Scanner(System.in);
    boolean win = false;
    Integer counter = 9;
    String symbol = "o";

    public void play() {
        while (!win && counter > 0) {
            read();
            check_winner();
            symbol = symbol.equals("x") ? "o" : "x";
            System.out.println("Matrix");
            System.out.println(Arrays.deepToString(matrix[0]));
            System.out.println(Arrays.deepToString(matrix[1]));
            System.out.println(Arrays.deepToString(matrix[2]));
        }
        if (counter == 0)
            System.out.println("No winners");
    }
}
