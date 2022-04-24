package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {
        int num =36;
        //+(concat)
        //Value of method

            String numStr=45+""+num;
            String numStr2=String.valueOf(num)+ String.valueOf(45);
        System.out.println("numStr "+numStr);
        System.out.println("numStr2 "+ numStr2);
    }
}
