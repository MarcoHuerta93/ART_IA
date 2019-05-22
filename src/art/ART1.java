package art;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class ART1 extends javax.swing.JFrame {

    public static String patron;
    public static String [] patrones = new String [10];
    public static String [] nombrePatrones = new String [10];
    public static double [] porcentaje = new double [10];
    public static int patronPos = 0, patronCant = 0;
    public static String bin1 = "0",bin2= "0",bin3= "0",bin4= "0",bin5= "0",bin6= "0",bin7= "0",
            bin8= "0",bin9= "0",bin10= "0",bin11= "0",bin12= "0",bin13= "0",bin14= "0",
            bin15= "0",bin16= "0",bin17= "0",bin18= "0",bin19= "0",bin20= "0",bin21= "0",
            bin22= "0",bin23= "0",bin24= "0",bin25= "0";
    boolean ejecucion,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,
            b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25 = false;
    
    public ART1() {
        initComponents();
        //txtpInfo.setText(txtpInfo.getText() + "\nHola");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtNombrePatron = new javax.swing.JTextField();
        lblNombrePatron = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpInfo = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        lblProbable = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ART1 - Reconocimiento de patrones binarios");

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn11.setBackground(new java.awt.Color(255, 255, 255));
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setBackground(new java.awt.Color(255, 255, 255));
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setBackground(new java.awt.Color(255, 255, 255));
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setBackground(new java.awt.Color(255, 255, 255));
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn16.setBackground(new java.awt.Color(255, 255, 255));
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn17.setBackground(new java.awt.Color(255, 255, 255));
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.setBackground(new java.awt.Color(255, 255, 255));
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn19.setBackground(new java.awt.Color(255, 255, 255));
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn10.setBackground(new java.awt.Color(255, 255, 255));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn15.setBackground(new java.awt.Color(255, 255, 255));
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn20.setBackground(new java.awt.Color(255, 255, 255));
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.setBackground(new java.awt.Color(255, 255, 255));
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.setBackground(new java.awt.Color(255, 255, 255));
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.setBackground(new java.awt.Color(255, 255, 255));
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn24.setBackground(new java.awt.Color(255, 255, 255));
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });

        btn25.setBackground(new java.awt.Color(255, 255, 255));
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("TEORIA DE LA RESONANCIA ADAPTIVA");

        lblNombrePatron.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNombrePatron.setText("Nombre de patron:");

        btnAgregar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCalcular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtpInfo.setBackground(new java.awt.Color(0, 0, 0));
        txtpInfo.setForeground(new java.awt.Color(255, 255, 255));
        txtpInfo.setText("MODO APRENDIZAJE.\n\nDibuje la forma del patron en el recuadro del dibujo.\nAsigne un nombre antes de agregar un patron.\n");
        jScrollPane1.setViewportView(txtpInfo);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Mas probable:");

        lblProbable.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProbable.setForeground(new java.awt.Color(255, 0, 0));
        lblProbable.setText("_");
        lblProbable.setToolTipText("");

        btnReiniciar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lblTitulo)
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblProbable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombrePatron, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombrePatron)
                    .addComponent(btnAgregar))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProbable)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNombrePatron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblNombrePatron)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(b1==false){
            btn1.setBackground(Color.BLACK);
            b1 = true;
            bin1 = "1";
            patronCant++;
        }else {
            btn1.setBackground(Color.WHITE);
            b1 = false;
            bin1 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(b2==false){
            btn2.setBackground(Color.BLACK);
            b2 = true;
            bin2 = "1";
            patronCant++;
        }else {
            btn2.setBackground(Color.WHITE);
            b2 = false;
            bin2 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(b3==false){
            btn3.setBackground(Color.BLACK);
            b3 = true;
            bin3 = "1";
            patronCant++;
        }else {
            btn3.setBackground(Color.WHITE);
            b3 = false;
            bin3 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(b4==false){
            btn4.setBackground(Color.BLACK);
            b4 = true;
            bin4 = "1";
            patronCant++;
        }else {
            btn4.setBackground(Color.WHITE);
            b4 = false;
            bin4 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(b5==false){
            btn5.setBackground(Color.BLACK);
            b5 = true;
            bin5 = "1";
            patronCant++;
        }else {
            btn5.setBackground(Color.WHITE);
            b5 = false;
            bin5 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(b6==false){
            btn6.setBackground(Color.BLACK);
            b6 = true;
            bin6 = "1";
            patronCant++;
        }else {
            btn6.setBackground(Color.WHITE);
            b6 = false;
            bin6 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(b7==false){
            btn7.setBackground(Color.BLACK);
            b7 = true;
            bin7 = "1";
            patronCant++;
        }else {
            btn7.setBackground(Color.WHITE);
            b7 = false;
            bin7 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(b8==false){
            btn8.setBackground(Color.BLACK);
            b8 = true;
            bin8 = "1";
            patronCant++;
        }else {
            btn8.setBackground(Color.WHITE);
            b8 = false;
            bin8 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(b9==false){
            btn9.setBackground(Color.BLACK);
            b9 = true;
            bin9 = "1";
            patronCant++;
        }else {
            btn9.setBackground(Color.WHITE);
            b9 = false;
            bin9 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        if(b10==false){
            btn10.setBackground(Color.BLACK);
            b10 = true;
            bin10 = "1";
            patronCant++;
        }else {
            btn10.setBackground(Color.WHITE);
            b10 = false;
            bin10 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        if(b11==false){
            btn11.setBackground(Color.BLACK);
            b11 = true;
            bin11 = "1";
            patronCant++;
        }else {
            btn11.setBackground(Color.WHITE);
            b11 = false;
            bin11 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        if(b12==false){
            btn12.setBackground(Color.BLACK);
            b12 = true;
            bin12 = "1";
            patronCant++;
        }else {
            btn12.setBackground(Color.WHITE);
            b12 = false;
            bin12 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        if(b13==false){
            btn13.setBackground(Color.BLACK);
            b13 = true;
            bin13 = "1";
            patronCant++;
        }else {
            btn13.setBackground(Color.WHITE);
            b13 = false;
            bin13 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        if(b14==false){
            btn14.setBackground(Color.BLACK);
            b14 = true;
            bin14 = "1";
            patronCant++;
        }else {
            btn14.setBackground(Color.WHITE);
            b14 = false;
            bin14 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        if(b15==false){
            btn15.setBackground(Color.BLACK);
            b15 = true;
            bin15 = "1";
            patronCant++;
        }else {
            btn15.setBackground(Color.WHITE);
            b15 = false;
            bin15 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        if(b16==false){
            btn16.setBackground(Color.BLACK);
            b16 = true;
            bin16 = "1";
            patronCant++;
        }else {
            btn16.setBackground(Color.WHITE);
            b16 = false;
            bin16 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        if(b17==false){
            btn17.setBackground(Color.BLACK);
            b17 = true;
            bin17 = "1";
            patronCant++;
        }else {
            btn17.setBackground(Color.WHITE);
            b17 = false;
            bin17 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        if(b18==false){
            btn18.setBackground(Color.BLACK);
            b18 = true;
            bin18 = "1";
            patronCant++;
        }else {
            btn18.setBackground(Color.WHITE);
            b18 = false;
            bin18 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        if(b19==false){
            btn19.setBackground(Color.BLACK);
            b19 = true;
            bin19 = "1";
            patronCant++;
        }else {
            btn19.setBackground(Color.WHITE);
            b19 = false;
            bin19 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        if(b20==false){
            btn20.setBackground(Color.BLACK);
            b20 = true;
            bin20 = "1";
            patronCant++;
        }else {
            btn20.setBackground(Color.WHITE);
            b20 = false;
            bin20 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        if(b21==false){
            btn21.setBackground(Color.BLACK);
            b21 = true;
            bin21 = "1";
            patronCant++;
        }else {
            btn21.setBackground(Color.WHITE);
            b21 = false;
            bin21 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        if(b22==false){
            btn22.setBackground(Color.BLACK);
            b22 = true;
            bin22 = "1";
            patronCant++;
        }else {
            btn22.setBackground(Color.WHITE);
            b22 = false;
            bin22 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        if(b23==false){
            btn23.setBackground(Color.BLACK);
            b23 = true;
            bin23 = "1";
            patronCant++;
        }else {
            btn23.setBackground(Color.WHITE);
            b23 = false;
            bin23 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        if(b24==false){
            btn24.setBackground(Color.BLACK);
            b24 = true;
            bin24 = "1";
            patronCant++;
        }else {
            btn24.setBackground(Color.WHITE);
            b24 = false;
            bin24 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        if(b25==false){
            btn25.setBackground(Color.BLACK);
            b25 = true;
            bin25 = "1";
            patronCant++;
        }else {
            btn25.setBackground(Color.WHITE);
            b25 = false;
            bin25 = "0";
            patronCant--;
        }
    }//GEN-LAST:event_btn25ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(patronCant < 5) {
            JOptionPane.showConfirmDialog(null, "Por favor dibuje con mas de 4 cuadros seleccionados", "Error", JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE);
        }else{
            nombrePatrones[patronPos] = txtNombrePatron.getText();
            patrones[patronPos] = bin1+bin2+bin3+bin4+bin5+bin6+bin7+bin8+bin9+bin10+
            bin11+bin12+bin13+bin14+bin15+bin16+bin17+bin18+bin19+bin20+bin21+
            bin22+bin23+bin24+bin25;
            porcentaje[patronPos] = patronCant;
            txtpInfo.setText(txtpInfo.getText() + "\n" + "Nuevo patron: " + nombrePatrones[patronPos]);
            patronPos++;
            limpiar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if(ejecucion == false && patronPos > 0) {
            txtpInfo.setText(txtpInfo.getText() + "\n\n" + "MODO EJECUCION.");
            ejecucion = true;
        }
        if(patronPos > 0) {
            patron = bin1+bin2+bin3+bin4+bin5+bin6+bin7+bin8+bin9+bin10+
            bin11+bin12+bin13+bin14+bin15+bin16+bin17+bin18+bin19+bin20+bin21+
            bin22+bin23+bin24+bin25;
            
            //Calculando patrones
            double aux = 0, aux2 = 0, acertados = 0;
            DecimalFormat formato1 = new DecimalFormat("#.00");
            txtpInfo.setText(txtpInfo.getText() + "\n");
            for(int i = 0; i < patronPos; i++) {
                for(int j = 0; j < patrones[i].length(); j++) {
                    if(patrones[i].charAt(j) == '1' && patron.charAt(j) == '1'){
                        acertados ++;
                    }
                    else if(patrones[i].charAt(j) == '0' && patron.charAt(j) == '1'){
                        acertados --;
                    }
                }
                aux = (acertados * 100) / porcentaje[i];
                if(aux <= 0){
                    txtpInfo.setText(txtpInfo.getText() + nombrePatrones[i] + ": 0,00%  ");
                }else {
                    txtpInfo.setText(txtpInfo.getText() + nombrePatrones[i] + ": " + formato1.format(aux) + "%  ");
                }
                acertados = 0;
                if(aux > 25 && aux > aux2) {
                    aux2 = aux;
                    lblProbable.setText(nombrePatrones[i]);
                }
                else if(aux < 25 && aux2 < 25) {
                    lblProbable.setText("_");
                }
            }
        }else {
            JOptionPane.showConfirmDialog(null, "Por favor agregue patrones de aprendizaje", "Error", JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        limpiar();
        txtpInfo.setText("MODO APRENDIZAJE.\n\n" +
            "Dibuje la forma del patron en el recuadro del dibujo.\n" +
            "Asigne un nombre antes de agregar un patron.");
        ejecucion = false;
        patronPos = 0;
        patronCant = 0;
    }//GEN-LAST:event_btnReiniciarActionPerformed

    
    private void limpiar() {
        txtNombrePatron.setText("");
        patronCant = 0;
        lblProbable.setText("_");
        
        btn1.setBackground(Color.WHITE);
        btn2.setBackground(Color.WHITE);
        btn3.setBackground(Color.WHITE);
        btn4.setBackground(Color.WHITE);
        btn5.setBackground(Color.WHITE);
        btn6.setBackground(Color.WHITE);
        btn7.setBackground(Color.WHITE);
        btn8.setBackground(Color.WHITE);
        btn9.setBackground(Color.WHITE);
        btn10.setBackground(Color.WHITE);
        btn11.setBackground(Color.WHITE);
        btn12.setBackground(Color.WHITE);
        btn13.setBackground(Color.WHITE);
        btn14.setBackground(Color.WHITE);
        btn15.setBackground(Color.WHITE);
        btn16.setBackground(Color.WHITE);
        btn17.setBackground(Color.WHITE);
        btn18.setBackground(Color.WHITE);
        btn19.setBackground(Color.WHITE);
        btn20.setBackground(Color.WHITE);
        btn21.setBackground(Color.WHITE);
        btn22.setBackground(Color.WHITE);
        btn23.setBackground(Color.WHITE);
        btn24.setBackground(Color.WHITE);
        btn25.setBackground(Color.WHITE);
        b1 = false;
        b2 = false; 
        b3 = false; 
        b4 = false; 
        b5 = false; 
        b6 = false; 
        b7 = false; 
        b8 = false; 
        b9 = false; 
        b10 = false; 
        b11 = false; 
        b12 = false; 
        b13 = false; 
        b14 = false; 
        b15 = false; 
        b16 = false; 
        b17 = false; 
        b18 = false; 
        b19 = false; 
        b20 = false; 
        b21 = false; 
        b22 = false; 
        b23 = false; 
        b24 = false; 
        b25 = false; 
        bin1 = "0";
        bin2 = "0";
        bin3 = "0";
        bin4 = "0";
        bin5 = "0";
        bin6 = "0";
        bin7 = "0";
        bin8 = "0";
        bin9 = "0";
        bin10 = "0";
        bin11 = "0";
        bin12 = "0";
        bin13 = "0";
        bin14 = "0";
        bin15 = "0";
        bin16 = "0";
        bin17 = "0";
        bin18 = "0";
        bin19 = "0";
        bin20 = "0";
        bin21 = "0";
        bin22 = "0";
        bin23 = "0";
        bin24 = "0";
        bin25 = "0";
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ART1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombrePatron;
    private javax.swing.JLabel lblProbable;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNombrePatron;
    private javax.swing.JTextPane txtpInfo;
    // End of variables declaration//GEN-END:variables
}
