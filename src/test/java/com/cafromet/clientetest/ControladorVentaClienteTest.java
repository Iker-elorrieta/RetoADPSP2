package com.cafromet.clientetest;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.cafromet.cliente.ControladorVentanMunicipio;
import com.cafromet.cliente.VentanaMunicipio;
import com.cafromet.modelodto.MunicipioDTO;
import com.cafromet.server.Datos;
import com.cafromet.server.Peticiones;

public class ControladorVentaClienteTest {

	ControladorVentanMunicipio controlador;
	VentanaMunicipio ventanaMunicipio;

	@Before
	public void setup() {
	ventanaMunicipio = new VentanaMunicipio();
	controlador = new ControladorVentanMunicipio(ventanaMunicipio);
	}
	
	@Test
	public void test() {
		controlador = Mockito.spy(controlador);
		Mockito.doReturn(true).when(controlador).procesarRecepcion();
		boolean result =controlador.enviarPeticion("prueba", Peticiones.p101a);
		assertTrue(result);
	}
	
}
