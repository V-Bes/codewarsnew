public class FindUniqClass {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1,1,2,1,1}));
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
}
