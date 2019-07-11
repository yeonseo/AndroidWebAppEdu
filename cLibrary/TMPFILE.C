#include <stdio.h>
#include <process.h>
void main(void)
{
   FILE *tempfp;
   tempfp=tmpfile();
   if (tempfp)
      printf("Temporary file created\n");
   else
   {
      printf("Unable to create temporary file\n");
      exit(1);
   }
}
