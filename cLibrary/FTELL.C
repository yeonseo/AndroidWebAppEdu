#include <stdio.h>
#include <stdlib.h>
void main(int argc,int *argv[])
{
long length;
FILE *stream;
if (argc<2) 
   {
   fprintf("I need parameter\n");
   exit(1);
   }
stream=fopen(argv[1],"rb");
fseek(stream,0l,SEEK_END);
length=ftell(stream);
printf("file size is %ld bytes\n",length);
}
