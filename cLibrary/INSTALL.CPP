// C++ ���� �A 3 �� ���A ��á �a���a��
// 1�� ��á �a���a���i ���q �����e ����
// arj �s�a�� �A����i �����a�� �s�i Ή�� �����e �e�a.
// 1994.11.28

#include <graphics.h>
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <dir.h>
#include <dos.h>
#include <errno.h>
#include <ctype.h>
#include <string.h>
#include "shhan.h"

void readpcx16p(char *,int,int);       /* 16 �� pcx�i ���e �q�� */
void readline16p(FILE *,int,int,int);
void readpalette16(char *);
void hom(int,int,int,int,int,int,int);
void dan(int,int,int,int,int,int,int,int);
void bar2(int l,int t,int r,int b);
#define he0 *h1
#define he1 *h1+h2


char buf[128];
ffblk ffb;
int result;
char cwd[80];       // �A�� �b��i ���b�e ���Bɡ��
char cwd2[80];      // arj.exe�� �w���i �����i ���a ���i
int disk;           // �A�� �b��i ���b�e �a�a����
char command[128];  // �w�w ���a�i
int chapter;        // �w�i�� �s�i Ή �����a�i �����e�a.
char drive[3],path[66],name[9],ext[5];
int gd=0,gm;
int h1,h2;

void main()
{
char ch;
getcwd(cwd,80);      // �b��i ���b�e �w���i �����e�a.
disk=getdisk();
registerbgidriver(EGAVGA_driver);
registerbgidriver(Herc_driver);
initgraph(&gd,&gm,"");
if (gd==7) {h1=0;h2=1;} else {h1=1;h2=0;}
shset(gd,1);
setfillstyle(1,7);
bar2(0,0,getmaxx(),getmaxy());

hom(15,5,625,195,8,15,1);
readpcx16p("won.pcx",20,10);      // �a�� ���� �i��
dan(85,200,555,255,15,8,1,1);     // ��á �e���� �b
dan(90,205,550,250,8,15,1,1);
setfillstyle(1,11he0);
bar2(91,206,549,249);
shhan(100,210,"C++�i �����a�� �A���a�e�� ���A �a���i �a�a",0,11,0,0);
shhan(100,226,"���a�a�A ��á�s���a. �a�� �����A �w�sЁ �������a.",0,11,0,0);

dan(85,260,555,380,15,8,1,1);    // �A���� �����w
dan(90,265,550,375,8,15,1,1);
do {
ch=0;
setfillstyle(1,1he0);
bar2(91,266,549,374);
shhan(100,270,"��á�i ���Bɡ���i ���b�a�����a.",15,1,0,0);
shmode(1);
strcpy(buf,"c:\\cpp3ex");
shget(100,290,buf,15,1,80,1);
result=findfirst(buf,&ffb,FA_DIREC);        // ���Bɡ���a ���e�� ���a.
if (result) {
  shhan(100,270,"���Bɡ���a ���s���a. �e�i�a�a?",15,1,0,0);
  shhan(100,290,"M:�e�k  R:�����b  C:��á �᭡",15,1,0,0);
  ch=getch();
  ch=tolower(ch);
  if (ch=='m')
    {
    if (mkdir(buf))
      {
      setfillstyle(1,1);
      bar(91,266,549,374);
      shhan(100,270,"���Bɡ�� ���q�� �i�� ���b�A���s���a.",15,1,0,0);
      shhan(100,290,"�a�� ���bЁ �������a.",15,1,0,0);
      delay(1500);
      ch='r';
      continue;
      }
    setfillstyle(1,1he0);
    bar(91,266,549,374);
    shhan(100,270,"���Bɡ���i �e�i���s���a.",15,1,0,0);
    shhan(100,290,"�� ���Bɡ���A ���A �a���i ��á�s���a.",15,1,0,0);
    delay(1000);
    }
  if (ch=='c')
    {
    closegraph();
    exit(0);
    }
  }
}while (ch=='r');


fnsplit(buf,drive,path,name,ext);
setdisk(tolower(drive[0])-'a');     // ��á�i ���Bɡ���� ����
chdir(buf);
setfillstyle(1,1he0);
bar(91,266,549,374);
/*   3���e ������ x���e�a�� �s�i ΅�a.
shhan(100,270,"�w�i�� ���Bɡ���i �����i�a�a?",15,1,0,0);
shhan(100,290,"�a���e �e�� ���Bɡ���A ���� ��á�i�a�a",15,1,0,0);
shhan(100,310,"C:�w�i��   A:����",15,1,0,0);
ch=getch();
  if (ch=='c') chapter=1;
    else chapter=0;
*/
chapter=1;
setfillstyle(1,1he1);
bar(95,195,545,255);
setfillstyle(1,15he0);
bar(100,200,540,250);
shhan(120,220,"��á�i ���b�s���a. �� 1���� ���a�S���a.",0,15,0,0);
delay(2000);
closegraph();
clrscr();
if (cwd[2]=='\\' && cwd[3]==0)   // ���a ���Bɡ�� �១
  {
  if (disk==0) strcpy(cwd2,"a:");
  if (disk==1) strcpy(cwd2,"b:");
  }
else strcpy(cwd2,cwd);
if (chapter==1)
sprintf(command,"%s%s%s%s",cwd2,"\\arj x -y ",cwd2,"\\cpp3ex");
 else sprintf(command,"%s%s%s%s",cwd2,"\\arj e -y ",cwd2,"\\cpp3ex");
result=system(command);
delay(500);
setdisk(disk);    // �A�� �b�� ���Bɡ���� �����e�a.
chdir(cwd);

initgraph(&gd,&gm,"");
setfillstyle(1,7);
bar2(0,0,getmaxx(),getmaxy());
dan(85,260,555,380,15,8,1,1);
dan(90,265,550,375,8,15,1,1);
setfillstyle(1,1he0);
bar2(91,266,549,374);
if (result==-1) {
  switch (errno) {
    case ENOMEM:shhan(100,300,"�A�����a �����s���a.",15,1,0,0);
	 break;
    case ENOENT:shhan(100,300,"�a���� ���s���a.",15,1,0,0);
	 break;
    case E2BIG:shhan(100,300,"�a���a���� �ᢁ �s���a.",15,1,0,0);
	 break;
    case ENOEXEC:shhan(100,300,"��З �a�� ���A�����a.",15,1,0,0);
	 break;
    }
  shhan(100,320,"arj �A˩��ˡ�i �a�w�a�a ���� ��á�a�����a.",15,1,0,0);
  }
else
  {
  shhan(100,300,"��á�a �Şa�A���s���a. �q�a�s���a.",15,1,0,0);
  shhan(100,320,"���A�� �a�w�w��e �����i �q�� �a�����a.",15,1,0,0);
  }
hom(15,5,625,195,8,15,1);
readpcx16p("won.pcx",20,10);
delay(1000);
getch();
closegraph();
}


