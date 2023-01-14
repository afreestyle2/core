package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
