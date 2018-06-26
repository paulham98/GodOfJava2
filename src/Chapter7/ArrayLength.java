package Chapter7;

public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength array=new ArrayLength();
        array.printArray();
    }

    public void printArray() {
        int [][]twoDim={{1,2,3},{4,5,6}};
        System.out.println("twoDIm.length="+twoDim.length);
        System.out.println("twoDim[0].length="+twoDim[0].length);

        for(int oneLoop=0;oneLoop<twoDim.length;oneLoop++) {
            for(int twoLoop=0;twoLoop<twoDim[oneLoop].length;twoLoop++) {
                System.out.println("twoDim["+oneLoop+"]["+twoLoop+"]="
                +twoDim[oneLoop][twoLoop]);
            }
        }
    }
}
