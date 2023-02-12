package principal;

import java.util.Scanner;

import entities.Empresa;
import repositories.EmpresaRepository;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\n *** CADASTRO DE EMPRESAS *** \n");
		
		Scanner scanner = new Scanner(System.in);
		
		Empresa empresa = new Empresa();
		
		System.out.print("\nInforme o ID da empresa: ");
		empresa.setIdEmpresa(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("\nInforme o nome fantasia: ");
		empresa.setNomeFantasia(scanner.nextLine());
		
		System.out.print("\nInforme a razão social: ");
		empresa.setRazaoSocial(scanner.nextLine());
		
		System.out.print("\nInforme o CNPJ: ");
		empresa.setCnpj(scanner.nextLine());
		
		scanner.close();
		
		try {
			
			EmpresaRepository empresaRepository = new EmpresaRepository();
			empresaRepository.exportar(empresa);
			
			System.out.println("\nEMPRESA CADASTRADA COM SUCESSO!");
			System.out.println("ID..................: " + empresa.getIdEmpresa());
			System.out.println("NOME FANTASIA.......: " + empresa.getNomeFantasia());
			System.out.println("RAZÃO SOCIAL........: " + empresa.getRazaoSocial());
			System.out.println("CNPJ................: " + empresa.getCnpj());
			
		} catch (Exception e) {
			System.out.println("\nFALHA AO CADASTRAR EMPRESA.");
			e.printStackTrace();
		}

	}

}
