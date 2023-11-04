#include<iostream.h>
#include<stdio.h>
#include<conio.h>
void main()
{
	int i,s,search,array[100];
	clrscr();
	cout<<"\nenter size of the array = ";
	cin>>s;
	cout<<"\nenter "<<s<<" elements in the array = ";
	for(i=0;i<s;i++)
	{
		cin>>array[i];
	}
	cout<<"your array = ";
	for(i=0;i<s;i++)
	{
		cout<<array[i]<<" ";
	}
	cout<<"\nenter element to search in the array = ";
	cin>>search;
	for(i=0;i<s;i++)
	{
		if(search == array[i])
		{
			cout<<array[i]<<" element is present at "<<i<<" location of the array";
			break;
		}
	}
	if(i==s)
	{
		cout<<search<<" is not present in the array";
	}
	getch();
}
