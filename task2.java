public class Seminar1Task4 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis(); 
        String outString = "2";
        for (int i = 3; i < 1001; i = i + 2) {
            int n = i;
            int count = 0;
            for (int j = 3; j < n; j = j + 2) {
                if (n % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                outString = outString + " " + n;
            }

        }
        System.out.println(outString);
        System.out.println(System.currentTimeMillis() - time); 

    }

}