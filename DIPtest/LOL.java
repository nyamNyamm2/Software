package DIPtest;

public class LOL extends Games
{
    // 객체 생성 시 게임 이름과 버전을 저장
    public LOL()
    {
        title = returnTitle();
        ver = returnVersion();
    }

    // 게임 이름을 리턴
    public String returnTitle()
    {
        return "League of Legends";
    }

    // 게임 출시일을 리턴
    public String returnVersion()
    {
        return "ver.2009.lol";
    }
}
