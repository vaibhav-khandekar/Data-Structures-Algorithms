import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        char stack[];
        int top=-1;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string = ");
        str = sc.nextLine();

        // created stack[] array with the size of string
        stack = new char[str.length()];
        
        // inserting string elements into the stack
        for (int i=0;i<str.length();i++) {
            top++;
            stack[top] = str.charAt(i);
        }
        // for printing output
        for (int i=top;i>=0;i--) {
            System.out.print(stack[i]+"");
        }
    }
}