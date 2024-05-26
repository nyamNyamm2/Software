package DIPtest;

public class LOL extends Games
{
    public LOL()
    {
        title = returnTitle();
        ver = returnVersion();
    }

    public String returnTitle()
    {
        return "League of Legends";
    }

    public String returnVersion()
    {
        return "ver.2009.lol";
    }
}
