#include <graphics.h>
#include <stdlib.h>
#include <stdio.h>
#include <conio.h>

int main(void)
{
/* request auto detection */
   int gdriver = DETECT, gmode, errorcode;
   struct palettetype pal;
   char psize[80], pval[20];
   int i, ht;
   int y = 10;

/* initialize graphics and local variables */
   initgraph(&gdriver, &gmode, "");

/* read result of initialization */
   errorcode = graphresult();
/* an error occurred */
   if (errorcode != grOk)
   {
      printf("Graphics error: %s\n", grapherrormsg(errorcode));
      printf("Press any key to halt:");
      getch();
/* terminate with an error code */
      exit(1);
   }

/* grab a copy of the palette */
   getpalette(&pal);

/* convert palette info. into strings */
   sprintf(psize, "The palette has %d modifiable entries.", 
pal.size);

/* display the information */
   outtextxy(0, y, psize);
   if (pal.size != 0)
   {
      ht = textheight("W");
      y += 2*ht;
      outtextxy(0, y, "Here are the current values:");
      y += 2*ht;
      for (i=0; i<pal.size; i++, y+=ht)
      {
         sprintf(pval, "palette[%02d]: 0x%02X", i, 
pal.colors[i]);
         outtextxy(0, y, pval);
      }
   }

/* clean up */
   getch();
   closegraph();
   return 0;
}
