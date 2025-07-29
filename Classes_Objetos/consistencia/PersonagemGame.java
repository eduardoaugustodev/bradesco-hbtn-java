
public class PersonagemGame{

    private int saudeAtual;

    private String nome;

    private String status;

    public PersonagemGame(int saudeAtual, String nome){
        setSaudeAtual(saudeAtual);
        setNome(nome);
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if(getSaudeAtual() > 0){
            this.status = "vivo";
        }else{
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || "".equalsIgnoreCase(nome)){
            this.nome = getNome();
        }else{
            this.nome = nome;
        }
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