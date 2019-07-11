#include <stdio.h>
#include <dos.h>
void main(void)
{
  FILE *fp;
  struct DOSERROR info;
  fp=fopen("neverexi.st","r");
  if (fp==NULL)
    printf("File open error\n");
  dosexterr(&info);
  printf("Extended DOS error information:\n");
  printf("Extended error: %d\n",info.de_exterror);
  printf("         Class: %x\n",info.de_class);
  printf("        Action: %x\n",info.de_action);
  printf("   Error Locus: %x\n",info.de_locus);
}
