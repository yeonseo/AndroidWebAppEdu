#include <sys\stat.h>
#include <stdio.h>
#include <time.h>
void main(void)
{
 struct stat statbuf;
   FILE *stream;
   if ((stream = fopen("DUMMY.FIL", "w+"))
       == NULL)
   {
      fprintf(stderr, "Cannot open output file.\n");
      return;
   }
   fprintf(stream, "This is a test");
   fflush(stream);
   fstat(fileno(stream), &statbuf);
   fclose(stream);
   if (statbuf.st_mode & S_IFCHR)
      printf("Handle refers to a device.\n");
   else
      printf("Handle refers to an ordinary file.\n");
   if (statbuf.st_mode & S_IREAD)
      printf("User has read permission on file.\n");
   if (statbuf.st_mode & S_IWRITE)
      printf("User has write permission on file.\n");
   printf("Drive letter of file: %c\n", 'A'+statbuf.st_dev);
   printf("Size of file in bytes: %ld\n", statbuf.st_size);
   printf("Time file last opened: %s\n", 
ctime(&statbuf.st_ctime));
}
