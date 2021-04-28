package Java.CaracteristicasDaLinguagem.Condicionais;

public class EstruturaIf {
    public static void main(String[] args) {
        final var linguagem = "java";
        //final var linguagem = "python"; //Use apenas uma dessas variáveis, essa ou a de cima...
        if (linguagem.equals("java")){
            System.out.println("Continue o aprendizado com java e mantenha o foco !");
        }else {
            System.out.println(String.format("Você não está em um ambiente %s",linguagem));
        }

        //Operador ternário
        final var condicao = false;
        final var ternario = condicao ? "É verdadeiro" : "É falso";
        System.out.println(String.format("Resposta do operador ternário: %s",condicao));
    }
}
