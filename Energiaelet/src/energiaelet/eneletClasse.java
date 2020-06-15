package energiaelet;

import javax.swing.JOptionPane;

public class eneletClasse {
    private int leitAtual;
    private int leitAnterior;
    private float gasto;
    private float tusd;
    private float te;    
    private float icms;
    private float acrescimo;
    private float total;
    private String band;
    private float valorTotal;
    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }
    
        
    public int getLeitAtual() {
        return leitAtual;
    }

    public void setLeitAtual(int leitAtual) {
        this.leitAtual = leitAtual;
    }

    public int getLeitAnterior() {
        return leitAnterior;
    }

    public void setLeitAnterior(int leitAnterior) {
        this.leitAnterior = leitAnterior;
    }
    public float getGasto() {
        return gasto;
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }
    public float getTusd() {
        return tusd;
    }

    public void setTusd(float tusd) {
        this.tusd = tusd;
    }

    public float getTe() {
        return te;
    }

    public void setTe(float te) {
        this.te = te;
    }

    public float getIcms() {
        return icms;
    }

    public void setIcms(float icms) {
        this.icms = icms;
    }

    public float getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(float acrescimo) {
        this.acrescimo = acrescimo;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public float gasto(int leitAtual, int leitAnterior){
        this.gasto = this.leitAtual - this.leitAnterior;
        return this.gasto;
    } 
    
    public float tusd(float gasto){
       this.tusd = this.gasto * 3;
       this.tusd = this.tusd / 10;
       return this.tusd;
    }
    
    public float te(float gasto){
       this.te = this.gasto * 29;
       this.te = this.te / 100;
       return this.te;
    }  
    
    public float total(float tusd, float te){
        this.total = this.tusd + this.te;
        return this.total;
    }
    
    public float calcIcms(float icms, float total){

        this.icms = this.total * 25;
        this.icms = this.icms / 100;
        this.icms = this.icms + this.total;
        return this.icms;
    }
    
    public String band(float gasto){
        if(this.gasto <= 100){
            this.band = "Verde";
        } else if(this.gasto > 100 && this.gasto <= 150){
            this.band = "Amarela";
        } else if(this.gasto > 150 && this.gasto <= 200){
            this.band= "Vermelha 1°Patamar";
        } else{
            this.band = "Vermelha 2°Patamar";
        }
        return this.band;
    }
    public float acrescimo(String band, float icms){
        if ("Verde".equals(this.band)){
           this.acrescimo = 1;
        }else if ("Amarela".equals(this.band)){
            this.acrescimo = 1343;
            this.acrescimo = this.acrescimo / 100000;
        } else if ("Vermelha".equals(this.band)){
            this.acrescimo = 4169;
            this.acrescimo = this.acrescimo / 100000;
        } else{
            this.acrescimo = 6243;
            this.acrescimo = this.acrescimo / 100000;
        }
        return this.acrescimo;
    } 
    public float bandCalc(String band, float icms){
        
        this.valorTotal = this.icms * this.acrescimo;
        this.valorTotal = this.valorTotal + this.icms;
        
        return this.valorTotal;
    }  

    public void contaLuz(float gasto, float tusd, float te, float icms, float acrescimo, float valorTotal, String band) {
        JOptionPane.showMessageDialog(null,"Conta de Luz: "
        +"\nGasto: "
        +this.gasto + " Kw/h"
        +"\nTusd: " + "R$ "
        +this.tusd
        +"\nTE: " + "R$ "
        +this.te
        +"\nICMS: " + "R$ "
        +this.icms
        +"\nAcréscimo: " + "R$ "
        +this.acrescimo 
        +"\nBandeira: "
        +this.band 
        +"\nValor total: " + "R$ "
        +Math.round(this.valorTotal));
    }
     
}
