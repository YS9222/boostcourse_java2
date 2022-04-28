
public class loopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		//...
		while(i<3) {
			System.out.println(i);
			//...
			//i = i+1; //i는 3까지 정의됨
			// i ++;
			i += 1;
		} //for문과 다르게 while은 시작, 조건, 반복이 각기 다른 영역에 정의됨 
		
		System.out.println("---Array---");
		
		String[] users = new String[4];
		users[0] = "A"; // 0 - index /// A - element
		users[1] = "B";
		users[2] = "C";
		
		System.out.println(users[1]);
		System.out.println(users.length); //담겨있는 데이터의 수가 아니라 Array의 칸수를 나타냄(빈칸도 포함)
		
		int[] score = {10, 30, 50}; //생성할때 바로 데이터 입력
		
		System.out.println(score.length);
		
		//Loop + Array 
		//목표 각 데이터 앞뒤에 <li> </li> 넣기
		
		String[] users1 = new String[3];
		users1[0] = "A"; 
		users1[1] = "B";
		users1[2] = "C";
		
		for(i = 0; i<users1.length; i++) {
			System.out.println("<li>" + users1[i] + "</li>");
		}//배열 그대로 가져오기 
		for(i = 0; i<users1.length; i++) {
			users1[i] = "<li>" + users[i] + "</li>";
		}//배열내 데이터 수정
		System.out.println(users1[1]);
		
		
		
		
		
		
		
	}

}
