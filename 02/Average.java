public class Average {

	public static void main(String[] args) {
		int numbers[] = {2,20,30,40,80};
		float sum = 0;
		
		for(int num:numbers)
			sum += num;

		float average = (sum / numbers.length); 
		
		System.out.println("Average of given Numbers is : "+average);
	}
}