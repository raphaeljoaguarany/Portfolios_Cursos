package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " É considerado sucesso e preferido!");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todos estão curtindo");
        }
    }
}
