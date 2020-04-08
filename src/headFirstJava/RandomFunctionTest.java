package headFirstJava;

//Math.random() will always return value between 0 and 1 i.e. 0.234325
public class RandomFunctionTest {

	public static void main(String[] args) {
		String[] wordListOne = {"process", "tippingpoint",
				"solution", "architecture", "core competency" ,
				"strategy", "mindshare", "portal" , "apace" , "vision",
				"~adigm", "~ssion"};
		int one = wordListOne.length;
		int random = (int) Math.random() * one;
		System.out.println(random + " " + one);
		System.out.println(Math.random());
	}

}
