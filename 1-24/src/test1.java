public class test1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:下記を条件としたトライキャッチ文を作成しなさい
		//条件：NullPointerExceptionを発生させ「ヌルポが発生しました」と出力する。
		//try文の処理はthrow new を使い強制的に例外を発生させる事。
		//改行
		
		String str = null;
        try {
            if(str != null) {
                System.out.println(str.length());
            } else {
            	System.out.println("ヌルポが発生しました");
                throw new NullPointerException();
            } 
        } catch(NullPointerException e) {
        }

		System.out.println("問２");
		//問題2:下記を条件としたトライキャッチ文を作成しなさい
		//条件：NumberFormatExceptionを発生させ「数字フォーマットエラーが発生しました」と出力する。
		//またcatch処理後に必ず「例外処理は終了です」と出力されるプログラム構成にする事
		//try文の処理はthrow new を使い強制的に例外を発生させる事。
		//改行
		
		try
        {
            // nullの場合にも投げられます。
            int i = Integer.parseInt( null );
            throw new NumberFormatException();
        }
        catch( NumberFormatException e )
        {
        	System.out.println("数字フォーマットエラーが発生しました");
        	
        }
		System.out.println("例外処理は終了です");
		System.out.println("問３");
		//問題3:下記を条件としたトライキャッチ文を作成しなさい
		//条件：NumberFormatExceptionを発生させNumberFormatException意外のExceptionでキャッチし「何らかの例外が発生しました」と出力する。
		//try文の処理はthrow new を使い強制的に例外を発生させる事。
		//改行
		try
        {
            throw new NullPointerException();
        }
        catch( Exception e )
        {
        	System.out.println("何らかの例外が発生しました");
        	
        }

		//問題4:例外処理を行うメリットを下記にコメント解答欄に記述しなさい
		//回答欄「例外処理を使うことで例外に対する処理を一元管理できるようになります。 また、例外を処理した場合には、プログラムを中断せずに処理を先に進めたり、どこでどのような異常が発生したのか情報を通知してからプログラムを中断することも可能になります　」
	}
}
