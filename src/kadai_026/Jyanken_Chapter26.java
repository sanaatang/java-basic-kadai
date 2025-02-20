package kadai_026;

import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	//自分の手を入力するメソッド
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String choice = scanner.nextLine();
		
		while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
			System.out.println("正しく入力してください");
			choice = scanner.nextLine();			
		}
		
		return choice;
	}
	//相手の手を決める
	public String getRandom() {
		String[] choices = {"r", "s", "p"};
		int index = (int) Math.floor(Math.random() * 3);
		return choices[index];
		
	}
	//勝敗を決める
	public void playGame() {
		String myChoice = getMyChoice();
		String opponentChoice = getRandom();
		System.out.println("自分の手は" + myChoice + "、対戦相手の手は" + opponentChoice);
		
	//判定
		if(myChoice.equals(opponentChoice)) {
			System.out.println("引き分けです");
		}else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
				  (myChoice.equals("s") && opponentChoice.equals("p")) ||
				  (myChoice.equals("p") && opponentChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
			
		}
	}

}
