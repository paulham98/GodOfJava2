package Chapter6;

public class ControlElseIf {
    public static void main(String[] args) {
        ControlElseIf control=new ControlElseIf();
        control.elseIf(85);
    }
    public void elseIf(int point) {
        if(point>90) {
            System.out.println("A");
        } else if(point>80) {
            System.out.println("B");
        } else if(point>70) {
            System.out.println("C");
        } else if(point>60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
