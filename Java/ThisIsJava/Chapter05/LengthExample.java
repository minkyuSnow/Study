public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int length = ssn.length();

        if(length == 13) {
            System.out.println("자릿수 맞습니다.");
        } else {
            System.out.println("자릿수 다릅니다.");
        }
    }
}
