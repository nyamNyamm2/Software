package LSPtest;

public class Main
{
    public static void main(String[] args)
    {
        // 각 강사 클래스 객체 생성 후 오버라이딩한 메소드 실행 
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
