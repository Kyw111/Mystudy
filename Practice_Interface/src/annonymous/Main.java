package annonymous;

public class Main implements AnnonymousInter{

	public static void main(String[] args) {
		
		// 인터페이스의 구현클래스를 생성
		Main main = new Main();
		main.method1(); 
		System.out.println("===============");
		// 인터페이스의 구현클래스를 실행

		
		// 인터페이스 익명구현객체 생성 
		AnnonymousInter annony = new AnnonymousInter() {
		//원래 인터페이스를 객체화 할 수 없지만
		// 이렇게 객체화를 해주고 ; 대신 { };를 열어서
		// { } 내부에 메소드를 오버라이딩 해준 후
		//  => 객체.메소드(); 이렇게 실행
			@Override
			public void method1() {
				System.out.println(" > 익명구현객체 테스트");
			}
			
		};
		annony.method1();
		// 인터페이스 익명구현객체 실행

	}
	@Override
	public void method1() {
		System.out.println(" 그냥 구현클래스 테스트");
	}

}
