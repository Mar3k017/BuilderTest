package builder01;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Data {
    private Date date;
    private int year;
    private int month;
    private int day;
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
    
    public Data(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        try {
            this.date = sdf.parse(year+"."+month+"."+day);
        } catch (ParseException ex) {
            System.err.println("Occured error: "+ex.getMessage());
        }
    }
     
    public String toString(){
            return sdf.format(date);
        }
}
