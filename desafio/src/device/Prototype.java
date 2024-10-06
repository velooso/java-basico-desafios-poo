package device;

import functions.InternetBrowser;
import functions.MusicPlayer;
import functions.TelephoneDevice;

public class Prototype implements InternetBrowser, MusicPlayer, TelephoneDevice {

    public void search() {
        System.out.println("Carregando url...");
        System.out.println("Site encontrado!");
    }

    public void visitWebSite() {
        System.out.println("Carregando site...");
        System.out.println("Carregamento concluido!");
    }
    public void searchMusic() {
        System.out.println("Buscando música...");
    }

    public void playMusic() {
        System.out.println("Inicar música!");
    }

    public void stopMusic() {
        System.out.println("Parar música!");
    }

    public void nextMusic() {
        System.out.println("Próxima música");
    }

    public void backMusic() {
        System.out.println("Música anterior");
    }

    public void volumeUp() {
        System.out.println("Aumentando volume");
    }

    public void volumeDown() {
        System.out.println("Diminuindo volume");
    }

    public void call() {
        System.out.println("Ligando...");
        System.out.println("Chamada em andamento");
    }

    public void turnOffCall() {
        System.out.println("Encerrando ligação...");
        System.out.println("Ligação encerrada!");
    }


}
