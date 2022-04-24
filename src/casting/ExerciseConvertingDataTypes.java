package casting;

public class ExerciseConvertingDataTypes {
    public static void main(String[] args) {
        String num1="23";
        String num2="25";

        int num1Int=Integer.valueOf(num1);//String-->Integer-->int
        int num2Int=Integer.parseInt(num2);//String-->int

        Integer num1Integer =Integer.valueOf(num1);//String-->Integer
        Integer num2Integer =Integer.parseInt(num2);//String-->int-->Integer

        System.out.println("avg with int is ="+ ((num1Int+num2Int)/2));
        System.out.println("avg with Integer is ="+((num1Integer+num2Integer)/2));

        String save ="390";
        String day="15.60";
        double saveDouble=Double.valueOf(save);
        double dayDouble=Double.valueOf(day);
        System.out.println("he can save =" +(int)(saveDouble/dayDouble));


    }


}
