#include <stdio.h>
#include <string.h>
#include <alloc.h>

int main(void)
{
   char *string1 = "9176004051";
   char *string2 = "1789642";
   int length;

   length = strspn(string1, string2);
   printf("Character where strings differ is at position %d\n", 
length);
   return 0;
}
