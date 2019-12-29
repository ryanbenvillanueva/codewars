public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        String dnaStr = dna.toUpperCase();
        char[] symbols = new char[dnaStr.length()];

        for (int i = 0; i < dnaStr.length(); i++) {
            if (dnaStr.charAt(i) == 'A') {
                symbols[i] = 'T';
            } else if (dnaStr.charAt(i) == 'T') {
                symbols[i] = 'A';
            } else if (dnaStr.charAt(i) == 'C') {
                symbols[i] = 'G';
            } else {
                symbols[i] = 'C';
            }
        }

        return new String(symbols);
    }

    public static void main(String[] args) {
        System.out.println(makeComplement("ACGTACGTACGT"));
    }
}
