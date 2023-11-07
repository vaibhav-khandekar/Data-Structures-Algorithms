#include<iostream.h>
#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>
void main()
{
	int i,c,top=-1;
	char stack[100],str[100];
	clrscr();
	cout<<"\nstring reversing using stack array, menu";
	while(1)
	{
		cout<<"\n1. try reverse \n2. exit \nenter your choice: ";
		cin>>c;
		switch(c)
		{
			case 1:
			cout<<"\nenter any string = ";
			cin>>str;
			for(i=0;i<strlen(str);i++)
			{
				top++;
				stack[top] = str[i];
			}

			// printing string in reversed
			cout<<"your string in reverse = ";
			for(i=top;i>=0;i--)
			{
				cout<<stack[top]<<" ";
				top--;
			}
			break;

			case 2:
			exit(0);
			getch();
			break;

			default:
			printf("\nplease enter valid choice = ");
			break;
		}
	}
}
