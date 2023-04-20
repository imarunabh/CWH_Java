import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();//This is the date
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy--E a");// This is the formatter
        DateTimeFormatter df2=DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(df);


        String myDate=dt.format(df);//Creating date string using date and format
        System.out.println(myDate);
    }
}
