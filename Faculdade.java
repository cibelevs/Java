public class Faculdade {
    private String nome;
    private int anoCriacao;
    private Curso[] cursos;
    private int indexCurso;  // Índice para controlar o número de cursos adicionados

    // Construtor
    public Faculdade(String nome, int anoCriacao) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.cursos = new Curso[2];  // Array de tamanho fixo 2
        this.indexCurso = 0;  // Inicializa o índice de cursos como 0
    }

    // Setters
    void setNome(String nome) {
        this.nome = nome;
    }

    void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    // Método para adicionar um curso
    public void adicionarCurso(Curso curso) {
        // Verifica se já existe um curso com o mesmo nome
        for (int i = 0; i < indexCurso; i++) {
            if (cursos[i].getNome().equals(curso.getNome())) {
                System.out.println("Curso já existe na faculdade!");
                return;
            }
        }

        // Verifica se há espaço no array
        if (indexCurso < cursos.length) {
            cursos[indexCurso] = curso;
            indexCurso++;  // Aumenta o índice
            System.out.println("Curso " + curso.getNome() + " adicionado com sucesso!");
        } else {
            System.out.println("Não é possível adicionar mais cursos. Limite atingido.");
        }
    }

    // Método para remover um curso dado o nome
    public void removerCurso(String nomeCurso) {
        boolean cursoEncontrado = false;
        for (int i = 0; i < indexCurso; i++) {
            if (cursos[i].getNome().equals(nomeCurso)) {
                cursos[i] = null;  // Remove o curso da posição
                // Move todos os cursos para a esquerda para preencher o espaço vazio
                for (int j = i; j < indexCurso - 1; j++) {
                    cursos[j] = cursos[j + 1];
                }
                cursos[indexCurso - 1] = null;  // Limpa a última posição
                indexCurso--;  // Decrementa o índice
                cursoEncontrado = true;
                System.out.println("Curso " + nomeCurso + " removido com sucesso!");
                break;
            }
        }

        if (!cursoEncontrado) {
            System.out.println("Curso com o nome " + nomeCurso + " não encontrado.");
        }
    }

    // Getters
    String getNome() {
        return this.nome;
    }

    int getAnoCriacao() {
        return this.anoCriacao;
    }

    // Método para exibir todos os cursos
    public void exibirCursos() {
        if (indexCurso == 0) {
            System.out.println("Nenhum curso na faculdade.");
        } else {
            for (int i = 0; i < indexCurso; i++) {
                System.out.println("Curso: " + cursos[i].getNome() + ", Duração: " + cursos[i].getDuracao() + " semestres");
            }
        }
    }

    // Método para criar uma nova faculdade com cursos lançados no máximo 5 anos após a criação da faculdade
    public Faculdade criarNovaFaculdade(String nome, int anoCriacaoNovaFaculdade) {
        Faculdade novaFaculdade = new Faculdade(nome, anoCriacaoNovaFaculdade);

        for (int i = 0; i < indexCurso; i++) {
            if (cursos[i].getAnoCriacao() <= anoCriacao + 5) {
                novaFaculdade.adicionarCurso(cursos[i]);
            }
        }

        return novaFaculdade;
    }
}
