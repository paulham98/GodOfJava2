package Chapter7;

public class ArrayInitialize {
    public static void main(String[] args) {
        ArrayInitialize array=new ArrayInitialize();
        array.otherInit();
        System.out.println(array.getMonth(3));
    }
    public void otherInit() {
        int [] lottoNumbers={5, 12,23,25,38,41,2};
    }
    public String getMonth(int monthInt) {
        String [] month={"January", "February", "March", "April","May", "June", " july", "August","September","October"
                ,"November", "December"};
        return month[monthInt+1];
    }
}
