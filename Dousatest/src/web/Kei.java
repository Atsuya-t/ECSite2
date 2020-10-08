package web;

public class Kei {

	//計算結果を格納するための変数
	int re = 0;

	//足し算メソッド
	public int tasum(int a, int b) {
		re = a + b;
		return re;
	}

	//引き算メソッド
	public int hikum(int a, int b) {
		re = a - b;
		return re;
	}

	//掛け算メソッド
	public int kakerum(int a, int b) {
		re = a * b;
		return re;
	}

	//割り算メソッド
	public int warum(int a, int b) {
		re = a / b;
		return re;
	}
}
