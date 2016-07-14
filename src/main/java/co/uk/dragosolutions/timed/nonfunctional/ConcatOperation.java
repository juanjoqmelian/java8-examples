package co.uk.dragosolutions.timed.nonfunctional;


public class ConcatOperation implements TimedOperation {

    private static final String TEST = "test";

    @Override
    public void run() {
        final String template = "Parse this as '" + TEST + "'";
        System.out.println(template);
    }
}
