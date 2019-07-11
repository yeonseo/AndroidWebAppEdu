#include <stdio.h>
#include <conio.h>
void main(void)
{
  char string[80];
  int i;
  clrscr();
  printf("Input a string:");
  cscanf("%s", string);
  printf("\nInputed string is: %s\n", string);
  printf("Input a integer:");
  cscanf("%d",&i);
  printf("\nInputed integer is: %d\n",i);
}
