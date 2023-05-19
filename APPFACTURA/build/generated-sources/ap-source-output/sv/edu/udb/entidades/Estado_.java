package sv.edu.udb.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.udb.entidades.Empleado;
import sv.edu.udb.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T15:03:29")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, String> descripcion;
    public static volatile SingularAttribute<Estado, Integer> idEstado;
    public static volatile ListAttribute<Estado, Usuario> usuarioList;
    public static volatile ListAttribute<Estado, Empleado> empleadoList;

}