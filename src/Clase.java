class Clase {
    int entero;
    String string;

    public Clase(int i, String string) {
        this.entero = i;
        this.string = string;
    }

    public void modificaObjeto(int nuevo_int, String nuevo_string) {
        i = nuevo_int;
        string = nuevo_string;
    }

    @Override
    public String toString() {
        return "Objeto { i=" + entero + ", a='" + string + "\'}";
    }
}