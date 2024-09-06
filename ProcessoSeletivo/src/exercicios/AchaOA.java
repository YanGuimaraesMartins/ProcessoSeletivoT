package exercicios;

public class AchaOA {

    public static void main(String[] args) {
        String s = "Antonio Carlos"; // 1 A; 3 a
        System.out.println(contaA(s));
    }

    public static String contaA(String s) {
        int totalA = 0, totala = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                totala++;
            } else if (s.charAt(i) == 'A') {
                totalA++;
            }
        }

        if (totalA + totala == 0) {
            return "Nao houve ocorrencia";
        }

        return "Ocorrencia de A = " + totalA + ", ocorrencia de a = " + totala + " ocorrencia total = " + (totalA + totala);
    }
}
