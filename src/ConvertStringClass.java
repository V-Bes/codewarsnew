import java.util.Arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertStringClass {

  public static void main(String[] args) {
    System.out.println(toCamelCase("the,Stea!lth Warrior"));
    System.out.println(toCamelCase1("the-Stealth_Warrior"));
  }

  static String toCamelCase(String str){
    String[] words = str.split("\\s|,|!|\\.");
    return Arrays.stream(words, 1, words.length)
        .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
        .reduce(words[0], String::concat);
  }

  static String toCamelCase1(String s){
    Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
      m.appendReplacement(sb, m.group(1).toUpperCase());
    }
    return m.appendTail(sb).toString();
  }
}
