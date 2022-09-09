package ss4.exercise.SstopWatch;

public class StopWatch {
  long starTime;
  long endingTime;
    StopWatch(){
        this.starTime = System.currentTimeMillis();
    }

    public void star(){
         this.starTime=System.currentTimeMillis();
    }
    public void stop(){
         this.endingTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endingTime-this.starTime;
    }
}
