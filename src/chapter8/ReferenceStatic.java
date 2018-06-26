package chapter8;

public class ReferenceStatic {
    private static String name;

    public static void main(String[] args) {
        ReferenceStatic.staticMethod();
        String name="Min";
    }

    public static void staticMethod() {
        System.out.println("This is a staticMethod.");
    }
    public static void staticMethodCallVariable() {
        System.out.println(name);
    }
}
