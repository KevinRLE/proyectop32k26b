/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Meilyn Juleisy Garcia Lima 9959-13-17838
 */
public class clsPerfil {
    private int percodigo;
    private String pernombre;
    private String perestado;

    public clsPerfil() {
    }

    public clsPerfil(int perCodigo) {
        this.percodigo = perCodigo;
    }

    public clsPerfil(String perNombre, String perEstado) {
        this.pernombre = perNombre;
        this.perestado = perEstado;
    }

    public clsPerfil(int perCodigo, String perNombre, String perEstado) {
        this.percodigo = perCodigo;
        this.pernombre = perNombre;
        this.perestado = perEstado;
    }

    public int getPerCodigo() {
        return percodigo;
    }

    public void setPerCodigo(int perCodigo) {
        this.percodigo = perCodigo;
    }

    public String getPerNombre() {
        return pernombre;
    }

    public void setPerNombre(String perNombre) {
        this.pernombre = perNombre;
    }

    public String getPerEstado() {
        return perestado;
    }

    public void setPerEstado(String perEstado) {
        this.perestado = perEstado;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "perCodigo=" + percodigo +
                ", perNombre=" + pernombre +
                ", perEstado=" + perestado +
                '}';
    }
}
