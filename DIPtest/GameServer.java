package DIPtest;

// 게임의 추가 삭제에 영향을 받지 않도록 설계
public class GameServer
{
    // 메인 함수에서 호출을 받을 시 Games의 Start 메소드를 실행
    public void Game_Play(Games games)
    {
        games.Start();
    }
}
