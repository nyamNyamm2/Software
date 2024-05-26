package DIPtest;

public class Racing extends Games
{
    // 객체 생성 시 게임 이름과 버전을 저장
    public Racing()
    {
        title = returnTitle();
        ver = returnVersion();
    }

    // 게임 이름을 리턴
    public String returnTitle()
    {
        return "F1";
    }

    // F1 첫 그랑프리를 리턴
    public String returnVersion()
    {
        return "ver.1946.F1_torino";
    }
}
