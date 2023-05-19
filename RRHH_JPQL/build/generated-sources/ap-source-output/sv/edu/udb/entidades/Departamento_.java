package sv.edu.udb.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.udb.entidades.Empleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-03T16:13:19")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, Integer> idDepartamento;
    public static volatile SingularAttribute<Departamento, Integer> presupuesto;
    public static volatile ListAttribute<Departamento, Empleado> empleadoList;
    public static volatile SingularAttribute<Departamento, String> nombre;

}