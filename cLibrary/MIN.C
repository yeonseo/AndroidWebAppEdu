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
printf("Smaller number is %d\n",min(i,j));
}
