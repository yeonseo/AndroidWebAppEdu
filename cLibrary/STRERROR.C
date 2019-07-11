#include <stdio.h>
int main(void)
{
int i;
for (i=0;i<16;i++)
printf("%s",strerror(i));
}
