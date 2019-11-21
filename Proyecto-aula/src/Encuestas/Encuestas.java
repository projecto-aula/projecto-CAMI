package Encuestas;

import java.util.ArrayList;
import javax.swing.JFrame;
import proyecto.aula.Panel_Menu;
import proyecto.aula.Ventana;


public class Encuestas extends javax.swing.JPanel {
     ArrayList<String> seleccion = new ArrayList<String>();
    /**      
     * Creates new form Encuestas
     */
    public Encuestas() {
        initComponents();
        
            Grupo_botones1.add(opc_1);
            Grupo_botones1.add(opc_2);
            Grupo_botones1.add(opc_3);
            
            Grupo_botones2.add(opc_4);
            Grupo_botones2.add(opc_5);
            Grupo_botones2.add(opc_6);
            
            Grupo_botones3.add(opc_7);
            Grupo_botones3.add(opc_8);
            Grupo_botones3.add(opc_9);
            
            jButton1.setEnabled(false);
            
           
            
         
    }
    public void comprobar(){
    
        if ((opc_1.isEnabled() || opc_2.isEnabled() || opc_3.isEnabled())) {
            
            jButton1.setEnabled(true);
            
        }else{jButton1.setEnabled(false);}
    
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
       

        Grupo_botones1 = new javax.swing.ButtonGroup();
        Grupo_botones2 = new javax.swing.ButtonGroup();
        Grupo_botones3 = new javax.swing.ButtonGroup();
        Grupo_Botones4 = new javax.swing.ButtonGroup();
        Grupo_botones5 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        opc_3 = new javax.swing.JRadioButton();
        opc_2 = new javax.swing.JRadioButton();
        opc_1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        opc_4 = new javax.swing.JRadioButton();
        opc_5 = new javax.swing.JRadioButton();
        opc_6 = new javax.swing.JRadioButton();
        opc_7 = new javax.swing.JRadioButton();
        opc_8 = new javax.swing.JRadioButton();
        opc_9 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        opc_10 = new javax.swing.JRadioButton();
        opc_11 = new javax.swing.JRadioButton();
        opc_12 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        opc_13 = new javax.swing.JRadioButton();
        opc_14 = new javax.swing.JRadioButton();
        opc_15 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 254, 245));
        setForeground(new java.awt.Color(255, 254, 245));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 3, 21));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contesta las siguientes preguntas.");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setForeground(new java.awt.Color(187, 87, 187));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(100, 100));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(10, 10));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 800));

        jPanel1.setBackground(new java.awt.Color(255, 254, 245));
        
        jPanel1.setAlignmentX(1.0F);
        jPanel1.setAlignmentY(1.0F);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jLabel2.setBackground(new java.awt.Color(255, 254, 245));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 5, 5));
        jLabel2.setText("1.-¿Por qué representa un problema para México ser un país receptor de migrantes con fines laborales?");

        opc_3.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_botones1.add(opc_3);
        opc_3.setForeground(new java.awt.Color(2, 5, 5));
        opc_3.setText("C) Los migrantes no trabajan");

        opc_2.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_botones1.add(opc_2);
        opc_2.setForeground(new java.awt.Color(2, 5, 5));
        opc_2.setText("<html> B)  Por problemas ambientales que crean a mediad que pasan por México<html>");

        opc_1.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_botones1.add(opc_1);
       
        opc_1.setForeground(new java.awt.Color(2, 5, 5));
        opc_1.setText("<html>A) Porque el país ya de por sí presentaba una clara deficiencia para la asignación <p>de trabajos destinados a sus propios habitantes, y a medida que migrantes entran el problema incrementa.<html>");
        opc_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_1ActionPerformed(evt);
             
            
            }
        });
        

        jButton1.setBackground(new java.awt.Color(255, 254, 245));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(2, 5, 5));
        jButton1.setText("Enviar");
        
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 254, 245));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 5, 5));
        jLabel4.setText("3.-¿Qué establece el artículo número 23 establecido por la DUDH?");

        jLabel3.setBackground(new java.awt.Color(255, 254, 245));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 5, 5));
        jLabel3.setText("2.-¿Cuál es el significado de las siglas “DUDH”?");

        opc_4.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_botones2.add(opc_4);
        opc_4.setForeground(new java.awt.Color(2, 5, 5));
        opc_4.setText("<html>A) Declaración Universal De los Humanos.<html>");
        opc_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_4ActionPerformed(evt);
            }
        });

        opc_5.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_botones2.add(opc_5);
        opc_5.setForeground(new java.awt.Color(2, 5, 5));
        opc_5.setText("<html> B)  Declaración Universal de los Derechos Humanos. <html>");
        opc_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_5ActionPerformed(evt);
            }
        });

        opc_6.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_botones2.add(opc_6);
        opc_6.setForeground(new java.awt.Color(2, 5, 5));
        opc_6.setText("C) Derechos Universales Dignificados para Humanos");
        opc_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_6ActionPerformed(evt);
            }
        });

        opc_7.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_botones3.add(opc_7);
        opc_7.setForeground(new java.awt.Color(2, 5, 5));
        opc_7.setText("C) Todas las anteriores");

        opc_8.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_botones3.add(opc_8);
        opc_8.setForeground(new java.awt.Color(2, 5, 5));
        opc_8.setText("<html> B)  Toda persona tiene derecho, sin discriminación alguna, a salario igual por trabajo igual. <html>");
        opc_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_8ActionPerformed(evt);
            }
        });

        opc_9.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_botones3.add(opc_9);
        opc_9.setForeground(new java.awt.Color(2, 5, 5));
        opc_9.setText("<html>A) Toda persona tiene derecho al trabajo, a la libre elección de su trabajo, a condiciones <p> equitativas y satisfactorias de trabajo y a la protección contra el desempleo..<html>");
        opc_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_9ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 254, 245));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 5, 5));
        jLabel5.setText("4.-¿Cuales son las principales causas de la migración en centro america?");

        opc_10.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_Botones4.add(opc_10);
        opc_10.setForeground(new java.awt.Color(2, 5, 5));
        opc_10.setText("C) Por efectos psicológicos. envejecimiento, sobrepoblación en un país.");
        opc_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_10ActionPerformed(evt);
            }
        });

        opc_11.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_Botones4.add(opc_11);
        opc_11.setForeground(new java.awt.Color(2, 5, 5));
        opc_11.setText("B) Cambio climatico, Corrupción, Hambre. ");
        opc_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_11ActionPerformed(evt);
            }
        });

        opc_12.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_Botones4.add(opc_12);
        opc_12.setForeground(new java.awt.Color(2, 5, 5));
        opc_12.setText("A) Causas laborales, inseguridad, desigualdad social.");
        opc_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_12ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 254, 245));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 5, 5));
        jLabel6.setText("5.-¿Qué es la migración irregular?");

        opc_13.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_botones5.add(opc_13);
        opc_13.setForeground(new java.awt.Color(2, 5, 5));
        opc_13.setText("<html>A) Movimiento migratorio de personas a través de las fronteras sin atender los<p> requerimientos legales del país de destino y muchas veces, también del país de procedencia.<html>");
        opc_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_13ActionPerformed(evt);
                      if (opc_13.isEnabled()) {
               jButton1.setEnabled(true);
            
        }else{
                jButton1.setEnabled(false);
        }
            }
        });

        opc_14.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_botones5.add(opc_14);
        opc_14.setForeground(new java.awt.Color(2, 5, 5));
        opc_14.setText("B) Movimiento migratorio, donde las personas migran sin ningún familiar.");
        opc_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_14ActionPerformed(evt);
                      if (opc_14.isEnabled()) {
               jButton1.setEnabled(true);
            
        }else{
                jButton1.setEnabled(false);
        }
            }
        });

        opc_15.setBackground(new java.awt.Color(255, 254, 245));
        Grupo_botones5.add(opc_15);
        opc_15.setForeground(new java.awt.Color(2, 5, 5));
        opc_15.setText("C) Cuando el migrante proviene de un continente distinto.");
        opc_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_15ActionPerformed(evt);
                if (opc_15.isEnabled()) {
               jButton1.setEnabled(true);
            
        }else{
                jButton1.setEnabled(false);
        }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opc_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opc_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(opc_3))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opc_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opc_6)
                            .addComponent(opc_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opc_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opc_7)
                                    .addComponent(opc_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(opc_11)
                                            .addComponent(opc_10)
                                            .addComponent(opc_12)))))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opc_14)
                                    .addComponent(opc_15)
                                    .addComponent(opc_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(opc_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opc_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opc_3)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(opc_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opc_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(opc_6)
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(opc_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opc_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(opc_7)
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(opc_12)
                .addGap(18, 18, 18)
                .addComponent(opc_11)
                .addGap(20, 20, 20)
                .addComponent(opc_10)
                .addGap(45, 45, 45)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(opc_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opc_14)
                .addGap(20, 20, 20)
                .addComponent(opc_15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1)
                .addContainerGap(255, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
        );
        
    }                       

    private void opc_15ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void opc_14ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void opc_13ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void opc_12ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void opc_11ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void opc_10ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void opc_9ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void opc_8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void opc_6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void opc_5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void opc_4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
       
        Ventana vent = new Ventana("Panel Menu");
                vent.add(new Panel_Menu());
                vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vent.setVisible(true);
           
                
    }                                        

    private void opc_1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    
    
    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup Grupo_Botones4;
    javax.swing.ButtonGroup Grupo_botones1;
    private javax.swing.ButtonGroup Grupo_botones2;
    private javax.swing.ButtonGroup Grupo_botones3;
    private javax.swing.ButtonGroup Grupo_botones5;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opc_1;
    private javax.swing.JRadioButton opc_10;
    private javax.swing.JRadioButton opc_11;
    private javax.swing.JRadioButton opc_12;
    private javax.swing.JRadioButton opc_13;
    private javax.swing.JRadioButton opc_14;
    private javax.swing.JRadioButton opc_15;
    private javax.swing.JRadioButton opc_2;
    private javax.swing.JRadioButton opc_3;
    private javax.swing.JRadioButton opc_4;
    private javax.swing.JRadioButton opc_5;
    private javax.swing.JRadioButton opc_6;
    private javax.swing.JRadioButton opc_7;
    private javax.swing.JRadioButton opc_8;
    private javax.swing.JRadioButton opc_9;
    // End of variables declaration                   

    public javax.swing.JRadioButton getOpc_1() {
        if (opc_1.isSelected()) {
            
        }
        return opc_1;
    }

    public void setOpc_1(javax.swing.JRadioButton opc_1) {
        this.opc_1 = opc_1;
    }

    public javax.swing.JRadioButton getOpc_2() {
        return opc_2;
    }

    public void setOpc_2(javax.swing.JRadioButton opc_2) {
        this.opc_2 = opc_2;
    }
}