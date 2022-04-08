package com.multimodule;

import java.util.List;

public interface MemberRepository {
    Member save(Member member);

    List<Member> findAll();
}
