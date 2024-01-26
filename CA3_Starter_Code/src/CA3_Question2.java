import java.util.Scanner;
import java.util.Stack;

/**
 *  Name: Ben Arrowsmith
 *  Class Group: GD2B
 */


class Pair {
    public int row;
    public int column;

    public Pair(int row,int column) {
        this.column = column;
        this.row = row;
    }
}

public class CA3_Question2
{
    /*
        Starter function to create the 2D array and populate it with 0

     */

    public static int[][]  floodFillStart() {
        Pair position = new Pair(0,0);
        Scanner kb = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for (int x = 0; x < 10; x++)
        {
            for (int y = 0; y < 10; y++)
            {
                System.out.printf("%4d", arr[x][y]);
            }
            System.out.println();
        }
       return arr;

    }
    /*
        Helper function to display the image
     */
    public static void display(int[][] arr)
    {
        for (int x = 0; x < 10; x++)
        {
            for (int y = 0; y < 10; y++)
            {
                System.out.printf("%4d", arr[x][y]);
            }
            System.out.println();
        }
    }
    private static void fill(int r, int c, int[][] arr)
    {

    }

    public static void start()
    {
       int[][] arr = floodFillStart();
    }
    public static void main(String[] args) {
        start();
    }

}
