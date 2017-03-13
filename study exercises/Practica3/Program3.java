 package Practica3;
public class Program3 {
    public static void main(String[] args) {
        //System.out.println(validateString("hola", "hssla"));
        //System.out.println(validateString("hola", "pedro"));
        //System.out.println(validateString("hola", "holas"));
        System.out.println(validateString("hola", "hla"));
        System.out.println(validateString("hola", "ola"));
    }

    private static boolean validateString(String wordA, String wordB) {
        char[] arrayA = wordA.toCharArray();
        char[] arrayB = wordB.toCharArray();
        if (arrayA.length == arrayB.length) {
            return validateSameSize(arrayA, arrayB);
        } else {
            return validateDifferentSize(arrayA, arrayB);
        }
    }

    private static boolean validateSameSize(char[] arrayA, char[] arrayB) {
        int dif = 0;
        for (int i = 0; i <= arrayA.length - 1; i++) {
            if (arrayA[i] != arrayB[i]) {
                dif++;
                if (dif > 1) {
                    return false;
                }
            }    
        }
        return true;
    }

    private static boolean validateDifferentSize(char[] arrayA, char[] arrayB) {
        if (arrayA.length > arrayB.length) {
            return compareArray(arrayA, arrayB);
        } 
            return compareArray(arrayB, arrayA);   
    }

    private static boolean compareArray(char[] a, char[] b) {
        int dif = 0;
        if ((a.length - b.length) >= 2) {
            return false;
        }
        for (int i = 0; i <= b.length - 1; i++) {
            int j = 0;
            if (a[j] == b[i]) {
                continue;
         
            }
            dif++;
            if (dif >= 2) {
                return false;
            }
            if (a[i + 1] != b[i]) {
            }
        }
        return true;
    }
}
