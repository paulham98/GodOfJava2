package Chapter6;

public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile control=new ControlWhile();
        control.whileLoop1();

    }

    private void whileLoop1() {
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
        }
    }
}
