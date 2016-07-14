package co.uk.dragosolutions.timed.nonfunctional;


public class TimeHelper {

    public static void main(String[] args) {

        TimedOperation stringFormat = new StringFormatOperation();
        TimedOperation concat = new ConcatOperation();

        concat.time();
        stringFormat.time();
    }
}
