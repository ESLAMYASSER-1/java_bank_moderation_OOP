class eight {
    public static void main(String[] args) {
        int i, space, j;
        char alphabet = 'A';
        for (i = 0; i < 5; i++) {
            for (space = i; space < 5; space++)
                System.out.print(" ");
            for (j = 0; j < (i + 1); j++)
                System.out.print(alphabet + " ");
            System.out.print("\n");
        }
    }
}