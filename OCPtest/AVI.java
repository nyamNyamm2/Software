package OCPtest;

public class AVI extends playCodec 
{
    public AVI()
    {
        System.out.println("AVI 파일 형식 입니다.");
    }

    @Override
    public void play() 
    {
        System.out.println("AVI 파일 형식 재생합니다.");
    }
}
