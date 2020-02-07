package intropoo;

public class RunTime {
    public static void main(String[] args) {
        // Creación del objeto time
        Time time = new Time();
        time.updateHour(10);
        time.updateMinute(51);
        time.updateSecond(40);
        String showTime = time.getTime();
        System.out.println(showTime);
    }
}
