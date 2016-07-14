package co.uk.dragosolutions.timed.nonfunctional;


public class StringFormatOperation implements TimedOperation {

    private static final String TEST = "test";

    @Override
    public void run() {
        final String template = String.format("Parse this as '%s'", TEST);
        System.out.println(template);
    }
}
