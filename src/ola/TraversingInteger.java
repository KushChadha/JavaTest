package ola;

public class TraversingInteger {

	public static void main(String[] args) {
		
		int num = 54484;
		int temp=0, reminder;
		
		while(num>0) {
			reminder = num %10;
			if(reminder == 5) {
				reminder=0;
			}
				
			num=num/10;
			
			temp=temp*10 + reminder;
		}
		
		num = 0;
		
		while(temp>0) {
			reminder = temp % 10;
			temp = temp/10;
			num = num*10 + reminder;
		}
		
		System.out.println(num);
		
	}

}
