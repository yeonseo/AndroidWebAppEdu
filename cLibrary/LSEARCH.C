/* lsearch example */

#include <stdlib.h>
#include <stdio.h>
#include <string.h>     /* for strcmp declaration */

/* initialize number of colors */
char *colors[10] = { "Red", "Blue", "Green" };
int ncolors = 3;

int colorscmp(char **arg1, char **arg2)
{
   return(strcmp(*arg1, *arg2));
}

int addelem(char *key)
{
   int oldn = ncolors;
   lsearch(key, colors, (size_t *)&ncolors, sizeof(char *),
     (int(*)(const void *,const void *))colorscmp);
   return(ncolors == oldn);
}

int main(void)
{
   int i;
   char *key = "Purple";

   if (addelem(key))
      printf("%s already in colors table\n", key);
   else
   {
      strcpy(colors[ncolors-1],key);
      printf("%s added to colors table\n", key);
   }

   printf("The colors:\n");
   for (i = 0; i < ncolors; i++)
      printf("%s\n", colors[i]);
   return 0;
}
