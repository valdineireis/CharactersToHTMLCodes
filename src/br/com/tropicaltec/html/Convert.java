package br.com.tropicaltec.html;

import java.util.HashMap;
import java.util.Map;

/**
 * Class responsible for converting characters
 * @author Valdinei Reis
 * @since 11, April of 2013
 *
 */
public class Convert {

	private String getFriendlyCode(Character code) {
		Map<Integer, String> codes = new HashMap<Integer, String>();
		codes.put(192, "&Agrave;"); //À
		codes.put(193, "&Aacute;"); //Á
		codes.put(194, "&Acirc;"); //Â
		codes.put(195, "&Atilde;"); //Ã
		codes.put(196, "&Auml;"); //Ä
		codes.put(197, "&Aring;"); //Å
		codes.put(198, "&AElig;"); //Æ
		codes.put(199, "&Ccedil;"); //Ç
		codes.put(200, "&Egrave;"); //È
		codes.put(201, "&Eacute;"); //É
		codes.put(202, "&Ecirc;"); //Ê
		codes.put(203, "&Euml;"); //Ë
		codes.put(204, "&Igrave;"); //Ì
		codes.put(205, "&Iacute;"); //Í
		codes.put(206, "&Icirc;"); //Î
		codes.put(207, "&Iuml;"); //Ï
		codes.put(208, "&ETH;"); //Ð
		codes.put(209, "&Ntilde;"); //Ñ
		codes.put(210, "&Ograve;"); //Ò
		codes.put(211, "&Oacute;"); //Ó
		codes.put(212, "&Ocirc;"); //Ô
		codes.put(213, "&Otilde;"); //Õ
		codes.put(214, "&Ouml;"); //Ö
		codes.put(215, "&times;"); //×
		codes.put(216, "&Oslash;"); //Ø
		codes.put(217, "&Ugrave;"); //Ù
		codes.put(218, "&Uacute;"); //Ú
		codes.put(219, "&Ucirc;"); //Û
		codes.put(220, "&Uuml;"); //Ü
		codes.put(221, "&Yacute;"); //Ý
		codes.put(222, "&THORN;"); //Þ
		codes.put(223, "&szlig;"); //ß
		codes.put(224, "&agrave;"); //à
		codes.put(225, "&aacute;"); //á
		codes.put(226, "&acirc;"); //â
		codes.put(227, "&atilde;"); //ã
		codes.put(228, "&auml;"); //ä
		codes.put(229, "&aring;"); //å
		codes.put(230, "&aelig;"); //æ
		codes.put(231, "&ccedil;"); //ç
		codes.put(232, "&egrave;"); //è
		codes.put(233, "&eacute;"); //é
		codes.put(234, "&ecirc;"); //ê
		codes.put(235, "&euml;"); //ë
		codes.put(236, "&igrave;"); //ì
		codes.put(237, "&iacute;"); //í
		codes.put(238, "&icirc;"); //î
		codes.put(239, "&iuml;"); //ï
		codes.put(240, "&eth;"); //ð
		codes.put(241, "&ntilde;"); //ñ
		codes.put(242, "&ograve;"); //ò
		codes.put(243, "&oacute;"); //ó
		codes.put(244, "&ocirc;"); //ô
		codes.put(245, "&otilde;"); //õ
		codes.put(246, "&ouml;"); //ö
		codes.put(247, "&divide;"); //÷
		codes.put(248, "&oslash;"); //ø
		codes.put(249, "&ugrave;"); //ù
		codes.put(250, "&uacute;"); //ú
		codes.put(251, "&ucirc;"); //û
		codes.put(252, "&uuml;"); //ü
		codes.put(253, "&yacute;"); //ý
		codes.put(254, "&thorn;"); //þ
		codes.put(255, "&yuml;"); //ÿ
		
		Integer number = Integer.valueOf(code);
		
		if (codes.containsKey(number)) {
			return codes.get(number);
		} else {
			return code.toString();
		}
	}
	
	public String toHtmlFriendlyCode(String str) {
		
		//All characters
        char[] caracteres = str.toCharArray();
        
        //Builder to the result
        StringBuilder sb = new StringBuilder();
        
        //Checks the characters
        for (char caracter : caracteres) {
            
            sb.append( getFriendlyCode(caracter) );
            
        }
        
        return sb.toString();
	}
	
}
