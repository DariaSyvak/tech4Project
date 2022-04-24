package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args) {
        String tech = "Tech";
        String global = "Global";


        String schoolName2 = tech + global;
        String schoolName3 = tech.concat(global);
        System.out.println(schoolName2 + "\n" + schoolName3);
        {
            String myName = "Dasha";
            String myLastName = "Syvak";
            String fullName1 = "Daria Syvak";
            String fullName2 = myName + "" + myLastName;
            String fullName3 = myName.concat(myLastName);
            System.out.println("This is my fullName " + fullName1);
            System.out.println("This is my fullName " + fullName2);
            System.out.println("This is my fullName " + fullName3);



        }
    }
}
