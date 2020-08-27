/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.GestionadorPacientes;
import Objetos.Paciente;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author AlexisRM
 */
public class ListaPacientes extends javax.swing.JFrame {

    int ordenar = 0;
    GestionadorPacientes g;

    public ListaPacientes() {
        initComponents();
        g = new GestionadorPacientes();
        setTitle("Lista de pacientes Covid 19");
        setBounds(650, 300, 700, 570);
        textListado.setText(g.lectura());
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
        btEditar1 = new javax.swing.JButton();

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
        btOrdenar.setText("Ordenar por creación");
        btOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(255, 153, 153));
        btEditar.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        btEditar.setText("Editar Paciente");

        btVolver.setBackground(new java.awt.Color(204, 204, 204));
        btVolver.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        btVolver.setText("Volver");
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });

        btEditar1.setBackground(new java.awt.Color(153, 153, 255));
        btEditar1.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        btEditar1.setText("Dar de alta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 438, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckPerdidaOlfato)
                            .addComponent(btFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckPerdidaGusto)
                            .addComponent(ckDificultadRespirar)
                            .addComponent(ckTosSeca)
                            .addComponent(ckCansancio)
                            .addComponent(ckDolorCabeza)
                            .addComponent(ckDolorGarganta)
                            .addComponent(ckDolorPecho)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscar))
                            .addComponent(jLabel3)
                            .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckDificultadRespirar)
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
                        .addComponent(btEditar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVolver)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarActionPerformed
        switch (ordenar) {
            case 0:
                btOrdenar.setText("Ordenar por edad");
                break;
            case 1:
                btOrdenar.setText("Ordenar por apellido");
                break;
            case 2:
                btOrdenar.setText("Ordenar por temperatura");
                break;
            case 3:
                btOrdenar.setText("Ordenar por Nro. de Sintomas");
                break;
            case 4:
                btOrdenar.setText("Ordenar por creación");
                ordenar = -1;
                break;
            default:
                break;
        }
        ordenar++;

        ArrayList<Paciente> pacientes = g.getListPaciente();

    }//GEN-LAST:event_btOrdenarActionPerformed

    public ArrayList<Paciente> ordenarPorEdad(ArrayList<Paciente> paci) {
        
        return paci;
    }

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVolverActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiltrarActionPerformed

    }//GEN-LAST:event_btFiltrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPacientes().setVisible(true);
            }
        });
    }

    public static void quicksort(int A[], int izq, int der) {

        int pivote = A[izq]; 
        int i = izq;         
        int j = der;         
        int aux;

        while (i < j) {                                                           
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
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
            quicksort(A, izq, j - 1);       
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der);         
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEditar1;
    private javax.swing.JButton btFiltrar;
    private javax.swing.JButton btOrdenar;
    private javax.swing.JButton btVolver;
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
    private javax.swing.JTextArea textListado;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables
}
