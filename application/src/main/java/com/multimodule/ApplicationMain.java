package com.multimodule;

public class ApplicationMain {
    public static void main(String[] args) {
        MemberService memberService = new MemberService(new InMemoryMemberRepository());

        memberService.createMember("memberName1");
        memberService.createMember("memberName2");
        memberService.createMember("memberName3");
        memberService.createMember("memberName4");
        memberService.createMember("memberName5");

        printHorizontalLine();
        memberService.getAllMembers().stream()
                .forEach(it -> System.out.println("memberName = " + it.getName()));
        printHorizontalLine();
    }

    private static void printHorizontalLine() {
        System.out.println("==============================");
    }
}
