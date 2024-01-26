import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.lang.Math;

/**
 *  Name:
 *  Class Group:
 */

    public class CA3_Question1 {

    public static void main(String[] args) {
        CA3_Question1 app = new CA3_Question1();
        app.start();
    }

    public void start() {
        parkingStack();
    }

    public void parkingStack(){
        Deque<Integer> driveWay = new ArrayDeque<>();
        Deque<Integer> parkingSpace = new ArrayDeque<>();

        System.out.println("Please enter a list of words, \"0\" to exit");

        Scanner in = new Scanner(System.in);
        int car = in.nextInt();

        while(car!=0){
            if(car <0){
                int remove = Math.abs(car);
                int move = driveWay.peek();
                while(move != remove-1){
                    driveWay.pop();
                    parkingSpace.push(move);
                    move = move-1;

                }
                car = in.nextInt();
            }else {
                driveWay.push(car);
                car = in.nextInt();
            }
        }
        System.out.println(driveWay);
        System.out.println(parkingSpace);
     }
    }