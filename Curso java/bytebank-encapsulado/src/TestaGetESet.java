public class TestaGetESet {


    public static void main(String[] args) {
        Conta conta = new Conta(1337 , 24226);

        System.out.println(conta.getNumero());

        Cliente Shazaam = new Cliente();
        //conta.titular = Shazaam
        Shazaam.setNome("Shazaam");

        conta.setTitular(Shazaam);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissão("NFT Trader");
        //em 2 linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissão("NFT Trader");

        //mesmo resultado
        System.out.println(titularDaConta);
        System.out.println(Shazaam);
        System.out.println(conta.getTitular());
    }
}
