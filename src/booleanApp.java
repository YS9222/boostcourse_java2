
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
	}

}
