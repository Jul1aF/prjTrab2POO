
package fatec.poo.model;

/**
 *
 * @author Jul1a
 */
public class Data {
    
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    public String obterData(){
        return (dia + "/" + mes + "/" + ano );
    }
    
    public int calcDiasCorridos(){
        
        int aux;
            switch (mes) {
    case 1:
        aux = 0;
        break;
    case 2:
        aux = 31;
        break;
    case 3:
        aux = 59;   // 31 + 28
        break;
    case 4:
        aux = 90;   // 31 + 28 + 31
        break;
    case 5:
        aux = 120;  // 31 + 28 + 31 + 30
        break;
    case 6:
        aux = 151;
        break;
    case 7:
        aux = 181;
        break;
    case 8:
        aux = 212;
        break;
    case 9:
        aux = 243;
        break;
    case 10:
        aux = 273;
        break;
    case 11:
        aux = 304;
        break;
    case 12:
        aux = 334;
        break;
    default:
        aux = -1; // mês inválido
}
            
            if (ano % 4 == 0){
                aux +=1;
            }
            
            return (int) (((ano-1)-1900)*365.25)+aux+dia;

    }
    
    public int subtrairDatas(Data d){
       return d.calcDiasCorridos()-calcDiasCorridos();
    }
    
}
