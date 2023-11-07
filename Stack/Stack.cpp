#include<iostream.h>
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void main()
{
	int stack[100],c,e,max,top=-1,i;
	clrscr();
	cout<<"stack implementation using array";
	cout<<"\nenter size of the stack = ";
	cin>>max;
	while(1)
	{
		cout<<"\nstack operations: \n1. push \n2. pop \n3. top \n4. display stack \n5. exit \nenter your choice = ";
		cin>>c;
		switch(c)
		{
			case 1:
			if(top == max-1)
			{
				cout<<"\nstack is full. Overflow.";
			}
			else
			{
				cout<<"\nenter element to push into the stack = ";
				cin>>e;
				top++;
				stack[top] = e;
			}
			break;

			case 2:
			if(top == -1)
			{
				cout<<"\nstack is empty. Underflow.";
			}
			else
			{
				cout<<"\n"<<stack[top]<<" element is popped from the stack";
				top--;
			}
			break;

			case 3:
			if(top == -1)
			{
				cout<<"\nstack is empty, so top value is -1";
			}
			else
			{
				cout<<"\ntop is "<<top;
				cout<<"\nvalue inside the top is "<<stack[top];
			}
			break;

			case 4:
			if(top == -1)
			{
				cout<<"\nstack is empty, nothing to print";
			}
			else
			{
				cout<<"\nelements in the stack are ";
				for(i=top;i>=0;i--)
				{
					cout<<stack[i]<<" ";
				}
			}
			break;

			case 5:
			exit(0);
			getch();
			break;

			default:
			cout<<"\nplease enter valid option";
			break;
		}
	}
}
