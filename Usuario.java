import java.time.LocalDate;
import java.util.Objects;

public class Usuario {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private LocalDate fechaNacimiento;
    private String pass;
    private boolean activo;


    public Usuario(String dni, String nombre, String apellidos, String direccion, String telefono, String correoElectronico, LocalDate fechaNacimiento, String pass, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.pass = pass;
        this.activo = activo;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return activo == usuario.activo && Objects.equals(dni, usuario.dni) && Objects.equals(nombre, usuario.nombre) && Objects.equals(apellidos, usuario.apellidos) && Objects.equals(direccion, usuario.direccion) && Objects.equals(telefono, usuario.telefono) && Objects.equals(correoElectronico, usuario.correoElectronico) && Objects.equals(fechaNacimiento, usuario.fechaNacimiento) && Objects.equals(pass, usuario.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellidos, direccion, telefono, correoElectronico, fechaNacimiento, pass, activo);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", pass='" + pass + '\'' +
                ", activo=" + activo +
                '}';
    }
}
