public class MusicBox implements MusicPlayer {

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de música está pausada");
        
    }

    @Override
    public void playMusic() {
        System.out.println("A caixa de música está tocando");
        
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de música está parando");
        
    }
    

}
