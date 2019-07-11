#include <stdio.h>
void main()
{
   char name1[13];
   char name2[13];
   tmpnam(name1);
   printf("temp file 1 is %s\n",name1);
   tmpnam(name2);
   printf("temp file 2 is %s\n",name2);
}
