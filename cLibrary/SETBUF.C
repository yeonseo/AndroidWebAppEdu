#include <stdio.h>
#include <conio.h>
char outbuf[BUFSIZ];
int main(void)
{
   setbuf(stdout, outbuf);
   puts("This is a test of buffered output.");
   puts("This output will go into outbuf");
   puts("and won't appear until the buffer");
   puts("fills up or we flush the stream.");
   getch();
   fflush(stdout);
   getch();
   return 0;
}
