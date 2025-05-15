public class Computador implements MusicPlayer, VideoPlayer {
    @Override
    public void pauseVideo() {
        System.out.println("O Computador está pausando o vídeo");
        
    }

    @Override
    public void playVideo() {
        System.out.println("O Computador está tocando o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O Computador está parando o vídeo");
        
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Computador está pausando a música");
        
    }

    @Override
    public void playMusic() {
        System.out.println("O Computador está tocando a música");
        
    }

    @Override
    public void stopMusic() {
        System.out.println("O Computador está parando a música");
    }
}
