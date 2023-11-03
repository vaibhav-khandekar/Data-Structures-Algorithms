import java.util.Scanner;

class ReverseMenu {
    public static void main(String[] args) {
        char stack[];
        int top=-1,c;
        String str;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nchoose the options: \n1. try reverse \n2. exit");
            c = sc.nextInt();
            sc.nextLine();
            switch (c) {
                case 1:
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
                    System.out.print("reverse string = ");
                    for (int i=top;i>=0;i--) {
                        System.out.print(stack[i]+"");
                    }
                    break;

                case 2:
                    System.exit(0);
    
                default:
                    System.out.println("enter valid choice.");
                    break;
            }
        }
    }
}