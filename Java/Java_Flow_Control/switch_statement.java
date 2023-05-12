public class switch_statement {
    public static void main(String[] args) {
        int number = 29;
        String size;

        // switch でサイズをチェックします。
        switch (number) {

            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";

            case 22:
                size = "Perfect";

            default:
                size = "Unknown";
                break;

        }
        System.out.print("Size: " + size);
    }
}
