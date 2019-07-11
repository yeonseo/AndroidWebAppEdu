#include <stdio.h>
void main(void)
{
  FILE *stream;
  int i = 100;
  char c = 'C';
  float f = 1.234;
  stream = fopen("fprintf.dat", "w+");
  fprintf(stream, "integer is %d\n",i);
  fprintf(stream, "character is %c\n",c);
  fprintf(stream, "float is %f\n", f);
  fclose(stream);
}
