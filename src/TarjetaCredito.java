import java.time.LocalDate;

public class TarjetaCredito
{
    private String emisor;
    private long cupo;
    private String numeroTarjeta;
    private int ccv;
    private LocalDate fechaVencimiento;

    public TarjetaCredito(String emisor, long cupo, String numeroTarjeta, int ccv, LocalDate fechaVencimiento) {
        this.emisor = emisor;
        this.cupo = cupo;
        this.numeroTarjeta = numeroTarjeta;
        this.ccv = ccv;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public long getCupo() {
        return cupo;
    }

    public void setCupo(long cupo) {
        this.cupo = cupo;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void imprimir()
    {
        System.out.println("ESTA ES LA INFORMACION DE SU TARJETA DE CREDITO\n");
        System.out.println("El Emisor Es:  "+ this.getEmisor());
        System.out.println("El Cupo Asignado Es:  "+ this.getCupo());
        System.out.println("El Numero de Tarjeta  Es:  "+ this.getNumeroTarjeta());
        System.out.println("El Codigo de Seguridad Es:  "+ this.getCcv());
        System.out.println("La Fecha de Vencimiento Es:  "+ this.getFechaVencimiento());
    }
}
