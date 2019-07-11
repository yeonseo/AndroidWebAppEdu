#include <stdlib.h>
#include <stdio.h>
#include <string.h>
void main(void)
{
char source[15] = "oNs omikgn!";
char target[15];
swab(source, target, 12);
printf("converted string is: %s\n", target);
}
