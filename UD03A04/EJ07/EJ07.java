// 7. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
// algoritmo que solicite por teclado dos números enteros positivos (a y b) y muestre por
// pantalla el máximo común divisor calculándolo mediante el algoritmo de Euclides.
//	 - Si a es menor que b se intercambian los valores
//	 - Sea r el resto de dividir a entre b
//	 - Si r=0 entonces mcd(a,b)=b sino mcd(a,b)=mcd(b,r)


import java.util.Scanner;

public class EJ07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);