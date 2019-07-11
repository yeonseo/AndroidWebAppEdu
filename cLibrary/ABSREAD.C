#include <stdio.h>
#include <dos.h>
#include <stdlib.h>
#include <ctype.h>
void main()
{
unsigned char buf[512];
int i,j;
int sector,drive;
if (absread(2,0,1,&buf)!=0)
  {
  printf("Error reading drive C");
  exit(1);
  }
for (i=0;i<512;i+=16)
  {
  printf("offset %04X:",i);
  for (j=0;j<16;j++)
    printf("%02X ",buf[i+j]);
  printf("   ");
  for (j=0;j<16;j++)
    if (isprint(buf[i+j]))
      printf("%c",buf[i+j]);
    else
      printf(".");
  printf("\n");
  }
}
