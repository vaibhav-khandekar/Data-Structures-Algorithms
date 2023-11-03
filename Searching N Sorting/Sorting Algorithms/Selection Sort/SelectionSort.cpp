#include<stdio.h>
#include<conio.h>
#include<iostream.h>
void main()
{
	int i,j,s,arr[30],temp;
	clrscr();
	cout<<"enter size of the array = ";
	cin>>s;
	cout<<"\nenter "<<s<<" elements in the array = ";
	for(i=0;i<s;i++)
	{
		cin>>arr[i];
	}
	for(i=0;i<s-1;i++)
	{
		for(j=i+1;j<s;j++)
		{
			if(arr[i] > arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	for(i=0;i<s;i++)
	{
		cout<<arr[i]<<" ";
	}
	getch();
}
