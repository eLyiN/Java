// ConcatenatedStringBuilder is a way to create a concatenated string builder.
// This can be used to build the output string from multiple strings separated by commas.

public class Concatenate {

    public static void main(String[] args) {

        String[] nombres = new String[]{"Pepito", "Fulanito", "Menganito"};

        StringBuilder line = null;
        line = new StringBuilder();
        for (String nombre : nombres) {
            line.append(nombre);
            line.append(" ");

        }
        System.out.println(line.toString());
    }
}
