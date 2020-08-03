package ArrayAndList;

public class Test {
	public static void main(String[] args) {
		
		String [] s = {"a","d","c","e","b"};
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("----------------");	
		/**
		 * forin语句，目的是为了简化迭代器遍历，本质依旧是迭代器遍历。
		 */
		for(String s1:s) {
			System.out.println(s1);
		}
		
		System.out.println("----------------");
		
		int j=0;
		while(j<s.length) {
			System.out.println(s[j]);
			j++;
		}
	}
}

