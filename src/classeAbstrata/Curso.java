package classeAbstrata;

public abstract class Curso {

    private String nomeDoCurso;
    private String codigoDoCurso;
    private int quantidadeDeDisciplinas;
    private String duracaoCurso;

    public Curso() {

    }

    public Curso(String nomeDoCurso, String codigoDoCurso, int quantidadeDeDisciplinas, String duracaoCurso) {
        this.nomeDoCurso = nomeDoCurso;
        this.codigoDoCurso = codigoDoCurso;
        this.quantidadeDeDisciplinas = quantidadeDeDisciplinas;
        this.duracaoCurso = duracaoCurso;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public String getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public int getQuantidadeDeDisciplinas() {
        return quantidadeDeDisciplinas;
    }

    public String getDuracaoCurso() {
        return duracaoCurso;
    }

    public void setQuantidadeDeDisciplinas(int quantidadeDeDisciplinas) {
        this.quantidadeDeDisciplinas = quantidadeDeDisciplinas;
    }

    public abstract void adicionarDisciplinas(int valor);

    public abstract void removerDisciplinas(int valor);

    public boolean equals(Object o) {
        Curso g = (Curso) o;
        if( this.getQuantidadeDeDisciplinas() == g.getQuantidadeDeDisciplinas()){
            System.out.println("Cursos possuem a mesma quantidade de disciplinas!");
        return true;
        }
        else {
            System.out.println("Cursos não possuem a mesma quantidade de disciplinas!");
        return false;
        }
}
}
