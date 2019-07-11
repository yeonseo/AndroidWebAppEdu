#include <stdio.h>
#include <stdlib.h>
main(int argc,char *argv[])
{
int c;
FILE *src,*dest;
if (argc <=2) {printf("I need two parameter\n");
       exit(1);
      }
src=fopen(argv[1],"rb");
if (src==NULL) {printf("Source file Error\n");
       exit(1);
      }
dest=fopen(argv[2],"wb");
if (dest==NULL) {printf("Destination file Error\n");
 exit(1);
}
while ((c=fgetc(src))!=EOF)
  if (fputc(c,dest)==EOF) break;
}
