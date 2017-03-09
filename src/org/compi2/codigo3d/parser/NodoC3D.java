package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones. Cuenta con un
 * único atributo de tipo String, pero pueden agregársele los atributos que se
 * consideren necesarios.
 *
 * @author esvux
 */
public class NodoC3D {

    private String cad;
    private String lv;
    private String lf;
    private String c3d;

    public NodoC3D(String cad) {
        this.cad = cad;
        this.lv = "";
        this.lf = "";
        this.c3d = "";
    }

    public NodoC3D(String lv, String lf) {
        this.lv = lv;
        this.lf = lf;
    }

    public NodoC3D(String cad, String lv, String lf, String c3d) {
        this.cad = cad != null ? cad : "";
        this.lv = lv != null ? lv : "";
        this.lf = lf != null ? lf : "";
        this.c3d = c3d != null ? c3d : "";
    }

    public String getCad() {
        return cad;
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    public String getLf() {
        return lf;
    }

    public void setLf(String lf) {
        this.lf = lf;
    }

    public String getC3d() {
        return c3d;
    }

    public void setC3d(String c3d) {
        this.c3d = c3d;
    }

}
