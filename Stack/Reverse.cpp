#include<iostream.h>
#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
	int top=-1,i,l;
	clrscr();
	char stack[100],str[100];
	cout<<"\nstring reversing using stack,array";
	cout<<"\nenter string = ";
	cin>>str;
	l = strlen(str);
	for(i=0;i<l;i++)
	{
		top++;
		stack[top] = str[i];
	}

	// printing string
	cout<<"reverse string = ";
	for(i=top;i>=0;i--)
	{
		cout<<stack[i]<<" ";
	}
	getch();
}
