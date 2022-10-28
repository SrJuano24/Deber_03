/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03;

/**
 *
 * @author Juano
 */
public class Auto extends Mostrar{
    private String marca;
    private String modelo;
    private String placa;
    private String color;
    private int year;
    private String tipoCombustible;
    private int precio;

    public Auto(String marca, String modelo, String placa, String color, int year, String tipoCombustible, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.year = year;
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    @Override
    public String mostrarInfo() {
       return "las caracteristicas de dicho auto son: marca "+this.getMarca()+
               ", su color es "+this.getColor()+", su numero de placa es "+
               this.getPlaca()+", el tipo de combustible que utiliza es "+
               this.getTipoCombustible()+", su año de fabricacion es "+
               this.getYear()+" y su precio es de "+this.getPrecio()+" dolares";
    }
}
