#include <assert.h>
#include <stdio.h>
#include <stdlib.h>
void main(void)
{
int i;
for (;;) {
    printf("input a number:");
    scanf("%d",&i);
    assert(i!=0);
    printf("10.0 / i = %f",10./i);
    }
}
