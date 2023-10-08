package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args)
	{
		executarInsercaoContato();
		executarUpdateContato();
		executarGetContato();
		executarDeleteContato();
	}
	
	public static void executarInsercaoContato() {
        ContatoDAO contatoDao = new ContatoDAO();

        Contato contato = new Contato();
        contato.setNome("Tatiana Monte Negro");
        contato.setIdade(27);
        contato.setData(new Date());

        contatoDao.create(contato);
        
        System.out.print("Nome: " + contato.getNome() + ", Idade: " + contato.getIdade()+ " cadastrados com sucesso.");
    }
	
	public static void executarUpdateContato() {
	    ContatoDAO contatoDao = new ContatoDAO();

        Contato contato = new Contato();
        contato.setNome("Linceana Inacia. N. C. Escoebraga");
        contato.setIdade(280);
        contato.setData(new Date());

	    contatoDao.update(3, contato);

	    System.out.println("Contato de " + contato.getNome() +" atualizado com sucesso.");
	}
	
	public static void executarDeleteContato() {
		ContatoDAO contatoDao = new ContatoDAO();
		
        Contato contato = new Contato();
        contato = contatoDao.get(3);
        
	    contatoDao.delete(3, contato);

	    System.out.println("Contato de " + contato.getNome() +" deletado com sucesso.");
	}
	
	public static void executarGetContato() {
		ContatoDAO contatoDao = new ContatoDAO();

        Contato contato = new Contato();

        
        contato = contatoDao.get(3);

	    System.out.println("Contato de " + contato.getNome() +" retornado com sucesso.");
	}
}
