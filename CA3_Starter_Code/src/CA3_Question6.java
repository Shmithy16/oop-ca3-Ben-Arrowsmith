import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Deque;
/**
 *  Name: Ben Arrowsmith
 *  Class Group:GD2B
 */

class Block{
    int qty;
    int price;
}
public class CA3_Question6
{

    /*
    Will repeatedly ask the user to enter the commands in the format
    buy qty price
    or
    sell qty price
    or
    quit
     */
    public static void main(String[] args) {
        Queue<Double> totalValue = new LinkedList<>();
        Deque<Block> blocks = new ArrayDeque<>();
       Scanner in = new Scanner(System.in);
        String command="";
            do {
            System.out.print(">");
            command = in.next();
            if(command.equalsIgnoreCase("buy"))
            {
                int qty = in.nextInt();
                double price = in.nextDouble();
                totalValue.add(qty*price);
            }
            else if(command.equals("sell"))
            {
                int qty = in.nextInt();
                double price = in.nextDouble();
                double gain = price*qty-totalValue.remove();
                System.out.print("The gain will be: " + gain);
            }
        }while(!command.equalsIgnoreCase("quit"));
    }
}