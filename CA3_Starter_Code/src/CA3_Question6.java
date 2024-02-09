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

    public Block(int qty, int price) {
        this.qty = qty;
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public int getPrice() {
        return price;
    }
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
                int price = in.nextInt();
                blocks.add(new Block(qty,price));
            }
            else if(command.equals("sell"))
            {
                int sellQty = in.nextInt();
                int sellPrice = in.nextInt();
                int totalGain = 0;
                while(sellQty > 0 && !blocks.isEmpty()){
                    Block buyQty = blocks.peek();
                    if(sellQty >= buyQty.getQty()){
                        sellQty = sellQty - buyQty.getQty();
                        int sellCurrentPrice = sellPrice - buyQty.getPrice();
                        int gain = buyQty.getQty()*sellCurrentPrice;
                        System.out.println(gain);
                        blocks.poll();
                        totalGain += gain;
                    }else if(sellQty < buyQty.getQty()){;
                        sellQty = buyQty.getQty() - sellQty;
                        int sellCurrentPrice = sellPrice - buyQty.getPrice();
                        int gain = sellQty*sellCurrentPrice;
                        System.out.println(gain);
                        totalGain += gain;
                    }
                }
                System.out.print("The gain will be: " + totalGain);
            }
        }while(!command.equalsIgnoreCase("quit"));
    }
}