import java.util.Scanner;

class Stack {
    public static void main(String[] args) {
        int stack[],max,c,e,temp;
        int top=-1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the stack = ");
        max = sc.nextInt();
        stack = new int[max];
        while (true) {
            System.out.println("\nchoose the stack operations: \n1. push \n2. pop \n3. top \n4. display \n5. exit");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    if (top==max-1) {
                        System.out.println("stack is full. overflow.");
                    }
                    else {
                        System.out.print("enter element to insert into the stack = ");
                        e = sc.nextInt();
                        top++;
                        stack[top]=e;
                    }
                    break;

                case 2:
                    if (top==-1) {
                        System.out.println("stack is empty. underflow.");
                    }
                    else {
                        temp = stack[top];
                        top--;
                        System.out.println("deleted element is "+temp);
                    }
                    break;
                
                case 3:
                    if (top==-1) {
                        System.out.println("stack is empty. So, top is -1");
                    }
                    else {
                        System.out.println("top value is "+top);
                        System.out.println("value inside the top is "+stack[top]);
                    }
                    break;

                case 4:
                    if (top==-1) {
                        System.out.println("stack is empty, nothing to print elements.");
                    }
                    else {
                        System.out.println("complete stack is");
                        for (int i=top;i>=0;i--) {
                            System.out.print(stack[i]+" ");
                        }
                    }
                    break;
                
                case 5:
                    System.exit(0);

                default:
                    System.out.println("enter valid case value");
                    break;
            }
        }
    }
}