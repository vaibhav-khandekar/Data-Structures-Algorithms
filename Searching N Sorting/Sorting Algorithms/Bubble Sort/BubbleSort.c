#include<stdio.h>
#include<conio.h>
void main()
{
	int i,j,s,temp,array[100];
	clrscr();
	printf("\nenter size of the array = ");
	scanf("%d",&s);
	printf("\nenter %d elements in the array = ",s);
	for(i=0;i<s;i++)
	{
		scanf("%d",&array[i]);
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
	printf("\nsorted array = ");
	for(i=0;i<s;i++)
	{
		printf("%d ",array[i]);
	}
	getch();
}
