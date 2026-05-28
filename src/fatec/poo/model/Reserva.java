
package fatec.poo.model;

/**
 *
 * @author Jul1a
 */
public class Reserva {
    
    private int codigo;
    private String nomeHosp;
    private Data dataEntrada;
    private Data dataSaida;
    private double valorHosped;
    private Hotel hotel;

    public Reserva(int codigo, String nomeHosp, Data dataEntrada) {
        this.codigo = codigo;
        this.nomeHosp = nomeHosp;
        this.dataEntrada = dataEntrada;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeHosp() {
        return nomeHosp;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public Data getDataSaida() {
        return dataSaida;
    }

    public double getValorHosped() {
        return valorHosped;
    }
    
    public double encerrarReserva(Data d){
        dataSaida = d;
        return d.calcDiasCorridos()-dataEntrada.calcDiasCorridos()*getValorHosped();
    }
    
}
