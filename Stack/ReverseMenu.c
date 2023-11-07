#include<stdio.h>
#include<conio.h>
void main()
{
	int i,c,top=-1;
	char str[100],stack[100] ;
	clrscr();
  printf("\nstring reversing by using stack, array menu");
	while(1)
	{
		printf("\n1. try reverse \n2. exit \nenter your choice: ");
		scanf("%d",&c);
		switch(c)
		{
			case 1:
			printf("\nplease enter any string = ");
			scanf("%s",&str);
			for(i=0;i<strlen(str);i++)
			{
				top++;
				stack[top] = str[i];
			}

			//printing string into reverse
			printf("\nreversed string = ");
			for(i=top;i>=0;i--)
			{
				printf("%c ",stack[i]);
				top--;
			}
			break;

			case 2:
			exit(0);
			getch();
			break;

			default:
			printf("\nplease enter valid option");
			break;
		}
	}
}
