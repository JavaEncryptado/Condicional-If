package main;

public class TemaIf {

    public static void main(String[] args) {
        //ESTRUCTURA DE CONTROL CONDICIONAL "IF"
        int edad = 13;
        if (edad > 3 && edad < 13) {
            System.out.println("Eres un nino");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Eres un Adolescente");
        } else if (edad >= 18 && edad <= 24) {
            System.out.println("Eres un Joven");
        } else if (edad >= 25 && edad <= 29) {
            System.out.println("Eres un Adulto Joven");
        } else if (edad >= 30 && edad <= 65) {
            System.out.println("Eres un Adulto");
        } else if (edad >= 66 && edad <= 110) {
            System.out.println("Eres un Anciano / Tercera Edad");
        }      
        else {
            System.out.println("Edad incorrecta");
        }
    }
}
