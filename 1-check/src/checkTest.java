import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
public class checkTest {
	//問7用
	private static final Logger LOGGER = Logger.getLogger(checkTest.class.getName());
	
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問1 リソースを開く(ファイル名)ショートカットキーは何ですか？
		
//		Ctrl + Shift + R
		//改行
		System.out.println("問２");
		//問2 リファクタリングをする時のショートカットキーは何ですか？
		
//		Ctrl + Ait + R
		//改行
		System.out.println("問３");
		//問3 デバッグを行う方法を簡潔に記載してください
		
//		調べたいところにブレークポイントを置いて無視のアイコンを押す
		//改行
		System.out.println("問４");
		//問4 Javaのバージョン8と11の違いを簡潔に答えてください
		
//		_を変数名に使用できなくなった
//		interfaceにprivateメソッドを導入できるようになった
//		varにより型推論ができるようになった
		//改行
		System.out.println("問５");
		//問5　Road博物館の入場料金は、一人1000円であるが、10人以上のチームなら一人820円、20人以上の団体なら一人700円である。
		//人数を入力し、入場料の合計を計算するプログラムを作成せよ。(if文で上記文章を作ってください)
		
		int n = 30;
		if(n >=10 && n<19) {
			System.out.println(n*820);
		}
		else if (n >= 20) {
			System.out.println(n*700);
		}
		else{
			System.out.println(n*1000);
		}
		//改行
		System.out.println("問６");
		//問6　コメントアウトされている箇所にどう言った処理が行われているか記載してください
		Scanner scn = new Scanner(System.in);
		int[] score = new int[5];
		int i, sum;
		double ave;
		
		//数字をスキャン。nextIntは改行をスキャンしない
		for (i = 0; i < score.length; i++) {
			System.out.print("得点を入力してください = ");
			score[i] = scn.nextInt();
			}
		
			//上でスキャンされたものをsumに格納する、sumの値が1つずつ変わる
			sum = 0;
			for (i = 0; i < score.length; i++) {
			sum += score[i];
			}
		
			//sumをスコアで割ることで平均点を出している
			ave = sum / (double)score.length;
			//出力
			System.out.println("平均値 = " + ave);
		
		//改行
		System.out.println("問７");
		//問7　ログ出力が行えるように下記コードを修正してください
		String message = "Hello World!";
		try {
		    // 出力ファイルを指定する
		    FileHandler fh = new FileHandler("SampleLog.log");
		    // 出力フォーマットを指定する
		    fh.setFormatter(new java.util.logging.SimpleFormatter());
		    LOGGER.addHandler(fh);
		} catch (IOException e) {
		    e.printStackTrace();
		}
		LOGGER.info("The message is: " + message);
		
		//改行
		System.out.println("問８");
		//問8　問題：
		//入力された文字列を整数に変換し、その結果を出力するプログラムを作成してください。ただし、以下の場合には例外を発生させてください。(Scannerメソッドを使用すること)
		//1.入力された文字列がnullの場合（NullPointerExceptionが発生する）
		//2.入力された文字列が空文字列の場合（Exceptionが発生する）
		//3.入力された文字列が整数に変換できない場合（NumberFormatExceptionが発生する）
		String str = "25t";
        try{
            int number = Integer.parseInt(str);
            System.out.println(number);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
		
     	//改行
		System.out.println("問９");
		//問9 Java編終わった感想と改善点もしございましたらお願いします。
		//『乗り気にはならないけどやってみると楽しいよね、みんなそうだと思う』
	}
}
