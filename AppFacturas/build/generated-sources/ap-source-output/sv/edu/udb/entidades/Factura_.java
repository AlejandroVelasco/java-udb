package sv.edu.udb.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.udb.entidades.Cliente;
import sv.edu.udb.entidades.DetalleFactura;
import sv.edu.udb.entidades.Empleado;
import sv.edu.udb.entidades.FormaPago;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T10:29:41")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile SingularAttribute<Factura, FormaPago> idFormaPago;
    public static volatile SingularAttribute<Factura, Cliente> idCliente;
    public static volatile SingularAttribute<Factura, Empleado> idEmpleado;
    public static volatile SingularAttribute<Factura, Integer> idFactura;
    public static volatile ListAttribute<Factura, DetalleFactura> detalleFacturaList;

}