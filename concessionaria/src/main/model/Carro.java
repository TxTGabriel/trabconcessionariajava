package model;
public class Carro implements Veiculo
{
    private float potMotor;
    private String opcional;
    private int qntPortas;
    public Carro(float potMotor, String opcional, int qntPortas) {
        this.potMotor = potMotor;
        this.opcional = opcional;
        this.qntPortas = qntPortas;
    }
    public float getPotMotor() {
        return potMotor;
    }
    public void setPotMotor(float potMotor) {
        this.potMotor = potMotor;
    }
    public String getOpcional() {
        return opcional;
    }
    public void setOpcional(String opcional) {
        this.opcional = opcional;
    }
    public int getQntPortas() {
        return qntPortas;
    }
    public void setQntPortas(int qntPortas) {
        this.qntPortas = qntPortas;
    }
    @Override
    public String toString() {
        return "Carro [potMotor=" + potMotor + ", opcional=" + opcional + ", qntPortas=" + qntPortas + "]";
    }

    




}
