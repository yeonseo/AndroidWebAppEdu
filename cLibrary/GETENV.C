#include <stdio.h>
#include <stdlib.h>
void main()
{
char *path,*comspec;
path=getenv("PATH");
printf("PATH = %s\n",path);
comspec=getenv("COMSPEC");
printf("COMSPEC = %s\n",comspec);
}
