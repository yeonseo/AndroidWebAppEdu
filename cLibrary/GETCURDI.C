#include <dir.h>
#include <stdio.h>
void main()
{
char path[66];
getcurdir(0,path);
printf("current directory is %s",path);
}
