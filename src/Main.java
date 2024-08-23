import java.util.ArrayList;
import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um autor: ");
        String autor = scanner.nextLine();

        System.out.println("Digite um isbn: ");
        String isbn = scanner.nextLine();

        System.out.println("Digite um codigo: ");
        String codigo = scanner.nextLine();

        System.out.println("Digite um titulo: ");
        String titulo = scanner.nextLine();

        System.out.println("Digite o ano de publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Com só o Scanner.nextInt não estava aparecendo o parametro ano

        Livro book = new Livro(autor, isbn, codigo, titulo, ano );

        Periodico periodic = new Periodico(10, 20, 30, "99r10", "O sol é para todos", 1960 );

        Biblioteca library = new Biblioteca();
        library.adicionarItem(book);

        ArrayList<ItemBibliografico> teste = library.listarItens();

        System.out.println(book);
        System.out.println(periodic);
        System.out.println(library);
        System.out.println(teste);
    }
}