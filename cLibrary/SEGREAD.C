#include <stdio.h>
#include <dos.h>
void main(void)
{
struct SREGS segs;
segread(&segs);
printf("Current segment register settings\n\n");
printf("CS: %X   DS: %X\n", segs.cs, segs.ds);
printf("ES: %X   SS: %X\n", segs.es, segs.ss);
}
