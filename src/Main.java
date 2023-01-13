import tiposDeCursos.Tecnologo;

public class Main {
    public static void main(String[] args)
    {
        Tecnologo tecnologo = new Tecnologo("Ads", "1234567", 10, "Dois anos e meio.");
        Tecnologo tecnologo1 = new Tecnologo("Desenvolvimento de jogos.", "1234567", 10, "Dois anos e meio.");


        tecnologo.adicionarDisciplinas(2);
        tecnologo1.adicionarDisciplinas(2);
        System.out.println(tecnologo.getQuantidadeDeDisciplinas());
        System.out.println(tecnologo1.getQuantidadeDeDisciplinas());
        System.out.println(tecnologo.equals(tecnologo1));

    }
}