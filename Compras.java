public class Compras implements Comparable<Compras>{
    private String item;
    private double valor;

    public Compras(String item, double valor) {
        this.item = item;
        this.valor = valor;
    }

    public String getItem() {
        return item;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "item='" + item + '\'' +
                ", valor=" + valor +
                '}';
    }


    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
