#include <stdio.h>
#include <dos.h>
void main()
{
switch (_8087) {
  case 0:printf("no coprocessor\n");
	 break;
  case 1:printf("8087 coprocessor is detected\n");
	 break;
  case 2:printf("80287 coprocessor is detected\n");
	 break;
  case 3:printf("80387 coprocessor is detected\n");
	 break;
  }
}
