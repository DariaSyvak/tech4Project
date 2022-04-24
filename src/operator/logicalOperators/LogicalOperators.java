package operator.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean isInterviewQuastionsSent= false;
        boolean isJavaHomeworkSent =true;

        System.out.println("The student is ok :" +
                (isInterviewQuastionsSent||isJavaHomeworkSent));
        System.out.println("The student is ok :"+
                (isInterviewQuastionsSent && isJavaHomeworkSent));

    }
}
