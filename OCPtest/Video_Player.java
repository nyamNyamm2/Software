package OCPtest;

public class Video_Player 
{
    // private으로 정보은닉
    private playCodec codec;

    // 매개변수없이 생성자 생성할 수 있도록 메소드 오버로딩
    public Video_Player() 
    {
        System.out.println("코덱이 설정되지 않았습니다.");
    }

    // 매개변수를 통해 생성자 생성할 수 있도록 메소드 오버로딩
    public Video_Player(playCodec codec) 
    {
        this.codec = codec;
    }

    // 매개변수없이 객체 생성 혹은 코덱을 변경할 수 있도록 하는 메소드
    public void setCodec(playCodec codec) 
    {
        this.codec = codec;
    }

    // 각 클래스마다 오버라이딩한 메소드 실행
    public void start() 
    {
        if (codec != null)
            codec.play();
        else
            System.out.println("코덱이 설정되지 않았습니다.");
    }
}
