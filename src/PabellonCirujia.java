public class PabellonCirujia {
    //Atributos
    private int numero;
    private String especialidad;
    private Estado estado;

    //Constructor
    public PabellonCirujia(int numero, String especialidad) {
        this.numero = numero;
        this.especialidad = especialidad;
        this.estado = Estado.DISPONIBLE;
    }

    //Metodo 1
    public int getNumero() {
        return numero;
    }

    //Metodo 2
    public String getEspecialidad() {
        return especialidad;
    }

    //Metodo 3
    public Estado getEstado() {
        return estado;
    }

    //Metodo 4
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //Metodo toString
    public String toString() {
        return numero + "," + especialidad + "," + estado.name().toLowerCase();
    }

    //Metodo equals
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }
        if (otro == null || this.getClass() != otro.getClass()) {
            return false;
        }

        //Casteo
        PabellonCirujia cirugia = (PabellonCirujia) otro;
        return this.numero == cirugia.numero;
    }
}