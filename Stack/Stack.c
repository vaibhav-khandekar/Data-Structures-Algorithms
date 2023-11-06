#include<stdio.h>
#include<conio.h>

void main()
{
	int stack[100],max,c,i,e,top=-1;
	clrscr();
	printf("stack implementation using array");
	printf("\nenter size of the stack = ");
	scanf("%d",&max);
	while(1)
	{
		printf("\nstack operations:\n1. push \n2. pop \n3. top \n4. display stack \n5. exit\nenter your choice = ");
		scanf("%d",&c);
		switch(c)
		{
			case 1:
			if(top == max-1)
			{
				printf("\nstack is full. Overflow.");
			}
			else
			{
				printf("\nenter element to push into the stack = ");
				scanf("%d",&e);
				top=top+1;
				stack[top]=e;
			}
			break;

			case 2:
			if(top == -1)
			{
				printf("\nstack is empty. Underflow.");
			}
			else
			{
				printf("\n%d is popped from the stack",stack[top]);
				top= top-1;
			}
			break;

			case 3:
			if(top>=0)
			{
				printf("\nthe value of top is %d ",top);
				printf("the value in top is %d",stack[top]);
			}
			else
			{
				printf("\nstack is empty, so top is -1");
			}
			break;

			case 4:
			if(top<0)
			{
				printf("\nstack is empty");
			}
			else
			{
				printf("\nyour stack is ");
				for(i=top;i>=0;--i)
				{
					printf("%d ",stack[i]);
				}
			}
			break;

			case 5:
			exit(0);
			getch();
			break;

			default:
			printf("\nplease enter valid choice");
			break;
		}
	}
}
