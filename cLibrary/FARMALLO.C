#include <stdio.h>
#include <alloc.h>
#include <string.h>
#include <dos.h>

void main()
{
  char far *fptr;
  char *str = "Korea is One";
  fptr = (char far *) farmalloc(20);
  movedata(FP_SEG(str), FP_OFF(str),
	   FP_SEG(fptr), FP_OFF(fptr), strlen(str));
  printf("Far string is: %Fs\n", fptr);
  farfree(fptr);
}
