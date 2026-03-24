package Controlador;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *Karina Alejandra Arriaza Ortiz 9959-24-14190
 * @author VA
 */
public class clsAsignacionAplicacionUsuario {

     // Llaves primaria/foránea
    private int Aplcodigo;
    private int Usucodigo;

    // Permisos de la aplicación (varchar(1))
    private String APLUins;
    private String APLUsel;
    private String APLUupd;
    private String APLUdel;
    private String APLUrep;
    
    // Constructor vacío
    public clsAsignacionAplicacionUsuario() {
    }

    // Constructor con todos los atributos
    public clsAsignacionAplicacionUsuario(int Aplcodigo, int Usucodigo, String APLUins, String APLUsel, String APLUupd, String APLUdel, String APLUrep) {
        this.Aplcodigo = Aplcodigo;
        this.Usucodigo = Usucodigo;
        this.APLUins = APLUins;
        this.APLUsel = APLUsel;
        this.APLUupd = APLUupd;
        this.APLUdel = APLUdel;
        this.APLUrep = APLUrep;
    }

    // GET Y SET
    
    public int getAplcodigo() {
        return Aplcodigo;
    }

    public void setAplcodigo(int Aplcodigo) {
        this.Aplcodigo = Aplcodigo;
    }

    public int getUsucodigo() {
        return Usucodigo;
    }

    public void setUsucodigo(int Usucodigo) {
        this.Usucodigo = Usucodigo;
    }

    public String getAPLUins() {
        return APLUins;
    }

    public void setAPLUins(String APLUins) {
        this.APLUins = APLUins;
    }

    public String getAPLUsel() {
        return APLUsel;
    }

    public void setAPLUsel(String APLUsel) {
        this.APLUsel = APLUsel;
    }

    public String getAPLUupd() {
        return APLUupd;
    }

    public void setAPLUupd(String APLUupd) {
        this.APLUupd = APLUupd;
    }

    public String getAPLUdel() {
        return APLUdel;
    }

    public void setAPLUdel(String APLUdel) {
        this.APLUdel = APLUdel;
    }

    public String getAPLUrep() {
        return APLUrep;
    }

    public void setAPLUrep(String APLUrep) {
        this.APLUrep = APLUrep;
    }

    public clsBitacora generarBitacora(String accion) {

        clsBitacora bitacora = new clsBitacora();

        // Usuario conectado
        bitacora.setUsucodigo(clsUsuarioConectado.getUsuId());
        bitacora.setAplcodigo(this.Aplcodigo);

        // Fecha en formato String
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        bitacora.setBitfecha(ahora.format(formato));

        // Datos básicos
        bitacora.setBitip("127.0.0.1");
        bitacora.setBitequipo("PC");

        // Acción
        bitacora.setBitaccion(accion);

        return bitacora;
    }

    @Override
    public String toString() {
        return "AsignacionAplicacionUsuario{" +
                "Aplcodigo=" + Aplcodigo +
                ", Usucodigo=" + Usucodigo +
                ", APLUins='" + APLUins + '\'' +
                ", APLUsel='" + APLUsel + '\'' +
                ", APLUupd='" + APLUupd + '\'' +
                ", APLUdel='" + APLUdel + '\'' +
                ", APLUrep='" + APLUrep + '\'' +
                '}';
    }
}
