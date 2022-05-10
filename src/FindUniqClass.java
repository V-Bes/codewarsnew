public class FindUniqClass {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1,1,2,1,1}));
        System.out.println(encode("(( @"));
    }

    public static double findUniq(double arr[]) {
        if (arr[0] != arr[1] && arr[0] != arr[2]) {
            return arr[0];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]){
                return arr[i + 1];
            }
        }
        return arr[0];
    }

   // public class DuplicateEncoder {
        static String encode(String word){
            char[] charMas = word.toCharArray();
            char[] result = new char[charMas.length];
            for (int i = 0; i < charMas.length; i++) {
                result[i] = '(';
                for (int j = 0; j < charMas.length; j++) {
                    if (i != j && Character.toLowerCase(charMas[i]) == Character.toLowerCase(charMas[j])) {
                        result[i] = ')';
                        break;
                    }
                }
            }

            return String.valueOf(result);
        }


    //}

}

class Kata {

    static String[] joust(String[] listField, int vKnightLeft, int vKnightRight) {
        return new String[] {};
    }

}
