
package exercise.time;


public class Time {
    private int hour;
    private int minute;
    private int second;
    private int timeTotalSeconds;
    private int rest;
    
    public void Time(int hour, int minute, int second){
        /*this.hour=hour;
        this.minute=minute;
        this.second=second;*/
        setTime(hour, minute, second);
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    public void setTime(int hour, int minute, int second) {
        if(second>=0 && second<60)
        this.second = second; else
            System.out.println("You entered an invalid number");
        if(hour>=0 && hour<24)
        this.hour=hour; else
            System.out.println("You entered an invalid number");
        if(minute>=0 && minute<60)
        this.minute=minute; else
            System.out.println("You entered an invalid number");
        this.timeTotalSeconds=this.second+(this.minute*60)+(this.hour*3600);
    }

    @Override
    public String toString() {
        
        return this.hour+":"+this.minute+":"+this.second; 
    }
    
    private void setTotalSecondsToTime(int timeTotalSeconds) {
        
        timeTotalSeconds=this.timeTotalSeconds;
        this.hour=timeTotalSeconds/3600;
        rest=timeTotalSeconds%3600;
        this.minute=rest/60;
        this.second=rest%60;
        toString();
    }
    
    public void nextSecond() {
        this.timeTotalSeconds++;
        setTotalSecondsToTime(timeTotalSeconds);
        
    }
    
    public void previousSecond() {
        this.timeTotalSeconds--;
        setTotalSecondsToTime(timeTotalSeconds);
    }
    
    
    
}
