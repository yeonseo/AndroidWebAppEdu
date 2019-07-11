#include <graphics.h>
#include <stdlib.h>
#include <stdio.h>
#include <conio.h>

/* the names of the line styles supported */
char *lname[] = { "SOLID_LINE",
                  "DOTTED_LINE",
                  "CENTER_LINE",
                  "DASHED_LINE",
                  "USERBIT_LINE"
                };

int main(void)
{
   /* request auto detection */
   int gdriver = DETECT, gmode, errorcode;
   struct linesettingstype lineinfo;
   int midx, midy;
   char lstyle[80], lpattern[80], lwidth[80];

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

   midx = getmaxx() / 2;
   midy = getmaxy() / 2;

   /* get information about current line settings */
   getlinesettings(&lineinfo);

   /* convert line information into strings */
   sprintf(lstyle, "%s is the line style.", 
lname[lineinfo.linestyle]);
   sprintf(lpattern, "0x%X is the user-defined line pattern.",
           lineinfo.upattern);
   sprintf(lwidth, "%d is the line thickness.",
           lineinfo.thickness);

   /* display the information */
   settextjustify(CENTER_TEXT, CENTER_TEXT);
   outtextxy(midx, midy, lstyle);
   outtextxy(midx, midy+2*textheight("W"), lpattern);
   outtextxy(midx, midy+4*textheight("W"), lwidth);

   /* clean up */
   getch();
   closegraph();
   return 0;
}
