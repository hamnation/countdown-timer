package test;
public class CountdownTimer {
  public static void main(String[] args) throws InterruptedException {
    for(int n=10; n>=1; --n) { 
      System.out.println(n);
      Thread.sleep(1000);
    }
    System.out.println("happy new years");
  }
} 