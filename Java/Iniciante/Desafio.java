package Iniciante;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Desafio {
    public static void main(String[] args) {
    /*  1-remova nomes repetidos;
        2-mantenha apenas nomes com mais de 4 letras;
        3-transforme todos para maiúsculo;
        4-ordene alfabeticamente.
     */
        List<String> nome = List.of("joao","maria","Zagalo","alex","fernanda","carlos","maria","Alexsandra");
        Set<String> meuSet = new HashSet<>(nome);
        System.out.println(meuSet);

        List<String> filtrandoPalavras = meuSet.stream().filter(s -> s.length() > 4).toList();
        System.out.println(filtrandoPalavras);

        List<String> palavrasMaiusculas = filtrandoPalavras.stream().map(String::toUpperCase).toList();
        System.out.println(palavrasMaiusculas);

        List<String> palavrasOrdenadas = palavrasMaiusculas.stream().sorted().toList();
        System.out.println(palavrasOrdenadas);
    }
}
