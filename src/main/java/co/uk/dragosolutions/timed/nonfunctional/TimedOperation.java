package co.uk.dragosolutions.timed.nonfunctional;


public interface TimedOperation {

    void run();


    default void time() {

        long startTime = System.nanoTime();

        run();

        long endTime = System.nanoTime();

        completed(startTime, endTime);
    }

    default void completed(long startTime, long endTime) {
        System.out.println("Elapsed time is " + (endTime - startTime));
    }
}
