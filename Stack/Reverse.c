#include<stdio.h>
#include<conio.h>
void main()
{
	int top=-1,i;
	char stack[100],str[100];
	clrscr();
	printf("\nreverse a string using stack,array");
	printf("\nenter a string = ");
	scanf("%s",&str);
	for(i=0;i<strlen(str);i++)
	{
		top++;
		stack[top]=str[i];
	}
	for(i=top;i>=0;i--)
	{
		printf("%c ",stack[i]);
	}
	getch();
}
