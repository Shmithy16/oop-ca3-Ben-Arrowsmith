import java.util.Scanner;
import java.util.Stack;
/**
 *  Name: Ben Arrowsmith
 *  Class Group: GD2B
 */
public class CA3_Question8 {
    //This gives us the code for this question file:///C:/Users/user/Downloads/Book%20Extract%20-%20Stack%20for%20Arithmentic%20Expression%20Eval%20and%20Maze%20Backtracking.pdf
    /*
        Reads in an equation from the user
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> results = new Stack<Integer>();
        System.out.println("Please enter equation");
        boolean done = false;
        while(!done){
            String input = in.nextLine();
            if(input.equals("+")){
                results.push(results.pop() + results.pop());
            }
            else if(input.equals("-")){
                Integer firstVal = results.pop();
                results.push(results.pop() - firstVal);
            }
            else if(input.equals("*") || input.equals("x")){
                results.push(results.pop() * results.pop());
            }
            else if(input.equals("/")){
                Integer firstVal = results.pop();
                results.push(results.pop() / firstVal);
            }
            else if(input.equalsIgnoreCase("q")){
                done  = true;
            }
            else{
                results.push(Integer.parseInt(input));
            }
        }
        System.out.println(results);
    }
}
