package model;
public class Moto implements Veiculo 
{
    private int cilindrada;
    private String modelo;
    public Moto(int cilindrada, String modelo) 
    {
        this.cilindrada = cilindrada;
        this.modelo = modelo;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public String toString() {
        return "Moto [cilindrada=" + cilindrada + ", modelo=" + modelo + ", documento=" + documento + "]";
    }

    

    
}
