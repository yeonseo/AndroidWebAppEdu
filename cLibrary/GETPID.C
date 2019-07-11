#include <stdio.h>
#include <process.h>
void main()
{
  printf("This program's process identification number (PID) "
	 "number is %X\n", getpid());
  printf("Note: under DOS it is the PSP segment\n");
}
