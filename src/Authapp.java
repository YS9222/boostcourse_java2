
public class Authapp {

	public static void main(String[] args) {
		//boolean + roop + if + array
		//목표 입력값이 배열내 값과 같다면 중단하고 이를 참, 거짓으로 판단하여 참이라면 Hello 출력
		
		
//		String[] users = {"egoing", "jinhyuk", "yubin"};
		String[] [] users = {
				{"egoing", "1111"},
				{"jinhyuk", "2222"},
				{"yubin", "3333"}
				
		};//각 index의 element가 배열이고 각 배열의 값이 string
		
		String inputId = args[0];
		String inputPw = args[1];
		
		//boolean isLogined = false;  //boolean 변수 지정하면서 미리 값 지정
		String isLogined = "1";
		
		for(int i=0; i<users.length; i++) {
			String current[] = users[i]; //element가 배열형태인 users[i]를 담기 위해 변수형태를 array로 
										//!!mine!! 처음에는 따로 변수지정해서 담는게 아니라 바로 비교하려함 
			
			if(		current[0].equals(inputId) 
					&&
					current[1].equals(inputPw)
					) 
			{  //!!error!! 처음에 inputId==users[i]로 하려함(String간 비교에는 사용불가)
				//isLogined = true;
				isLogined = "right";	
				break;
			} else if (!current[0].equals(inputId) 
					&&
					current[1].equals(inputPw)) {
				isLogined = "WrongId";
			}else if (current[0].equals(inputId) 
					&&
					!current[1].equals(inputPw)
					) {
				isLogined = "WrongPw";
			}
			
		}
		//boolean으로 true false 식으로 단순하게 비교하려 할때 
//		if(isLogined) { //!!!Error!!! isLogined = true 를 해서 변수값으로 true를 지정해버림 (같냐는 조건식으로 쓰려했는데)
//						//위에서 boolean 변수의 속성은 정해졌기 때문에 그대로 넣거나 isLogined == true 해도 됨 
//			System.out.println("Hello!");
//		}else {
//			System.out.println("Access denied");
//		}
		
		if(isLogined.equals("right")) { //!!!Error!!! isLogined = true 를 해서 변수값으로 true를 지정해버림 (같냐는 조건식으로 쓰려했는데)
			//위에서 boolean 변수의 속성은 정해졌기 때문에 그대로 넣거나 isLogined == true 해도 됨 
			System.out.println("Hello!");
		}else if(isLogined.equals("WrongId")) {
			System.out.println("Wrong Id Access denied");
		}else if(isLogined.equals("WrongPw")){
			System.out.println("Wrong Pw Access denied");
		}

	}

}
