package co.uk.dragosolutions.timed;

@FunctionalInterface
public interface TimedOperation {

    void run();

    default void completed(long startTime, long endTime) {
        System.out.println("Elapsed time is " + (endTime - startTime));
    };

    static void time(TimedOperation operation) {

        long startTime = System.nanoTime();

        operation.run();

        long endTime = System.nanoTime();

        operation.completed(startTime, endTime);
    }
}
