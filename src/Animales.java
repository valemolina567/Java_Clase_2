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
