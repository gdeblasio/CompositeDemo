package compositedemo;

public class Indentacion {
    private final StringBuilder indent = new StringBuilder();

    public String getIndentacion() {
        return indent.toString();
    }
    
    public void aumentarIndentacion() {
        indent.append(" ");
    }
    
}
