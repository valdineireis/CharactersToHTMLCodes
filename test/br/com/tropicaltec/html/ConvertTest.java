package br.com.tropicaltec.html;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConvertTest {

	private Convert convert;

	@Before
	public void setUp() throws Exception {
		convert = new Convert();
	}

	@Test
	public void deveriaRetornarFriendlyCodeAGraveMaiuscula() {
		assertEquals("&Agrave;", convert.toHtmlFriendlyCode("À"));
	}
	
	@Test
	public void deveriaRetornarFriendlyCodeACuteMaiuscula() {
		assertEquals("&Aacute;", convert.toHtmlFriendlyCode("Á"));
	}
	
	@Test
	public void deveriaRetornarFriendlyCodeACircMaiuscula() {
		assertEquals("&Acirc;", convert.toHtmlFriendlyCode("Â"));
	}
	
	@Test
	public void deveriaRetornarFriendlyCodeAtildeMaiuscula() {
		assertEquals("&Atilde;", convert.toHtmlFriendlyCode("Ã"));
	}
	
	@Test
	public void deveriaRetornarFriendlyCodeAumlMaiuscula() {
		assertEquals("&Auml;", convert.toHtmlFriendlyCode("Ä"));
	}
	
	@Test
	public void deveriaRetornarFriendlyCodeAringMaiuscula() {
		assertEquals("&Aring;", convert.toHtmlFriendlyCode("Å"));
	}
	
	@Test
	public void deveriaRetornarFriendlyCodeAEligMaiuscula() {
		assertEquals("&AElig;", convert.toHtmlFriendlyCode("Æ"));
	}

}
