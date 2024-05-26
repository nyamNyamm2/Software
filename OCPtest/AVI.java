package OCPtest;

public class AVI extends playCodec 
{
    // 생성자
    public AVI()
    {
        System.out.println("AVI 파일 형식 입니다.");
    }

    // 추상메소드 오버라이딩
    @Override
    public void play() 
    {
        System.out.println("AVI 파일 형식 재생합니다.");
    }
}
