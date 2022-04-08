package com.multimodule;

import java.util.ArrayList;
import java.util.List;

public class InMemoryMemberRepository implements MemberRepository {
    private final List<Member> members = new ArrayList<>();

    @Override
    public Member save(Member member) {
        members.add(member);
        return member;
    }

    @Override
    public List<Member> findAll() {
        return this.members;
    }
}
