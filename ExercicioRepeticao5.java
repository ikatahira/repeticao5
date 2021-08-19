public class ExercicioRepeticao5{

    public static void main(String args[]){

        int valor=10;
        if(valor%2==0){
            //se x é par, x = x / 2
            valor=valor/2;
            System.out.println("par: "+valor);
        }
        else{
            //se x é impar, x = 3 * x + 1
            //valor=2*3+1=7?
            valor=2*valor+1;
            System.out.println("impar: "+valor);
        }
    }
}

/**
5. (opcional) Escreva um programa que, dada uma variável x com algum valor inteiro, 
temos um novo x de acordo com a seguinte regra:


imprime x */