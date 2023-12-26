package com.corenetworks.modelo;

import java.util.Objects;

public class EmpresaEnvios {
    private int idEnvios;
    private String nombreEmpresa;
    private String telefono;

    @Override
    public String toString() {
        return "EmpresaEnvios{" +
                "idEnvios=" + idEnvios +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", telefono='" + telefono + '\'' +
                '}'+'\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpresaEnvios that = (EmpresaEnvios) o;
        return idEnvios == that.idEnvios && Objects.equals(nombreEmpresa, that.nombreEmpresa) && Objects.equals(telefono, that.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEnvios, nombreEmpresa, telefono);
    }

    public EmpresaEnvios() {
    }

    public EmpresaEnvios(int idEnvios, String nombreEmpresa, String telefono) {
        this.idEnvios = idEnvios;
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
    }

    public int getIdEnvios() {
        return idEnvios;
    }

    public void setIdEnvios(int idEnvios) {
        this.idEnvios = idEnvios;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
