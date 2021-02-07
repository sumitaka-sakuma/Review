package service;

import java.util.ArrayList;

import Entity.Member;

public class MemberServiceImpl implements MemberService {

	@Override
	public String greet(int i) {
		
		String[] greetings = {"Good morning", "Hello", "Good evening"};
		
		return greetings[i];
	}

	@Override
	public ArrayList<Member> getAll() {
		
		ArrayList<Member> memberList = new ArrayList<>();
		Member mem1 = new Member(1, "Tom", "tom@gmail.com");
		Member mem2 = new Member(1, "Mary", "mary@gmail.com");
		
		memberList.add(mem1);
		memberList.add(mem2);
		
		return memberList;
	}
	
	@Override
	public int sumOf(int x, int y) {
		
		int sum = 0;
		for (int i = x; x <= y; x++) {
			sum += x;
		}
		
		return sum;
	}

}
