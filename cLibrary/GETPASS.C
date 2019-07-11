#include <stdio.h>
#include <conio.h>
void main(void)
{
   char *password;
   password = getpass("Input a password:");
   printf("inputed password is: %s\n", password);
}
