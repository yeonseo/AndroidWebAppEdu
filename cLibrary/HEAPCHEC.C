#include <stdio.h>
#include <alloc.h>
void main()
{
   char *array[10];
   int i;
   int result;
   for( i = 0; i < 10; i++ )
      array[ i ] = (char *) malloc( 20 );

   for( i = 0; i < 10; i += 2 )
      free( array[ i ] );

   result=heapcheck();
      if( result == _HEAPCORRUPT )
      printf("Heap is corrupted.\n");
   else if ( result == _HEAPEMPTY)
      printf("Heap is empty.\n");
   else
      printf("Heap is OK.\n" );

   *(array[5]-1)=0xff;
   printf("after corrupt : ");

   result=heapcheck();
      if( result == _HEAPCORRUPT )
      printf("Heap is corrupted.\n");
   else if ( result == _HEAPEMPTY)
      printf("Heap is empty.\n");
   else
      printf("Heap is OK.\n" );

}
