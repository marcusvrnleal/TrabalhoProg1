public class Dataset {
    private int numExemplos;
    private int numAtributos;
    private int numClasses;
    private String nome;

    public Dataset(int nExemplos, int nAtributos, int nClasses, String nome) {
        this.numExemplos = nExemplos;
        this.numAtributos = nAtributos;
        this.numClasses = nClasses;
        this.nome = nome;
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

    public String getNome() {
        return this.nome;
    }
}
