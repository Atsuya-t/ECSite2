package web;

import java.util.Scanner;

public class Dentaku {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


	     String pass="123";
	     int chance =5;


	     while(chance > 0) {
	    	 System.out.print("パスワードを入力して下さい:");
	    	 String i = sc.nextLine();

	    	 if(i.equals(pass)) {
	    		 System.out.println("パスワード認証しました。");
	    		 break;
	    	 }else {
	    		 chance--;
	    		 System.out.println("パスワードが間違っています。");
	    		 System.out.println("チャンスは残り"+ chance +"回です！");
	    	 }
	     }

	     if(chance==0) {
	    	 System.out.println("もう二度とチャンスは訪れません。");
	     }else {
	    	 System.out.println("計算しますよ！");
	     }


	}

}
