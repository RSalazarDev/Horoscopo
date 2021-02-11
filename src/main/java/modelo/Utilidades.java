/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author salaz
 */
public class Utilidades {
    public static ArrayList<String> getMeses(){
        ArrayList<String> meses = new ArrayList<String>();
        for (int i = 1; i <= 12; i++) {
            meses.add(String.valueOf(i));
        }
        return meses;
    }
    
    public static ArrayList<String> getDias(){
        ArrayList<String> dias = new ArrayList<String>();
        for (int i = 1; i <= 31; i++) {
            dias.add(String.valueOf(i));
        }
        return dias;
    }

    public static String obtenerSigno(int diaSeleccionado, int mesSeleccionado) {
        int dia = diaSeleccionado;
        int mes = mesSeleccionado;
        String signo = "FECHA NO VALIDA";
        
        
        //Abril junio septiembre y noviembre tienen 30
        //4 6 9 11
        
        if ((mes==4) || (mes==6) || (mes==9) || (mes==11) ) {
            if (dia>30) {
                return signo;
            }
        }
        
        if (mes==2) {
            if (dia>28) {
                return signo;
            }
        }
        
        
        
        
        
        switch (mes) {
        case 1:
            if (dia > 21) {
                signo = "ACUARIO";
            } else {
                signo = "CAPRICORNIO";
            }
            break;
        case 2:
                if (dia > 19) {
                    signo = "PISCIS";
                } else {
                    signo = "ACUARIO";
                }
                break;
        case 3:
                if (dia > 20) {
                    signo = "ARIES";
                } else {
                    signo = "PISCIS";
                }
                break;
        case 4:
                if (dia > 20) {
                    signo = "TAURO";
                } else {
                    signo = "ARIES";
                }
                break;
        case 5:
                if (dia > 21) {
                    signo = "GEMINIS";
                } else {
                    signo = "TAURO";
                }
                break;
        case 6:
                if (dia > 20) {
                    signo = "CANCER";
                } else {
                    signo = "GEMINIS";
                }
                break;
        case 7:
                if (dia > 22) {
                    signo = "LEO";
                } else {
                    signo = "CANCER";
                }
                break;
        case 8:
                if (dia > 21) {
                    signo = "VIRGO";
                } else {
                    signo = "LEO";
                }
                break;
        case 9:
                if (dia > 22) {
                    signo = "LIBRA";
                } else {
                    signo = "VIRGO";
                }
                break;
        case 10:
                if (dia > 22) {
                    signo = "ESCORPION";
                } else {
                    signo = "LIBRA";
                }
                break;
        case 11:
                if (dia > 21) {
                    signo = "SAGITARIO";
                } else {
                    signo = "ESCORPION";
                }
                break;
        case 12:
                if (dia > 21) {
                    signo = "CAPRICORNIO";
                } else {
                    signo = "SAGITARIO";
                }
        break;
    }
    return signo;
    }
}
