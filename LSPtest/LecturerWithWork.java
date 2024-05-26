package LSPtest;

public class LecturerWithWork extends Lecturer
{
    // 생성자
    public LecturerWithWork()
    {
        lecturer = "직업을 가진 강사";
    }

    // 추상메소드 오버라이딩
    @Override
    public void Lecturer()
    {
        System.out.println(lecturer);
        System.out.println("강사료: " + charge/2 + "원\n");
    }    
}
