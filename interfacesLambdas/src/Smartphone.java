public class Smartphone implements VideoPlayer, MusicPlayer {
    //nas classes podemos implementar mais de uma interface
    //mas para implementar classes deve ser somente uma

    @Override
    public void pauseVideo() {
        System.out.println("O Smartphone está pausando o vídeo");
        
    }

    @Override
    public void playVideo() {
        System.out.println("O Smartphone está tocando o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O Smartphone está parando o vídeo");
        
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Smartphone está pausando a música");
        
    }

    @Override
    public void playMusic() {
        System.out.println("O Smartphone está tocando a música");
        
    }

    @Override
    public void stopMusic() {
        System.out.println("O Smartphone está parando a música");
    }
    

}
