package com.corenetworks.persistencia;

import com.corenetworks.modelo.EmpresaEnvios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoEmpresaEnvios extends Conexion {
    public boolean insertar(EmpresaEnvios e) throws SQLException, ClassNotFoundException {
        //1.declarar variable
        PreparedStatement sentencia;
        int resultado = 0;
        String sql = "insert into  shippers (shipper_id,company_name,phone) values (?,?,?)";
        //2Abrir conexion
        abrirConexion();
        //3.Crear el statment
        sentencia = miConexion.prepareStatement(sql);
        //3a Dar valor a los parametros
        sentencia.setInt(1, e.getIdEnvios());
        sentencia.setString(2, e.getNombreEmpresa());
        sentencia.setString(3, e.getTelefono());


        //4.Actualizar
        resultado = sentencia.executeUpdate();
        //5.Devolver el resultado
        return resultado > 0;
    }

    //CRear un metodo para modificar el telefono
    public boolean modificar(EmpresaEnvios e) throws SQLException, ClassNotFoundException {
        //1.Declarar variables
        PreparedStatement sentencia;
        int resultado = 0;
        String sql = " update  shippers set phone =? where shipper_id= ?;";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.prepareStatement(sql);
        //3A insertar datos
        sentencia.setInt(2, e.getIdEnvios());
        sentencia.setString(1, e.getTelefono());


        //4. Modificar
        resultado = sentencia.executeUpdate();
        //5. Devolver el resultado
        return resultado > 0;
    }

//    public boolean eliminar(int id) throws SQLException, ClassNotFoundException {
//        Statement sentencia;
//        int resultado = 0;
//        String sql = " delete from public.shippers where shipper_id=" + id;
//        abrirConexion();
//        sentencia = miConexion.createStatement();
//        resultado = sentencia.executeUpdate(sql);
//        return resultado > 0;
//    }
    public boolean eliminar(int id) throws SQLException, ClassNotFoundException {
        //1. Declarar variables
        PreparedStatement sentencia;
        int resultado = 0;
        String sql = "delete from shippers where shipper_id = ?;";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el statement
        sentencia = miConexion.prepareStatement(sql);
        //3a dar valor a los parámetros
        sentencia.setInt(1, id);
        //4. Actualizar
        resultado = sentencia.executeUpdate();
        //5. Devolver el resultado
        return resultado > 0;
    }
    public EmpresaEnvios consultarUnaEmpresa(int id) throws SQLException, ClassNotFoundException {
        //1. Declarar variables
        PreparedStatement sentencia;
        EmpresaEnvios resultado=null;
        String sql = "Select shipper_id, Company_name, phone from shippers where shipper_id = ?;";
        ResultSet rejilla = null;
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el statement
        sentencia = miConexion.prepareStatement(sql);
        //3a dar valor a los parámetros
        sentencia.setInt(1,id);
        //4. Actualizar
        rejilla = sentencia.executeQuery();
        if(rejilla.next()){
            resultado = new EmpresaEnvios(rejilla.getInt("shipper_id")
                    ,rejilla.getString("Company_name")
                    ,rejilla.getString("phone"));
        }
        //5. Devolver el resultado
        return resultado;
    }
    public List<EmpresaEnvios> consultarTodasEmpresas() throws SQLException, ClassNotFoundException {
        //1. Declarar variables
        Statement sentencia;
        List<EmpresaEnvios> resultado= new ArrayList<>();
        String sql = "Select shipper_id, Company_name, phone from shippers";
        ResultSet rejilla = null;
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el statement
        sentencia = miConexion.createStatement();

        //4. Actualizar
        rejilla = sentencia.executeQuery(sql);
        while(rejilla.next()){
            resultado.add( new EmpresaEnvios(rejilla.getInt("shipper_id")
                    ,rejilla.getString("Company_name")
                    ,rejilla.getString("phone")));
        }
        //5. Devolver el resultado
        return resultado;
    }
    }

