public class tiposPrimitivos2 {
    public static void main(String[] args) {
        //main é a porta de entrada para que possa roda o porgrama

        //informações funcionario
        //tipos primitivos

        byte anosDeTrabalhos = 23;
        short numeroDeVoos = 128;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223l; //precisa colocar o 'l' parea dizer que e long

        //tipos numericos reais;
        float salario = 11.445f; //precisa colocar a letra f pra dizer que ele é do tipo float
        double vendasAcumuladas = 2_991_797_103.01 ;

        //tipos booleanos

        boolean estaDeFerias = false ;

        //tipos caractere
        char status = 'a'; // ativo

        //dias de empresa
        System.out.println(anosDeTrabalhos*365);

        System.out.println(numeroDeVoos/2);

        System.out.println(pontosAcumulados/vendasAcumuladas);
        System.out.println(id +  ":GANHAR -> " + salario);
        System.out.println("ferias" + estaDeFerias);
        System.out.println("status:" + status);




    }
}
