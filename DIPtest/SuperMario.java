package DIPtest;

public class SuperMario extends Games
{
    public SuperMario()
    {
        title = returnTitle();
        ver = returnVersion();
    }

    public String returnTitle()
    {
        return "SuperMario Bros.";
    }

    public String returnVersion()
    {
        return "ver.1985.SM_Bros";
    }
}
