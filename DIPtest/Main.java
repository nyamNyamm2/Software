package DIPtest;

public class Main
{
    public static void main(String[] args)
    {
        // GameServer 객체 생성
        GameServer gameserver = new GameServer();

        // 각 게임 생성한 객체를 이용한 Game_Play 메소드
        gameserver.Game_Play(new SuperMario());
        gameserver.Game_Play(new LOL());
        gameserver.Game_Play(new Racing());
        gameserver.Game_Play(new Tetris());
    }
}
