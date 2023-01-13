package tiposDeCursos;

import classeAbstrata.Curso;

public class Licenciatura extends Curso {
    public Licenciatura() {
    }

    public Licenciatura(String nomeDoCurso, String codigoDoCurso, int quantidadeDeDisciplinas, String duracaoDoCurso) {
        super(nomeDoCurso, codigoDoCurso, quantidadeDeDisciplinas, duracaoDoCurso);
    }

    @Override
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
