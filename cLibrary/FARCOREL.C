#include <stdio.h>
#include <alloc.h>
void main(void)
{
 printf("free far heap is %lu bytes\n", farcoreleft());
}