typedef struct {
   char manufacturer;   /* pcx �a�� �·� 0x0a */
   char version;        /* ����ѡ 0x05�a 5.0 256��� */
   char encoding;       /* ��š�� �w�� 0x01-RLL ��š�� */
   char bpp;            /* Ϣ�I�w bit��   */
   int xmin,ymin;       /* �a���� �w�a���� �a�� */
   int xmax,ymax;
   int hres;            /* Ё�w��-���a �����a ���q */
   int vres;
   char palette[48];    /* �i�A�a ���� */
   char reserved;       /* ����        */
   char colour_planes;  /* �i�A�� ���� HGC=1,VGA=4 */
   int bpl;             /* ���w byte �� */
   int palette_type;
   char filler[58];     /* ���� �w�b */
}PCXHEAD;
/* ��i ���e �w��a�� 16�� pcx�i �b�e�a.            */
/* �����a ���q �a���a.                                */
/* filename-�b�i pcx �a��,                          */
/* x,y - �b�i ���e�w�� ��á                         */
void readpcx16p(char *filename,int x,int y)
{
FILE *fp;
PCXHEAD hd;
unsigned int width,depth;   /* �a���� ͢�� ���� */
unsigned int bytes;         /* ���w byte�� */
char palette[768];          /* palette �����i �q�e ���i */
int i,j;                 /* ���� �e���� */
fp=fopen(filename,"rb");
if (fp==NULL){     /* �a�� ���w�A ��́�a�e exit() */
    return;
    }
fseek(fp,-769l,SEEK_END);   /* 256 �i�U�a ���� ��a */
 if (fgetc(fp)==0x0c && fread(palette,1,768,fp)== 768)
   {
   printf("not 16 color,but 256 color\n");
   exit(0);
   }
fseek(fp,0l,SEEK_SET);
fread(&hd,1,128,fp);   /* �A�� ���q */
if (hd.manufacturer==0x0a && hd.bpp==0x01)
    {
    if (hd.version!=0x03)   /* �i�A�a�a ���a�e ���q */
       readpalette16(hd.palette);
    fseek(fp,128,SEEK_SET); /* �A�� �a�� �a�q ���� ���q */
    for (i=0;i<hd.ymax-hd.ymin+1;i++)
       readline16p(fp,hd.bpl,x,y+i);
    }
}
/* 16�� pcx �a���A�� �i�U�a�����i ���� �i�U�a�i setting�e�a. */
void readpalette16(char *pal_buf)
{
int i;
struct REGPACK reg;
/* �i�A�a�� �w�� 6byte�e �a�w�e�a. */
return;
for (i=0;i<48;i++) pal_buf[i]>>=2;
for (i=0;i<16;i++)
    {
    reg.r_ax=0x1000;
    reg.r_bx=i*256+i;
    intr(0x10,&reg);
    }
reg.r_ax=0x1012;
reg.r_bx=0;
reg.r_cx=16;
reg.r_es=FP_SEG(pal_buf);
reg.r_dx=FP_OFF(pal_buf);
intr(0x10,&reg);
}
/* readpcx16p�A�� �a�w�a�e ��a��˥,�e���i �bЁ���a. */
/* fp=�b�i pcx �a��, len= ���w byte ��               */
/* x,y - �b�i ���e�w�� ��á                          */
void readline16p(FILE *fp,int len,int x,int y)
{
int i,j,k,n;     /* ���� �e���i */
char temp[1040]; /* ���� ���� */
char col[1040];
n=0;
do
{
  i=fgetc(fp);
/* �a�� ��w: �s�� �w�� �a�� 6 bit�i i�A ���� */
/* �a �a�q byte�i ���� �i�a j�A ���e ҁ j�i i�� */
/* �e��Ё�� ����A ���� ���e�a. �s�i ΁�e   */
/* �������a.                                    */
  if ((i&0xc0)==0xc0)       /* �s�� �w�� */
    {
    i=i&0x3f;
    j=fgetc(fp);
    while(i--) temp[n++]=j;
    }
    else
    { temp[n++]=i; }     /* �s�� �a�� �w�� */
} while (n<len*4);   /* �e���A 4plane�i ���q */
for (i=0;i<640;i++) col[i]=0;  /* ����i ���� */
for (i=0;i<4;i++)       /* �i�A�� */
  for (j=0;j<len;j++)     /* ���w �a���a */
    for (k=7;k>=0;k--)     /* ���a        */
      if (temp[j+i*len]&(1<<k)) col[j*8+7-k]|=(1<<i);
for (i=0;i<len*8;i++)      /* col���i�A �Ŭ��E �a���i �b�e�a.*/
  putpixel(x++,y,col[i]);    /* �b �e��e �e�����a.            */
}
/* ���� ���a�� ���e ���b�i �e�e�a.                      */
 void dan(int x1,int y1,int x2,int y2,int upcolor,int downcolor,int num,int gap)
 {
 int i,j=0;
 for (i=0;i<num;i++){
 setcolor(upcolor);line(x1-j,y1-j,x1-j,y2+j);line(x1-j,y1-j,x2+j,y1-j);
 setcolor(downcolor);line(x2+j,y2+j,x2+j,y1-j);line(x2+j,y2+j,x1-j,y2+j);
 j+=gap;
 }
 }
/* VGA�A�� ���i��a ���e �e ���i �e�e�a.Ӆ���� �a�w���a ���e���i */
/* �a���ᝡ �a�b�w�e �a�a���e �E�a.                              */
/* �����e DAN�� �� �{���e gap�e ���a.                            */

void hom(int x1,int y1,int x2,int y2,int upcolor,int downcolor,int num)
{
int i;
for (i=0;i<num;i++)
{
setcolor(upcolor);
rectangle(x1+i,y1+i,x2+i,y2+i);
setcolor(downcolor);
rectangle(x1+i+num,y1+i+num,x2+i+num,y2+i+num);
}
}

void bar2(int l,int t,int r,int b)
{
int i;
int incx=(r-l)/20;
int incy=(b-t)/20;
int cx=(r+l)/2;
int cy=(b+t)/2;
for (i=1;i<10;i++)
  {
  bar(cx-incx*i,cy-incy*i,cx+incx*i,cy+incy*i);
  delay(50);
  }
bar(l,t,r,b);
}
