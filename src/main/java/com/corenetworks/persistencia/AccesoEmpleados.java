package com.corenetworks.persistencia;

import com.corenetworks.modelo.Empleado;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccesoEmpleados extends Conexion {
    public boolean insertar(Empleado e) throws SQLException, ClassNotFoundException {
        //1.declarar variable
        PreparedStatement sentencia;
        int resultado = 0;
        String sql = "insert into employees (employee_id, last_name,first_name,reports_to ) values (?,?, ?,?);";
        //2Abrir conexion
        abrirConexion();
        //3.Crear el statment
        sentencia = miConexion.prepareStatement(sql);
        //3a Dar valor a los parametros
        sentencia.setInt(1, e.getIdEmpleado());
        sentencia.setString(2, e.getApellido());
        sentencia.setString(3, e.getNombre());
        sentencia.setInt(4, e.getJefe());

        //4.Actualizar
        resultado = sentencia.executeUpdate();
        //5.Devolver el resultado
        return resultado > 0;
    }
}