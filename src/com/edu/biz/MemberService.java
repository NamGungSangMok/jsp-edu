package com.edu.biz;

import com.edu.beans.Member;

public class MemberService {
	MemberDAO dao = new MemberDAO();
	
	public void memberInsert(Member member) {
		dao.insertMember(member);
	}
}

