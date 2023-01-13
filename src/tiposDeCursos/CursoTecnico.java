package tiposDeCursos;

import classeAbstrata.Curso;

public final class CursoTecnico extends Tecnologo {

    private String opcoesDeCursoTecnico;

    public CursoTecnico() {
    }

    public CursoTecnico(String nomeDoCurso, String codigoDoCurso, int quantidadeDeDisciplinas, String duracaoDoCurso, String opcoesDeCursoTecnico) {
        super(nomeDoCurso, codigoDoCurso, quantidadeDeDisciplinas, duracaoDoCurso);
        this.opcoesDeCursoTecnico = opcoesDeCursoTecnico;
    }
    public void adicionarDisciplinas(int valor) {
        int quantidadeDeDisciplinas = getQuantidadeDeDisciplinas();
        setQuantidadeDeDisciplinas(quantidadeDeDisciplinas + valor);
    }

    @Override
    public void removerDisciplinas(int valor) {
        int quantidadeDeDisciplinas = getQuantidadeDeDisciplinas();
        setQuantidadeDeDisciplinas(quantidadeDeDisciplinas - valor);
    }

    public void trocarDeCursoTecnico() {
        System.out.println("Você trocou de curso!");
    }
}
