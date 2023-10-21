#include<stdio.h>
#include<conio.h>
void main()
{
	int temp,arr[30],i,j,s;
	clrscr();
	printf("enter size of the array = ");
	scanf("%d",&s);
	printf("\nenter %d elements in the array = ",s);
	for(i=0;i<s;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0;i<s;i++)
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
	printf("\n sorted array = ");
	for(i=0;i<s;i++)
	{
		printf("%d ",arr[i]);
	}
	getch();
}
