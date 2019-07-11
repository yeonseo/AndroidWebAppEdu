#include <string.h>
#include <stdio.h>
#include <conio.h>
#include <io.h>
void main(void)
{
   FILE *stream;
   char msg[] = "This is a test";
   stream = fopen("DUMMY.FIL", "w");
   fwrite(msg, strlen(msg), 1, stream);
   fflush(stream);
   printf("File was flushed\n");
   fclose(stream);
}
