#include <stdio.h>
#include <string.h>
void main()
{
 char *s1 = "North Korea";
 char *s2 = "South Korea";
 int check;
 check = strcoll(s1,s2);
   if (check == 0)
      printf("The two strings are equal\n");
   if (check <  0)
      printf("%s comes before %s\n", s1,s2);
   if (check >  0)
      printf("%s comes before %s\n", s1,s2);
}
