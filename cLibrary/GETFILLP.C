#include <graphics.h>
#include <stdlib.h>
#include <stdio.h>
#include <conio.h>

int main(void)
{
   /* request auto detection */
   int gdriver = DETECT, gmode, errorcode;
   int maxx, maxy;
   char pattern[8] = {0x00, 0x70, 0x20, 0x27, 0x25, 0x27, 0x04, 
0x04};

   /* initialize graphics and local variables */
   initgraph(&gdriver, &gmode, "");

   /* read result of initialization */
   errorcode = graphresult();
   if (errorcode != grOk)  /* an error occurred */
   {
      printf("Graphics error: %s\n", grapherrormsg(errorcode));
      printf("Press any key to halt:");
      getch();
      exit(1); /* terminate with an error code */
   }

   maxx = getmaxx();
   maxy = getmaxy();
   setcolor(getmaxcolor());

   /* select a user defined fill pattern */
   setfillpattern(pattern, getmaxcolor());

   /* fill the screen with the pattern */
   bar(0, 0, maxx, maxy);

   getch();

   /* get the current user defined fill pattern */
   getfillpattern(pattern);

   /* alter the pattern we grabbed */
   pattern[4] -= 1;
   pattern[5] -= 3;
   pattern[6] += 3;
   pattern[7] -= 4;

   /* select our new pattern */
   setfillpattern(pattern, getmaxcolor());

   /* fill the screen with the new pattern */
   bar(0, 0, maxx, maxy);

   /* clean up */
   getch();
   closegraph();
   return 0;
}
