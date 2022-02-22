import java.util.Random;
public class Buffer {
  String str;
  public Buffer(String s) {
    str = s;
  }
  public void append(String s) {
    str += s;
  }
  
  public void appendRandom(Random rand) {
   
    int n = rand.nextInt(100);
    append(String.valueOf(n));
  }
  
  public String toString() {
    return str;
  }
}