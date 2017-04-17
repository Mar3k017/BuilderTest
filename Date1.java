package builder01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Date1 {
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
    private int year;
    private int month;
    private int day;
    private Date date;
    
    private Date1(final Builder builder){
        this.year = builder.year;
        this.month = builder.month;
        this.day = builder.day;
        try {
            this.date = sdf.parse(year+"."+month+"."+day);
        } catch (ParseException ex) {
            System.err.println("Occured error: " + ex.getMessage());
        }
    }
    
    public String toString(){
        //return sdf.format(date);
        String result = null;
        if((year != 0) && (month != 0) && (day != 0)){
            result = year+"."+month+"."+day;
        }
        
        if((year != 0) && (month != 0) && (day == 0)){
            result = year+"."+month;
        }
        
        if((year != 0) && (month == 0) && (day == 0)){
            result = year+"";
        }
        return result;
    }
    
    public static class Builder{
        
    private int year;
    private int month;
    private int day;
    private Date date;

    
    public Builder year(int year){
        this.year = year;
        return this;
    }
    
    public Builder month(int month){
        this.month = month;
        return this;
    }
    
    public Builder day(int day){
        this.day = day;
        return this;
    }
    
    public Builder date(Date date){
        this.date = date;
        return this;
    }
    
    public Date1 Build(){
        return new Date1(this);
    }
    
    }
}
