
public class Stack {
    private final int MAX_SIZE = 100;
    private int top;
    private final int[] items = new int[MAX_SIZE];

    public Stack() {
        top = -1;
    }

    public void push(int num) {
        if(top < MAX_SIZE - 1) {
            top++;
            items[top] = num;
        } else {
            System.out.println("Your stack is full");
        }
    }

    public void pop() {
        if(top != -1) {
            items[top] = 0;
            top--;
        } else {
            System.out.println("You dont have elements to delete");
        }
    }

    public int popStock() {
        if(top != -1) {
            int popedItem = items[top];
            items[top] = 0;
            top--;
            return popedItem;
        }
        System.out.println("You dont have elements to delete");
        return 0;  
    }
    public int getTop() {
        if(top != -1) {
            return items[top];
        }
        System.out.println("Stack is empty");
        return 0;
    }

    public void print() {
        System.out.print('[');
        for(int i = top; i >= 0; i--) {
            System.out.print(items[i] + " ");
        }
        System.out.println(']');
    }


}
