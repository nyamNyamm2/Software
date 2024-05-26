package LSPtest;

public class LecturerNormal extends Lecturer
{
    // 생성자
    public LecturerNormal()
    {
        lecturer = "일반 강사";
    }

    // 추상메소드 오버라이딩
    @Override
    public void Lecturer()
    {
        System.out.println(lecturer);
        System.out.println("강사료: " + charge + "원\n");
    }
}
