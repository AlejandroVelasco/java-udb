package sv.edu.udb.controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sv.edu.udb.entidades.Empleado;
import sv.edu.udb.modelo.Conexion;

public class EmpleadoControl {
        
    public static DefaultTableModel cargarTabla(){
        String[] titulos = {"COD", "NOMBRE", "DEPARTAMENTO", "SALARIO"};
        String[] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        try{
            String query = "SELECT E.ID_EMPLEADO, E.NOMBRE, D.NOMBRE AS DEP,"
            + " E.SALARIO FROM EMPLEADO E INNER JOIN DEPARTAMENTO D ON"
            + " E.DEPARTAMENTO = D.ID_DEPARTAMENTO";
            
            ResultSet rs = Conexion.ListasRegistros(query);
 
            while(rs.next()){
                registros[0] = String.valueOf(rs.getInt("ID_EMPLEADO"));
                registros[1] = rs.getString("NOMBRE");
                registros[2] = rs.getString("DEP");
                registros[3] = String.valueOf(rs.getBigDecimal("SALARIO"));
                modelo.addRow(registros);
            }
        }catch (SQLException e){
            System.out.println("Error al cargar datos de la tabla" + e);
        }
        return modelo;
    }
    
    public static void agregarEmpleado(Empleado empleado){
        String query = "INSERT INTO EMPLEADO(NOMBRE,DEPARTAMENTO, SALARIO)"
                + " VALUES ('" + empleado.getNombre() + "'," 
                + empleado.getIdDepartamento()+ ", "
                + empleado.getSalario() + ")";
        int insert = Conexion.actualizarRegistros(query);
        if(insert > 0){
            JOptionPane.showMessageDialog(null, 
            "Empleado registrado exitosamente", "Registro exitoso",
            JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, 
            "Empleado no pudo ser registrado", "Registro fallido",
            JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void modificarEmpleado(Empleado empleado){
         String query = "UPDATE EMPLEADO SET"
                + " NOMBRE = '" + empleado.getNombre() + "'," 
                + " DEPARTAMENTO = " + empleado.getIdDepartamento()+ ", "
                + " SALARIO =" + empleado.getSalario() + " WHERE "
                + " ID_EMPLEADO = " + empleado.getIdEmpleado();
         
        int update = Conexion.actualizarRegistros(query);
        if(update > 0){
            JOptionPane.showMessageDialog(null, 
            "Empleado actualizado exitosamente", "Registro exitoso",
            JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, 
            "Empleado no pudo ser actualizado", "Registro fallido",
            JOptionPane.ERROR_MESSAGE);
        }
    }
    
}