import java.io.Serializable;

public class Estudiantes implements Serializable {
    private static final long serialVersionUID = 1L;
    //creamos las variables
    private String codigo;
    private String cedula;
    private String nombres;
    private String Apellidos;
    private String Signo;
    private String fechaN;
    private String color;
    private String estadoCV;

//creamos el constructor

    public Estudiantes(String codigo, String cedula, String nombres, String apellidos, String signo, String fechaN,String color, String estadoCV) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombres = nombres;
       this. Apellidos = apellidos;
       this. Signo = signo;
        this.fechaN = fechaN;
        this.color = color;
        this.estadoCV = estadoCV;
    }
//creamos los setters y getters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getSigno() {
        return Signo;
    }

    public void setSigno(String signo) {
        Signo = signo;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstadoCV() {
        return estadoCV;
    }

    public void setEstadoCV(String estadoCV) {
        this.estadoCV = estadoCV;
    }

    public String toString(){
        return "CÓDIGO: " + codigo+ "\nCÉDULA: " + cedula+ "\nNOMBRES: " + nombres+ "\nAPELLIDO: " + Apellidos+ "\nSIGNO: " + Signo+ "\nFECHAN: " + fechaN+  "\nCOLOR: " + color+ "\nESTADOCV: " + estadoCV;
    }
}
