
package fatec.poo.model;

/**
 *
 * @author Jul1a
 */
public class Hotel {
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private double valorDiaria;
    private double totalFaturamento;
    private Reserva[] reservas;
    private int numReserv;
    
    public void addReserva(Reserva r){
        reservas[numReserv]= r;
        numReserv++;
    }

    public Hotel(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }
    
    public void addValorHospedagem(double valor){
    valor += valor;
    }
    
  
}
