import java.util.Arrays;

public class JoustClass {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(joust(new String[]{"$->   ", "   <-P"}, 1, 1)));
    }
     static String[] joust(String[] listField, int vKnightLeft, int vKnightRight) {
         if (vKnightLeft == 0 && vKnightRight == 0) {
             return listField;
         }
         String[] result = new String[]{"",""};
         int sizeField = listField[0].length();
         String knight1 = listField[0].substring(0,3);
         String knight2 = listField[1].substring(sizeField - 3);
         int passedLeft = vKnightLeft;
         int passedRight = vKnightRight;

         while (listField[0].indexOf('>') < listField[1].indexOf('<')) {
             for (int i = 0; i < passedLeft; i++) {
                 result[0] += " ";
             }
             result[0] += knight1;
             for (int i = 0; i < sizeField - passedLeft - knight1.length(); i++) {
                 result[0] += " ";
             }
             passedLeft += vKnightLeft;

             for (int i = 0; i < sizeField - passedRight - knight2.length(); i++) {
                 result[1] += " ";
             }
             result[1] += knight2;
             for (int i = 0; i < passedRight; i++) {
                 result[1] += " ";
             }
             passedRight += vKnightRight;
             listField = result;
             result = new String[]{"",""};
         }
         return listField;
     }
}
