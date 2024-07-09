package Parking;

import java.util.Scanner;

public class ParkingMng {

	public static Scanner sc = new Scanner(System.in);

	static final int ROW = 4;
	static final int COL = 3;
	static final String RESULT = "성공!!";
	static final double PIE = 3.14;

	public static void main(String[] args) {


		/*
		 * [주차 관리 프로그램]
		 * 
		 * 주차장 구조
		 * 
		 * □ □ □
		 * □ □ □
		 * □ □ □
		 * □ □ □
		 * 
		 * 
		 */


		/*

		parking contoller
		parkigservice
		parkingDAO

		 */

		String[][] parkingSpace = new String[ROW][COL];

		while (true) {

			System.out.println(" [ 주차장 현황 ] ");
			System.out.println("   1   2   3 ");


			for (int i =0; i<parkingSpace.length; i++) {
				System.out.print(i +1 +" ");
				for(int j=0; j<parkingSpace[i].length; j++) {

					if(parkingSpace[i][j] == null) {
						System.out.print("  □ " + parkingSpace[i][j]);
					} else {
						System.out.print("  ■ " + parkingSpace[i][j]);
					}

				}

				System.out.println();
			}


			System.out.println();
			System.out.println("원하는 메뉴를 선택 해 주세요.");
			System.out.println("1) 주차 2) 출차 3) 종료");
			String menu = sc.next();


			switch(menu) {


			case "1" :
				System.out.println("주차하고 싶은 위치를 선택해주세요.");
				System.out.print("(예시) 새로 가로 - 2 1");

				int locationRow = sc.nextInt();			
				int locationCol = sc.nextInt();		

				if(locationRow > ROW || locationCol > COL ||locationRow == 0 ||locationCol == 0) {
					System.out.println("주차 위치를 잘못 입력하셨습니다.");
					System.out.println("처음부터 다시 시작하세요.");

					break;
				}


				if(parkingSpace[locationRow-1][locationCol-1] != null) {
					System.out.println("이미 다른 차량이 주차되어 있습니다.");
					System.out.println("처음부터 다시 시작하세요.");

					break;
				}


				System.out.println("주차 차량의 번호를 입력 해 주세요. ( 예 : 20가 1234 ) : ");
				String carNum = sc.next();

				System.out.print("차량 번호가 " + carNum + "맞습니까? ( y / n )");
				String confirm = sc.next();

				//-1의 이유는 0부터 시작이기 때문과 계산 초과
				if("y".equals(confirm)) {
					parkingSpace[locationRow-1][locationCol-1] =carNum;
					System.out.println("주차가 완료 되었습니다.");


				}else {
					System.out.println("처음부터 다시 시작하세요.");
					break;
				}

				break;


			case "2":
				System.out.print("차량번호를 입력해 주세요. : ");
				String number = sc.next();

				int count = 0;

				for(int i=0; i<parkingSpace.length; i++) {
					for(int j=0; j<parkingSpace[i].length; j++) {

						//		System.out.println("count >> " + count);

						if(number.equals(parkingSpace[i][j])) {
							parkingSpace[i][j] = null;
							System.out.println("출차 완료!");
							System.out.println("안녕히 가세요.");

							break;
						}else {
							count++;
						}
						//		System.out.println("count >> " + count);
					}
					//12 까지 이미 완료 되어 필요 없음 count++;
				}

				//ROW * COL 차량 객수

				if(count == ROW * COL) {
					System.out.println("찾는 차량이 존재하지 않습니다.");
					System.out.println("차량 번호 확인 후 다시 시도해 주세요.");
				}

				break;
			case "3":
				System.out.println("시스템 종료 !");
				System.exit(0);
				//exit 콘솔 작업 용으로 서버 셧다운 주의

				break;

			default:
				System.out.println("1~3 사이의 수를 입력해 주세요.");
				break;

			}
		}
	}

}

