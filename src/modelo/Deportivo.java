package modelo;

public class Deportivo extends Calzado{
    private String tipoDeporte;
    private String tipoMaterial;

    public Deportivo(Producto producto, int numero, String diaVenta, String tipoDeporte, String tipoMaterial) {
        super(diaVenta, numero, producto);
        this.tipoDeporte = tipoDeporte;
        this.tipoMaterial = tipoMaterial;
    }

    public Deportivo(){

    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
    public int impuestoMaterial(){
       /* int impuestoMaterial = (this.getTipoMaterial().equalsIgnoreCase("Cuero") ? Math.round(this.getProducto().getValorBase()*15/100) : (int) Math.round(this.getProducto().getValorBase()*0.06));
        return impuestoMaterial;*/
        int impuestoMaterial= -1;
        switch (this.getTipoMaterial().toLowerCase()){
            case "cuero":
                impuestoMaterial = Math.round(this.getProducto().getValorBase()*15/100);
                break;
            case "lona":
                impuestoMaterial = Math.round(this.getProducto().getValorBase()*6/100);
                break;
            default:
                break;
        }
        return impuestoMaterial;
    }
}