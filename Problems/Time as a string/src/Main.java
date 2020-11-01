class Time {

    private final int hours;
    private final int minutes;
    private final int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);








        /*String output1 = "", output2 = "", output3 = "", output;
        if (hours > 9) {
            output1 = Integer.toString(hours);
        } else if (hours <= 9){
            output1 = "0" + hours;
        }
        if (minutes > 9) {
            output2 = Integer.toString(minutes);
        } else if (minutes <= 9){
            output2 = "0" + minutes;
        }

        if (seconds > 9) {
            output3 = Integer.toString(seconds);
        } else if (seconds <= 9){
            output3 = "" + "0" + seconds;
        }


        output = output1 + output2 + output3;
        return output;*/
    }
}