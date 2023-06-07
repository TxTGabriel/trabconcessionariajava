public class Clientes 
{
    Sring nome,email;
    int idade,numTelefone,cpf;
    public Clientes(Sring nome, Sring email, int idade, int numTelefone, int cpf) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.numTelefone = numTelefone;
        this.cpf = cpf;
    }
    public Sring getNome() {
        return nome;
    }
    public void setNome(Sring nome) {
        this.nome = nome;
    }
    public Sring getEmail() {
        return email;
    }
    public void setEmail(Sring email) {
        this.email = email;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getNumTelefone() {
        return numTelefone;
    }
    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return "Clientes [nome=" + nome + ", email=" + email + ", idade=" + idade + ", numTelefone=" + numTelefone
                + ", cpf=" + cpf + "]";
    }

    
}
