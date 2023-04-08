package com.dio;

import com.dio.model.ggato;

public class PrimeiroProgramaJava {

	public static void main(String[] args) {
		ggato ggato = new ggato(); 
		
		livros livros = new livros();
		System.out.println(ggato);
		System.out.println(livros);
		
	    
	}

}
class livros {
	public String nome;
	public Integer npag;
	
}
