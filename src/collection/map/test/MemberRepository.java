package collection.map.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public Member findById(String id) {
        if (memberMap.containsKey(id)) {
            return memberMap.get(id);
        }

        return null;
    }

    public Member findByName(String name) {
        for (Member value : memberMap.values()) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        return null;
    }

    public void remove(String id) {
        memberMap.remove(id);
    }
}
