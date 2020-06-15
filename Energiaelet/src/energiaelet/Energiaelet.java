package energiaelet;

import javax.swing.JOptionPane;

public class Energiaelet {

    public static void main(String[] args) {
        eneletClasse conteudo = new eneletClasse();
        
        conteudo.setLeitAtual(Integer.parseInt(JOptionPane.showInputDialog("Digite a leitura atual: ")));
        conteudo.setLeitAnterior(Integer.parseInt(JOptionPane.showInputDialog("Digite a leitura anterior: ")));
        
        conteudo.gasto(conteudo.getLeitAtual(),conteudo.getLeitAnterior());
        conteudo.tusd(conteudo.getGasto());
        conteudo.te(conteudo.getGasto());
        conteudo.total(conteudo.getTusd(), conteudo.getTe());
        conteudo.calcIcms(conteudo.getTotal(), conteudo.getIcms());
        
        conteudo.band(conteudo.getGasto());
        conteudo.acrescimo(conteudo.getBand(), conteudo.getIcms());
        conteudo.bandCalc(conteudo.getBand(), conteudo.getIcms());
        conteudo.contaLuz(conteudo.getGasto(),conteudo.getTusd(),conteudo.getTe(),conteudo.getIcms(),conteudo.getAcrescimo(),conteudo.getValorTotal(),conteudo.getBand());
    }
    
}
