#include <stdio.h>
#include <dos.h>
void main(void)
{
  int port = 0;
  int value = 'C';
  outport(port, value);
  printf("Value %d sent to port number %d\n", value, port);
}
