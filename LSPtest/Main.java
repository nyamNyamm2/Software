package LSPtest;

public class Main
{
    public static void main(String[] args)
    {
        LecturerNormal lec01 = new LecturerNormal();
        lec01.Lecturer();

        LecturerAtGS lec02 = new LecturerAtGS();
        lec02.Lecturer();
        
        LecturerNight lec03 = new LecturerNight();
        lec03.Lecturer();
        
        LecturerWithWork lec04 = new LecturerWithWork();
        lec04.Lecturer();
    }
}
