package com.iescamp.PROYECTO;
import java.time.LocalDate;
import java.util.Objects;

public class Cliente extends Usuario{

    private String direccionEnvio;
    private float saldoCuenta;
    private boolean tarjetaFidelidad;
    private int numerosPedidosRealizados;
    private MetodoPago metodoPago;



    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "direccionEnvio='" + direccionEnvio + '\'' +
                ", saldoCuenta=" + saldoCuenta +
                ", tarjetaFidelidad=" + tarjetaFidelidad +
                ", numerosPedidosRealizados=" + numerosPedidosRealizados +
                ", metodoPago=" + metodoPago +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return Float.compare(saldoCuenta, cliente.saldoCuenta) == 0 && tarjetaFidelidad == cliente.tarjetaFidelidad && numerosPedidosRealizados == cliente.numerosPedidosRealizados && Objects.equals(direccionEnvio, cliente.direccionEnvio) && Objects.equals(metodoPago, cliente.metodoPago);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), direccionEnvio, saldoCuenta, tarjetaFidelidad, numerosPedidosRealizados, metodoPago);
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Cliente(String dni, String nombre, String apellidos, String direccion, String telefono, String correoElectronico, LocalDate fechaNacimiento, String pass, boolean activo, String direccionEnvio, float saldoCuenta, boolean tarjetaFidelidad, int numerosPedidosRealizados, MetodoPago metodoPago) {
        super(dni, nombre, apellidos, direccion, telefono, correoElectronico, fechaNacimiento, pass, activo);
        this.direccionEnvio = direccionEnvio;
        this.saldoCuenta = saldoCuenta;
        this.tarjetaFidelidad = tarjetaFidelidad;
        this.numerosPedidosRealizados = numerosPedidosRealizados;
        this.metodoPago = metodoPago;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public float getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(float saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public boolean isTarjetaFidelidad() {
        return tarjetaFidelidad;
    }

    public void setTarjetaFidelidad(boolean tarjetaFidelidad) {
        this.tarjetaFidelidad = tarjetaFidelidad;
    }

    public int getNumerosPedidosRealizados() {
        return numerosPedidosRealizados;
    }

    public void setNumerosPedidosRealizados(int numerosPedidosRealizados) {
        this.numerosPedidosRealizados = numerosPedidosRealizados;
    }








}
