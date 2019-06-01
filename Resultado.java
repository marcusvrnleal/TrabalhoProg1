public class Resultado {
    private Algoritmo algoritmo;
    private Dataset dataset;

    private ValorAvaliacao avaliacao[3];

    public Resultado(Algoritmo algoritmo, Dataset dataset){
        this.algoritmo = algoritmo;
        this.dataset = dataset;
    }
    public algoritmo getAlgoritmo(){
		return this.algoritmo;
	}
	public dataset getDataset(){
		return this.dataset;
	}
	public string getNomeAlgoritmo(){
		return this.nomeAlgoritmo;
	}

    public String getNomeDataset() {
        return this,nomeDataset;
    }

}