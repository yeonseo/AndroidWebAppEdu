#include <stdio.h>
#include <dos.h>
void main(void)
{
  int port = 0;
  char value = 'C';
  outportb(port, value);
  printf("Value %c sent to port number %d\n", value, port);
}
