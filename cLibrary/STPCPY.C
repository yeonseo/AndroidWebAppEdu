#include <stdio.h>
#include <string.h>
void main()
{
char src1[20];
char src2[20];
char dest[20];
char *addstr;
strcpy(src1,"i love ");
strcpy(src2,"you");
addstr=stpcpy(dest,src1);
stpcpy(addstr,src2);
printf("destination string is %s\n",dest);
}
