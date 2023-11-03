//package Queue.Linear Queue;

import java.util.Scanner;

public class LinearQueue {
    public static void main(String[] args) {
        int queue[],max,c,e,temp,front=0,rear=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the stack = ");
        max = sc.nextInt();
        queue = new int[max];
        while (true) {
            System.out.println("\nchoose the queue operations: \n1. insert \n2. delete \n3. front \n4. rear \n5. display queue \n6. exit");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    if (rear==max) {
                        System.out.println("queue is full. overflow.");
                    }
                    else {
                        System.out.print("enter element to insert into the queue = ");
                        e = sc.nextInt();
                        queue[rear]=e;
                        rear++;
                    }
                    break;

                case 2:
                    if (front<0) {
                        System.out.println("queue is empty. underflow.");
                    }
                    else {
                        temp = queue[front];
                        front++;
                        System.out.println("deleted element is "+temp);
                    }
                    break;
                
                case 3:
                    if (front<0) {
                        System.out.println("queue is empty. So, front is -1");
                    }
                    else {
                        System.out.println("front value is "+front);
                        System.out.println("value inside the front is "+queue[front]);
                    }
                    break;
                
                case 4:
                    if (rear<0) {
                        System.out.println("queue is empty. So, rear is -1");
                    }
                    else {
                        System.out.println("rear value is "+rear);
                        System.out.println("value inside the rear is "+queue[rear]);
                    }
                    break;

                case 5:
                    System.out.println("complete queue is");
                    for (int i=0;i<max;i++) {
                        System.out.print(queue[i]+" ");
                    }
                    break;
                
                case 6:
                    System.exit(0);

                default:
                    System.out.println("enter valid case value");
                    break;
            }
        }
    }
}