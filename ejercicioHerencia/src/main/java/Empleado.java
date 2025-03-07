public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;

    public Empleado(String nombre, int par) {
        super(nombre);
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    

    @Override
    public String toString() {
        return  super.toString() + "idEmpleado: " + idEmpleado + ", sueldo: " + sueldo;
    }

    
    
    
    
}
