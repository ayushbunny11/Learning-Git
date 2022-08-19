import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.List;


public class dayOfWeek {
    
    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");

    public static String getDay(String day, String month, String year){

        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);

        Calendar cal = Calendar.getInstance();
        cal.set(y, m-1, d);

        int dayNum = cal.get(Calendar.DAY_OF_WEEK);
        return days.get(dayNum-1);

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the date in the format(DD MM YYYY)");
        String day=sc.next();
        String month=sc.next();
        String year=sc.next();

        System.out.println(getDay(day, month, year));
        sc.close();

    }
}
