#include <stdio.h>
#include <ctype.h>
#include <conio.h>
void main()
{
char i;
clrscr();
printf("Press one number key you prefer to\n");
for (;;){
   i=getch();
   if (!isdigit(i))
      printf("Wrong!! not a number key\n");
   else break;
   }
printf("your prefer number is %c",i);
}
