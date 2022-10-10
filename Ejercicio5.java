public class Ejercicio5{
    public static void main(String[] args){
        String rojo = "\033[31m"; 
        String verde = "\033[32m"; 
        String naranja = "\033[33m"; 
        String azul = "\033[34m"; 
        String morado = "\033[35m";
        String celeste = "\033[36m";
        String blanco = "\033[37m";
        System.out.println("Lunes\tMartes\tMierc.\tJueves\tViernes");
        System.out.println("======\t======\t======\t======\t======");
        System.out.println(verde+"PROG"+morado+"\tS.INFO"+azul+"\tE.DES"+verde+"\tPROG"+blanco+"\tFOL");
        System.out.println(verde+"PROG"+morado+"\tS.INFO"+azul+"\tE.DES"+verde+"\tPROG"+blanco+"\tFOL");
        System.out.println(celeste+"L.MAR"+morado+"\tS.INFO"+verde+"\tPROG"+celeste+"\tL.MAR"+blanco+"\tFOL");
        System.out.println(naranja+"RECREO\tRECREO\tRECREO\tRECREO\tRECREO");
        System.out.println(celeste+"L.MAR"+verde+"\tPROG"+verde+"\tPROG"+celeste+"\tL.MAR"+morado+"\tS.INFO");
        System.out.println(rojo+"B.DATOS"+verde+"\tPROG"+rojo+"\tB.DATOS"+rojo+"\tB.DATOS"+morado+"\tS.INFO");
        System.out.println(rojo+"B.DATOS"+azul+"\tE.DES"+rojo+"\tB.DATOS"+rojo+"\tB.DATOS"+morado+"\tS.INFO");
    }
}