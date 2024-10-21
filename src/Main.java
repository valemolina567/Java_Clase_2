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