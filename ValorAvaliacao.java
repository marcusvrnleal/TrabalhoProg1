public class ValorAvaliacao {
    private float valor;
    private MedidaAvaliacao nomeMedida;

    public ValorAvaliacao (float valor, MedidaAvaliacao nomeMedida){
        this.valor = valor;
        this.nomeMedida = nomeMedida;

    }

    public void setValor(boolean valor) {
        this.valor = MedidaAvaliacao.VerificaMedida()

    }
        
    public float getValor() {
        return this.valor;
    }

    public MedidaAvaliacao getNomeMedida() {
        return this.nomeMedida;
    }

}