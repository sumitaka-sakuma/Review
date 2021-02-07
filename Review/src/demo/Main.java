package demo;

import java.util.ArrayList;

import Entity.Member;
import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {

		MemberServiceImpl service = new MemberServiceImpl();
		System.out.println(service.greet(2));
		
		ArrayList<Member> memberList = service.getAll();
		for (Member mem : memberList) {
			System.out.println(mem.getId() + "," + mem.getName() + "," + mem.getEmail());
		}
		
		System.out.println(service.sumOf(3, 5));
		
	}

}
