public class Stringify {
  Buffer result;
  
  
  public Stringify(Buffer result) {
    this.result = result;
  }
  
  
  public void append(Value val) {
    result.append(String.valueOf(val.getVal()));
  }
  
  
  public void appendN(Value val, int n) {
    for(int i = 0; i < n; i++) {
      append(val);
      val.incVal();
    }
  }
  
  
}