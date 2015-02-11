 class time {
    public static void main(String [] args) {
        
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinute = totalSeconds / 60;
        long currentMinute = totalMinute % 60;
        long totalHours = totalMinute / 60;
        long currentHour = totalHours %24;
        System.out.println ("current time is" +currentHour+":"+currentMinute+""+currentSecond);
        
        
    }
}