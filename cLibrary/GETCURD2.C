#include <dir.h>
#include <stdio.h>
void main()
{
char path[66];
path[0]=getdisk()+'A';
path[1]=':';
path[2]='\\';
getcurdir(0,path+3);
printf("current directory is %s",path);
}
