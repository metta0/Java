package collections.set.hashSet;

import collections.set.hashSet.member.Member;
import collections.set.hashSet.member.MemberOnlyHash;

public class MyHashSetV3Main {
    public static void main(String[] args) {

        MySet<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
        //검색
        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

        MySet<Member> setMember = new MyHashSetV3<>(10);
        setMember.add(new Member("A"));
        setMember.add(new Member("B"));
        System.out.println(setMember);
        //검색
        Member searchMember = new Member("B");
        boolean result2 = setMember.contains(searchMember);
        System.out.println("set.contains(" + searchValue + ") = " + result2);


    }
}
