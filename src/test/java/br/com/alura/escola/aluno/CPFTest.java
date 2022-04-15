package br.com.alura.escola.aluno;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CPFTest {

	@Test
	void naoDeveriaCriarCPFComNumerosInvalidos() {
		
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF(null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF(""));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF("12345678900"));
	}

}
