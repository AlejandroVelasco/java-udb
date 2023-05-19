package sv.edu.udb.entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.udb.entidades.Estado;
import sv.edu.udb.entidades.Factura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T15:03:29")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, Date> fechaIngreso;
    public static volatile SingularAttribute<Empleado, Estado> idEstado;
    public static volatile SingularAttribute<Empleado, Integer> idEmpleado;
    public static volatile SingularAttribute<Empleado, Date> fechaNacimiento;
    public static volatile SingularAttribute<Empleado, BigDecimal> salario;
    public static volatile ListAttribute<Empleado, Factura> facturaList;
    public static volatile SingularAttribute<Empleado, String> dui;
    public static volatile SingularAttribute<Empleado, String> nombre;

}