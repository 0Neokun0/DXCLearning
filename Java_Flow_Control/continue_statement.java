public class continue_statement {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 10; i++) {
            // if calue of i is between 4 and 9, then continue
            if (i > 4 && i < 9) {
                continue;
            }
            System.out.println(i);
        }
    }

}
