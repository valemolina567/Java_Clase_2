//Main
public class Main {
    public static void main(String[] args){
        Animales perro=new Animales();
        perro.tipo_animal = "Perro";
        perro.raza = "Shi-tzu";
        perro.n_animales = 1; //El molde dice negro, pero el cambio en main dice blanco
        perro.domestico_salvaje = "Domestico";
        perro.peso = 6.9;
        perro.edad = 5;

        System.out.println(perro.detalle()); //Imprimir concatenado 1 sola linea
        perro.detalle(); //Imprimir en varias lineas
    }
}
//Animales
public class Animales {
    String tipo_animal;
    String raza;
    Integer n_animales;
    String domestico_salvaje;
    Double peso;
    Integer edad;

    public void detalle(){
        System.out.println("El tipo de animal es: "+this.tipo_animal);
        System.out.println("La raza del animal es: " + this.raza);
        System.out.println("El número de animales es: " + this.n_animales);
        System.out.println("El animal es: "+this.domestico_salvaje);
        System.out.println("El peso del animal es: " + this.peso);
        System.out.println("La edad del animal es: " + this.edad);
    }

    public String detalle(){
    StringBuilder sb = new StringBuilder();
    sb.append(" El tipo de animal es: " + this.tipo_animal);
    sb.append(" La raza del animal es: " + this.raza);
    sb.append(" El número de animales es: " + this.n_animales);
    sb.append(" El animal es: " + this.domestico_salvaje);
    sb.append(" El peso del animal es: " + this.peso);
    sb.append(" La edad del animal es: " + this.edad);
    return sb.toString();
    }
}
