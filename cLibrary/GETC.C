#include <stdio.h>
int main(void)
{
   char ch;
   printf("Input a character:");
   ch = getc(stdin);
   printf("inputed character is: %c\n", ch);
}
