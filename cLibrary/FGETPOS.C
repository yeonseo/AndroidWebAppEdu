#include <stdlib.h>
#include <stdio.h>
void main(void)
{
  FILE *stream;
  fpos_t filepos;
  stream = fopen("DUMMY.FIL", "w+");
  fprintf(stream, "test string");
  fgetpos(stream, &filepos);
  printf("File position: %ld\n", filepos);
  fclose(stream);
}
