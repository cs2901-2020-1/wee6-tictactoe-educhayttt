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
