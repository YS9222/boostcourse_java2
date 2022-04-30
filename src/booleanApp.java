
public class booleanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String true = "Hello"
		//String false = "Hello"
		//true false 는 boolean 타입의 키워드이기 때문에 변수의 이름으로 지정불가 
		//이와같이 특정 기능을 수행하여 변수지정이 불가능한 키워드들은 reserved word라고 부름 
		
		String foo = "Hello world";
		
		System.out.println(foo.contains("worl")); 
		System.out.println(foo.contains("ooo")); 
		//1. 변수뒤 . 을 붙여 해당 타입의 메서드를 사용가능(foo.contains)
		//2. 해당 매서드는 true, false를 returns 함 
		
		//!!!비교연산자는 	true, false를 반환함!!! 
		System.out.println(1>1); //false
		System.out.println(1<1); //false
		System.out.println("12" == "12"); //true
		System.out.println(1<=1); //true
		
		String id = "egoing";
		String inputId = args[0];
		
		String pw = "1111";
		String pw2 = "2222";
		String inputPw = args[1]; 
		
		//if(inputId == id) {	//잘못된 결과 도출됨 왜냐하면 non primitive 데이터 타입은 .equals로 비교해야 하기때문 (String Array Date ..)
								// == 은 양 옆이 같은자리의 데이터를 가리키고 있는지 확인한다면 .equals는 자리 상관없이 내용 자체가 같은지 확인
								// 보통 primitive 타입(int double float char...)(더이상 쪼갤수 없는)은 == 로 비교하며
								// non primitive 타입의 데이터는 일부상황하의 string을 제외하고 .equals통해 비교함 
//		if(inputId.equals(id)) {//boolean 형식을 반환
//			if(inputPw.equals(pw)) {
//			System.out.println("Hi Master");
//			} else {
//				System.out.println("Wrong password");
//			}
//		}else {
//			System.out.println("who are you?");
//		}
		//위와 아래 조건문은 거의 비슷한 구조를 보임 (차이점은 있음)
		
		boolean isRightPw  = (inputPw.equals(pw)|| inputPw.equals(pw)); //길어지면 이렇게 변수지정해서 사용가능 
		if(inputId.equals(id) && isRightPw) { // && 과  ||
			System.out.println("Hi master");
		} else {
			System.out.println("who are you?");
		}
		
		
		//boolean 관련 연산자
		//not (!~)
		System.out.println(!true); //false
		System.out.println(!false);//true
	}

}
