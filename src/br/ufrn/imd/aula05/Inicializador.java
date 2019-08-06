package br.ufrn.imd.aula05;

import java.util.ArrayList;

import br.imd.ufrn.aula05.dominio.Papel;
import br.imd.ufrn.aula05.dominio.Pessoa;
import br.imd.ufrn.aula05.dominio.Usuario;

public class Inicializador {

	public static void main(String[] args) {
		
		Papel papel = new Papel("ADMIN", "001");
		System.out.println(papel);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("001.001.001-20");
		pessoa.setNome("Itamir Filho");
		System.out.println(pessoa);
		
		Usuario u = new Usuario("itamir", "itamir");
		u.setPapeis(new ArrayList<Papel>());
		u.getPapeis().add(papel);
		u.setPessoa(pessoa);
		System.out.println(u);
			
	}
}
