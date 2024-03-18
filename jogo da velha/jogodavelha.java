class JogoDaVelha {
    private static String simbolo = "X"; // Definindo "X" como símbolo inicial
    private static String[] grid = new String[9]; // Representação do tabuleiro

    public static void main(String[] args) {
        // Aqui você pode chamar o método para iniciar o jogo
    }

    public static String getSimbolo() {
        return simbolo;
    }

    public static void mudarSimbolo() {
        if (verificarVitoria()) {
            System.out.println("☻ Vitória do " + simbolo);
            // Aqui você pode adicionar lógica adicional após a vitória
            return;
        }

        if (verificarVelha()) {
            System.out.println("Opa, deu velha ☺");
            // Aqui você pode adicionar lógica adicional após empate
            return;
        }

        // Trocando o símbolo atual
        simbolo = (simbolo.equals("X")) ? "O" : "X";
    }

    private static boolean verificarVitoriaNasLinhas() {
        // Lógica para verificar vitória nas linhas
        return false; // Adicione sua lógica aqui
    }

    private static boolean verificarVitoriaNasColunas() {
        // Lógica para verificar vitória nas colunas
        return false; // Adicione sua lógica aqui
    }

    private static boolean verificarVitoriaNasDiagonais() {
        // Lógica para verificar vitória nas diagonais
        return false; // Adicione sua lógica aqui
    }

    private static boolean verificarVitoria() {
        return verificarVitoriaNasLinhas() || verificarVitoriaNasColunas() || verificarVitoriaNasDiagonais();
    }

    private static boolean verificarVelha() {
        // Verificando se todos os espaços estão preenchidos
        for (String valor : grid) {
            if (valor == null || valor.isEmpty()) {
                return false; // Ainda há espaços vazios, o jogo não empatou
            }
        }
        // Se todos os espaços estiverem preenchidos e ninguém ganhou, é um empate
        return true;
    }
}

