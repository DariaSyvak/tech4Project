package casting;

public class CastingPrimitives {
    public static void main(String[] args) {
        //double->float->long=>int=>char=>short->byte//
        int myInt=32;
        long myLong=myInt;
        myInt=(int)myLong;


        int mySecondInt='B';
        char myChar=(char)56;
        char mySecondChar =56;

        int myThirdInt=(int)45.4;

        short myShort=(short)myChar;
        char myThirdChar=(char)myShort;

        byte num1=45;
        int num2=num1; //implicit

        double num3= 13.6;
        float num4=(float)num3;

        int num5=45;
        short num6=34;

        char c= (char) num5;//we have to cast  for both cuz they need to be positive
        c=(char)num6;




    }
}
