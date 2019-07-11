#include <stdio.h>
#include <string.h>
void main()
{
char string[20];
char moum[6];
char *first;
strcpy(moum,"aeiou");
scanf("%s",string);
first=strpbrk(string,moum);
printf("the first moum in your string %c\n",*first);
}
