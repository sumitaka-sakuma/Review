package demo;

import java.util.ArrayList;

import Entity.Member;
import service.MemberService;
import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {

		MemberService service = MemberServiceImpl.getInstance();
		
		// 挨拶の取得
		System.out.println(service.greet(2));
		
		// ID、名前、メールアドレスの取得
		ArrayList<Member> memberList = service.getAll();
		for (Member mem : memberList) {
			System.out.println(mem.getId() + "," + mem.getName() + "," + mem.getEmail());
		}
		
		// 課題
		System.out.println(service.sumOf(3, 5));
	}

}
