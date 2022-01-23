package Example;

public class MaxMin { //최대값, 최소값 구하고 각 수가 몇번째 자리수인가

	public static void main(String[] args) {
		
		
		int[] numbers = { 20, 10, 40, 35, 30, 1, 7 };
		// 배열에 담긴 숫자들을 하나씩 조사해보게끔 for문을 이용해야함
		// 아래 최대값,최소값을 담을 변수를 선언해주는 것이 중요함
		int max = numbers[0]; // int max = 0; 이렇게 하면 안됨
		int min = numbers[0]; // int min = 0; 이렇게 하면 안됨
		
		int num = 0;
	
		// 첫 숫자 하나씩 비교해나가는 도중에 그때마다의 최대,최소값을 변수에 저장하고
		// 그다음 숫자와 비교, 조건에 맞는 숫자를 그때그때 변수에 저장
		// 최종적으로 선택된 최대,최소값이 변수에 저장되게됨.
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i]; // 여기까진 최대값 구하기
				if(numbers[i] == 40) {
					num = i; // 최대값이 몇번째 자리수인가
					System.out.println("최대값은 " + num + "번째 자리");
				}
				
			}
			else if(numbers[i] < min) {
				min = numbers[i]; // 여기까진 최소값 구하기
				if(numbers[i] == 1) {
					num = i; // 최소값이 몇번째 자리수인가
					System.out.println("최소값은 " + num + "번째 자리");
				}
			}
			
		}
		System.out.println("최대값은 : " + max);
		System.out.println("최소값은 : " + min);
		

	}

}
