package chapter3;

import java.util.Random;
import java.util.UUID;

public class Package3 {

	public static void main(String[] args) {

		// Random 클래스 : 난수를 생성하는 클래스
		Random random = new Random();
		System.out.println(random.nextInt());
		// 범위 제약
		System.out.println(random.nextInt(3)); // 0 ~ 2 난수
		System.out.println(random.nextInt(3) + 1); // 1 ~ 3 난수
		
		// SEED 지정
		random = new Random(1);
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(45));
		
		// UUID 클래스 : 고유한 식별자를 만들기 위해 사용하는 랜덤한 문자열
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		 
		
		
		
		
		
	}

}
