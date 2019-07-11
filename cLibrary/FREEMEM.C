#include <dos.h>
#include <alloc.h>
#include <stdio.h>
void main(void)
{
  unsigned int size, segp;
  int stat;
  size = 64;
  stat = allocmem(size, &segp);
  if (stat < 0)
     printf("Allocated memory at segment: %x\n", segp);
  else
     printf("Failed: maximum number of\
	    paragraphs available is %u\n", stat);
  freemem(segp);
}
