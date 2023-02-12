package repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import entities.Empresa;

public class EmpresaRepository {

	public void exportar(Empresa empresa) throws Exception {
		
		String path = "C:\\Temp\\empresas\\empresa.txt";
		
		PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File(path), true));
		
		printWriter.write("\n\nDADOS DA EMPRESA:");
		printWriter.write("\nID.................: " + empresa.getIdEmpresa());
		printWriter.write("\nNOME FANTASIA......: " + empresa.getNomeFantasia());
		printWriter.write("\nRAZÃO SOCIAL.......: " + empresa.getRazaoSocial());
		printWriter.write("\nCNPJ...............: " + empresa.getCnpj());
		
		printWriter.flush();
		printWriter.close();
		
	}
}
