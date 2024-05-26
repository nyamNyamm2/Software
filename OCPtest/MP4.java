package OCPtest;

public class MP4 extends playCodec 
{
    public MP4()
    {
        System.out.println("MP4 파일 형식 입니다.");
    }

    @Override
    public void play() 
    {
        System.out.println("MP4 파일 형식 재생합니다.");
    }
}
