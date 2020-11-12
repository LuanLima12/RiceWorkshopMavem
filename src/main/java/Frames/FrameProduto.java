/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Entidades.Produto;
import Models.ModelProduto;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luan
 */
public class FrameProduto extends javax.swing.JInternalFrame {

    DefaultTableModel tabela;
    private int quantidade, i=0; //Saber a quantidade de itens para o SELECT
    private String selecionado1, selecionado2; //Saber quais itens serão usados no SELECT
    private String conteudo1, conteudo2; //Conteudo dos campos selecionados para o SELECT
    
    /**
     * Creates new form FrameProduto
     */
    public FrameProduto() {
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
    //--------------------------------------------------------------------------
    
    private void montarTabela(){
        tabela = (DefaultTableModel) Tabela.getModel();
        ModelProduto mp = new ModelProduto();
        for (Produto p : mp.listaProdutos()){
            tabela.addRow(new Object[]{p.getId(), p.getNome(), p.getDescricao(), p.getTipo(), p.getEstoque(),
                p.getValorVenda(), p.getValorCompra(), p.getCnpj_fornecedor(), p.getTamanho(), p.getEstoqueMin()});
        }
    }
    
    private void montarTabela1(){
        tabela = (DefaultTableModel) Tabela.getModel();
        ModelProduto mp = new ModelProduto();
        for (Produto p : mp.listaProdutos1(selecionado1, conteudo1)){
            tabela.addRow(new Object[]{p.getId(), p.getNome(), p.getDescricao(), p.getTipo(), p.getEstoque(),
                p.getValorVenda(), p.getValorCompra(), p.getCnpj_fornecedor(), p.getTamanho(), p.getEstoqueMin()});
        }
    }
    
    private void montarTabela2(){
        tabela = (DefaultTableModel) Tabela.getModel();
        ModelProduto mp = new ModelProduto();
        for (Produto p : mp.listaProdutos2(selecionado1, conteudo1, selecionado2, conteudo2)){
            tabela.addRow(new Object[]{p.getId(), p.getNome(), p.getDescricao(), p.getTipo(), p.getEstoque(),
                p.getValorVenda(), p.getValorCompra(), p.getCnpj_fornecedor(), p.getTamanho(), p.getEstoqueMin()});
        }
    }
    
    private void limparTabela(){
        tabela.setNumRows(0);
    }
    
    //==========================================================================
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Nome1 = new javax.swing.JRadioButton();
        CNPJ1 = new javax.swing.JRadioButton();
        ValorC1 = new javax.swing.JRadioButton();
        ID1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        Estoque1 = new javax.swing.JRadioButton();
        Data1 = new javax.swing.JRadioButton();
        ValorV1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ValorC = new javax.swing.JTextField();
        Data = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CNPJ = new javax.swing.JFormattedTextField();
        pesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ValorV = new javax.swing.JTextField();
        Estoque = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Produtos");
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

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setToolTipText("Escolha temas para pesquisar.\n\"Data\" pode ser combinado com qualquer outro.");

        Nome1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(Nome1);
        Nome1.setText("Nome");

        CNPJ1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(CNPJ1);
        CNPJ1.setText("CNPJ");
        CNPJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPJ1ActionPerformed(evt);
            }
        });

        ValorC1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(ValorC1);
        ValorC1.setText("Valor Compra");
        ValorC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorC1ActionPerformed(evt);
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

        Estoque1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(Estoque1);
        Estoque1.setText("Estoque");
        Estoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Estoque1ActionPerformed(evt);
            }
        });

        Data1.setBackground(new java.awt.Color(153, 153, 255));
        Data1.setText("Data");
        Data1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data1ActionPerformed(evt);
            }
        });

        ValorV1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(ValorV1);
        ValorV1.setText("Valor Venda");
        ValorV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorV1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CNPJ1)
                    .addComponent(ID1)
                    .addComponent(Estoque1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Data1)
                    .addComponent(ValorV1)
                    .addComponent(ValorC1)
                    .addComponent(Nome1))
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
                    .addComponent(CNPJ1)
                    .addComponent(ValorC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estoque1)
                    .addComponent(ValorV1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Data1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Nome");

        ID.setEnabled(false);

        Nome.setEnabled(false);

        jLabel5.setText("CNPJ");

        jLabel3.setText("Data");

        jLabel6.setText("Estoque");

        ValorC.setEnabled(false);

        Data.setEnabled(false);
        Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel4.setText("Valor compra");

        try {
            CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CNPJ.setEnabled(false);

        pesquisar.setText("Pesquisar");
        pesquisar.setAutoscrolls(true);
        pesquisar.setEnabled(false);
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor venda");

        ValorV.setEnabled(false);

        Estoque.setEnabled(false);

        jButton3.setText("Sem Filtro");
        jButton3.setToolTipText("Não usar filtros de pesquisa.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pesquisar)
                                        .addGap(12, 12, 12))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(Estoque))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ValorC, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ValorV, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
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
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisar)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Tipo", "Estoque", "Valor de venda", "Valor de aquisição", "CNPJ do Fornecedor", "Tamanho", "Estoque minimo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 723, 455);
    }// </editor-fold>//GEN-END:initComponents

    private void CNPJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNPJ1ActionPerformed

    private void ValorC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorC1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (ID1.isSelected() && Data1.isSelected()){
            ID.setEnabled(true);
            Data.setEnabled(true);
            Nome.setEnabled(false);
            ValorC.setEnabled(false);
            ValorV.setEnabled(false);
            Estoque.setEnabled(false);
            CNPJ.setEnabled(false);
            pesquisar.setEnabled(true);

            quantidade = 2;
            selecionado1 = "id";
            selecionado2 = "data";

        }else if(ID1.isSelected()){
            ID.setEnabled(true);
            Data.setEnabled(false);
            Nome.setEnabled(false);
            ValorC.setEnabled(false);
            CNPJ.setEnabled(false);
            ValorV.setEnabled(false);
            Estoque.setEnabled(false);
            pesquisar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "id";

        }else if(Nome1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            Nome.setEnabled(true);
            ValorC.setEnabled(false);
            CNPJ.setEnabled(false);
            ValorV.setEnabled(false);
            Estoque.setEnabled(false);
            pesquisar.setEnabled(true);

            quantidade = 2;
            selecionado1 = "nome";
            selecionado2 = "data";

        }else if(Nome1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            Nome.setEnabled(true);
            ValorC.setEnabled(false);
            CNPJ.setEnabled(false);
            ValorV.setEnabled(false);
            Estoque.setEnabled(false);
            pesquisar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "nome";

        }else if(CNPJ1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            Nome.setEnabled(false);
            ValorC.setEnabled(false);
            CNPJ.setEnabled(true);
            ValorV.setEnabled(false);
            Estoque.setEnabled(false);
            pesquisar.setEnabled(true);

            quantidade = 2;
            selecionado1 = "cnpj_fornecedor";
            selecionado2 = "data";

        }else if(CNPJ1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            Nome.setEnabled(false);
            ValorC.setEnabled(false);
            CNPJ.setEnabled(true);
            ValorV.setEnabled(false);
            Estoque.setEnabled(false);
            pesquisar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "cnpj_fornecedor";

        }else if(ValorC1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            Nome.setEnabled(false);
            ValorC.setEnabled(true);
            CNPJ.setEnabled(false);
            ValorV.setEnabled(false);
            Estoque.setEnabled(false);
            pesquisar.setEnabled(true);

            quantidade = 2;
            selecionado1 = "valorCompra";
            selecionado2 = "data";

        }else if(ValorC1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            Nome.setEnabled(false);
            ValorC.setEnabled(true);
            CNPJ.setEnabled(false);
            ValorV.setEnabled(false);
            Estoque.setEnabled(false);
            pesquisar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "valorCompra";

        }else if(ValorV1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            Nome.setEnabled(false);
            ValorC.setEnabled(false);
            CNPJ.setEnabled(false);
            ValorV.setEnabled(true);
            Estoque.setEnabled(false);
            pesquisar.setEnabled(true);

            quantidade = 2;
            selecionado1 = "valorVenda";
            selecionado2 = "data";

        }else if(ValorV1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            Nome.setEnabled(false);
            ValorC.setEnabled(false);
            CNPJ.setEnabled(false);
            ValorV.setEnabled(true);
            Estoque.setEnabled(false);
            pesquisar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "valorVenda";

        }else if(Estoque1.isSelected() && Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            Nome.setEnabled(false);
            ValorC.setEnabled(false);
            CNPJ.setEnabled(false);
            ValorV.setEnabled(false);
            Estoque.setEnabled(true);
            pesquisar.setEnabled(true);

            quantidade = 2;
            selecionado1 = "estoque";
            selecionado2 = "data";

        }else if(Estoque1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(false);
            Nome.setEnabled(false);
            ValorC.setEnabled(false);
            CNPJ.setEnabled(false);
            ValorV.setEnabled(false);
            Estoque.setEnabled(true);
            pesquisar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "estoque";

        }else if(Data1.isSelected()){
            ID.setEnabled(false);
            Data.setEnabled(true);
            Nome.setEnabled(false);
            ValorC.setEnabled(false);
            CNPJ.setEnabled(false);
            ValorV.setEnabled(false);
            Estoque.setEnabled(false);
            pesquisar.setEnabled(true);

            quantidade = 1;
            selecionado1 = "data";

        }else{
            JOptionPane.showMessageDialog(this, "É preciso selecionar ao menos um tema de pesquisa.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Estoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Estoque1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Estoque1ActionPerformed

    private void Data1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Data1ActionPerformed

    private void ValorV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorV1ActionPerformed

    private void DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        // TODO add your handling code here:

        if (ID1.isSelected() && Data1.isSelected()){
            conteudo1 = ID.getText();
            conteudo2 = Data.getText();

        }else if(ID1.isSelected()){
            conteudo1 = ID.getText();

        }else if(Nome1.isSelected() && Data1.isSelected()){
            conteudo1 = Nome.getText();
            conteudo2 = Data.getText();

        }else if(Nome1.isSelected()){
            conteudo1 = Nome.getText();

        }else if(CNPJ1.isSelected() && Data1.isSelected()){
            conteudo1 = CNPJ.getText();
            conteudo2 = Data.getText();

        }else if(CNPJ1.isSelected()){
            conteudo1 = CNPJ.getText();

        }else if(ValorV1.isSelected() && Data1.isSelected()){
            conteudo1 = ValorV.getText();
            conteudo2 = Data.getText();

        }else if(ValorV1.isSelected()){
            conteudo1 = ValorV.getText();

        }else if(ValorC1.isSelected() && Data1.isSelected()){
            conteudo1 = ValorC.getText();
            conteudo2 = Data.getText();

        }else if(ValorC1.isSelected()){
            conteudo1 = ValorC.getText();

        }else if(Estoque1.isSelected() && Data1.isSelected()){
            conteudo1 = Estoque1.getText();
            conteudo2 = Data.getText();

        }else if(Estoque1.isSelected()){
            conteudo1 = Estoque1.getText();

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

    }//GEN-LAST:event_pesquisarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        if(i==1){
            limparTabela();
        }
        montarTabela();
        i=1;

    }//GEN-LAST:event_jButton3ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        centralizar();
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CNPJ;
    private javax.swing.JRadioButton CNPJ1;
    private javax.swing.JFormattedTextField Data;
    private javax.swing.JRadioButton Data1;
    private javax.swing.JTextField Estoque;
    private javax.swing.JRadioButton Estoque1;
    private javax.swing.JTextField ID;
    private javax.swing.JRadioButton ID1;
    private javax.swing.JTextField Nome;
    private javax.swing.JRadioButton Nome1;
    private javax.swing.JTable Tabela;
    private javax.swing.JTextField ValorC;
    private javax.swing.JRadioButton ValorC1;
    private javax.swing.JTextField ValorV;
    private javax.swing.JRadioButton ValorV1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisar;
    // End of variables declaration//GEN-END:variables
}
