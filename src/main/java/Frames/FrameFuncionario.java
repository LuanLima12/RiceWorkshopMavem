/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.JOptionPane;

/**
 *
 * @author Luan
 */
public class FrameFuncionario extends javax.swing.JInternalFrame {

    public int q; //Saber a q de itens para o SELECT
    public String s1, s2; //Saber quais itens serão usados no SELECT
    public String c1, c2; //Conteudo dos campos selecionados para o SELECT
    
    public FrameFuncionario() {
        initComponents();
    }

    /**
     * Creates new form FrameFuncionario
     */
    
    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }
    
    public void setC2(String c2) {
        this.c2 = c2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Nome1 = new javax.swing.JRadioButton();
        Cargo1 = new javax.swing.JRadioButton();
        Email1 = new javax.swing.JRadioButton();
        CPF1 = new javax.swing.JRadioButton();
        ID1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        RG1 = new javax.swing.JRadioButton();
        Data1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();
        Cargo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Data = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CPF = new javax.swing.JFormattedTextField();
        pesquisar = new javax.swing.JButton();
        RG = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Funcionarios");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setToolTipText("Escolha temas para pesquisar.\n\"Data\" pode ser combinado com qualquer outro.");

        Nome1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(Nome1);
        Nome1.setText("Nome");

        Cargo1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(Cargo1);
        Cargo1.setText("Cargo");
        Cargo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cargo1ActionPerformed(evt);
            }
        });

        Email1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(Email1);
        Email1.setText("E-Mail");
        Email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email1ActionPerformed(evt);
            }
        });

        CPF1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(CPF1);
        CPF1.setText("CPF");
        CPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPF1ActionPerformed(evt);
            }
        });

        ID1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(ID1);
        ID1.setText("ID");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        RG1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(RG1);
        RG1.setText("RG");
        RG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RG1ActionPerformed(evt);
            }
        });

        Data1.setBackground(new java.awt.Color(153, 153, 255));
        Data1.setText("Data");
        Data1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cargo1)
                            .addComponent(ID1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nome1)
                            .addComponent(CPF1)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Email1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(RG1)
                            .addGap(18, 18, 18)
                            .addComponent(Data1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID1)
                    .addComponent(Nome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cargo1)
                    .addComponent(CPF1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RG1)
                    .addComponent(Data1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email1)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jLabel2.setText("Nome");

        ID.setEnabled(false);

        Nome.setEnabled(false);

        Cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Selecione um cargo]", "Gerente", "Funcionario" }));
        Cargo.setAutoscrolls(true);
        Cargo.setEnabled(false);

        jLabel5.setText("CPF");

        jLabel3.setText("Data");

        jLabel6.setText("RG");

        jLabel7.setText("Cargo");

        Email.setEnabled(false);

        Data.setEnabled(false);
        Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel4.setText("E-Mail");

        try {
            CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CPF.setEnabled(false);

        pesquisar.setText("Pesquisar");
        pesquisar.setAutoscrolls(true);
        pesquisar.setEnabled(false);
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        try {
            RG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        RG.setEnabled(false);

        jButton2.setText("Sem Filtro");
        jButton2.setToolTipText("Não usar filtros de pesquisa.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RG, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pesquisar))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pesquisar))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cargo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cargo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cargo1ActionPerformed

    private void CPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPF1ActionPerformed

    private void RG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RG1ActionPerformed

    private void Data1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Data1ActionPerformed

    private void Email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email1ActionPerformed

    private void DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if (ID1.isSelected() && Data1.isSelected()){
            ID.setEnabled(true);
            Data.setEnabled(true);
            Nome.setEnabled(false);
            Email.setEnabled(false);
            CPF.setEnabled(false);
            RG.setEnabled(false);
            Cargo.setEnabled(false);
            pesquisar.setEnabled(true);
            
            q = 2;
            s1 = "id";
            s2 = "data";
            
        }else if(ID1.isSelected()){
            ID.setEnabled(true);
            Data.setEnabled(false);
            Nome.setEnabled(false);
            Email.setEnabled(false);
            CPF.setEnabled(false);
            RG.setEnabled(false);
            Cargo.setEnabled(false);
            pesquisar.setEnabled(true);
            
            q = 1;
            s1 = "id";
            
        }else if(Nome1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            Nome.setEnabled(true);
            Email.setEnabled(false);
            CPF.setEnabled(false);
            RG.setEnabled(false);
            Cargo.setEnabled(false);
            pesquisar.setEnabled(true);
            
            q = 2;
            s1 = "nome";
            s2 = "data";
            
        }else if(Nome1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            Nome.setEnabled(true);
            Email.setEnabled(false);
            CPF.setEnabled(false);
            RG.setEnabled(false);
            Cargo.setEnabled(false);
            pesquisar.setEnabled(true);
            
            q = 1;
            s1 = "nome";
            
        }else if(Cargo1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            Nome.setEnabled(false);
            Email.setEnabled(false);
            CPF.setEnabled(false);
            RG.setEnabled(false);
            Cargo.setEnabled(true);
            pesquisar.setEnabled(true);
            
            q = 2;
            s1 = "cargo";
            s2 = "data";
            
        }else if(Cargo1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            Nome.setEnabled(false);
            Email.setEnabled(false);
            CPF.setEnabled(false);
            RG.setEnabled(false);
            Cargo.setEnabled(true);
            pesquisar.setEnabled(true);
            
            q = 1;
            s1 = "cargo";
            
        }else if(CPF1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            Nome.setEnabled(false);
            Email.setEnabled(false);
            CPF.setEnabled(true);
            RG.setEnabled(false);
            Cargo.setEnabled(false);
            pesquisar.setEnabled(true);
            
            q = 2;
            s1 = "cpf_funcionario";
            s2 = "data";
            
        }else if(CPF1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            Nome.setEnabled(false);
            Email.setEnabled(false);
            CPF.setEnabled(true);
            RG.setEnabled(false);
            Cargo.setEnabled(false);
            pesquisar.setEnabled(true);
            
            q = 1;
            s1 = "cpf_funcionario";
            
        }else if(RG1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            Nome.setEnabled(false);
            Email.setEnabled(false);
            CPF.setEnabled(false);
            RG.setEnabled(true);
            Cargo.setEnabled(false);
            pesquisar.setEnabled(true);
            
            q = 2;
            s1 = "rg";
            s2 = "data";
            
        }else if(RG1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            Nome.setEnabled(false);
            Email.setEnabled(false);
            CPF.setEnabled(false);
            RG.setEnabled(true);
            Cargo.setEnabled(false);
            pesquisar.setEnabled(true);
            
            q = 1;
            s1 = "rg";
            
        }else if(Email1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            Nome.setEnabled(false);
            Email.setEnabled(true);
            CPF.setEnabled(false);
            RG.setEnabled(false);
            Cargo.setEnabled(false);
            pesquisar.setEnabled(true);
            
            q = 2;
            s1 = "email";
            s2 = "data";
            
        }else if(Email1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            Nome.setEnabled(false);
            Email.setEnabled(true);
            CPF.setEnabled(false);
            RG.setEnabled(false);
            Cargo.setEnabled(false);
            pesquisar.setEnabled(true);
            
            q = 1;
            s1 = "email";
            
        }else if(Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            Nome.setEnabled(false);
            Email.setEnabled(false);
            CPF.setEnabled(false);
            RG.setEnabled(false);
            Cargo.setEnabled(false);
            pesquisar.setEnabled(true);
            
            q = 1;
            s1 = "email";
            
        }else{
            JOptionPane.showMessageDialog(this, "É preciso selecionar ao menos um tema de pesquisa.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        // TODO add your handling code here:
        
        if (ID1.isSelected() && Data1.isSelected()){
            c1 = ID.getText();
            c2 = Data.getText();
            
        }else if(ID1.isSelected()){
           c1 = ID.getText();
            
        }else if(Nome1.isSelected() && Data1.isSelected()){
            c1 = Nome.getText();
            c2 = Data.getText();
            
        }else if(Nome1.isSelected()){
           c1 = Nome.getText();
            
        }else if(Cargo1.isSelected() && Data1.isSelected()){
            if(Cargo.getSelectedIndex()==1){
                c1 = "gerente";
            }else if(Cargo.getSelectedIndex()==2){
                c1= "funcionario";
            }else{
                JOptionPane.showMessageDialog(this, "Selecione um cargo, por favor.");
            }
            c2 = Data.getText();
            
        }else if(Cargo1.isSelected()){
            if(Cargo.getSelectedIndex()==1){
                c1 = "gerente";
            }else if(Cargo.getSelectedIndex()==2){
                c1= "funcionario";
            }else{
                JOptionPane.showMessageDialog(this, "Selecione um cargo, por favor. Caso contrario, serão exibidos resultados sem filtro de pesquisa.");
            }
            
        }else if(CPF1.isSelected() && Data1.isSelected()){
            c1 = CPF.getText();
            c2 = Data.getText();
            
        }else if(CPF1.isSelected()){
            c1 = CPF.getText();
            
        }else if(RG1.isSelected() && Data1.isSelected()){
            c1 = RG.getText();
            c2 = Data.getText();
            
        }else if(RG1.isSelected()){
            c1 = RG.getText();
            
        }else if(Email1.isSelected() && Data1.isSelected()){
            c1 = Email.getText();
            c2 = Data.getText();
            
        }else if(Email1.isSelected()){
            c1 = Email.getText();
            
        }else if(Data1.isSelected()){
            c1 = Data.getText();
            
        }else{
            q = 0;
            JOptionPane.showMessageDialog(this, "Exibindo resultado sem filtros de pesquisa.");
        }
        
        FrameExibirFuncionario fef = new FrameExibirFuncionario();
        fef.setSelecionado1(getS1());
        fef.setSelecionado2(getS2());
        fef.setQuantidade(getQ());
        fef.setConteudo1(getC1());
        fef.setConteudo2(getC2());
        fef.setVisible(true);
   
    }//GEN-LAST:event_pesquisarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        setQ(0); 
        FrameExibirFuncionario fef = new FrameExibirFuncionario();
        fef.setSelecionado1(getS1());
        fef.setSelecionado2(getS2());
        fef.setQuantidade(getQ());
        fef.setConteudo1(getC1());
        fef.setConteudo2(getC2());
        fef.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CPF;
    private javax.swing.JRadioButton CPF1;
    private javax.swing.JComboBox<String> Cargo;
    private javax.swing.JRadioButton Cargo1;
    private javax.swing.JFormattedTextField Data;
    private javax.swing.JRadioButton Data1;
    private javax.swing.JTextField Email;
    private javax.swing.JRadioButton Email1;
    private javax.swing.JTextField ID;
    private javax.swing.JRadioButton ID1;
    private javax.swing.JTextField Nome;
    private javax.swing.JRadioButton Nome1;
    private javax.swing.JFormattedTextField RG;
    private javax.swing.JRadioButton RG1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pesquisar;
    // End of variables declaration//GEN-END:variables
}
