/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.GestionadorPacientes;
import Clases.ListaEnlazada;
import Objetos.Paciente;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.SpringLayout;

/**
 *
 * @author AlexisRM
 */
public class ListaPacientes extends javax.swing.JFrame {

    int ordenar = 0;
    public static GestionadorPacientes g;
    ListaEnlazada<Paciente> listaInicial;
    public static Paciente encontrado;
    
    public ListaPacientes() {
        initComponents();
        g = new GestionadorPacientes();
        setTitle("Lista de pacientes Covid 19");
        setBounds(650, 300, 700, 570);
        
        textListado.setText(g.getListPaciente().toString());
        listaInicial = g.getListPaciente();
        
        jlistPacientes.setListData(g.getListaNombres());
        centrar(1080, 600);
    }

    private void centrar(int anchoGUI, int altoGUI) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int X = (screenSize.width - anchoGUI) / 2;
        int Y = (screenSize.height - altoGUI) / 2;
        setBounds(X, Y, anchoGUI, altoGUI);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textListado = new javax.swing.JTextArea();
        ckDificultadRespirar = new javax.swing.JCheckBox();
        ckTosSeca = new javax.swing.JCheckBox();
        ckCansancio = new javax.swing.JCheckBox();
        ckDolorCabeza = new javax.swing.JCheckBox();
        ckDolorGarganta = new javax.swing.JCheckBox();
        ckDolorPecho = new javax.swing.JCheckBox();
        ckPerdidaGusto = new javax.swing.JCheckBox();
        ckPerdidaOlfato = new javax.swing.JCheckBox();
        btFiltrar = new javax.swing.JButton();
        btOrdenar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btVolver = new javax.swing.JButton();
        btnDarAlta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlistPacientes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Listado de pacientes Covid 19");

        jLabel2.setText("Escriba el apellido a buscar:");

        btBuscar.setBackground(new java.awt.Color(153, 153, 255));
        btBuscar.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Filtrar:");

        textListado.setEditable(false);
        textListado.setColumns(20);
        textListado.setRows(5);
        jScrollPane1.setViewportView(textListado);

        ckDificultadRespirar.setText("Dificultad para respirar");

        ckTosSeca.setText("Tos seca");

        ckCansancio.setText("Cansancio");

        ckDolorCabeza.setText("Dolor de cabeza");

        ckDolorGarganta.setText("Dolor de garganta");

        ckDolorPecho.setText("Dolor en el pecho");

        ckPerdidaGusto.setText("Pérdida del gusto");

        ckPerdidaOlfato.setText("Pérdida del olfato");

