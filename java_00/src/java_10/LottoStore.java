package java_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class LottoStore {

	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new LottoStore().startLotto();
	}

	public void startLotto() {

		while(true) {


			int choice = displayMenu();

			switch(choice) {
			case 1 :
				System.out.println("1. 로또 구매하기 ");
				//createLotto(10000);
				seleLotto();
				break;
			case 2 :

				System.out.println("감사합니다. 안녕히 가세요.");
				return;

			default : 
				System.out.println("1 또는 2를 입력해 주세요.");

			}

		}
	}
	public int displayMenu() {
		System.out.println("==== 로또 판매점====");		
		System.out.println("1. Lotto 구매하기");
		System.out.println("2. 프로그램 종료 ");
		System.out.println("=================");
		System.out.println("선택 :  ");
		int choice =sc.nextInt();

		return choice;
	}


	public void seleLotto() {
		System.out.println("1000원에 로또 번호 하나씩입니다.");
		System.out.println("로또는 최대 100매까지 구매 가능 합니다.");
		System.out.println("구매를 원하시는 금액을 입력햐 주세요.");
		System.out.println("금액 입력: ");
		int money = sc.nextInt();

		System.out.println();

		if(money < 1000) {
			System.out.println("금액 이 너무 적습니다. 1000원 이상으로 입력 해주세요.");
			return ;
		}

		if(money >= 100001) {
			System.out.println("구매 금액이 너무 큽니다. 10만원 초과는 구매 불가능 합니다.");

			return;
		}

		createLotto(money);

		System.out.println();	
		System.out.println("받은 금액은 " + money + "원이고, 거스름돈은 " + (money % 1000)+"입니다." );

	}

	public void createLotto(int money){

		int lotCnt = money /1000;

		HashSet<Integer> lottoSet = new HashSet<Integer>();



		for (int i=1; i <=lotCnt; i++ ) {
			while (lottoSet.size() < 6) {
				int lotNum = (int) (Math.random()*45 +1);
				lottoSet.add(lotNum);
			}

			ArrayList<Integer> lottoList = new ArrayList<Integer>(lottoSet);
			Collections.sort(lottoList);


			System.out.println("로또 번호 : " + i + "번 >>>");

			for(int lottoNum : lottoList) {
				System.out.print( lottoNum + " ");
			}
			
			System.out.println();
			lottoSet.clear();

		}

	}
}
