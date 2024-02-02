import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *  Name: Ben Arrowsmith
 *  Class Group: GD2B
 */

public class CA3_Question5
{
    public static void main(String[] args)
    {
        Queue<String> takeoff = new LinkedList<>();
        Queue<String> land = new LinkedList<>();

        Scanner in = new Scanner(System.in);
        String plane = in.nextLine();
        while(!plane.equals("quit")) {
            if (plane.contains("takeoff")) {
                takeoff.add(plane.substring(7));
                plane = in.nextLine();
            } else if(plane.contains("land")){
                land.add(plane.substring(4));
                plane = in.nextLine();
            } else if(plane.contains("next")){
                if(!land.isEmpty()){
                    System.out.println("Plane landed: " + land.peek());
                    land.poll();
                    plane = in.nextLine();
                } else if(!takeoff.isEmpty()){
                    System.out.println("Plane takeoff: " + takeoff.peek());
                    takeoff.poll();
                    plane = in.nextLine();
                } else{
                    System.out.printf("No more planes");
                    plane = in.nextLine();
                }
            }else {
                System.out.println("Invalid Command");
                plane = in.next();
            }
        }
        System.out.println("Take off" + takeoff);
        System.out.println("Landing" + land);
        System.out.printf("System complete");
    }
}
