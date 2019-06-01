public class Dataset {
    private int numExemplos;
    private int numAtributos;
    private int numClasses;
    private String nomeDataset;

    public Dataset(int nExemplos, int nAtributos, int nClasses, String nomeDataset) {
        this.numExemplos = nExemplos;
        this.numAtributos = nAtributos;
        this.numClasses = nClasses;
        this.nomeDataset = nomeDataset;
    }

    public int getNumExemplo() {
        return this.numExemplos;
    }

    public int getNumAtributos() {
        return this.numAtributos;
    }

    public int getNumClasse() {
        return this.numClasses;
    }

    public String getNomeDataset() {
        return this.nomeDataset;
    }
}