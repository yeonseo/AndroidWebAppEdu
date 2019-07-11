#include <stdio.h>

int main(void)
{
   FILE *fp;
   fp = fopen("nofile.nof", "r");
   printf("%s", _strerror("you merong"));
   if (fp) fclose(fp);
   return 0;
}
