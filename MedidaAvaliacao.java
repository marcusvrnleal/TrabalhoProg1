public class MedidaAvaliacao {
    private String nomeMedida;
    private float menorValor;
    private float maiorValor;

    public MedidaAvaliacao(String nomeMedida, float menorValor, float maiorValor) {
        this.nomeMedida = nomeMedida;
        this.menorValor = menorValor;
        this.maiorValor = maiorValor;
    }

    public String getNomeMedida() {
        return this.nomeMedida;
    }

    public float getMenorValor() {
        return this.menorValor;
    }

    public float getMaiorValor() {
        return this.maiorValor;
    }
    public boolean VerificaMedida(){
        boolean VerificaMedida;
        if(ValorAvalicao.getValor() >= getMenorValor() && ValorAvalicao.getValor() >= getMaiorValor()){
            VerificaMedida = true;
        }
        else
            VerificaMedida = false;
        return VerificaMedida;
    }

}