public class Persona implements Cloneable {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(Persona personaParametro){
        this.nombre = personaParametro.nombre;
        this.edad = personaParametro.edad;
    }

    @Override
    protected Persona clone() {
        return new Persona(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Persona)){
            return false;
        }
        Persona persona = (Persona) obj;
        return  this.nombre.equals(persona.nombre) &&
                this.edad == persona.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
