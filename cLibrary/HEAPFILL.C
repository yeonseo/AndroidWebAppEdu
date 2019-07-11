
#include <stdio.h>
#include <alloc.h>
#include <mem.h>

#define NUM_PTRS  10
#define NUM_BYTES 16

int main(void)
{
   char *array[ NUM_PTRS ];
   int i;
   int res;

   for( i = 0; i < NUM_PTRS; i++ )
      array[ i ] = (char *) malloc( NUM_BYTES );

   for( i = 0; i < NUM_PTRS; i += 2 )
      free( array[ i ] );

   if( heapfillfree( 1 ) < 0 )
   {
      printf( "Heap corrupted.\n" );
      return 1;
   }

   for( i = 1; i < NUM_PTRS; i += 2 )
      memset( array[ i ], 0, NUM_BYTES );

   res = heapcheckfree( 1 );
   if( res < 0 )
      switch( res )
      {
         case _HEAPCORRUPT:
              printf( "Heap corrupted.\n" );
              return 1;
         case _BADVALUE:
              printf( "Bad value in free space.\n" );
              return 1;
         default:
              printf( "Unknown error.\n" );
              return 1;
      }

   printf( "Test successful.\n" );
   return 0;
}
