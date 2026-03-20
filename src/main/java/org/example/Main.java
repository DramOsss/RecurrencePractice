package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// Punto 1:  Factorial: de recursión lineal a diseño consciente
//
//        // FACTORIAL- ITERATIVA
//        long result = factoriaLIteral(5);
//        System.out.println(result);
//
//        // FACTORIAL- Recusivo con Cola
//        long acum = 0;
//        long resultado = factorialCola(5, acum);
//        System.out.println(resultado);
//
//    }
//
//    static long factoriaLIteral(int n) {
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//
//        }
//        return result;
//
//    }
//
//    static long factorialCola(int n, long acumulador) {
//        if (n <= 1) return acumulador;
//        return factorialCola(n - 1, acumulador * n);

//   }
//
// -------------------------------------------------------------------------------------------------


// Punto 2: Fibonacci: detectar el verdadero origen del costo

//        // FACTORIAL- ITERATIVA
//        long result = factoriaLIteral(5);
//        System.out.println(result);
//
//        // FACTORIAL- Recusivo con Cola
//        long acum = 0;
//        long resultado = factorialCola(5, acum);
//        System.out.println(resultado);
//
//    }
//
//    static long factoriaLIteral(int n) {
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//
//        }
//        return result;
//
//    }
//
//    static long factorialCola(int n, long acumulador) {
//        if (n <= 1) return acumulador;
//        return factorialCola(n - 1, acumulador * n);
//
//      }
//  }

//-------------------------------------------------------------------------------------


//Punto 4:  Mutaciones de código: cambiar la complejidad con cambios mínimos



// Fragmento A
//
//
//
//        System.out.println(potencia(10, 2));
//        System.out.println(potencia(3, 5));
//
//
//    }
//
//    public static long potencia(long x, int n) {
//        if (n == 0) return 1;
//
//        long half = potencia(x, n / 2);
//
//        if (n % 2 == 0) {
//            return half * half;
//        } else {
//            return x * half * half;
//        }
//    }

// Fragmento B
//
//        System.out.println(invertir("hola"));
//        System.out.println(invertir("recursion"));
//
//    }
//
//    public static String invertir(String s) {
//        char[] arr = s.toCharArray();
//        invertirRec(arr, 0, arr.length - 1);
//        return new String(arr);
//    }
//
//    private static void invertirRec(char[] arr, int i, int j) {
//        if (i >= j) return;
//
//        char temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//
//        invertirRec(arr, i + 1, j - 1);
//    }


//Fragmento C:


        int[] arreglo = {1, 0, 1, 1, 0, 1};
        System.out.println(contarUnos(arreglo));
    }

    public static int contarUnos(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;
            }
        }

        return count;
    }


}