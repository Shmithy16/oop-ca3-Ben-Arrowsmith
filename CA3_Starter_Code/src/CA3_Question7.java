import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;
import java.util.Map;
import java.util.HashMap;
/**
 *  Name: Ben Arrowsmith
 *  Class Group: GD2B
 */

class Block2 {
    int qty;
    int price;

    public Block2(int qty, int price) {
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
public class CA3_Question7
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

        Deque<Block2> blocks = new ArrayDeque<>();
        Map<String, Block2> stock = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String command="";
        do {
            System.out.print(">");
            command = in.next();
            if(command.equalsIgnoreCase("buy"))
            {
                System.out.println("Enter the quantity to buy");
                int qty = in.nextInt();
                System.out.println("Enter the price");
                int price = in.nextInt();
                System.out.println("Enter the company");
                String symbol = in.next();
                blocks.add(new Block2(qty,price));
                stock.put(symbol, blocks.peek());
            }
            else if(command.equals("sell"))
            {
                System.out.println("Enter the quantity to sell");
                int sellQty = in.nextInt();
                System.out.println("Enter the price");
                int sellPrice = in.nextInt();
                System.out.println("Enter the company");
                String symbol = in.next();

                int totalGain = 0;
                while(sellQty > 0 && !blocks.isEmpty()){
                    Block2 buyQty = blocks.peek();
                    if(sellQty >= buyQty.getQty()){
                        sellQty = sellQty - buyQty.getQty();
                        int sellCurrentPrice = sellPrice - buyQty.getPrice();
                        int gain = buyQty.getQty()*sellCurrentPrice;
                        System.out.println(gain);
                        blocks.poll();
                        totalGain += gain;
                    }else if(sellQty < buyQty.getQty()){;
                        int sellCurrentPrice = sellPrice - buyQty.getPrice();
                        int gain = sellQty*sellCurrentPrice;
                        sellQty = 0;
                        System.out.println(gain);
                        totalGain += gain;
                    }
                }
                System.out.print("The gain will be: " + totalGain);
            }
        }while(!command.equalsIgnoreCase("quit"));
    }
}