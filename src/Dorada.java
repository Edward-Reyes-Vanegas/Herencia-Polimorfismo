import java.time.LocalDate;

public class Dorada extends TarjetaCredito
{
    private String tipoTarjeta;

    public Dorada(String emisor, long cupo, String numeroTarjeta, int ccv, LocalDate fechaVencimiento, String tipoTarjeta)
    {
        super(emisor, cupo, numeroTarjeta, ccv, fechaVencimiento);
        this.tipoTarjeta = tipoTarjeta;
    }

    @Override
    public void imprimir()
    {

        System.out.println("ESTA ES LA INFORMACION DE SU TARJETA DE CREDITO\n");
        System.out.println("El Tipo de Tarjeta Es:  "+ this.tipoTarjeta);
        System.out.println("El Emisor Es:  "+ this.getEmisor());
        System.out.println("El Cupo Asignado Es:  "+ this.getCupo());
        System.out.println("El Numero de Tarjeta  Es:  "+ this.getNumeroTarjeta());
        System.out.println("El Codigo de Seguridad Es:  "+ this.getCcv());
        System.out.println("La Fecha de Vencimiento Es:  "+ this.getFechaVencimiento());
    }

}
