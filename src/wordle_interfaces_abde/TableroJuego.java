/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordle_interfaces_abde;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Utente-XB
 */
public class TableroJuego extends javax.swing.JFrame implements ActionListener {

    public JTextPane[] PalabraOculta = new JTextPane[5];// de 5 
    public JTextPane[] PalabraEscrita = new JTextPane[5];// de 5  
    static Jugador jugadorAux = new Jugador();

    /**
     * Creates new form TableroJuego
     */
    public TableroJuego() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextLetrasAcertadas = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextNombre = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextIntentos = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextLetrasDescartadas = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPalabraEscrita1 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPalabraEscrita2 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPalabraEscrita3 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextPalabraEscrita4 = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextPalabraEscrita5 = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextPalabraEscrita6 = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextPalabraEscrita7 = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextPalabraEscrita8 = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextPalabraEscrita9 = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextPalabraEscrita10 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextRecuperaPalabra = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        JButtonPalabraComprobar = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(30, 178, 67));
        jTextField1.setText("WORDLE PLAY INTERFACES");
        jTextField1.setMargin(new java.awt.Insets(2, 2, 2, 4));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Letras Descartadas: ");

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("TU Palabra : ");

        jTextLetrasAcertadas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextLetrasAcertadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextLetrasAcertadas.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextLetrasAcertadas.setName(""); // NOI18N
        jScrollPane3.setViewportView(jTextLetrasAcertadas);

        jTextNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextNombre.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextNombre.setName(""); // NOI18N
        jScrollPane5.setViewportView(jTextNombre);

        jTextIntentos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextIntentos.setText("Intentos: 6");
        jTextIntentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextIntentos.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextIntentos.setName(""); // NOI18N
        jScrollPane6.setViewportView(jTextIntentos);

        jTextLetrasDescartadas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextLetrasDescartadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextLetrasDescartadas.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextLetrasDescartadas.setName(""); // NOI18N
        jScrollPane7.setViewportView(jTextLetrasDescartadas);

        jTextPalabraEscrita1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextPalabraEscrita1.setText(" -");
        jTextPalabraEscrita1.setAlignmentX(2.5F);
        jTextPalabraEscrita1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPalabraEscrita1.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextPalabraEscrita1.setName(""); // NOI18N
        jScrollPane8.setViewportView(jTextPalabraEscrita1);

        jTextPalabraEscrita2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextPalabraEscrita2.setText(" -");
        jTextPalabraEscrita2.setAlignmentX(2.5F);
        jTextPalabraEscrita2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPalabraEscrita2.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextPalabraEscrita2.setName(""); // NOI18N
        jScrollPane9.setViewportView(jTextPalabraEscrita2);

        jTextPalabraEscrita3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextPalabraEscrita3.setText(" -");
        jTextPalabraEscrita3.setAlignmentX(2.5F);
        jTextPalabraEscrita3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPalabraEscrita3.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextPalabraEscrita3.setName(""); // NOI18N
        jScrollPane10.setViewportView(jTextPalabraEscrita3);

        jTextPalabraEscrita4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextPalabraEscrita4.setText(" -");
        jTextPalabraEscrita4.setAlignmentX(2.5F);
        jTextPalabraEscrita4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPalabraEscrita4.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextPalabraEscrita4.setName(""); // NOI18N
        jScrollPane11.setViewportView(jTextPalabraEscrita4);

        jTextPalabraEscrita5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextPalabraEscrita5.setText(" -");
        jTextPalabraEscrita5.setAlignmentX(2.5F);
        jTextPalabraEscrita5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPalabraEscrita5.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextPalabraEscrita5.setName(""); // NOI18N
        jScrollPane12.setViewportView(jTextPalabraEscrita5);

        jTextPalabraEscrita6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextPalabraEscrita6.setText(" -");
        jTextPalabraEscrita6.setAlignmentX(2.5F);
        jTextPalabraEscrita6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPalabraEscrita6.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextPalabraEscrita6.setName(""); // NOI18N
        jScrollPane13.setViewportView(jTextPalabraEscrita6);

        jTextPalabraEscrita7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextPalabraEscrita7.setText(" -");
        jTextPalabraEscrita7.setAlignmentX(2.5F);
        jTextPalabraEscrita7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPalabraEscrita7.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextPalabraEscrita7.setName(""); // NOI18N
        jScrollPane14.setViewportView(jTextPalabraEscrita7);

        jTextPalabraEscrita8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextPalabraEscrita8.setText(" -");
        jTextPalabraEscrita8.setAlignmentX(2.5F);
        jTextPalabraEscrita8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPalabraEscrita8.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextPalabraEscrita8.setName(""); // NOI18N
        jScrollPane15.setViewportView(jTextPalabraEscrita8);

        jTextPalabraEscrita9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextPalabraEscrita9.setText(" -");
        jTextPalabraEscrita9.setAlignmentX(2.5F);
        jTextPalabraEscrita9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPalabraEscrita9.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextPalabraEscrita9.setName(""); // NOI18N
        jScrollPane16.setViewportView(jTextPalabraEscrita9);

        jTextPalabraEscrita10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextPalabraEscrita10.setText(" -");
        jTextPalabraEscrita10.setAlignmentX(2.5F);
        jTextPalabraEscrita10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPalabraEscrita10.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextPalabraEscrita10.setName(""); // NOI18N
        jScrollPane17.setViewportView(jTextPalabraEscrita10);

        jLabel4.setBackground(new java.awt.Color(153, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Letras  Acertadas: ");

        jLabel5.setBackground(new java.awt.Color(153, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Oculta : ");

        jLabel6.setBackground(new java.awt.Color(153, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Info: ");

        jTextRecuperaPalabra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextRecuperaPalabra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextRecuperaPalabra.setMinimumSize(new java.awt.Dimension(201, 20));
        jTextRecuperaPalabra.setName(""); // NOI18N
        jScrollPane18.setViewportView(jTextRecuperaPalabra);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel7.setBackground(new java.awt.Color(153, 255, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Dime Palabra: ");

        JButtonPalabraComprobar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JButtonPalabraComprobar.setText("Comprobar");
        JButtonPalabraComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonPalabraComprobarActionPerformed(evt);
            }
        });

        jProgressBar1.setForeground(new java.awt.Color(0, 153, 0));
        jProgressBar1.setMaximum(6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane7)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33)
                                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)
                                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane18)
                            .addComponent(JButtonPalabraComprobar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(497, 497, 497)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addGap(32, 32, 32)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JButtonPalabraComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(214, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(198, 198, 198)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void JButtonPalabraComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonPalabraComprobarActionPerformed
        // TODO add your handling code here:      
        System.out.println("Se ha pulsado el Boton");
        String palabraEscritaJ = jTextRecuperaPalabra.getText().trim().toUpperCase();
        System.out.println(palabraEscritaJ);
        boolean encontrada = Arrays.equals(jugadorAux.partidaJugador.getNombrePalabra(), jugadorAux.partidaJugador.getPalabraOculta());
        boolean palabraCorrecta = jugadorAux.partidaJugador.getListaPalabras().listaPalabrasExistentes.contains(palabraEscritaJ);
        if (palabraEscritaJ.length() != 5 || jugadorAux.partidaJugador.getIntentos() == 0 || encontrada || !palabraCorrecta) {
            jTextArea1.setText("La Palabra Tiene Que Tener 5 letras: " + palabraEscritaJ);
            if (jugadorAux.partidaJugador.getIntentos() == 0) {
                jTextArea1.setText("Lo siento Se Te han Gastado los intentos: " + 0);
            }
            if (encontrada) {
                jTextArea1.setText("Felicidades Completaste el Juego: " + palabraEscritaJ + " \npalabra adivinar es;" + jugadorAux.partidaJugador.chartoString(jugadorAux.partidaJugador.getNombrePalabra()));
            }
            if (!palabraCorrecta) {
                jTextArea1.setText("Lo siento, La Palabra: " + palabraEscritaJ + ", \nNo esta Registrada en nuestro diccionario \n o no tiene 5 Letras");

            }
        } else {
            //jugadorAux.partidaJugador.comprobarLetrasPalabra();
            jugadorAux.partidaJugador.setPalabraEscrita(palabraEscritaJ.toCharArray());
            jugadorAux.partidaJugador.comprobarLetrasPalabra();

            jTextArea1.setText("Se ha Guardado la palabra Escrita: " + palabraEscritaJ);
            if (encontrada) {
                jTextArea1.setText("Felicidades Completaste el Juego: " + palabraEscritaJ + " \npalabra adivinar es;" + jugadorAux.partidaJugador.chartoString(jugadorAux.partidaJugador.getNombrePalabra()));
            }
            //jugadorAux.partidaJugador.comprobarLetrasPalabra();
            System.out.println("comprbando letras");
            ActualizarDatosTablero();
            comrobarColores();

        }

    }//GEN-LAST:event_JButtonPalabraComprobarActionPerformed
    void ActualizarDatosTablero() {
        // jugadorAux.partidaJugador.comprobarLetrasPalabra();

        Jugada jugadaAux = jugadorAux.partidaJugador;
        System.out.println("**********mostradno Datos Prueba******");
        System.out.println("Palabra Escrita: " + Arrays.toString(jugadaAux.getPalabraEscrita()));
        System.out.println("Palabra generada: " + Arrays.toString(jugadaAux.getNombrePalabra()));
        System.out.println("Palabra Oculta : " + Arrays.toString(jugadaAux.getPalabraOculta()));
        System.out.println("Letras Acertadas: " + Arrays.toString(jugadaAux.getLetrasFind()));
        System.out.println("********Fin mostrar******************");
        // jTextLetrasDescartadas.setText(jugadorAux.partidaJugador.getLetrasNotFind().toString());
        for (int i = 0; i < PalabraEscrita.length; i++) {
            String letra = jugadaAux.getPalabraEscrita()[i] + "";
            String letraOculta = jugadaAux.getPalabraOculta()[i] + "";

            //  System.out.print(" Posicion letra " + i + " : " + letra.toUpperCase().trim());
            //System.out.print(" Posicion letra2 " + i + " : " + letraOculta.toUpperCase().trim());
            PalabraEscrita[i].setText(letra.toUpperCase().trim());
            PalabraOculta[i].setText(letraOculta.toUpperCase().trim());

        }
        String AcertadasAnterior = jTextLetrasAcertadas.getText();
        String AcertadasPoster = jugadaAux.chartoString(jugadaAux.getLetrasFind());
        String LetrasAcertFinal = AcertadasAnterior;
        for (char c : AcertadasPoster.toCharArray()) {
            if (!jugadorAux.partidaJugador.palabraTieneLetra(LetrasAcertFinal.toCharArray(), c)) {
                LetrasAcertFinal += c;
            }
        }
        String DescartadasAnterior = jTextLetrasDescartadas.getText();
        String DescartadasPoster = jugadaAux.chartoString(jugadaAux.getLetrasNotFind());
        //String LetrasDescartadasFinal = DescartadasPoster;
        jTextLetrasAcertadas.setText(LetrasAcertFinal);
        jTextLetrasDescartadas.setText(DevuelveDiferenciaString(DescartadasAnterior, DescartadasPoster));
        jTextLetrasDescartadas.setText(DevuelveDiferenciaString(DescartadasAnterior, DescartadasPoster));

        jTextIntentos.setText("Intentos: " + jugadaAux.getIntentos());
        jProgressBar1.setValue(jugadaAux.getIntentos());// barra de Progreso

    }

    static public String DevuelveDiferenciaString(String palabraA, String palabraB) {
        char tempArray[] = (palabraA + palabraB).toCharArray();
        Arrays.sort(tempArray);
        for (int i = 0; i < tempArray.length - 1; i++) {
            if (tempArray[i] == tempArray[i + 1]) {
                tempArray[i] = ' ';
            }
        }
        String palabraReturn = jugadorAux.partidaJugador.chartoString(tempArray);
        return palabraReturn;
    }

    void comrobarColores() {
        for (int i = 0; i < PalabraOculta.length; i++) {
            if (PalabraOculta[i].getText().trim().equals("*")) {
                //Azul
                PalabraOculta[i].setBorder(new LineBorder(Color.BLUE, 2));
                PalabraOculta[i].setBackground(new Color(46, 46, 46));

            } else if (PalabraOculta[i].getText().trim().equals("-")) {
                //Rojo Claro
                PalabraOculta[i].setBorder(new LineBorder(Color.RED, 2));

            } else {
                //verde
                PalabraOculta[i].setBorder(new LineBorder(Color.GREEN, 2));
                //77F2A1
                //PalabraOculta[i].setForeground(new java.awt.Color(119, 242, 161));// No me pia el BackGraundColor

            }

        }
    }

    void ComprobarDatos(Jugador jugador) {
        PalabraOculta[0] = jTextPalabraEscrita1;
        PalabraOculta[1] = jTextPalabraEscrita2;
        PalabraOculta[2] = jTextPalabraEscrita3;
        PalabraOculta[3] = jTextPalabraEscrita4;
        PalabraOculta[4] = jTextPalabraEscrita5;

        PalabraEscrita[0] = jTextPalabraEscrita6;
        PalabraEscrita[1] = jTextPalabraEscrita7;
        PalabraEscrita[2] = jTextPalabraEscrita8;
        PalabraEscrita[3] = jTextPalabraEscrita9;
        PalabraEscrita[4] = jTextPalabraEscrita10;

        //textPanel6
        //jTextNombre.setBorder(new LineBorder(Color.BLUE,5));
        //jTextLetrasAcertadas.setCaretColor(new Color(255, 255, 255));//50E249
        //jTextNombre.setBackground(new Color(46, 46, 46));
        jugadorAux = jugador;// lo inicializamos
        //+" la palabra generada es :"+Arrays.toString(jugadaAux.partidaJugador.getNombrePalabra())
        this.jTextNombre.setText("Name : " + jugadorAux.nombreJugador);
        JButtonPalabraComprobar.addActionListener(this);// A?adimos el ActioElisener al button tanvbien

    }

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TableroJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonPalabraComprobar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextIntentos;
    private javax.swing.JTextPane jTextLetrasAcertadas;
    private javax.swing.JTextPane jTextLetrasDescartadas;
    private javax.swing.JTextPane jTextNombre;
    private javax.swing.JTextPane jTextPalabraEscrita1;
    private javax.swing.JTextPane jTextPalabraEscrita10;
    private javax.swing.JTextPane jTextPalabraEscrita2;
    private javax.swing.JTextPane jTextPalabraEscrita3;
    private javax.swing.JTextPane jTextPalabraEscrita4;
    private javax.swing.JTextPane jTextPalabraEscrita5;
    private javax.swing.JTextPane jTextPalabraEscrita6;
    private javax.swing.JTextPane jTextPalabraEscrita7;
    private javax.swing.JTextPane jTextPalabraEscrita8;
    private javax.swing.JTextPane jTextPalabraEscrita9;
    private javax.swing.JTextPane jTextRecuperaPalabra;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        int random = (int) (Math.random() * 55);
        String pr = random + "";
        //System.out.println(pr + jTextRecuperaPalabra.getText());
        //b1.setIcon(new ImageIcon("image/card/" + random + ".png"));
        // jTextArea1.setText(jTextRecuperaPalabra.getText());
        //de prueba
    }

}
