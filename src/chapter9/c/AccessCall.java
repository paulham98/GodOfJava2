package chapter9.c;

import chapter9.c.sub.AccessModifier;
public class AccessCall {
    public static void main(String[] args) {
        AccessModifier accessModifier=new AccessModifier();
        accessModifier.publicMethod();
        accessModifier.protectedMethod();
        accessModifier.packagePrivateMethod();
        accessModifier.privateMethod();

    }
}
