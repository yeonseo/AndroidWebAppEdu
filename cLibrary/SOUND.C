#include <dos.h>
#include <math.h>
void main()
{
double i;
for (i=0;i<1000;i++)
  {
  sound(500+sin(i*3.14/180)*100);
  delay(1);
  }
nosound();
}
