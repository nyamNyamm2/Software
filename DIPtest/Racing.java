package DIPtest;

public class Racing extends Games
{
    public Racing()
    {
        title = returnTitle();
        ver = returnVersion();
    }

    public String returnTitle()
    {
        return "F1";
    }

    public String returnVersion()
    {
        return "ver.1946.F1_torino";
    }
}
