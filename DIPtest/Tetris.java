package DIPtest;

public class Tetris extends Games
{
    // 객체 생성 시 게임 이름과 버전을 저장
    public Tetris()
    {
        title = returnTitle();
        ver = returnVersion();
    }

    // 게임 이름을 리턴
    public String returnTitle()
    {
        return "Tetris";
    }

    // 게임 출시일을 리턴
    public String returnVersion()
    {
        return "ver.1985.tetris";
    }
}
