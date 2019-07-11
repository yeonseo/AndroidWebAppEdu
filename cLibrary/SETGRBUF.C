 #include <graphics.h>
 #include <stdlib.h>
 #include <stdio.h>
 #include <conio.h>

 #define BUFSIZE 1000 /* internal graphics
buffer size */

 int main(void)
 {
    /* request auto detection */
    int gdriver = DETECT, gmode, errorcode;
    int x, y, oldsize;
    char msg[80];

    /* set the size of the internal graphics buffer */
    /* before making a call to initgraph.           */
    oldsize = setgraphbufsize(BUFSIZE);

    /* initialize graphics and local variables */
    initgraph(&gdriver, &gmode, "");

    /* read result of initialization */
    errorcode = graphresult();
    if (errorcode != grOk)  /* an error occurred */
    {
       printf("Graphics error: %s\n", 
grapherrormsg(errorcode));
       printf("Press any key to halt:");
       getch();
       exit(1); /* terminate with an error code */
    }

    x = getmaxx() / 2;
    y = getmaxy() / 2;

    /* output some messages */
    sprintf(msg, "Graphics buffer size: %d", BUFSIZE);
    settextjustify(CENTER_TEXT, CENTER_TEXT);
    outtextxy(x, y, msg);
    sprintf(msg, "Old graphics buffer size: %d", oldsize);
    outtextxy(x, y+textheight("W"), msg);

    /* clean up */
    getch();
    closegraph();
    return 0;
 }
