 #include <stdio.h>
 #include <string.h>
 #include <alloc.h>

int main(void)
 {
    char *string1 = "9176004051";
    char *string2 = "4628";
    int length;

    length = strcspn(string1, string2);
    printf("Character where strings intersect is at 
position %d\n",
           length);

    return 0;
 }
