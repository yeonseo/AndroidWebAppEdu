#include <graphics.h>
#include <stdlib.h>
#include <stdio.h>
#include <conio.h>
void main(void)
{
  int gdriver = DETECT, gmode, errorcode;
  int midx, midy;
  initgraph(&gdriver, &gmode, "");
  errorcode = graphresult();
  if (errorcode != grOk)
  {
     printf("Graphics error: %s\n", grapherrormsg(errorcode));
     printf("Press any key to halt:");
     getch();
     exit(1);
  }

  midx = getmaxx() / 2;
  midy = getmaxy() / 2;
  moveto(midx, midy);
  outtext("This ");
  outtext("is ");
  outtext("a ");
  outtext("test string.");
  getch();
  closegraph();
}
