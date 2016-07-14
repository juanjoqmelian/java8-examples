package co.uk.dragosolutions.timed;


public class TimeHelper {

    private static final String TEST = "test";


    public static void main(String[] args) {

        TimedOperation stringFormat = () -> {
            final String template = String.format("Parse this as '%s'", TEST);
            System.out.println(template);
        };

        TimedOperation concat = () -> {
            final String template = "Parse this as '" + TEST + "'";
            System.out.println(template);
        };

        TimedOperation.time(concat);
        TimedOperation.time(stringFormat);
    }
}
