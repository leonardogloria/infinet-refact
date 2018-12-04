package duplicate;

import java.util.List;

public class AluguelDeCarroV2 {
    private List<Aluguel> alugueis;

    public AluguelDeCarroV2(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
    private Aluguel getAluguel(int id){
        Aluguel aluguelReturn = null ;
        for(Aluguel aluguel: alugueis){
            if(aluguel.getId() == id  ){
                aluguelReturn = aluguel;
            }
        }
        return aluguelReturn;
    }
    public void deleteAluguel(int id){
        alugueis.remove(getAluguel(id));
    }
    public void calculaImposto(int id, float percentual){
        Aluguel aluguel = getAluguel(id);
        System.out.println(aluguel.getValor() * percentual);
    }
    public void atualizaValorDoAluguel(int id, int valor){
        Aluguel aluguel = getAluguel(id);
        aluguel.setValor(valor);
    }



}
