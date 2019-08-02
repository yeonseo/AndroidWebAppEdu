/*
// 샐러드 자판기



int main()
{
	for( 재고 ;모든 재고가 0g일때까지 ; 재고-- )
	유통기한 체크를 한 후 유통기한이 지난 제품은 자동으로 폐기;
	payMethod = 0 상태에서는 모든 버튼이 작동하지 않음 (Sleep(5000); printf:돈을 투입해 주세요)

	
	
	
	payMethod() //결제방식을 선택 현금인지 카드orNFC 지불인지 구분
	{
		for(재고가 소진될 때 까지)
		{
			switch()
			{
			case 1 (현금):	chash() 호출 
				{
					if payMethod = 1 투입한 금액이 되는 제품들만 활성화되고, 선택할 수 있음
									 색깔로 구분,활성화는 하얀색, 금액이 모자르면 파랑색
					재고g>0g 인 제품들을 출력, 품절인 상품은 색깔 빨강
					do
					{
						int 메뉴 선택() 함수 호출
						(if 투입가격 > 제품가격)
							- 투입금액 - 제품가격 비교
						else 금액이 부족합니다. 금액을 투입하시겠습니까? (Y/N)
							Y :  총 금액 = 총 금액 + 투입한 금액
							N : 메뉴 선택 continue;
					}while(구매자가 종료할 때 까지)
				}

			case 2 (카드):	모든 선택할 수 있음 (선택 후 결제)
				do
				{
					int 메뉴 선택() 함수 호출

					메뉴 선택 완료 후, 결제하겠다고 하면 그때 결제 시작. 결제가 완료되어 상품반환
					재고g>0g 인 제품들을 출력

					do
					{
						- 제품가격 누적
					}while(구매자가 종료할 때 까지)


					if 결제가능금액 > 제품가격
						- 제품 반환
					else 잔고 금액이 부족합니다. 다른방법으로 결제하시겠습니까? (Y/N)
						Y : payMethod() 호출
						N : 다시담기
				}while(구매자가 종료할 때 까지)


				판매가 되고 나면 
				재고=재고-구매한 상품 수;
				재고 확인;
				다시 주문받을 준비
			case 123456789 (관리자모드): 모든 재료 수정가능
									printf()
			}

		}
	}
	if(모든 재고 = 0)
	{
		printf: 모든 상품이 품절입니다.
		void alram()
		{
			printf("System : 판매자에게 재료 소진 알람을 전송중입니다.")
			
			do
			{
				//send(clnSock,message,int strlem(message),0);
				int strlem(message)
				{
				//1시간 간격으로 알람
				printf("재고 0이야아~ 다팔렸다구우우우우우");
				Sleep(5000);
				
				}
			}while(확인)
		}
	}
}

int payValue()
{
	예정 결제금액 :	payValue = payValue + menuSellect();
	return payValue;
}

menuRemains()
{
	static menu들!!
재고 :		총 무게/제품 1개의 무게
			선택할 수 있는 상품은 재고가 있을 시에만
			무게가 0인 상품은 품절표시

}
int 메뉴 선택()
{
	화살표로 선택 메뉴 페이지를 바꿔 출력함	(자판기의 키 입력값을 위에서 define 한 후 사용)
	화살표 할 때마다 값 증가&감소, 최대페이지보다 값이 넘어가거나 최소페이지보다 값이 작아지면
	0 or 최대값으로 초기화 해서 메뉴선택페이지를 출력함 
	switch (page)
	{
	case 0: main
	case 1: 채소
	case 2: 토핑
	case 3: 소스
	case 4: 사이드	
	}
}
int vegitSellect()
{
채소 선택 : 	입력한 상품의 번호의 가격을 return
		switch()
		{
		case 1 기본: 1500; (필수 선택)
		case 2 방울토마토: 500;
		case 3 양파: 500;
			.
			.
		}

}
int topingSellect()
{
토핑 선택 : 	입력한 상품의 번호의 가격을 return
		switch()
		{
		case 1 계란: 1000;
		case 2 참치: 1000;
			.
			.
			.
		}

}
int sourceSellect()
{
소스 선택 : 	입력한 상품의 번호의 가격을 return
		switch()
		{
		case 1 발사믹: 500;
		case 2 올리브: 500;
			.
			.
			.
		}

}
int sideSellect()
{
사이드 선택 : 입력한 상품의 번호의 가격을 return
		switch()
		{
		case 1 스프: 700;
		case 2 탄산수: 1000;
			.
			.
			.
		}

}
int dishSellect()
{
그릇&수저 선택 : 	입력한 상품의 번호의 가격을 return

ex)규격 사이즈 = 최소 입구 사이즈 * (채소 추가마다 +300ml, 토핑 추가마다 100ml)
		switch()
		{
		case 1 자판기 전용 재사용 그릇: dish++; 4000; //락앤락 비스프리~
		case 2 일회용 그릇: 1000;
		case 3 수저: 700;
		case 4 일회용 물티슈: 100;
		case 5 쇼핑백(종이) : 100;
			.
			.
			.
		}

if(dish==0) 그릇을 선택하지 않으면 경고안내문&선택한 상품이 담길 규격사이즈를 제시

}


outputGoods()
{
	여기는 모두 if로 주문수량이 있는지 확인한 수 수량만큼 출력됨
	봉투
	그릇 (유무 확인, 자신의 도시락에 담기로 했다면 그릇 사이즈 확인 및 평가 (아니면 그릇 추가주문 가능) //length=length -moveLength 로 구할 수 있지마안...!! )
	채소	 (printf :	채소가 골고루 되도록 살짝 흔들어 주세요. (구매자가 흔든 후 놓기)
					그릇 높이를 확인한 후, 토핑이 담길 수 있으면 next를 선택해주세요
					Next : 다음 상품 출력
					No   : 그릇 추가주문 가능 or 출력 이전의 상품 결제 재진행
	토핑	 (printf :	채소가 골고루 되도록 살짝 흔들어 주세요. (구매자가 흔든 후 놓기)
					그릇 높이를 확인한 후, 토핑이 담길 수 있으면 next를 선택해주세요
					Next : 다음 상품 출력
					No   : 그릇 추가주문 가능 or 출력 이전의 상품 결제 재진행
	소스 (포장용기 / 지금 뿌리기 선택)
	수저	
	사이드 메뉴
	순으로 출력
}
*/

