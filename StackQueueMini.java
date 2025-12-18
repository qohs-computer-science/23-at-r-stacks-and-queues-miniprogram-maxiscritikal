//Max Korsa, 12/18/25. PD: 4
//This program uses stacks and queues to manipulate user input.
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {

    Scanner in = new Scanner (System.in);

    Stack<Integer> myStack = new Stack<>();

    System.out.println("Enter a number 5 times: ");
    for (int x = 1; x < 6; x++)
    {
      int temp = in.nextInt();
      myStack.push(temp);
    }//end for loop
  
    Stack<Integer> tempStack = new Stack<>();

    while (!myStack.isEmpty()) 
    {
      tempStack.push(myStack.pop());
    }//end while loop
    
    while (!tempStack.isEmpty()) 
    {
      int temp = tempStack.pop();
      myStack.push(temp);
      myStack.push(temp);
    }//end while loop

    System.out.println("Here is your new Stack after the method:");
    while (!myStack.isEmpty()) 
    {
      System.out.print(myStack.pop() + ", ");
    }//end while loop

    Queue<Integer> myQueue = new LinkedList<>();

    System.out.println();
    System.out.println("Enter a number 10 times: ");
    for (int x = 1; x < 11; x++)
    {
      int temp = in.nextInt();
      myQueue.add(temp);
    }//end for loop

    Queue<Integer> evenQueue = new LinkedList<>();
    Queue<Integer> oddQueue = new LinkedList<>();
    Queue<Integer> finalQueue = new LinkedList<>();

    while (!myQueue.isEmpty())
    {
      if (myQueue.peek() % 2 == 0)
        {
          evenQueue.add(myQueue.remove());
        }//end if statement
      else
        {
          oddQueue.add(myQueue.remove());
        }//end else statement
    }//end while loop

    while (!evenQueue.isEmpty())
    {
      finalQueue.add(evenQueue.remove());
    }//end while loop

    while (!oddQueue.isEmpty())
    {
      finalQueue.add(oddQueue.remove());
    }//end while loop

    System.out.println("Here is your new Queue after the method:");
    while (!finalQueue.isEmpty())
    {
      System.out.print(finalQueue.remove() + ", ");
    }//end while loop

    in.close();
  } // end main
} // end class