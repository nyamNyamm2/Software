package OCPtest;

public class Video_Player 
{
    private playCodec codec;

    public Video_Player() 
    {
        System.out.println("코덱이 설정되지 않았습니다.");
    }

    public Video_Player(playCodec codec) 
    {
        this.codec = codec;
    }

    public void setCodec(playCodec codec) 
    {
        this.codec = codec;
    }

    public void start() 
    {
        if (codec != null)
            codec.play();
        else
            System.out.println("코덱이 설정되지 않았습니다.");
    }

    public static void main(String[] args) 
    {
        Video_Player player = new Video_Player();

        player.setCodec(new MP4());
        player.start();                                     // MP4를 재생

        player.setCodec(new WMV());
        player.start();                                     // WMV를 재생

        player.setCodec(new AVI());
        player.start();                                     // AVI를 재생

        player.setCodec(new MP21());
        player.start();                                     // MP21를 재생
    }
}
