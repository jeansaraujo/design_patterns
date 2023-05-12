package Estruturais.Proxy;

public class ProxyPessoa implements Pessoa{
    
    private String nome;
    private Pessoa pessoa; //mesma interface

    public ProxyPessoa (String nome){
        this.nome = nome;
    }

    public String getNome(){
        if(pessoa == null){
            //Apenas cria o objeto real quando chamar este método
            // pessoa = PessoaDAO.getPessoaByNome(this.nome); // Inexistencia de PessoaDAO
           // PessoaImplementada pessoa = new PessoaImplementada();
            // .getNome(this.nome); // Inexistencia de PessoaDAO
        }
        /** Delega para o objeto real */
        return pessoa.getNome();
    }

}
