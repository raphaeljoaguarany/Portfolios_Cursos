
public class TestaBanco {

    public static void main(String[] args) {
        Cliente shazaam = new Cliente();
        shazaam.nome = "Shazaam Dragonz";
        shazaam.cpf = "222.222.222-22";
        shazaam.profissão = "Colecionador de JPEG";

        Conta condaDoShazaam = new Conta();
        condaDoShazaam.deposita(100);

        condaDoShazaam.titular = shazaam;
        System.out.println(condaDoShazaam.titular.nome);
    }
}
