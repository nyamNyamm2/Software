package LSPtest;

public class LecturerNight extends Lecturer
{
    // 생성자
    public LecturerNight()
    {
        lecturer = "야간 강사";
    }

    // 추상메소드 오버라이딩
    @Override
    public void Lecturer()
    {
        System.out.println(lecturer);
        System.out.println("강사료: " + charge*1.5 + "원\n");
    }
}
