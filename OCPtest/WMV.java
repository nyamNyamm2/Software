package OCPtest;

public class WMV extends playCodec
{
    // 생성자
    public WMV()
    {
        System.out.println("WMV 파일 형식 입니다.");
    }

    // 추상메소드 오버라이딩
    @Override
    public void play()
    {
        System.out.println("WMV 파일 형식 재생합니다.");
    }
}