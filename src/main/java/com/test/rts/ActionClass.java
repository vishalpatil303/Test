package com.test.rts;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class ActionClass {
	
	public static HashMap buildActionClassMap(InputStream inputStream ) throws Exception {
		HashMap hashMap = null;
		DocumentBuilderFactory builderFactory = null;
		DocumentBuilder documentBuilder = null;
		Document document = null;
		ConfigBean configBean = null;
		
		builderFactory= DocumentBuilderFactory.newInstance();
		documentBuilder = builderFactory.newDocumentBuilder();
		document = documentBuilder.parse(inputStream);
		
		Element element = document.getDocumentElement();
		element.
		
			
		
		
		
		return hashMap;
	}

}
