
package Bean;


public class Calculadora {
    
    private String marca;
    private String color;
    private double peso;
    private double tamano;
    
    public Calculadora(){
        
    }
    
    //METODO DE ACCESO: OBTENER EL VALOR DEL ATRIBUTO
    public String getMarca(){
        return marca;
    }
    
    //METODO DE MODIFICACIÓN: PERMITE CAMBIAR EL VALOR DEL ATRIBUTO
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }    
}
