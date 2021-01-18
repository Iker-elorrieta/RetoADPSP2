package com.cafromet.utiltest;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Test;

import com.cafromet.server.Updater;
import com.cafromet.util.GestorFicheros;
import com.cafromet.util.JsonToXml;

public class JsonToXmlTest {
	@Test
	public void test() {
		JsonToXml jsonToXml = new JsonToXml();
		boolean rs = jsonToXml.convertJsonToXml("abanto_temp2.json", "ABANTO", "ABANTO", "test_" +  "abanto.xml", Updater.RUTA_XML);
		assertEquals(true, rs);
	}

}
