#include <stdio.h>
#include <dir.h>
void main(void)
{
char *p;
p=searchpath("NCD.EXE");
printf("NCD.EXE is in %s\n",p);
}
