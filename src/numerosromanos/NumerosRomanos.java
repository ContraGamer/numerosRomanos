/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosromanos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Contr
 */
public class NumerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, aux, conta = 0;
        String unoR = "I", cincoR = "V", diezR = "X", numero = "";
        try {

            num = scan.nextInt();
            if (num >= 1 & num < 40) {
                if (num == 1) {
                    System.out.println("I");
                }
                if (num > 1) {
                    if ((num / 10) >= 1) {
                        aux = (num / 10);
                        while (conta < aux) {
                            numero = numero.concat(diezR);
                            conta++;
                        }
                        //   System.out.println(numero);
                    }
                    if (num % 10 >= 1) {
                        aux = num % 10;
                        conta = 0;
                        if (aux == 9) {
                            int len = numero.length();
                            numero = "";
                            while (conta < len) {
                                numero = numero.concat(diezR);
                                conta++;
                            }
                            numero = numero.concat(unoR);
                            numero = numero.concat(diezR);
                            // System.out.println(numero);
                        } else {

                            if (aux >= 5) {
                                numero = numero.concat(cincoR);
                                while (conta < aux - 5) {
                                    numero = numero.concat(unoR);
                                    conta++;
                                }
                            } else {
                                if (aux == 4) {
                                    String auxNumero = "";
                                    auxNumero = auxNumero.concat(unoR);
                                    auxNumero = auxNumero.concat(cincoR);
                                    numero = numero.concat(auxNumero);
                                } else {
                                    while (conta < aux) {
                                        numero = numero.concat(unoR);
                                        conta++;
                                    }
                                }
                            }
                            // System.out.println(numero);
                        }
                    }

                }
                System.out.println(numero);
            } else {
                System.out.println("Fuera de rango");
            }

        } catch (InputMismatchException e) {
            System.out.println("Valor Inesperado");
        }

    }

}
