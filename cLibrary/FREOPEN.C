#include <stdio.h>
int main(void)
{
   if (freopen("test.txt", "w", stdout)== NULL)
      printf("error redirecting stdout\n");
   printf("This text will go into text.txt");
   fclose(stdout);
   return 0;
}
