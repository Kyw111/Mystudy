package Example;

public class MaxMin2 { // 다시 한번 더 해보기

	public static void main(String[] args) {
		
		int[] arr = { 100, 25, 1, 911, 1120, 55, 75 };
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				if(arr[i] == 1120) {
					int num = i+1;
					System.out.println("최대값은: "+max+", \t"+num+"번째 수");
				}
			}
			else if(arr[i] < min) {
				min = arr[i];
				if(arr[i] == 1) {
					int num = i+1;
					System.out.println("최소값은: "+min+", \t"+num+"번째 수");
				}
			}
			
		}
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);
		
	}

}