        btFiltrar.setBackground(new java.awt.Color(102, 255, 204));
        btFiltrar.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        btFiltrar.setText("Filtrar");
        btFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFiltrarActionPerformed(evt);
            }
        });

        btOrdenar.setBackground(new java.awt.Color(255, 255, 153));
        btOrdenar.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        btOrdenar.setText("Ordenado por creación");
        btOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(255, 153, 153));
        btEditar.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        btEditar.setText("Editar Paciente");
        btEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditarMouseClicked(evt);
            }
        });
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btVolver.setBackground(new java.awt.Color(204, 204, 204));
        btVolver.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        btVolver.setText("Volver");
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });

        btnDarAlta.setBackground(new java.awt.Color(153, 153, 255));
        btnDarAlta.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        btnDarAlta.setText("Dar de alta");
        btnDarAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDarAltaMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(jlistPacientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckPerdidaOlfato)
                            .addComponent(btFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckPerdidaGusto)
                            .addComponent(ckDolorGarganta)
                            .addComponent(ckDolorPecho)
                            .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckDificultadRespirar)
                            .addComponent(ckTosSeca)
                            .addComponent(ckCansancio)
                            .addComponent(ckDolorCabeza)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscar))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel1)
                .addGap(0, 459, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckDificultadRespirar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckTosSeca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckCansancio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckDolorCabeza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckDolorGarganta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckDolorPecho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckPerdidaGusto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckPerdidaOlfato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btFiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btOrdenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDarAlta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVolver))
                    .addComponent(jScrollPane1))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarActionPerformed
        ListaEnlazada<Paciente> pacientes = g.getListPaciente();
        if (pacientes.longitud() > 1) {
            Paciente[] arreglo = pacientes.aArray();
            switch (ordenar) {
                case 0:
                    btOrdenar.setText("Ordenado por edad");
                    ordenarPorEdad(arreglo, 0, arreglo.length - 1);
                    textListado.setText(Arrays.toString(arreglo));
                    break;
                case 1:
                    btOrdenar.setText("Ordenado por apellido");
                    ordenarPorApellido(arreglo, 0, arreglo.length - 1);
                    textListado.setText(Arrays.toString(arreglo));
                    break;
                case 2:
                    btOrdenar.setText("Ordenado por temperatura");
                    ordenarPorTemperatura(arreglo, 0, arreglo.length - 1);
                    textListado.setText(Arrays.toString(arreglo));
                    break;
                case 3:
                    btOrdenar.setText("Ordenado por Nro. de Sintomas");
                    ordenarPorSintomas(arreglo, 0, arreglo.length - 1);
                    textListado.setText(Arrays.toString(arreglo));
                    break;
                case 4:
                    btOrdenar.setText("Ordenado por creación");
                    textListado.setText(listaInicial.toString());
                    ordenar = -1;
                    break;
                default:
                    break;
            }
            ordenar++;

        }


    }//GEN-LAST:event_btOrdenarActionPerformed

    public void ordenarPorEdad(Paciente[] A, int izq, int der) {
        Paciente pivote = A[izq];
        int i = izq;
        int j = der;
        Paciente aux;

        while (i < j) {
            while (A[i].getEdadString().compareTo(pivote.getEdadString()) <= 0 && i < j) {
                i++;
            }
            while (A[j].getEdadString().compareTo(pivote.getEdadString()) > 0) {
                j--;
            }
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];
        A[j] = pivote;

        if (izq < j - 1) {
            ordenarPorEdad(A, izq, j - 1);
        }
        if (j + 1 < der) {
            ordenarPorEdad(A, j + 1, der);
        }
    }

    public void ordenarPorApellido(Paciente[] A, int izq, int der) {
        Paciente pivote = A[izq];
        int i = izq;
        int j = der;
        Paciente aux;

        while (i < j) {
            while (A[i].getApellidoString().compareTo(pivote.getApellidoString()) <= 0 && i < j) {
                i++;
            }
            while (A[j].getApellidoString().compareTo(pivote.getApellidoString()) > 0) {
                j--;
            }
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];
        A[j] = pivote;

        if (izq < j - 1) {
            ordenarPorApellido(A, izq, j - 1);
        }
        if (j + 1 < der) {
            ordenarPorApellido(A, j + 1, der);
        }
    }

    public void ordenarPorTemperatura(Paciente[] A, int izq, int der) {
        Paciente pivote = A[izq];
        int i = izq;
        int j = der;
        Paciente aux;
        
        while (i < j) {
            while (A[i].getTemperaturaString().compareTo(pivote.getTemperaturaString()) <= 0 && i < j) {
               
                i++;
            }
            while (A[j].getTemperaturaString().compareTo(pivote.getTemperaturaString()) > 0) {
                j--;
                
            }
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
            
        }
        
        A[izq] = A[j];
        A[j] = pivote;

        if (izq < j - 1) {
            ordenarPorTemperatura(A, izq, j - 1);
        }
        if (j + 1 < der) {
            ordenarPorTemperatura(A, j + 1, der);
        }
       
    }

    public void ordenarPorSintomas(Paciente[] A, int izq, int der) {
        Paciente pivote = A[izq];
        int i = izq;
        int j = der;
        Paciente aux;
        
        while (i < j) {
            while (A[i].getContadorSintomas() <= pivote.getContadorSintomas() && i < j) {
                i++;
                
            }
            while (A[j].getContadorSintomas() > pivote.getContadorSintomas()) {
                j--;
                
            }
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        

        A[izq] = A[j];
        A[j] = pivote;

        if (izq < j - 1) {
            ordenarPorSintomas(A, izq, j - 1);
        }
        if (j + 1 < der) {
            ordenarPorSintomas(A, j + 1, der);
        }
    }

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVolverActionPerformed


    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String aBuscar = tfBuscar.getText();
        boolean encontrado = false;
        ListaEnlazada<Paciente> pacientes = g.getListPaciente();
        textListado.setText("");
        for (int i = 0; i < pacientes.longitud(); i++) {

            String apellido = pacientes.obtener(i).getApellidoString();
            if (apellido.startsWith(aBuscar)) {

                textListado.setText(textListado.getText() + pacientes.obtener(i).toString());

                encontrado = true;
            }
        }

        if (!encontrado) {
            textListado.setText("No existe ese apellido");
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiltrarActionPerformed
        textListado.setText("");
        ListaEnlazada<Paciente> pacientes = g.getListPaciente();
        for (int i = 0; i < pacientes.longitud(); i++) {
           
            if (ckDificultadRespirar.isSelected() && pacientes.obtener(i).getDificultadRespirarBoolean()) {
                textListado.setText(textListado.getText() + pacientes.obtener(i).toString());

            } else if (ckCansancio.isSelected() && pacientes.obtener(i).getCansancioBoolean()) {
                textListado.setText(textListado.getText() + pacientes.obtener(i).toString());

            } else if (ckDolorCabeza.isSelected() && pacientes.obtener(i).getDolorCabezaBoolean()) {
                textListado.setText(textListado.getText() + pacientes.obtener(i).toString());

            } else if (ckDolorGarganta.isSelected() && pacientes.obtener(i).getDolorGargantaBoolean()) {
                textListado.setText(textListado.getText() + pacientes.obtener(i).toString());

            } else if (ckDolorPecho.isSelected() && pacientes.obtener(i).getDolorPechoBoolean()) {
                textListado.setText(textListado.getText() + pacientes.obtener(i).toString());

            } else if (ckPerdidaGusto.isSelected() && pacientes.obtener(i).getPerdidaGustoBoolean()) {
                textListado.setText(textListado.getText() + pacientes.obtener(i).toString());

            } else if (ckPerdidaOlfato.isSelected() && pacientes.obtener(i).getPerdidaOlfatoBoolean()) {
                textListado.setText(textListado.getText() + pacientes.obtener(i).toString());

            } else if (ckTosSeca.isSelected() && pacientes.obtener(i).getTosSecaBoolean()) {
                textListado.setText(textListado.getText() + pacientes.obtener(i).toString());

            }
        }
    }//GEN-LAST:event_btFiltrarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        int seleccion = jlistPacientes.getSelectedIndex();
        if (seleccion != -1) {
            encontrado = null;
            String pacienteNombre = jlistPacientes.getSelectedValue();            
            String pacienteCodigo = pacienteNombre.substring(0, pacienteNombre.indexOf(" "));
            
            encontrado = g.aPaciente(Integer.parseInt(pacienteCodigo));
            
            if (encontrado != null) {
                Registro edicion = new Registro();

                edicion.setVisible(true);
                dispose();
                //Colocar datos del paciente en ese registro

                edicion.textApellidos.setText(encontrado.getApellidoString());
                edicion.textNombres.setText(encontrado.getNombreString());
                edicion.textEdad.setText(encontrado.getEdadString());
                edicion.textTemperatura.setText(encontrado.getTemperaturaString());
                if (encontrado.getTosSecaBoolean()) {
                    edicion.checkTos.doClick();
                }
                if (encontrado.getCansancioBoolean()) {
                    edicion.checkCansancio.doClick();
                }
                if (encontrado.getDificultadRespirarBoolean()) {
                    edicion.checkDificultadRespirar.doClick();
                }
                if (encontrado.getDolorCabezaBoolean()) {
                    edicion.checkDolorCabeza.doClick();
                }
                if (encontrado.getDolorGargantaBoolean()) {
                    edicion.checkDolorGarganta.doClick();
                }
                if (encontrado.getDolorPechoBoolean()) {
                    edicion.checkDolorPecho.doClick();
                }
                if (encontrado.getPerdidaGustoBoolean()) {
                    edicion.checkPerdidaGusto.doClick();
                }
                if (encontrado.getPerdidaOlfatoBoolean()) {
                    edicion.checkPerdidaOlfato.doClick();
                }
                //Eliminar paciente de la lista
                
                if (g.getListPaciente().borrar(encontrado)) {
                    
                    edicion.buttonAñadir.setText("Editar paciente");
                   
                    actualizarDatos(true);

                }

            }

        }


    }//GEN-LAST:event_btEditarActionPerformed
                                           

    public void actualizarDatos(boolean escribir) {
        if (escribir) {
            g.nuevaEscritura(g.getListPaciente());
        }
        textListado.setText(g.getListPaciente().toString());
        listaInicial = g.getListPaciente();
        jlistPacientes.setListData(g.getListaNombres());
    }

    
    private void btEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarMouseClicked

    private void btnDarAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDarAltaMouseClicked
        int seleccion = jlistPacientes.getSelectedIndex();
        if (seleccion != -1) {
            encontrado = null;
            String pacienteNombre = jlistPacientes.getSelectedValue();            
            String pacienteCodigo = pacienteNombre.substring(0, pacienteNombre.indexOf(" "));
            
            encontrado = g.aPaciente(Integer.parseInt(pacienteCodigo));            
            if (encontrado != null) {                
                if (g.getListPaciente().borrar(encontrado)) {                   
                    actualizarDatos(true);
                    
                }
            }
        }
    }//GEN-LAST:event_btnDarAltaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btFiltrar;
    private javax.swing.JButton btOrdenar;
    private javax.swing.JButton btVolver;
    private javax.swing.JButton btnDarAlta;
    private javax.swing.JCheckBox ckCansancio;
    private javax.swing.JCheckBox ckDificultadRespirar;
    private javax.swing.JCheckBox ckDolorCabeza;
    private javax.swing.JCheckBox ckDolorGarganta;
    private javax.swing.JCheckBox ckDolorPecho;
    private javax.swing.JCheckBox ckPerdidaGusto;
    private javax.swing.JCheckBox ckPerdidaOlfato;
    private javax.swing.JCheckBox ckTosSeca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlistPacientes;
    private javax.swing.JTextArea textListado;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables

}
