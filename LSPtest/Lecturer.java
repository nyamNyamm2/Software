package LSPtest;

// 추상 클래스로 Lecturer 클래스 정의
public abstract class Lecturer
{
    // 생성자 설계
    public Lecturer()
    {
        System.out.println("[리스코프 교체 원칙]\n");
    }

    // 강사 이름 지정할 변수, 디폴트 급여 변수 선언
    public String lecturer;
    public int charge = 70000;

    // 추상 메소드로 다른 클래스에서 상속받아 오버라이딩 하도록 설계
    public abstract void Lecturer();
}
