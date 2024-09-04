public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1 == strVar2) {
            System.out.println("참조 변수 주소가 같다.");
        } else {
            System.out.println("참조 변수가 다르다.");
        }

        if(strVar1.equals(strVar2)) {
            System.out.println("참조 변수가 가리코 있는 객체 내부의 값이 같다.");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("참조하는 곳이 같다.");
        } else {
            System.out.println("참조하는 곳이 다르다.");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("서로 가리키고 있는 객체의 내부 데이터가 같다.");
        }
    }
}
