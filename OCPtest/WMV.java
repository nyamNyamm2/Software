package OCPtest;

public class WMV extends playCodec
{
    public WMV()
    {
        System.out.println("WMV 파일 형식 입니다.");
    }

    @Override
    public void play()
    {
        System.out.println("WMV 파일 형식 재생합니다.");
    }
}