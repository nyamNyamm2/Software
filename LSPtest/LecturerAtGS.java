package LSPtest;

public class LecturerAtGS extends Lecturer
{
    // 생성자
    public LecturerAtGS()
    {
        lecturer = "대학원 강사";
    }

    // 추상 메소드 오버라이딩
    @Override
    public void Lecturer()
    {
        System.out.println(lecturer);
        System.out.println("강사료: " + charge*2 + "원\n");
    }
}
