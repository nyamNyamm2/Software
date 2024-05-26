package OCPtest;

public class Main
{
    public static void main(String[] args) 
    {
        // 매개변수없이 객체 생성
        Video_Player player = new Video_Player();

        // MP4를 재생
        player.setCodec(new MP4());
        player.start();                                     

        // WMV를 재생
        player.setCodec(new WMV());
        player.start();                                     

         // AVI를 재생
        player.setCodec(new AVI());
        player.start();                                    

        // MP21를 재생
        player.setCodec(new MP21());
        player.start();                                     
    }
}
