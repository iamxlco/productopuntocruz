/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class productos {
    private int[][] matriz = new int[2][2];
    public productos(int[][] arr) {
        this.matriz = arr;
    }
    
    public String punto(){
        int total = 0;
            total = matriz[0][0]*matriz[0][1] + matriz[1][0]*matriz[1][1];
        return total + "";
    } 
    
    public String cruz(){
        double i = matriz[0][0]*matriz[1][1];
        double j = matriz[0][1]*matriz[1][0];
        double magnitud = Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
        String vector = i+"i"+ "" + j + "j";
        return "Magnitud: " + magnitud + " Dirección: " + vector; 
    }
}
