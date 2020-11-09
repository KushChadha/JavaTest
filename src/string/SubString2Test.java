package string;

public class SubString2Test {

	public static void main(String[] args) {
		
		String s = "https://www.google.com/maps/place/San+Francisco,+CA,+USA/@37.757815,-122.5076407,12z/data=!3m1!4b1!4m5!3m4!1s0x80859a6d00690021:0x4a501367f076adff!8m2!3d37.7749295!4d-122.4194155";
		
		String sub = s.substring(s.indexOf("@")+1);
		
		String[] s1 = s.substring(s.indexOf("@")+1).split(",");
		System.out.println("This is in string " + s1[0]);
		System.out.println("This is in string " + s1[1]);
		
		Double d1 = Double.valueOf(s1[0]);
		Double d2 = Double.valueOf(s1[1]);
		
		System.out.println("This is in double " + d1);
		System.out.println("This is in double " + d2);
		
	}

}
