import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        long aleatorio;
        String numeroTarjeta;
        LocalDate date;
        aleatorio=(long)(Math.random()*10000000+1);
        numeroTarjeta=Long.toString(aleatorio);
        date=LocalDate.now();

        //creando Tarjetas de Credito.
        TarjetaCredito clasica= new Clasica("Visa", 1000000, numeroTarjeta, 258, date, "Clasica");

        date=LocalDate.now();
        aleatorio=(long)(Math.random()*10000000+1);
        numeroTarjeta=Long.toString(aleatorio);
        TarjetaCredito dorada= new Dorada("Master Card", 800000, numeroTarjeta, 874, date, "Dorada");

        date=LocalDate.now();
        aleatorio=(long)(Math.random()*10000000+1);
        numeroTarjeta=Long.toString(aleatorio);
        TarjetaCredito platinum= new Platinum("American Express", 2000000, numeroTarjeta, 140, date, "Platinum");


        date=LocalDate.now();
        aleatorio=(long)(Math.random()*10000000+1);
        numeroTarjeta=Long.toString(aleatorio);
        TarjetaCredito black= new Black("American Express", 100000000, numeroTarjeta, 577, date, "Black");

        //Imprimiendo informacion de las Cuentas.
        clasica.imprimir();
        System.out.println("\n");
        dorada.imprimir();
        System.out.println("\n");
        platinum.imprimir();
        System.out.println("\n");
        black.imprimir();


    }
}