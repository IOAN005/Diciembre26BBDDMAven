package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;
import com.corenetworks.persistencia.AccesoEmpleados;
import com.corenetworks.persistencia.Conexion;

import java.sql.SQLException;

public class ProbarEmpeados {
    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        Empleado e1 =new Empleado(231,"Ioan","Bobinca",1);
        AccesoEmpleados aE = new AccesoEmpleados();
//       try {
//            c1.abrirConexion();
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        }
        try {
            System.out.println("El empleado ha sido insetado "+ aE.insertar(e1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
