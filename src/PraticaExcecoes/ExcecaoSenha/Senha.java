package PraticaExcecoes.ExcecaoSenha;

public class Senha {
    private String senha;

    public Senha(String senha) throws SenhaInvalidaException {
        this.senha = senha;

        if(senha.length() < 8){
            throw new SenhaInvalidaException("ERRO: A senha tem que ter pelo menos 8 caracteres");
        }
    }
}
