package DIPtest;

public class SuperMario extends Games
{
     // 객체 생성 시 게임 이름과 버전을 저장
    public SuperMario()
    {
        title = returnTitle();
        ver = returnVersion();
    }

    // 게임 이름을 리턴
    public String returnTitle()
    {
        return "SuperMario Bros.";
    }

    // 게임 출시일을 리턴
    public String returnVersion()
    {
        return "ver.1985.SM_Bros";
    }
}
