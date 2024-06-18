package p0618;

import java.util.Scanner;

public class C0618_12 {

	public static void main(String[] args) {
	// 3,3 홍길동, 유관순, 이순신 국어, 영어, 수학성적을 입력받아 출력하시오. 
		Scanner scanner = new Scanner(System.in);

	    String[] names = new String[3];
	int[][] scores = new int[3][3];

	    for (int i = 0; i < 3; i++) {
	        System.out.print("이름을 입력하세요: ");
	        names[i] = scanner.next();
	        
	        System.out.print("국어 성적을 입력하세요: ");
	        scores[i][0] = scanner.nextInt();
	        
	        System.out.print("영어 성적을 입력하세요: ");
	        scores[i][1] = scanner.nextInt();
	        
	        System.out.print("수학 성적을 입력하세요: ");
	        scores[i][2] = scanner.nextInt();
	    }
	    
	    System.out.println("=================================");
	    System.out.println("이름\t국어\t영어\t수학");
	    System.out.println("=================================");
	    
	    for (int i = 0; i < 3; i++) {
	        System.out.println(names[i] + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2]);
	    }
	    
	    scanner.close();
	}
}