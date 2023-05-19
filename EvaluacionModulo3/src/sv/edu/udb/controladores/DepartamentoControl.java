
package sv.edu.udb.controladores;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sv.edu.udb.entidades.Departamento;
import sv.edu.udb.entidades.Empleado;
import sv.edu.udb.modelo.Conexion;


public class DepartamentoControl {

    public static List<Departamento> listarDepartamentos() {
        List<Departamento> lst = new ArrayList<>();
        String sql = "SELECT * FROM DEPARTAMENTO";
        ResultSet rs = Conexion.ListasRegistros(sql);
        try {
            while (rs.next()) {
                int id = rs.getInt("ID_DEPARTAMENTO");
                String nombre = rs.getString("NOMBRE");
                Departamento dep = new Departamento(id, nombre);
                lst.add(dep);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar las cuentas del usuario");
        }
        return lst;
    }
    
    public static void agregarDepartamento(Departamento dep){
        String query = "INSERT INTO DEPARTAMENTO(NOMBRE) VALUES "
                + "('" + dep.getNombre() + "')";

        int insert = Conexion.actualizarRegistros(query);
        if(insert > 0){
            JOptionPane.showMessageDialog(null, 
            "Departamento registrado exitosamente", "Registro exitoso",
            JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, 
            "Departamento no pudo ser registrado", "Registro fallido",
            JOptionPane.ERROR_MESSAGE);
        }
    }
}
