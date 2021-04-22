public class Main {

    public static void main(String[] args) {

        Persona sebastian = new Persona("Sebas", 20);
        Persona clone = sebastian.clone();
        clone.setNombre("Sebas clone");

        if(clone.equals(sebastian)){
            System.out.println("Tenemos la misma información");
        }
    }
}
