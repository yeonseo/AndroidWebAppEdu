#include <stdio.h>
#include <dir.h>
void main()
{
  FILE *fp;
  char first;
  fp = fopen("test.txt","w+");
  fprintf(fp,"abcdefghijklmnopqrstuvwxyz");
  rewind(fp);
  fscanf(fp,"%c",&first);
  printf("The first character is: %c\n",first);
  fclose(fp);
  remove("test.txt");
}
