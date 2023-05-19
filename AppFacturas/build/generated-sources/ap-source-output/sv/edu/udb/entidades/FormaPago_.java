package sv.edu.udb.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.udb.entidades.Factura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T10:29:42")
@StaticMetamodel(FormaPago.class)
public class FormaPago_ { 

    public static volatile SingularAttribute<FormaPago, String> descripcion;
    public static volatile SingularAttribute<FormaPago, Integer> idFormaPago;
    public static volatile ListAttribute<FormaPago, Factura> facturaList;

}