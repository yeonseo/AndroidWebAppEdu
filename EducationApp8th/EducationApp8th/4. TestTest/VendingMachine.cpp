/*
#include<stdio.h>
#include<windows.h>

#define vendingX 11 //���Ǳ� ����ũ�� 
#define vendingY 23 //���Ǳ� ����ũ�� 
#define MAIN_X_ADJ 3 //������ ��ġ���� 
#define MAIN_Y_ADJ 1 //������ ��ġ���� 

int main_org[vendingX][vendingY]; //���Ǳ��� ȭ��(t)�� �����ϴ� �迭 
int main_cpy[vendingX][vendingY]; //���Ǳ��� ȭ��(t-1)�� �����ϴ� �迭

void reset_main(void){ //���Ǳ� �ʱ�ȭ  
    int i,j;
    
    for(i=0;i<vendingX;i++){ // �������� 0���� �ʱ�ȭ  
        for(j=0;j<vendingY;j++){
            main_org[i][j]=0;
            main_cpy[i][j]=100;
        }
    }
    for(i=1;i<vendingX-1;i++){ //�¿� ���� ����  
        main_org[0][i]=WALL;
        main_org[vendingX-1][i]=WALL;
    }
    for(j=0;j<vendingY-1;j++){ //õ��, �ٴں��� ���� 
    	main_org[i][0]=WALL;
		main_org[i][vendingY-1]=WALL;
    }
}
//*/