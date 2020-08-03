package server;

import java.io.InputStream;
import javax.xml.parsers.SAXParser;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
//Pieter-Jan Steeman
/**
<personenlijst>
	<persoon>
		<voornaam> Gorik </voornaam>
		<achternaam> De Samblanx </achternaam>
		<gemeente></gemeente>
		<geslacht> m </geslacht>
	</persoon>

	<persoon>
		<voornaam> Jan </voornaam>
		<achternaam> Van Gemert </achternaam>
		<gemeente></gemeente>
		<geslacht> m </geslacht>
	</persoon>
...
</personenlijst>
**/

public class XMLParser extends DefaultHandler {
	private SAXParser parser;
    private InputStream stroom;
    private PersonenLijst huidigeLijst;
    private Persoon huidigePersoon;
    private String verwachteInhoud;


    public XMLParser(InputStream s, SAXParser p) {
    	stroom = s;
    	parser = p;
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) {
    	if (qName.equals("persoonlijst")) {
    	    if (huidigeLijst != null)
    		System.err.println("Geneste PersonenLijst-tags worden genegeerd");
    	    else  {
    		huidigeLijst = PersonenLijst.getInstance();
    	    }
    	    return;
    	}
    	if (qName.equals("persoon")) {
    	    if (huidigePersoon != null)
    		System.err.println("Geneste Persoon-tags worden genegeerd");
    	    else 
    		if (huidigePersoon == null)
    		    System.err.println("Persoon-tags die niet in een PersonenLijst-tag voorkomen worden genegeerd");
    		else  {
    		    huidigePersoon = new Persoon();
    		}
    	    return;
    	}
    }

    public void characters(char[] ch, int start, int length) {
    	boolean erIsInhoud = false;
    	for (int i = start; i < length + start; i++)
    	    if (!Character.isWhitespace(ch[i]))
    		erIsInhoud = true;
    	if (!erIsInhoud)
    	    return;
    	String s = String.copyValueOf(ch,start,length);
    	if (verwachteInhoud == null) {
    	    System.err.println("Inhoud \""+s+"\" niet verwacht");
    	    return;
    	}
    	if (verwachteInhoud.equals("voornaam")) {
    	    huidigePersoon.setVNaam(s);
    	    return;
    	}
    	if (verwachteInhoud.equals("naam")) {
    	    huidigePersoon.setNaam(s);
    	    return;
    	}
    	if (verwachteInhoud.equals("geslacht")) {
    	    huidigePersoon.setGeslacht(Boolean.getBoolean(s));
    	    return;
    	}
    	if (verwachteInhoud.equals("gemeente")) {
    	    huidigePersoon.setGemeente(s);
    	    return;
    	}
    	System.err.println("Inhoud \""+s+"\" niet verwacht");
    }

    public void startDocument() {

    }

    public void endDocument() {

    }

    public void endElement(String uri, String localName, String qName) {
    	verwachteInhoud = null;
    	if (qName.equals("personenlijst")) {
    	    huidigeLijst.voegToe(huidigePersoon);
    	    huidigePersoon = null;
    	}
    }


}