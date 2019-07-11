#include <stdio.h>
#include <alloc.h>
void main()
{
   struct heapinfo hi;
   void *array[5];
   int i;
   array[0]=malloc(100);
   array[1]=malloc(10);
   array[2]=malloc(20);
   array[3]=malloc(30);
   array[4]=malloc(40);

   free(array[3]);

   hi.ptr = NULL;
   printf( "   Addr  Size   Status\n" );
   printf( "   ----  ----   ------\n" );
   while( heapwalk( &hi ) == _HEAPOK )
   printf( "   %p %5u    %s\n", hi.ptr,hi.size,
     hi.in_use ? "used" : "free" );

   free(array[0]);
   free(array[1]);
   free(array[2]);
   free(array[4]);


}

