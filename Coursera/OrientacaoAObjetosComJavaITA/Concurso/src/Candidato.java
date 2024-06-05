public class Candidato implements Comparable<Candidato> {
    private int nota;
    private boolean deficiencia;
    private int idade;

    public Candidato(int nota, boolean deficiencia, int idade) {
        super();
        this.nota = nota;
        this.deficiencia = deficiencia;
        this.idade = idade;
    }

    public int getNota() {
        return nota;
    }

    public boolean isDeficiencia() {
        return deficiencia;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Candidato outro) {
        if (this.nota == outro.getNota()) {
            if (this.deficiencia == outro.isDeficiencia()) {
                return this.idade - outro.getIdade();
            } else {
                if (this.deficiencia) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            return this.nota - outro.getNota();
        }
    }

    @Override
    public String toString() {
        return "Candidato [nota=" + nota + ", deficiencia=" + deficiencia + ", idade=" + idade + "]";
    }

}