package LSPtest;

public class LecturerWithWork extends Lecturer
{
    public LecturerWithWork()
    {
        lecturer = "직업을 가진 강사";
    }

    public void Lecturer()
    {
        System.out.println(lecturer);
        System.out.println("강사료: " + charge/2 + "원\n");
    }    
}
