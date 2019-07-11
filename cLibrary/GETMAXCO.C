#include <graphics.h>
#include <stdlib.h>
#include <stdio.h>
#include <conio.h>
void main(void)
{
int gdriver = DETECT, gmode, errorcode;
int midx, midy;
char colstr[80];
char maxmode[80];

initgraph(&gdriver, &gmode, "");

errorcode = graphresult();
if (errorcode != grOk)  /* an error occurred */
{
   printf("Graphics error: %s\n"
      , grapherrormsg(errorcode));
   printf("Press any key to halt:");
   getch();
   exit(1); /* terminate with an error code */
}

midx = getmaxx() / 2;
midy = getmaxy() / 2;

sprintf(colstr, "This mode supports colors 0..%d"
	, getmaxcolor());
sprintf(maxmode, "This mode have %d modes"
	, getmaxmode());
settextjustify(CENTER_TEXT, CENTER_TEXT);
outtextxy(midx, midy, colstr);
outtextxy(midx,midy+20,maxmode);

getch();
closegraph();
}
