public class MiObjecto {
    
    private int valor;
    
    public MiObjecto(int valorInicial){
        this.valor=valor_inicial
    }
    
    public void getValor(){
        return this.valor;
    }
    
    public int setValor(int nuevoValor){ // 99% de cuestras funciones get y set
        //if(nuevoValor < 0) throw new Exception("Valor RUINOSO !!!!"); // Dia 100
        this.valor=nuevoValor;
    }
    
}

public class App {
    public static void main(String[] args) {
        MiObjeto mo = new MiObjeto(3);
        System.out.println(mo.getValor());
        mo.getValor(7);
        System.out.println(mo.getValor());
    }
}