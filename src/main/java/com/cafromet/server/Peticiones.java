package com.cafromet.server;

public enum Peticiones {
    //PETICIONES POR PLATAFORMA
    //  pXXXa -> Cliente de escritorio
    //  pXXXb -> Cliente de android

    //PETICION LOGIN
    p101a(1, 1),
    p101b(1, 2),
    //PETICION REGISTRAR USUARIO
    p102a(2, 1),
    p102b(2, 2),
    //PETICION LISTAR MUNICIPIOS
    p103a(3, 1),
    p103b(3, 2),
    p103c(3, 3),
    //PETICION LISTAR ESPACIOS NATURALES
    p104a(4, 1),
    p104b(4, 2),
    //PETICION LISTAR CENTROS METEOROLOGICOS
    p105a(5, 1),
    p105b(5, 2),
    p105c(5, 3),
    //PETICION LISTAR MEDICIONES
    p106a(6, 1),
    p106b(6, 2),
    //PETICION LISTAR MEDICIONES
    p107a(7, 1),
    p107b(7, 2);

    private int codigo;
    private int plataforma;

    Peticiones(int codigo, int plataforma) {
        this.codigo = codigo;
        this.plataforma = plataforma;
    }

    public int getCodigo() {
        return codigo;
    }
    public int getPlataforma() {
        return plataforma;
    }

}
	