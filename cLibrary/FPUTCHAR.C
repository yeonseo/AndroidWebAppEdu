#include <stdio.h>
void main(void)
{
   char str[] = "test string";
   int i = 0;
   while (str[i])
   {
      fputchar(str[i]);
      i++;
   }
}
