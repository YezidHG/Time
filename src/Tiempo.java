
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
public class Tiempo {
    
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public void setHora(int horas){
        this.hora = horas;
    }
    public void setMinutos(int minuto){
        this.minutos = minuto;
    }
    public void setSegundos(int segundo){
        this.segundos = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    } 
    
    public void datos(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la hora");
        this.setHora(scanner.nextInt());
        while(this.hora< 0 || this.hora > 23){
            System.out.println("Ingrese una hora válida");
            this.setHora(scanner.nextInt());
        }        
        
        System.out.println("Ingrese los minutos");
        this.setMinutos(scanner.nextInt());
        while(this.minutos< 0 || this.minutos > 59){
            System.out.println("Ingrese los minutos");
            this.setMinutos(scanner.nextInt());
        }      
        
        System.out.println("Ingrese los segundos");
        this.setSegundos(scanner.nextInt());
        while(this.segundos< 0 || this.segundos > 59){
            System.out.println("Ingrese los segundos");
            this.setSegundos(scanner.nextInt());
        }
    }        

    public void tiempoTranscurrido(){
        this.setSegundos(segundos+1);
        if(this.segundos == 60){
            this.setSegundos(00);
            this.setMinutos(minutos+1);
            if(this.minutos == 60){
                this.setMinutos(00);
                this.setHora(hora+1);
                if(this.hora == 24){
                    this.setHora(00);
                }
            }
        }
    }
    
    public String retornarTiempo(){
        return "La hora es: "+hora+":"+minutos+":"+segundos;
    }
    
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo(0,0,0);
        tiempo.datos();
        tiempo.tiempoTranscurrido();
        
        System.out.println(tiempo.retornarTiempo());
    }
}
