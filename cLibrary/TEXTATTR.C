#include <stdio.h>
void main()
{
int i;
for (i=0;i<256;i++)
{
textattr(i);
putch('S');
}
}
