package StopWatch;

public class StopWatch {
    private long startTime;
    private long stopTime;
    private boolean running = false;

    public StopWatch(){

    }

    public void getStartTime(long startTime){
        this.startTime = startTime;
    }

    public void getEndTime(long endTime){
        this.stopTime = stopTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop(){
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }
}
