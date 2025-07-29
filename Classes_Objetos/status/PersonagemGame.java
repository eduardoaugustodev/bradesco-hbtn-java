
public class PersonagemGame{

    private int saudeAtual;

    private String nome;

    private String status;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        if(saudeAtual > 0){
            this.status = "vivo"
        }else{
            this.status = "morto"
        }
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void tomarDano(int quantidadeDeDano){
        setSaudeAtual(Math.max(0, getSaudeAtual() - quantidadeDeDano));
    }

    public void receberCura(int quantidadeDeCura){
        setSaudeAtual(Math.min(100, getSaudeAtual() + quantidadeDeCura));
    }
}