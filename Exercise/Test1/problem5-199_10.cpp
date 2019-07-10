/*
#include <stdio.h>
int main()
{
	int binaryOne=0,binaryTwo=0, x=0, y=0;
	printf("x좌표와 y좌표를 차례대로 입력하세요.\n");
	scanf("%d %d", &x ,&y);
	
	//어떻게든 줄여보고자 노력해본 결과 ㅠㅠ
	//(ex 1사분면은 (2)100-(2)11이라는 생각으로 시작)

	binaryTwo=(y>0 && x*y!=0)?(1):(0);
	binaryOne=((y/x)>0 && x*y!=0)?(1):(0);
	printf("입력한 (%d, %d)는 %d사분면에 위치합니다. \n",x,y,4-((binaryTwo<<1)+(binaryOne)));

	//책의 예시
	//(x>0 && y>0)?printf("1사분면"):printf("");
	//(x<0 && y>0)?printf("2사분면"):printf("");
	//(x>0 && y<0)?printf("3사분면"):printf("");
	//(x<0 && y<0)?printf("4사분면"):printf("");
		return 0;
}
*/