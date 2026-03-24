public class BotaoFisicoVolume {
    public void pressionarMais(){
        ControleVolume.getInstance().aumentar(5);
    }

    public void precionarMenos(){
        ControleVolume.getInstance().diminuir(5);
    }
}