#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
void main()
{
int i;
char binstr[10];
char octstr[10];
char decstr[10];
char hexstr[10];
clrscr();
printf("%10s%10s%10s%10s\n","binary","octal","decimal","hexa");
for (i=0;i<=16;i++)
  {
  itoa(i,binstr,2);
  itoa(i,octstr,8);
  itoa(i,decstr,10);
  itoa(i,hexstr,16);
  printf("%10s%10s%10s%10s\n",binstr,octstr,decstr,hexstr);
  }
}
