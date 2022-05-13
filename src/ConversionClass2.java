import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConversionClass2 {

  public static void main(String[] args) {
    System.out.println(solution(98));
  }
  //XCVIII

  public static String solution(int n) {
    Map<Integer, String> symbolRoman = new HashMap<>();
    symbolRoman.put(0, "M");
    symbolRoman.put(1, "D");
    symbolRoman.put(2, "C");
    symbolRoman.put(3, "L");
    symbolRoman.put(4, "X");
    symbolRoman.put(5, "V");
    symbolRoman.put(6, "I");
    List<Integer> values = new ArrayList<>();
    int valueRoman = 1000;
    for (int i = 7; i >= 1; i--) {
      int amount = n / valueRoman;
      if (amount == 0) {
        amount = n / valueRoman / 10;
      }
      values.add(amount);
      n = n - valueRoman * amount;
      if (i % 2 == 0) {
        valueRoman /= 5;
      } else {
        valueRoman /= 2;
      }
    }
    String result = new String();
    for (int i = 0; i < values.size(); i++) {
      int element = values.get(i);
      for (int j = 0; j < element; j++) {
        result += symbolRoman.get(i);
      }
    }
    return result;
  }
}
