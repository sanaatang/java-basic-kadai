package text.section_12;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        boolean[] num = new boolean[101];
        
        //2.配列の初期化
        for(int i = 2; i < num.length; i++) {
        	num[i] = true;
        }
        
        //素数判定
        for (int i = 2; i * i < num.length; i++) {
        	if(num[i]) {
        		for(int j = i * i; j < num.length; j += i) {
        			num[j] = false;
        	}
        }
	}
        //4.素数の入力
        for (int i = 2; i < num.length; i++) {
            if (num[i]) {
                System.out.println(i);
            }
        }
	}
}
