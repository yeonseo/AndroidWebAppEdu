#include <stdlib.h>
#include <conio.h>
void main()
{
int i,j;
clrscr();
printf("Enter a number\n");
scanf("%d",&i);
printf("Enter another number\n");
scanf("%d",&j);
printf("Larger number is %d\n",max(i,j));
}
