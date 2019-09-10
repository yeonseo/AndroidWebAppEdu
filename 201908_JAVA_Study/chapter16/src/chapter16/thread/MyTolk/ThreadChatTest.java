package chapter16.thread.MyTolk;

import java.util.Scanner;

public class ThreadChatTest {
	public static void main (String[] args) {

	/************************* 변수 선언 ************************/
			int GameArr[] = new int[10];
			int UserArr[] = new int[3];
			int Strike = 0;
			int Ball = 0;
			int Limit = 0;
			boolean Homerun = true;
			boolean _switch[] = new boolean[GameArr.length];

			Scanner UserScan = new Scanner (System.in); //Scanner 객체 생성




			
			//화면에 게임시작을 알림
			System.out.println("Hello! making Game Number.");
			System.out.println("waiting...");
			System.out.println("waiting...");
			System.out.println("waiting...");
			System.out.println(" ");



	/********************************************************************************
	 불리언 switch를 모두 true로 전부 초기화, 게임 랜덤수 생성 0~9의 랜덤수의 index를 갖는 
	_switch 배열의 원소가 true이면 if문을 실행한다. 랜덤수가 4이면 _switch[4]는 false가 되고, 
	다음에 다시 4가 나와도 아무일도 일어나지 않고 whlie문을 돈다.
	모든 switch 배열이 false로 바뀌면 shuffle이 완료
	*********************************************************************************/
			for (int i=0; i<_switch.length; i++){
				_switch[i] = true;
				} //for
			int w=0;
			int r;
			while (w<GameArr.length) {
				r = (int)(Math.random()*GameArr.length);
				if(_switch[r]) {
					_switch[r] = false;
					GameArr[w] = r;
					w++;
				} //if
			} //while (w





	/******************* do-while 홈런 시, 게임종료 *********************/
			do {
				Strike = Ball = 0; // Strike 값과 Ball 값이 쌓이지 않게 초기화를 함

				int g = 0;
				while (g<=2) {
					System.out.print("\n"+"숫자를 입력하세요. : ");
					int num = UserScan.nextInt(); //입력을 Line으로 받음
					UserArr[g] = num;
					g++;
				} //while UserArr
				System.out.print("입력한 3자리 수 : ");
				for(int i = 0; i < UserArr.length; i++) {
				System.out.print(UserArr[i]);
				}


				//게임숫자와 사용자의 숫자를 비교함
				for(int i = 0; i <= 2; i++) {
					for(int j =0; j <= 2; j++) {
						if (i == j) {
							if (GameArr[i] == UserArr[j]) {
							Strike++;
							} //if Strike
						} //if i = j
						else {
							if (GameArr[i] == UserArr[j]) {
							Ball++;
							} //else Ball
						} //else
					} //for j++
				} // for i++
				System.out.print("\n"+"스트라이크 : "+Strike+" 볼 : "+Ball);
				System.out.printf("\n"+"게임의 3자리 수 : %d %d %d",GameArr[0],GameArr[1],GameArr[2]); //섞인 배열 GameArr[0]~[2]를 출력

				Limit++;
				// Homerun 이거나, 회수제한에 걸릴 시, false로 바꿈
				if (Strike == 3 | Limit == 10) {
					Homerun = false;
					if (Strike == 3) {
						System.out.printf("\n"+"축하합니다! 홈런입니다!");
					} // X-) 홈러언
					else {
						System.out.printf("\n"+"아잇..!! 다음엔 홈런을!!!");
					} // ㅠ_ㅠ
				} //if out
				//System.out.printf("out");
			} while(Homerun); //do-while 비교
		} //main
}