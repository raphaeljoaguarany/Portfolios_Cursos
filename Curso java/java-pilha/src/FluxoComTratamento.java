public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException ex) {
            // String msg = ex.getMessage();
            // System.out.println("ArithmeticException" + msg);
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("NullPointerException" + msg);
            //ex.printStackTrace()
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    public static void metodo2() {
        System.out.println("Ini do metodo2");

        ArithmeticException ex = new ArithmeticException("deu errado");
        throw ex;

        //System.out.println("Fim do metodo2");
    }
}