package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("A conta número: " + numero + " não foi encontrada!");
	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas)
			conta.visualizar();
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("A Conta foi Criada");
	}

	@Override
	public void atualizar(Conta conta) {
var buscaConta = buscarNaCollection(conta.getNumero());
		
		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("\nA Conta numero: " + conta.getNumero() + " foi atualizada com sucesso!");
		}else
			System.out.println("\nA Conta numero: " + conta.getNumero() + " não foi encontrada!");;
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (listaContas.remove(conta) == true)
				System.out.println("\nA Conta numero: " + numero + " foi deletada com sucesso!");
		} else
			System.out.println("\nA Conta numero: " + numero + " não foi encontrada!");

	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(int numero, int contaDestino, float valor) {
		// TODO Auto-generated method stub

	}

	/* Implementar Métodos Auxiliares */

	public int gerarNumero() {
		return listaContas.size() + 1;
		// usa o mais 1 pois a contagem começa no zero;
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return conta;
		}

		return null;
	}

	public int retornaTipo(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return conta.getTipo();
		}

		return 0;
	}

}
