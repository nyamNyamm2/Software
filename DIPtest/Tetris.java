package DIPtest;

public class Tetris extends Games
{
    public Tetris()
    {
        title = returnTitle();
        ver = returnVersion();
    }

    public String returnTitle()
    {
        return "Tetris";
    }

    public String returnVersion()
    {
        return "ver.1985.tetris";
    }
}
