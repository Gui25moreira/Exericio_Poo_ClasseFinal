import tiposDeCursos.Tecnologo;

public class Main {
    public static void main(String[] args)
    {
        Tecnologo tecnologo = new Tecnologo();
        Tecnologo tecnologo1 = new Tecnologo();

        tecnologo.adicionarDisciplinas(2);
        tecnologo1.adicionarDisciplinas(2);
        System.out.println(tecnologo.getQuantidadeDeDisciplinas());
        System.out.println(tecnologo1.getQuantidadeDeDisciplinas());
        System.out.println(tecnologo.equals(tecnologo1));

    }
}