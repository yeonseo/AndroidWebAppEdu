#include <stdio.h>
#include <dos.h>
void main(void)
{
  int result;
  int port = 0;
  result = inport(port);
  printf("Word read from port %d = 0x%X\n"
    , port, result);
}
