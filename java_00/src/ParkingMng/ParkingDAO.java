package ParkingMng;



public class ParkingDAO {

	static final int ROW = 4;
	static final int COL = 5;

	//데이터 저장소
	String[][] parkingSpace;	
	String[][] parkingNum;

	public ParkingDAO() {
		parkingSpace = new String[ROW][COL];
		parkingNum = new String[ROW][COL];

		int parkingcnt = 0;

		for(int i=0; i<parkingNum.length; i++) {
			for(int j=0; j<parkingNum[i].length; j++) {
				//이중 배열 [i] 값 뻬막지 말 것
				parkingcnt++;
				parkingNum[i][j] =parkingcnt+ "";
				//공백 없이 "" 추가 시 String변환

			}
		}
	}


	public void insertParking(String location, String carNum) {

		for(int i=0; i<parkingNum.length; i++) {
			for(int j=0; j<parkingNum[i].length; j++) {
				if(location.equals(parkingNum[i][j])) {
					parkingSpace[i][j] = carNum;
				}
			}
		}
	}


	public boolean deleteParking(String location){

		boolean flag = true;

		for(int i =0; i<parkingNum.length; i++) {
			for(int j=0; j<parkingNum[i].length; j++) {
				if(location.equals(parkingNum[i][j])&& parkingSpace[i][j] !=null){
					parkingSpace[i][j] = null;
					return true;
				}else {
					flag = false;
				}
			}
		}

		return flag;
		//다른 방법
		//int count =0;
		//for(int i=0; i<parkingNum.length; i++) {
		//			for(int j=0; j<parkingNum[i].length; j++) {
		//				if(location.equals(parkingNum[i][j])){
		//					if(parkingSpace[i][j] == null) {
		//						count = 0;
		//					}else {
		//						count = 1;
		//					}
		//					parkingSpace[i][j] = null;
		//					
		//				}
		//			}
		//}
		//
		//if(count > 0) {
		//			return true;
		//}else {
		//			return false;
		//}
	}


	public String[][] selectParking() {
		return parkingSpace;
	}



	public String selectParkingSpace(String location) {
		String result ="";

		for(int i=0; i<parkingNum.length; i++) {
			for(int j=0; j<parkingNum[i].length; j++) {
				if(location.equals(parkingNum[i][j])) {
					result = parkingSpace[i][j];
				}
			}
		}

		return result;

	}


}

