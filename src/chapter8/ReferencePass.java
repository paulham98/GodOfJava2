package chapter8;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        //reference.callPassByValue();
        reference.callPassByReference();
    }

    public void callPassByValue() {
        int a=10;
        String b="b";
        System.out.println("before passBtValue");
        System.out.println("a="+a);
        System.out.println("b="+b);
        passByValue(a,b);
        System.out.println("after passByValue");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public void passByValue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("in passByValue");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
    public void callPassByReference() {
        MemberDTO member=new MemberDTO("Sangmin");
        System.out.println("before passByReference");
        System.out.println("member.name="+member.name);
        passByReference(member);
        System.out.println("after passByReference");
        System.out.println("member.anme="+member.name);
    }
    public void passByReference(MemberDTO member) {
        member.name="Sunghoon";
        System.out.println("in passByReference");
        System.out.println("member.name="+member.name);
    }

}
