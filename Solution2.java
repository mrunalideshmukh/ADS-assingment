// Stack using Array

class Stack {
  private int arr[];
  private int top;
  private int capacity;

  
  Stack(int size)
  {
    arr = new int[size];
    capacity = size;
    top = -1;
  }

  
  public void push(int x) 
  {
    if (isFull())
    {
      System.out.println("Stack is Full");
      System.exit(1);
    }

    System.out.println("Push" + x);
    arr[++top] = x;
  }

  
  public int pop()
  {
    if (isEmpty())
    {
      System.out.println("STACK EMPTY");
      System.exit(1);
    }
    return arr[top--];
  }

  
  public int size()
  {
    return top + 1;
  }

  
  public Boolean isEmpty()
  {
    return top == -1;
  }

  
  public Boolean isFull() 
  {
    return top == capacity - 1;
  }

  public void printStack()
  {
    for (int i = 0; i <= top; i++)
    {
      System.out.println(arr[i]);
    }
  }
  
}
public class Solution2
{ 
  public static void main(String[] args)
  {
    Stack stack = new Stack(5);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    stack.pop();
    System.out.println("\nAfter popping out");

    stack.printStack();
  }
  }

