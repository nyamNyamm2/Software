package OCPtest;

public class MP4 extends playCodec 
{
    // 생성자
    public MP4()
    {
        System.out.println("MP4 파일 형식 입니다.");
    }

    // 추상메소드 오버라이딩
    @Override
    public void play() 
    {
        System.out.println("MP4 파일 형식 재생합니다.");
    }
}
