package tiposDeCursos;

import classeAbstrata.Curso;

public class Tecnologo extends Curso {
    public Tecnologo() {
    }

    public Tecnologo(String nomeDoCurso, String codigoDoCurso, int quantidadeDeDisciplinas, String duracaoDoCurso) {
        super(nomeDoCurso, codigoDoCurso, quantidadeDeDisciplinas, duracaoDoCurso);
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

    public final void trancarCurso() {
        System.out.println("Você trancou o curso");
    }
}
