import java.util.List;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member createMember(String memberName) {
        Member member = new Member(memberName);
        Member savedMember = memberRepository.save(member);

        return savedMember;
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
