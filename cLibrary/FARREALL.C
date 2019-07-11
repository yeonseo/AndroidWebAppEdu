#include <stdio.h>
#include <alloc.h>
#include <string.h>
#include <dos.h>
#include <stdlib.h>
void main()
{
  char far *fptr;
  char far *fptr2;
  char *str = "Korea is One ";
  char *str2= "abcdefghijklmnopqrstuvwxyz";
  fptr = (char far *) farmalloc(20);
  movedata(FP_SEG(str), FP_OFF(str),
	   FP_SEG(fptr), FP_OFF(fptr), strlen(str));
  printf("Far string is: %Fs\n", fptr);
  fptr2 = (char far *) farrealloc(fptr,50);
  if (fptr2==NULL)
    {
    printf("Out of memory\n");
    exit(0);
    }
  movedata(FP_SEG(str2), FP_OFF(str2),
	   FP_SEG(fptr2), FP_OFF(fptr2), strlen(str2));
  printf("Far string2 is: %Fs\n", fptr2);
  farfree(fptr);
}
