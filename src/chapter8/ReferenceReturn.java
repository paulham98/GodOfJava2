package chapter8;

public class ReferenceReturn {
    public static void main(String[] args) {
        ReferenceReturn reference=new ReferenceReturn();
        System.out.println(reference.intReturn());
        System.out.println(reference.intArrayReturn());
        System.out.println(reference.stringReturn());
    }
    public int intReturn() {
        int returnInt=0;
        return returnInt;
    }
    public int[] intArrayReturn() {
        int returnArray[]=new int[10];
        return returnArray;
    }
    public String stringReturn() {
        String returnString="Return value";
        return returnString;
    }
}
