public class badbunny {

    public static void main(String[] args) {

        String[] names = {"nacho", "sophia", "luca", "junior"};
        double[] notas = {7.5, 8.0, 6.0, 5.5};

        for (int i = 0; i < names.length; i++) {

            if (notas[i] >= 6) {
                System.out.println(names[i] + " aprobado");
            } else {
                System.out.println(names[i] + " reprobado");
            }
        }
    }
}