package com.cafromet.cliente;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class VentanaEspacioNatural extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel defaultTableModel;
	private JTable tablaContactos;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBoxProvincia;
	private JButton btnFiltrar;
	
	public JButton getBtnFiltrar() {
		return btnFiltrar;
	}

	public void setBtnFiltrar(JButton btnFiltrar) {
		this.btnFiltrar = btnFiltrar;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getComboBoxProvincia() {
		return comboBoxProvincia;
	}

	@SuppressWarnings("rawtypes")
	public void setComboBoxProvincia(JComboBox comboBoxProvincia) {
		this.comboBoxProvincia = comboBoxProvincia;
	}

	public DefaultTableModel getDefaultTableModel() {
		return defaultTableModel;
	}

	public void setDefaultTableModel(DefaultTableModel defaultTableModel) {
		this.defaultTableModel = defaultTableModel;
	}
	
	public void inicioVentanaEspacioNatural() {

		VentanaEspacioNatural ventanaEspacioNatural = new VentanaEspacioNatural();
		ventanaEspacioNatural.setVisible(true);
		
		ControladorVentanaEspacioNatural controladorVentEspacioNatural = new ControladorVentanaEspacioNatural(ventanaEspacioNatural);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public VentanaEspacioNatural() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane;
		contentPane.setLayout(null);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 74, 483, 176);
		getContentPane().add(scrollPane);
		
		String columnas[] = {"NOMBRE", "DESCRIPCION", "CATEGORIA"};

		defaultTableModel = new DefaultTableModel(columnas, 0);

		tablaContactos = new JTable(defaultTableModel);
		tablaContactos.setAutoCreateRowSorter(true);
		tablaContactos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablaContactos.setRowSelectionAllowed(false);
		tablaContactos.setCellSelectionEnabled(false);
	
		tablaContactos.setDefaultEditor(Object.class, null); 

		scrollPane.setViewportView(tablaContactos);
		
		comboBoxProvincia = new JComboBox();
		comboBoxProvincia.setModel(new DefaultComboBoxModel(new String[] {"Pantanos", "Rios", "Playas"}));
		comboBoxProvincia.setBounds(135, 36, 112, 22);
		contentPane.add(comboBoxProvincia);
		
		JLabel lblNewLabel = new JLabel("CATEGORIA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(25, 35, 100, 20);
		contentPane.add(lblNewLabel);
		
		btnFiltrar = new JButton("FILTRAR");
		btnFiltrar.setBounds(257, 35, 100, 24);
		contentPane.add(btnFiltrar);
		
	}

}