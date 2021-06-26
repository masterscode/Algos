package hackerrank;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("03:10:01PM"));

    }
    public static String timeConversion(String s) {
        // Write your code here
        TimeFormat time = getTimeFormat(s);
        int hour = Integer.parseInt(time.hour);
        String output;
        if(!isPm(time.metric)){
            int hour24 = hour == 12 ? 0: hour;
            output =  new TimeFormat(
                String.valueOf(hour24),time.minute, time.seconds, ""
        ).toString();
        } else {
            int hour24 = hour == 12 ? 12: 12 + hour;
          output =  new TimeFormat(
                  String.valueOf(hour24),time.minute,time.seconds,""
          ).toString();
        }
        return output;
    }

    private static boolean isPm(String time){
        return time.contains("PM");
    }

    private static TimeFormat getTimeFormat(String time){
        String[] timeParts = time.split(":");
        return new TimeFormat(
                timeParts[0], timeParts[1], timeParts[2].substring(0,2), timeParts[2].substring(2)
        );

    }

    public static class TimeFormat{
        public String hour, minute, seconds, metric;
        public TimeFormat(String hour, String minute, String seconds, String metric){
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
            this.metric = metric;
        }

        @Override
        public  String toString(){
            return (this.hour.length()< 2? "0"+this.hour:this.hour) + ":" + this.minute + ":" + this.seconds +  this.metric;
        }

    }
}
