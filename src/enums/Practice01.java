package enums;

public class Practice01 {
    public static void main(String[] args) {
        Constants.Frequencies frequencies=Constants.Frequencies.YEARLY;
        switch(frequencies){
            case YEARLY:
                System.out.println("38400");
                break;
            case MONTHLY:
                System.out.println("3200");
                break;
            case WEEKLY:
                System.out.println("800");
                break;
            case DAILY:
                System.out.println("160");
                break;
            case HOURLY:
                System.out.println("20");
                break;
            default:
                System.out.println("no option");
        }
    }
}
