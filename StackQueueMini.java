import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {

    Scanner in = new Scanner (System.in);

    Stack<Integer> myStack = new Stack<>();

    for (int x = 1; x < 6; x++)
    {
      System.out.println("Enter your " + x + " number: ");
      int temp = in.nextInt();
      myStack.push(temp);
    }
  
    Stack<Integer> doubleStack = new Stack<>();
    while (!myStack.isEmpty())
    {
      int temp = myStack.pop();
      doubleStack.push(temp);
      doubleStack.push(temp);
    }

    System.out.println("Here is your new Stack after the method:");
    while (!doubleStack.isEmpty())
    {
      System.out.print(doubleStack.pop() + ", ");
    }


  } // end main
} // end class