package Nome_Sexo;

import java.util.*;

public class NomeSexo {
    private String nome;
    private String sexo;

    public NomeSexo(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public static void main(String[] args) {
        Map<String, List<NomeSexo>> listaNome = new HashMap<>();
        List<NomeSexo> turma = criarTurma();
        List<NomeSexo> masculino = new ArrayList<>();
        List<NomeSexo> feminino = new ArrayList<>();

        for (NomeSexo ns : turma) {
            if (ns.getSexo().equalsIgnoreCase("Masculino")) {
                masculino.add(ns);
            } else if (ns.getSexo().equalsIgnoreCase("Feminino")) {
                feminino.add(ns);
            }
        }

        listaNome.put("Masculino", masculino);
        listaNome.put("Feminino", feminino);

        imprimirListaNome(listaNome);
    }

    private static List<NomeSexo> criarTurma() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome e sexo com - (ex: Everton Silva-Masculino, Ana Clara-Feminino): ");
        String nome = s.nextLine();
        String[] nomes = nome.trim().split(",");

        List<NomeSexo> turma = new ArrayList<>();
        for (String n : nomes) {
            String[] detalhes = n.trim().split("-");
            if (detalhes.length == 2) {
                turma.add(new NomeSexo(detalhes[0], detalhes[1]));
            }
        }
        return turma;
    }

    private static void imprimirListaNome(Map<String, List<NomeSexo>> listaNome) {
        listaNome.forEach((sexo, nomes) -> {
            System.out.println("Sexo: " + sexo);
            nomes.forEach(n -> System.out.println("Nome: " + n.getNome()));
        });
    }
}
