#include <stdio.h>
#include <stdlib.h>
void main()
{
  char input[80], *endptr;
  double value;
  printf("Enter a floating point number:");
  gets(input);
  value = strtod(input, &endptr);
  printf("The string is %s\n",input);
  printf("the number is %lf\n",value);
}
