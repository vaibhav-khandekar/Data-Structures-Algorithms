#include<iostream.h>
#include<stdio.h>
#include<conio.h>
void main()
{
	int i,j,s,temp,array[100];
	clrscr();
	cout<<"\nenter size of the array = ";
	cin>>s;
	cout<<"\nenter "<<s<<" elements in the array = ";
	for(i=0;i<s;i++)
	{
		cin>>array[i];
	}
	for(i=0;i<s-1;i++)
	{
		for(j=0;j<s-1;j++)
		{
			if(array[j] > array[j+1])
			{
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}
		}
	}
	cout<<"\nsorted array = ";
	for(i=0;i<s;i++)
	{
		cout<<array[i]<<" ";
	}
	getch();
}
