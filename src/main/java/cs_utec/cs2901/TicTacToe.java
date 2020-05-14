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
    private void check_winner() {
        // Filas
        if (matrix[0][0].equals(matrix[0][1]) && matrix[0][1].equals(matrix[0][2]) && !matrix[0][0].equals(" ")) {
            System.out.println("Winner is " + matrix[0][0]);
            win = true;
        }
        if (matrix[1][0].equals(matrix[1][1]) && matrix[1][1].equals(matrix[1][2]) && !matrix[1][0].equals(" ")) {
            System.out.println("Winner is " + matrix[0][0]);
            win = true;
        }
        if (matrix[2][0].equals(matrix[2][1]) && matrix[2][1].equals(matrix[2][2]) && !matrix[2][0].equals(" ")) {
            System.out.println("Winner is " + matrix[0][0]);
            win = true;
        }
        // Columnas
        if (matrix[0][0].equals(matrix[1][0]) && matrix[1][0].equals(matrix[2][0]) && !matrix[0][0].equals(" ")) {
            System.out.println("Winner is " + matrix[0][0]);
            win = true;
        }
        if (matrix[0][1].equals(matrix[1][1]) && matrix[1][1].equals(matrix[2][1]) && !matrix[0][1].equals(" ")) {
            System.out.println("Winner is " + matrix[0][0]);
            win = true;
        }
        if (matrix[0][2].equals(matrix[1][2]) && matrix[1][2].equals(matrix[2][2]) && !matrix[0][2].equals(" ")) {
            System.out.println("Winner is " + matrix[0][0]);
            win = true;
        }
        
        // Diagonales
        if (matrix[0][0].equals(matrix[1][1]) && matrix[1][1].equals(matrix[2][2]) && !matrix[0][0].equals(" ")) {
            System.out.println("Winner is " + matrix[0][0]);
            win = true;
        }
        if (matrix[2][0].equals(matrix[1][1]) && matrix[1][1].equals(matrix[0][2]) && !matrix[2][0].equals(" ")) {
            System.out.println("Winner is " + matrix[0][0]);
            win = true;
        }
    }	}

     private void read() {
        System.out.print("Ingrese Coordenadas: ");
        String[] line = scanner.nextLine().split(",");
        if (line[0]>2 || line[1]>2 || line[0]<0 || line[1]<0){
            if (matrix[Integer.parseInt(line[0])][Integer.parseInt(line[1])].equals(" "))
            {
                matrix[Integer.parseInt(line[0])][Integer.parseInt(line[1])] = symbol;
                --counter;
            }
            else
            {
                System.out.println("Posición ya ocupada. Intente nuevamente.");
                read();
            }
        } else {
            System.out.println("Indexes incorrectos. Intente nuevamente.");
            read();
        }
    }
}
