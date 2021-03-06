/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Entidades.Fornecedor;
import Modal.AdcFornecedor;
import Models.ModelFornecedor;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luan
 */
public class FrameFornecedor extends javax.swing.JInternalFrame {

    DefaultTableModel tabela;
    private int quantidade, i=0; //Saber a quantidade de itens para o SELECT
    private String selecionado1, selecionado2; //Saber quais itens serão usados no SELECT
    private String conteudo1, conteudo2; //Conteudo dos campos selecionados para o SELECT
    Fornecedor f = new Fornecedor();
    ModelFornecedor mf = new ModelFornecedor();
    
    /**
     * Creates new form FrameFornecedor
     */
    public FrameFornecedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void centralizar(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    //METODOS DA TABELA
    //----------------------------------------------------------------------
    
    private void montarTabela(){
        tabela = (DefaultTableModel) Tabela.getModel();
        ModelFornecedor mf = new ModelFornecedor();
        for (Fornecedor f : mf.listaFornecedores()){
            tabela.addRow(new Object[]{f.getId(), f.getRazao_social(), f.getCnpj_fornecedor(), f.getEndereco(), f.getCidade(), f.getData()});
        }
    }
    
    private void montarTabela1(){
        tabela = (DefaultTableModel) Tabela.getModel();
        ModelFornecedor mf = new ModelFornecedor();
        for (Fornecedor f : mf.listaFornecedores1(selecionado1, conteudo1)){
            tabela.addRow(new Object[]{f.getId(), f.getRazao_social(), f.getCnpj_fornecedor(), f.getEndereco(), f.getCidade(), f.getData()});
        }
    }
    
    private void montarTabela2(){
        tabela = (DefaultTableModel) Tabela.getModel();
        ModelFornecedor mf = new ModelFornecedor();
        for (Fornecedor f : mf.listaFornecedores2(selecionado1, conteudo1, selecionado2, conteudo2)){
            tabela.addRow(new Object[]{f.getId(), f.getRazao_social(), f.getCnpj_fornecedor(), f.getEndereco(), f.getCidade(), f.getData()});
        }
    }
    
    public void limparTabela(){
        tabela.setNumRows(0);
    }
    
    //======================================================================
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        razao_social1 = new javax.swing.JRadioButton();
        cidade1 = new javax.swing.JRadioButton();
        CNPJ1 = new javax.swing.JRadioButton();
        ID1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        Data1 = new javax.swing.JRadioButton();
        endereco1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        razao_social = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        Data = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        CNPJ = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        Cidade = new javax.swing.JFormattedTextField();
        semFiltro = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Cadastrar = new javax.swing.JButton();
        Apagar = new javax.swing.JButton();
        Editar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Fornecedor");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(114, 172, 254));
        jPanel3.setPreferredSize(new java.awt.Dimension(508, 181));

        jPanel1.setBackground(new java.awt.Color(21, 116, 253));
        jPanel1.setToolTipText("Escolha temas para pesquisar.\n\"Data\" pode ser combinado com qualquer outro.");

        razao_social1.setBackground(new java.awt.Color(21, 116, 253));
        razao_social1.setText("Razao");

        cidade1.setBackground(new java.awt.Color(21, 116, 253));
        cidade1.setText("Cidade");
        cidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidade1ActionPerformed(evt);
            }
        });

        CNPJ1.setBackground(new java.awt.Color(21, 116, 253));
        CNPJ1.setText("CNPJ");
        CNPJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPJ1ActionPerformed(evt);
            }
        });

        ID1.setBackground(new java.awt.Color(21, 116, 253));
        ID1.setText("ID");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("OK");
        jButton1.setAutoscrolls(true);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Data1.setBackground(new java.awt.Color(21, 116, 253));
        Data1.setText("Data");
        Data1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data1ActionPerformed(evt);
            }
        });

        endereco1.setBackground(new java.awt.Color(21, 116, 253));
        endereco1.setText("Endereço");
        endereco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endereco1ActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(cidade1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Data1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CNPJ1)
                            .addComponent(ID1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(razao_social1)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(endereco1)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID1)
                    .addComponent(razao_social1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CNPJ1)
                    .addComponent(endereco1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade1)
                    .addComponent(Data1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(114, 172, 254));

        jLabel2.setText("Razão Social");

        ID.setEnabled(false);

        razao_social.setEnabled(false);

        jLabel5.setText("CNPJ");

        jLabel3.setText("Data");

        endereco.setEnabled(false);

        try {
            Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Data.setEnabled(false);
        Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel4.setText("Endereço");

        Confirmar.setBackground(new java.awt.Color(204, 204, 204));
        Confirmar.setText("Pesquisar");
        Confirmar.setAutoscrolls(true);
        Confirmar.setBorderPainted(false);
        Confirmar.setEnabled(false);
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        try {
            CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CNPJ.setEnabled(false);

        jLabel6.setText("Cidade:");

        Cidade.setEnabled(false);

        semFiltro.setBackground(new java.awt.Color(153, 153, 153));
        semFiltro.setText("Sem Filtro");
        semFiltro.setToolTipText("Não usar filtros de pesquisa.");
        semFiltro.setAutoscrolls(true);
        semFiltro.setBorderPainted(false);
        semFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(razao_social, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Cidade))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Confirmar)
                                    .addComponent(semFiltro))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endereco)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(razao_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semFiltro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirmar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(114, 172, 254));

        Cadastrar.setBackground(new java.awt.Color(153, 153, 153));
        Cadastrar.setText("Cadastrar");
        Cadastrar.setAutoscrolls(true);
        Cadastrar.setBorderPainted(false);
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Apagar.setBackground(new java.awt.Color(255, 102, 102));
        Apagar.setText("Apagar");
        Apagar.setAutoscrolls(true);
        Apagar.setBorderPainted(false);
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });

        Editar1.setBackground(new java.awt.Color(204, 204, 204));
        Editar1.setText("Editar");
        Editar1.setAutoscrolls(true);
        Editar1.setBorderPainted(false);
        Editar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar1ActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Razão Social", "CNPJ", "Endereço", "Cidade", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Editar1)
                    .addComponent(Apagar)
                    .addComponent(Cadastrar))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Apagar, Cadastrar, Editar1});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(Editar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 788, 469);
    }// </editor-fold>//GEN-END:initComponents

    private void cidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidade1ActionPerformed

    private void CNPJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNPJ1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (ID1.isSelected() && Data1.isSelected()){
            ID.setEnabled(true);
            Data.setEnabled(true);
            razao_social.setEnabled(false);
            endereco.setEnabled(false);
            Cidade.setEnabled(false);
            CNPJ.setEnabled(false);
            Confirmar.setEnabled(true);

            quantidade = 2;
            selecionado1 = "id";
            selecionado2 = "data";

        }else if(ID1.isSelected()){
            ID.setEnabled(true);
            Data.setEnabled(false);
            razao_social.setEnabled(false);
            endereco.setEnabled(false);
            Cidade.setEnabled(false);
            CNPJ.setEnabled(false);
            Confirmar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "id";

        }else if(razao_social1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            razao_social.setEnabled(true);
            endereco.setEnabled(false);
            Cidade.setEnabled(false);
            CNPJ.setEnabled(false);
            Confirmar.setEnabled(true);

            quantidade = 2;
            selecionado1 = "razao_social";
            selecionado2 = "data";

        }else if(razao_social1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            razao_social.setEnabled(true);
            endereco.setEnabled(false);
            Cidade.setEnabled(false);
            CNPJ.setEnabled(false);
            Confirmar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "razao_social";

        }else if(CNPJ1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            razao_social.setEnabled(false);
            endereco.setEnabled(false);
            Cidade.setEnabled(false);
            CNPJ.setEnabled(true);
            Confirmar.setEnabled(true);

            quantidade = 2;
            selecionado1 = "cnpj_fornecedor";
            selecionado2 = "data";

        }else if(CNPJ1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            razao_social.setEnabled(false);
            endereco.setEnabled(false);
            Cidade.setEnabled(false);
            CNPJ.setEnabled(true);
            Confirmar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "cnpj_fornecedor";

        }else if(endereco1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            razao_social.setEnabled(false);
            endereco.setEnabled(true);
            Cidade.setEnabled(false);
            Confirmar.setEnabled(true);

            quantidade = 2;
            selecionado1 = "cidade";
            selecionado2 = "data";

        }else if(endereco1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            razao_social.setEnabled(false);
            endereco.setEnabled(true);
            Cidade.setEnabled(false);
            CNPJ.setEnabled(false);
            Confirmar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "cidade";

        }else if(cidade1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            razao_social.setEnabled(false);
            endereco.setEnabled(false);
            Cidade.setEnabled(true);
            Confirmar.setEnabled(true);

            quantidade = 2;
            selecionado1 = "cidade";
            selecionado2 = "data";

        }else if(cidade1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            razao_social.setEnabled(false);
            endereco.setEnabled(false);
            Cidade.setEnabled(true);
            CNPJ.setEnabled(false);
            Confirmar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "cidade";

        }else if(Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            razao_social.setEnabled(false);
            endereco.setEnabled(false);
            Cidade.setEnabled(false);
            CNPJ.setEnabled(false);
            Confirmar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "data";

        }else{
            JOptionPane.showMessageDialog(this, "É preciso selecionar ao menos um tema de pesquisa.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Data1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Data1ActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        // TODO add your handling code here:

        if (Confirmar.getText().equals("Pesquisar")){ // DECIDIR SESERÁ SELEC OU UPDATE

           if (ID1.isSelected() && Data1.isSelected()){
            conteudo1 = ID.getText();
            conteudo2 = Data.getText();

            }else if(ID1.isSelected()){
                conteudo1 = ID.getText();

            }else if(razao_social1.isSelected() && Data1.isSelected()){
                conteudo1 = razao_social.getText();
                conteudo2 = Data.getText();

            }else if(razao_social1.isSelected()){
                conteudo1 = razao_social.getText();

            }else if(CNPJ1.isSelected() && Data1.isSelected()){
                conteudo1 = CNPJ.getText();
                conteudo2 = Data.getText();

            }else if(CNPJ1.isSelected()){
                conteudo1 = CNPJ.getText();

            }else if(endereco1.isSelected() && Data1.isSelected()){
                conteudo1 = endereco.getText();
                conteudo2 = Data.getText();

            }else if(endereco1.isSelected()){
                conteudo1 = endereco.getText();

            }else if(cidade1.isSelected() && Data1.isSelected()){
                conteudo1 = Cidade.getText();
                conteudo2 = Data.getText();

            }else if(cidade1.isSelected()){
                conteudo1 = Cidade.getText();

            }else if(Data1.isSelected()){
                conteudo1 = Data.getText();

            }else{
                quantidade = 0;
                JOptionPane.showMessageDialog(this, "Exibindo resultado sem filtros de pesquisa.");
            }

            if (i==1){
              limparTabela();  
            }
            switch (getQuantidade()) {
                case 0:
                    montarTabela();
                    i=1;
                    break;
                case 1:
                    montarTabela1();
                    i=1;
                    break;
                case 2:
                    montarTabela2();
                    i=1;
                    break;
                default:
                    break;
            } 
            
        }else{
            
            f.setRazao_social(razao_social.getText());
            f.setEndereco(endereco.getText());
            f.setCidade(Cidade.getText());
            f.setCnpj_fornecedor(CNPJ.getText());
            
            if (mf.editar(f)==true){
                JOptionPane.showMessageDialog(this, "Fornecedor editado com sucesso!");
                ID.setText(null); ID.setEnabled(false);
                razao_social.setText(null); razao_social.setEnabled(false);
                endereco.setText(null); endereco.setEnabled(false);
                Cidade.setText(null); Cidade.setEnabled(false);
                CNPJ.setText(null); CNPJ.setEnabled(false);
                Confirmar.setText("Pesquisar"); Confirmar.setEnabled(false);
                semFiltro.setEnabled(true);
                limparTabela(); montarTabela();
            }

        }
        
        
        
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataActionPerformed

    private void endereco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endereco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endereco1ActionPerformed

    private void semFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semFiltroActionPerformed
        // TODO add your handling code here:
        
        if(i==1){
            limparTabela();
        }
        montarTabela();
        i=1;
        
    }//GEN-LAST:event_semFiltroActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        
        centralizar();
    }//GEN-LAST:event_formInternalFrameOpened

    private void Editar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editar1ActionPerformed
        // TODO add your handling code here:
        
        if (Tabela.getSelectedRowCount()<1){
            JOptionPane.showMessageDialog(this, "Nenhum fornecedor selecionado.");
        }else if (Tabela.getSelectedRowCount()>1){
            JOptionPane.showMessageDialog(this, "Por favor, selecione apenas um fornecedor por vez para edita-lo.");
        }else{
            Long idLocal = (Long)Tabela.getValueAt(Tabela.getSelectedRow(), 0);
            f = mf.buscar(idLocal);
            ID.setText(Long.toString(f.getId())); ID.setEnabled(false);
            razao_social.setText(f.getRazao_social()); razao_social.setEnabled(true);
            endereco.setText(f.getEndereco()); endereco.setEnabled(true);
            Cidade.setText(f.getCidade()); Cidade.setEnabled(true);
            CNPJ.setText(f.getCnpj_fornecedor()); CNPJ.setEnabled(true);
            Data.setText(f.getData()); Data.setEnabled(false);
            Confirmar.setText("Salvar"); Confirmar.setEnabled(true);
            semFiltro.setEnabled(false);
            limparTabela(); montarTabela();
        }
        
    }//GEN-LAST:event_Editar1ActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
        // TODO add your handling code here:
        
        if(Tabela.getSelectedRowCount()>1){
            JOptionPane.showMessageDialog(this, "Selecione apenas um cliente por vez para deleta-lo.");
        }else if(Tabela.getSelectedRowCount()<1){
            JOptionPane.showMessageDialog(this, "Nenhum cliente selecionado.");
        }else{
            Long n = (Long)Tabela.getValueAt(Tabela.getSelectedRow(), 0);
            System.out.println(n);
            int botao;
        botao = JOptionPane.showConfirmDialog (null, "Tem certeza que deseja apagar?", "Aviso", JOptionPane.YES_OPTION);
        if(botao == JOptionPane.YES_OPTION){
           mf.delete(n);
           limparTabela(); montarTabela();
        }
        }
        
    }//GEN-LAST:event_ApagarActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        // TODO add your handling code here:
        AdcFornecedor af = new AdcFornecedor();
        af.setModal(true);
        af.setVisible(true);
    }//GEN-LAST:event_CadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apagar;
    private javax.swing.JFormattedTextField CNPJ;
    private javax.swing.JRadioButton CNPJ1;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JFormattedTextField Cidade;
    private javax.swing.JButton Confirmar;
    private javax.swing.JFormattedTextField Data;
    private javax.swing.JRadioButton Data1;
    private javax.swing.JButton Editar1;
    private javax.swing.JTextField ID;
    private javax.swing.JRadioButton ID1;
    private javax.swing.JTable Tabela;
    private javax.swing.JRadioButton cidade1;
    private javax.swing.JTextField endereco;
    private javax.swing.JRadioButton endereco1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField razao_social;
    private javax.swing.JRadioButton razao_social1;
    private javax.swing.JButton semFiltro;
    // End of variables declaration//GEN-END:variables
}
