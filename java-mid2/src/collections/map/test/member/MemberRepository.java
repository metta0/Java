package collections.map.test.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public void remove(String id) {
        if (memberMap.containsKey(id)) {
            memberMap.remove(id);
        }
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        for (Map.Entry<String, Member> entry : memberMap.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                return entry.getValue();
            }
        }
        return null;
    }

}

