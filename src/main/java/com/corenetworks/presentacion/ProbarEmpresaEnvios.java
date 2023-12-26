package com.corenetworks.presentacion;

import com.corenetworks.modelo.EmpresaEnvios;
import com.corenetworks.persistencia.AccesoEmpresaEnvios;

import java.sql.SQLException;

public class ProbarEmpresaEnvios {
    public static void main(String[] args) {


        EmpresaEnvios e1 = new EmpresaEnvios(90, "BUGGATI", "677222222");
        AccesoEmpresaEnvios aEE = new AccesoEmpresaEnvios();
//        try {
//            System.out.println("Añadir empresa nueva " + aEE.insertar(e1));
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//        }
//        try {
//            System.out.println("Modificar telefono de empresa " +aEE.modificar(e1));
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//        }

//        try {
//            System.out.println("Eliminar el id "+aEE.eliminar(90));
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//        }
//        try {
//            System.out.println("consultar una empresa " + aEE.consultarUnaEmpresa(2));
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//        }
        try {
            System.out.println("Consultar todas las empresas" + aEE.consultarTodasEmpresas());
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}