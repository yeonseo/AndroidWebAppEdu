/*
#include<stdio.h>
#include<windows.h>

#define vendingX 11 //자판기 가로크기 
#define vendingY 23 //자판기 세로크기 
#define MAIN_X_ADJ 3 //게임판 위치조정 
#define MAIN_Y_ADJ 1 //게임판 위치조정 

int main_org[vendingX][vendingY]; //자판기의 화면(t)을 저장하는 배열 
int main_cpy[vendingX][vendingY]; //자판기의 화면(t-1)을 저장하는 배열

void reset_main(void){ //자판기 초기화  
    int i,j;
    
    for(i=0;i<vendingX;i++){ // 게임판을 0으로 초기화  
        for(j=0;j<vendingY;j++){
            main_org[i][j]=0;
            main_cpy[i][j]=100;
        }
    }
    for(i=1;i<vendingX-1;i++){ //좌우 벽을 만듦  
        main_org[0][i]=WALL;
        main_org[vendingX-1][i]=WALL;
    }
    for(j=0;j<vendingY-1;j++){ //천장, 바닥벽을 만듦 
    	main_org[i][0]=WALL;
		main_org[i][vendingY-1]=WALL;
    }
}
//*/