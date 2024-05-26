package DIPtest;

// 게임서버에 영향을 주는 게임의 추가 삭제를 다른 클래스로 묶어 설계
public abstract class Games
{
    public String title, ver;

    public void Start()
    {
        System.out.println("게임명: " + title);
        System.out.println("버  전: " + ver);
        System.out.println("\n" + title + " 게임을 시작합니다.\n");
    }
}
