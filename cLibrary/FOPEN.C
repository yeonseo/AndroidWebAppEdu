#include <stdio.h>
#include <stdlib.h>
void main(int argc,char *argv[])
{
char buffer[80];
FILE *stream;
if (argc <= 1) {printf("I need parameter\n");
		exit(1);
	       }
stream=fopen(argv[1],"rt");
if (stream==NULL) {printf("File open error\n");
		   exit(1);
		  }
while (!feof(stream)){
  if (fgets(buffer,80,stream)==NULL) break;
  printf("%s",buffer);
  }
}
