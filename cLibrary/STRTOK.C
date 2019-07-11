#include <string.h>
#include <stdio.h>

int main(void)
{
   char name[25] = "kim sang hyung 1970 6.29";
   char *p;
   p = strtok(name, " ");
   if (p)   printf("%s\n", p);
while (p!=NULL){
   p = strtok(NULL, " ");
   if (p)   printf("%s\n", p);
   }
   return 0;
}
