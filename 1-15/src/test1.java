import java.util.Arrays;

public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		int result = add(1, 2);
        System.out.println(result);
        
		//改行
		System.out.println("問２");
		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		System.out.println(isPalindrome("しんぶんし"));
		
		//改行
		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer [] i = {5,3,1,9,4,8};
		sort(i);
		System.out.println(Arrays.toString(i));
		
		//改行
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int [] k = {5,3,1,9,4,8};
		
		System.out.println(array(k));
	}
	//問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
	public static int add(int num1, int num2) {
        return num1 + num2;
	}
	
	//問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
	public static boolean isPalindrome(String sentence) {
        StringBuilder sb = new StringBuilder(sentence);
        if(sentence.equals(sb.reverse().toString())) {
        	return true;
        }else {
            return false;
		}
	}
	
	//問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
	public static void sort(Integer [] i) {
        Arrays.sort(i, (a, b) -> a - b);
	}
	
	//問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	public static int array(int[] i) {
		 int minIndex = 0;
	        for (int sa = 0; sa < i.length; sa++) {
	            minIndex = i[sa] < i[minIndex] ? sa : minIndex;
	        }
		return  minIndex;
    }
}


