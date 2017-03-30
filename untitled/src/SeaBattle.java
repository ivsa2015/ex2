import java.util.Arrays;

/**
 * Created by Dendi on 3/13/2017.
 */
import java.util.Random;
import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        final Random random = new Random();
        char[] cells = new char[10];
        for (int i = 0; i < cells.length; i++) cells[i] = '.';
        int position =4;
        cells[position] = 'X';

        do {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            System.out.printf("Вы ввели: %s\n",s);
            int shoot = Integer.parseInt(s);

            switch(cells[shoot]){
                case 'X':
                    System.out.println("Вы попали!!");
                    cells[shoot] = '-';
                    for (char cell : cells) {
                        System.out.print(cell);
                    }

                    break;
                case '.':
                    cells[shoot] = 'f';
                    System.out.println("Промах");
                    break;
                case 'f':
                    System.out.println("Вы сюда уже стреляли");
                    break;
            }
//            cells[shoot] = 'O';
        } while (cells[position] == 'X');
    }
}
