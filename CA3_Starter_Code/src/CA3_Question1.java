import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

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
        //stack3();
    }

    public void parkingStack(){
        Deque<Integer> parkingSpace = new ArrayDeque<>();

        System.out.println("Please enter a list of words, \"0\" to exit");

        Scanner in = new Scanner(System.in);
        int car = in.nextInt();

        while(car!=0){
            parkingSpace.push(car);
            car = in.nextInt();
        }

    }


    public void stack2() {
        //TODO add code to this starter code as described below.
        // 1. declare a stack to store objects of type String
        Deque<String> newStack = new ArrayDeque<>();

        Scanner in = new Scanner(System.in);

        String word = "";
        System.out.println("Stack sample stack2().");
        System.out.println("Please enter a list of words, \"q\" to exit");

        while (!word.equals("q")) {
            word = in.next();
            if (!word.equals("q")) {
                //TODO 2. add the word to stack  (push())
                newStack.push(word);
            }
        }

        System.out.println("Your words in reverse order are: ");
          while (!newStack.isEmpty()) {
            word = newStack.pop();
            System.out.println(word);
            }
        //TODO 3. Write code to retrieve words from the stack - one by one -
        // and display them as they are removed.  (see loop is sample function above)

    }
}