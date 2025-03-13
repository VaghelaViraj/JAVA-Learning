package basicope;
import java.time.LocalDate; // Import the LocalDate class
import java.time.LocalTime; //Import the LocalTime class
import java.time.LocalDateTime; //Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class


public class TodayDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); //current Date
        LocalTime time = LocalTime.now(); //current Time
        LocalDateTime date_time = LocalDateTime.now(); //current Date and Time
        DateTimeFormatter date_time_format = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        String dateformat = date_time.format(date_time_format);
        System.out.println("Current Date:" + date);
        System.out.println("Current Time:" + time);
        System.out.println("Before Formatting Current Date and Time:" + date_time);
        System.out.println("After Formatting Date and Time:" + dateformat);
        System.out.println(date.toString());

    }
}
