
public class RegexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{[fsdfasdgasdasdg=fasdfgasdg,er=23}}";
		//System.out.println(s.replaceAll("[\\{\\}]", ""));
		System.out.println(s.replaceAll("[\\[{}\\]]", ""));
	}

}
