#include<stdio.h>
#include<conio.h>
void main()
{
	int i,j,s,search,array[100];
	clrscr();
	printf("\nenter size of the array = ");
	scanf("%d",&s);
	printf("enter %d elements in the array = ",s);
	for(i=0;i<s;i++)
	{
		scanf("%d",&array[i]);
	}
	printf("\nyour array = ");
	for(i=0;i<s;i++)
	{
		printf("%d ",array[i]);
	}
	printf("\nenter element to search = ");
	scanf("%d",&search);
	for(i=0;i<s;i++)
	{
		if(search == array[i])
		{
			printf("%d element at %d location",search,i);
			break;
		}
	}
	if(i==s)
	{
		printf("%d is not present in the array",search);
	}
	getch();
}
