package chapter8;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference=new ReferenceConstructor();
        reference.makeMeberObject();
    }

    public void makeMeberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Sangmin");
        MemberDTO dto3 = new MemberDTO("Sangmin","010XXXXYYYY");
        MemberDTO dto4 = new MemberDTO("Sangmin", "010XXXXYYYY","god@godofjava.com");
    }
}
