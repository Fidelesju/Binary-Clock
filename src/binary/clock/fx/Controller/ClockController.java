/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.clock.fx.Controller;

import java.awt.Color;
import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


/**
 * FXML Controller class
 *
 * @author Julia Fideles
 */
public class ClockController implements Initializable {

    @FXML
    private Button btnHours1;
    @FXML
    private Button btnMinutes1;
    @FXML
    private Button btnHours2;
    @FXML
    private Button btnHours3;
    @FXML
    private Button btnMinutes2;
    @FXML
    private Button btnHours4;
    @FXML
    private Button btnHours5;
    @FXML
    private Button btnMinutes3;
    @FXML
    private Button btnMinutes4;
    @FXML
    private Button btnMinutes5;
    @FXML
    private Button btnMinutes6;
    @FXML
    private Button btnSeconds1;
    @FXML
    private Button btnSeconds2;
    @FXML
    private Button btnSeconds3;
    @FXML
    private Button btnSeconds4;
    @FXML
    private Button btnSeconds5;
    @FXML
    private Button btnSeconds6;


    /**
     * Initializes the controller class.
     */
    
    //Criando variaveis
    int seconds = 0, minutes = 1, hours = 1;
    boolean[] positionsSeconds = new boolean[6];
    boolean[] positionsMinutes = new boolean[6];
    boolean[] positionsHours = new boolean[5];
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {  
        Thread t = new Thread(()->{
          Score();   
        });
        t.start();
        
    }   
    public void VerificationSeconds(){
        //Segundos casa 6
        if (positionsSeconds[0] == true) {
            btnSeconds6.setStyle("-fx-background-color: #ff0000");
        } else{
            btnSeconds6.setStyle("-fx-background-color: #808080");
        }
        //Segundos casa 5
        if (positionsSeconds[1] == true) {
            btnSeconds5.setStyle("-fx-background-color: #ff0000");
        } else{
            btnSeconds5.setStyle("-fx-background-color: #808080");
        }
        //Segundos casa 4
        if (positionsSeconds[2] == true) {
            btnSeconds4.setStyle("-fx-background-color: #ff0000");
        } else{
            btnSeconds4.setStyle("-fx-background-color: #808080");
        }
        //Segundos casa 3
        if (positionsSeconds[3] == true) {
            btnSeconds3.setStyle("-fx-background-color: #ff0000");
        } else{
            btnSeconds3.setStyle("-fx-background-color: #808080");
        }
        //Segundos casa 2
        if (positionsSeconds[4] == true) {
            btnSeconds2.setStyle("-fx-background-color: #ff0000");
        } else{
            btnSeconds2.setStyle("-fx-background-color: #808080");
        }
        //Segundos casa 1
        if (positionsSeconds[5] == true) {
            btnSeconds1.setStyle("-fx-background-color: #ff0000");
        } else{
            btnSeconds1.setStyle("-fx-background-color: #808080");
        }
        
    }
    
    public void VerificationMinutes(){
        //Minutos casa 6
        if (positionsMinutes[0] == true) {
            btnMinutes6.setStyle("-fx-background-color: #ff0000");
        } else{
            btnMinutes6.setStyle("-fx-background-color: #808080");
        }
        //Minutos casa 5
        if (positionsMinutes[1] == true) {
            btnMinutes5.setStyle("-fx-background-color: #ff0000");
        } else{
            btnMinutes5.setStyle("-fx-background-color: #808080");
        }
        //Minutos casa 4
        if (positionsMinutes[2] == true) {
            btnMinutes4.setStyle("-fx-background-color: #ff0000");
        } else{
            btnMinutes4.setStyle("-fx-background-color: #808080");
        }
        //Minutos casa 3
        if (positionsMinutes[3] == true) {
            btnMinutes3.setStyle("-fx-background-color: #ff0000");
        } else{
            btnMinutes3.setStyle("-fx-background-color: #808080");
        }
        //Minutos casa 2
        if (positionsMinutes[4] == true) {
            btnMinutes2.setStyle("-fx-background-color: #ff0000");
        } else{
            btnMinutes2.setStyle("-fx-background-color: #808080");
        }
        //Minutos casa 1
        if (positionsMinutes[5] == true) {
            btnMinutes1.setStyle("-fx-background-color: #ff0000");
        } else{
            btnMinutes1.setStyle("-fx-background-color: #808080");
        }    
    }
    
    public void VerificationHours(){
        //Horas casa 5
        if (positionsHours[0] == true) {
            btnHours5.setStyle("-fx-background-color: #ff0000");
        } else{
            btnHours5.setStyle("-fx-background-color: #808080");
        }
        //Horas casa 4
        if (positionsHours[1] == true) {
            btnHours4.setStyle("-fx-background-color: #ff0000");
        } else{
            btnHours4.setStyle("-fx-background-color: #808080");
        }
        //Horas casa 3
        if (positionsHours[2] == true) {
            btnHours3.setStyle("-fx-background-color: #ff0000");
        } else{
            btnHours3.setStyle("-fx-background-color: #808080");
        }
        //Horas casa 2
        if (positionsHours[3] == true) {
            btnHours2.setStyle("-fx-background-color: #ff0000");
        } else{
            btnHours2.setStyle("-fx-background-color: #808080");
        }
        //Horas casa 1
        if (positionsHours[4] == true) {
            btnHours1.setStyle("-fx-background-color: #ff0000");
        } else{
            btnHours1.setStyle("-fx-background-color: #808080");
        }
         
    }
     
    public void Score(){
        while (true) {   
            //Contagem dos segundos
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Segundos: " + seconds);
            for (int i = 0; i < 6; i++) {
                positionsSeconds[i] = (((seconds >> i)&0x1)==1);
                
            }
            for (int i = 5; i >=0; i--) {   
               VerificationSeconds();
                System.out.print(positionsSeconds[i]?1:0);
            }
            System.out.println();
            seconds++;
            seconds = seconds!=60?seconds:0;
            
            //Contagem dos minutos
            if(seconds == 59){
               
                System.out.println("Minutos: " + minutes);
                for (int i = 0; i < 6; i++) {
                    positionsMinutes[i] = (((minutes >> i)&0x1)==1);
                }
                for (int i = 5; i >=0; i--) {
                  VerificationMinutes();
                    System.out.print(positionsMinutes[i]?1:0);
                }
                System.out.println();
                minutes++;
                minutes = minutes!=60?minutes:0;
                //Contando horas
                    if(minutes == 59){
                        minutes = 1;
                        System.out.println("Horas: " + hours);
                   for (int i = 0; i < 5; i++) {
                    positionsHours[i] = (((hours >> i)&0x1)==1);
                    }
                   for (int i = 0; i < 4; i++) {
                       VerificationMinutes();
                       System.out.print(positionsHours[i]?1:0);
                   }
                   System.out.println();
                   hours++;
                   hours = hours!=24?hours:0;
                    }
               }
            
        }
        
        
    }
}
