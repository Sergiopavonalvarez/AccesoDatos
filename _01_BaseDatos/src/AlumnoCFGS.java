import java.io.Serializable;

public class AlumnoCFGS implements Serializable {

    private static final long serialVersionUID = 1L;
    public String nombre;
    public byte edad;
    public byte noGrupo;
    public float alturaAproxEnMetros;
    public boolean juegaEnConsola;
    public long horasEnElLOL;
    public String juegoFavorito;

    public AlumnoCFGS(String s, byte b, byte b1, float alturaMetro, boolean b2, long l, String s1) {
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public byte getNoGrupo() {
        return noGrupo;
    }

    public void setNoGrupo(byte noGrupo) {
        this.noGrupo = noGrupo;
    }

    public float getAlturaAproxEnMetros() {
        return alturaAproxEnMetros;
    }

    public void setAlturaAproxEnMetros(float alturaAproxEnMetros) {
        this.alturaAproxEnMetros = alturaAproxEnMetros;
    }

    public boolean isJuegaEnConsola() {
        return juegaEnConsola;
    }

    public void setJuegaEnConsola(boolean juegaEnConsola) {
        this.juegaEnConsola = juegaEnConsola;
    }

    public long getHorasEnElLOL() {
        return horasEnElLOL;
    }

    public void setHorasEnElLOL(long horasEnElLOL) {
        this.horasEnElLOL = horasEnElLOL;
    }

    public String getJuegoFavorito() {
        return juegoFavorito;
    }

    public void setJuegoFavorito(String juegoFavorito) {
        this.juegoFavorito = juegoFavorito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "AlumnoCFGS{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", noGrupo=" + noGrupo +
                ", alturaAproxEnMetros=" + alturaAproxEnMetros +
                ", juegaEnConsola=" + juegaEnConsola +
                ", horasEnElLOL=" + horasEnElLOL +
                ", juegoFavorito='" + juegoFavorito + '\'' +
                '}';
    }
}
