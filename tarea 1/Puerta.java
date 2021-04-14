public class Puerta
{
    String color;
    String material;
    int largoencm;
    int anchoencm;
    
    Puerta(String color, String material, int largoencentimetros, int anchoencentimetros){
        this.color = color;
        this.material = material;
        this.largoencm =largoencentimetros;
        this.anchoencm =anchoencentimetros;
    }
    
    String TocarPuerta(String NombrePersona){
       String TocarPuerta;
       
       TocarPuerta = NombrePersona + " esta tocando la puerta de color " + color + " de " + material; 
       return TocarPuerta;
    }
    
    String PasarPersona(String NombrePersona){
       String PasarPersona;
       PasarPersona = NombrePersona + " esta pasando por la puerta de color " + color + " de " + material;
       return PasarPersona;
    }
    
    String CalcularAreaDePuerta(){
        String Area;
        Area = (largoencm * anchoencm) + " Centimetros cuadrados";
        return Area;
    }
    
    public String getcolor(){
        return color;
    
    }
    
    public void setcolor(String color){
        this.color = color;
    }
    
    public String getmaterial(){
        return material;
    
    }
    
    public void setmaterial(String material){
        this.material = material;
    }
    
    public int getlargoencm(){
        return largoencm;
    
    }
    
    public void setlargoencm(int largoencm){
        this.largoencm = largoencm;
    }
    
    public int getanchoencm(){
        return anchoencm;
    
    }
    
    public void setanchoencm(int anchoencm){
        this.anchoencm = anchoencm;
    }
}
