package repetitionworkshop;
// Integrantes: Royer Masache, Andrés Vallejo, Jordy Esparza

public class Factorial {
    /**
     * Método para calcular el valor del factorial
     * @param number
     * @return
     */
    public int calculateFactorial(int number){
        int n = 1;
        for(int a = 1; a <= number; a ++){
            n = n * a;
        }
        return n;
    }
}
