public class StringSplitClass {

  public static String[] solution(String s) {
    int amount = s.length() / 2;
    int remain = s.length() % 2;
    String[] result = new String[amount + remain];

    for (int i = 0; i < amount; i++) {
      result[i] = String.valueOf(s.charAt(i * 2)) + s.charAt(i * 2 + 1);
    }
    if (remain > 0) {
      result[amount] = String.valueOf(s.charAt(s.length() - 1)) + '_';
    }
    return result;
  }
}