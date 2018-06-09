package Chapter6;

public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel control=new ControlLabel();
        control.printTimesTable();
    }

    private void printTimesTable() {
        for(int level=2;level<10;level++) {
            for(int unit=1;unit<10;unit++) {
                System.out.println(level+"*"+unit+"="+level*unit+" ");
            }
            System.out.println();
        }
    }
}
