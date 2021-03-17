package br.com.alura.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;

public class ClientWebService {

	public static void main(String[] args) throws Exception{
		
		String conteudo = Request
		.Post("http://localhost:8080/gerenciador/empresas")//chama o post
		.addHeader("Accept","application/xml")
		.execute()//executa o post
		.returnContent()//aguarda o conteudo
		.asString();//retorna o conteudo como string
		
		System.out.println(conteudo);

	}

}