//*
#include <stdio.h>

int store[5]={0,30,30,30,30};  //상품명 선택 번호와 배열 번호를 맞춰주기 위해서 [0]칸의 값을 NULL인것으로 하나 만든다.
char *productName[5]={" ","콜라","사이다","주스","쌍화탕"};
int productPrice[5]={0,1000,1500,2000,1500};
int totalMoney=0; //전역변수로 총 금액 사용

int print_menu(void);
void input_money(void);


int main()
{
	int number=0; //메뉴선택 (1-4번)
	char select=' '; //주문추가 여부 확인
	//상품화면 출력

	//음료자판기 진행 프로그램 무한루프
	for( ; ; )
	{
		//1. 금액입력
		input_money();
		printf("현재 금액 : %d\n",totalMoney); //제대로 돌아가는지 중간점검
		//2. 상품선택
		number=print_menu();
		if(number==5)//종료를 선택할 시 종료
		{
			if(totalMoney>0)
			{
				printf("%d 돈을 반환하고 종료합니다.\n",totalMoney);
				totalMoney=0;
			}
			break;
		}


		//선택한 메뉴를 출력한다. (갯수를 차감한다.)
		for(;;)
		{
			if(totalMoney<productPrice[number])
			{
				printf("현재 투입금액 : %d , 상품금액 : %d\n",totalMoney, productPrice[number]);
				printf("모어모어 깁미머니.. 부족한 금액 : %d \n",totalMoney, productName[number]);
				input_money();
			}
			else
			{
				printf("\n%s를 드리옵니다. \n맛있게 드세요 :-)\n",productName[number]);
				store[number]--;
				totalMoney=totalMoney-productPrice[number];

				printf("더 주문하시겠습니까?");
				while(getchar()!='\n');
				scanf("%c",&select);
				if(select=='y'||select=='Y')
				{
					number=print_menu();
					continue;
				}
				else 
				{
					printf("%d 돈을 반환하고 종료합니다.\n",totalMoney);
					totalMoney=0;
					break;
				}
			}
			break;
		}//end of for2
		printf("감사합니다. 고객님... 사랑해요....\n\n\n");
	}//end of for1
	return 0;
}

//금액 입력하는 함수
void input_money(void)
{
	int money=0;
	char addMoneyAnswer=' ';

	for( ; ; )
	{
		printf("★음료자판기★\n현재 투입금액 : %5d  금액을 입력 100,500,1000,5000,10000 : ",totalMoney);
		scanf("%d",&money);
		switch(money)
		{
		case 100: case 500: case 1000: case 5000: case 10000:
			totalMoney=totalMoney+money; break;
		default: printf("정신차리세요:-0\n 총액에 반환안함!\n");
		}

		printf("금액을 다시 입력하시겠습니까?(Y/N)");
		while(getchar()!='\n');
		scanf("%c",&addMoneyAnswer);
		//printf("%c",addMoneyAnswer);  //값 출력 확인하기
		while(getchar()!='\n');
		if(addMoneyAnswer=='y'||addMoneyAnswer=='Y') continue;
		else break;
	}//end of for
}
//제품선택 함수
int print_menu(void)
{
	int sellectNumber=0;
	
	for(;;)
	{
		printf("1. 콜라 : %d, 2,.사이다 : %d, 3.주스 : %d, 4.쌍화탕 : %d \n",store[1],store[2],store[3],store[4]);
		printf("제품번호 1번부터 4번까지 선택하세요.(취소 : 5)");
		scanf("%d", &sellectNumber);
		//printf("%d",sellectNumber); //제대로 돌아가는지 중간점검
	
		//재고품절확인
		if((sellectNumber>=1 && sellectNumber<=4))
		{
			
			if (store[sellectNumber]<=0)
			{
				printf("%s는 %d개로 품절입니다. 다시 입력하세요.",productName[sellectNumber],store[sellectNumber]);
				continue;
			}
			break;
		}
		if(sellectNumber==5) break; //종료를 선택할 시 종료
	}
	return sellectNumber;
}


//*/