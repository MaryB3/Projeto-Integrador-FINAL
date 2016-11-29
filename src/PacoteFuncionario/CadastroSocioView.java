/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteFuncionario;

import com.senai.projetointegrador.socio.ProdutoSocioCtrl;

/**
 *
 * @author MaryBeds
 */
public class CadastroSocioView extends javax.swing.JInternalFrame {

	/**
	 * Creates new form CadastroSocioView
	 */
	public CadastroSocioView() {
		this.initComponents();
		this.inicializar();
	}

	private void inicializar() {
		ProdutoSocioCtrl produtoSocioCtrl = ProdutoSocioCtrl.getInstancia();
		produtoSocioCtrl.setSocioView(this);
		produtoSocioCtrl.inicializar();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPopupMenu1 = new javax.swing.JPopupMenu();
		jPanel1 = new javax.swing.JPanel();
		NomeLbl = new javax.swing.JLabel();
		tfNome = new javax.swing.JTextField();
		cpfLbl = new javax.swing.JLabel();
		cpfTxtField = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		telTxtField = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		emailTxtField = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		ruaTxtField = new javax.swing.JTextField();
		boletoCheckBox = new javax.swing.JCheckBox();
		cartaoCheckBox = new javax.swing.JCheckBox();
		SalvarPressed = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel13 = new javax.swing.JLabel();
		nomeCartaoTxtField = new javax.swing.JTextField();
		jLabel15 = new javax.swing.JLabel();
		dataValidadeTxtField = new javax.swing.JTextField();
		jLabel16 = new javax.swing.JLabel();
		cvcTxtField = new javax.swing.JTextField();
		jLabel17 = new javax.swing.JLabel();
		datanscTF = new javax.swing.JTextField();
		jLabel18 = new javax.swing.JLabel();
		jcbQuemIndicou = new javax.swing.JComboBox<>();
		jScrollPane1 = new javax.swing.JScrollPane();
		TabelaSocios = new javax.swing.JTable();
		addDependentePressed = new javax.swing.JButton();
		jLabel12 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox<>();
		jLabel20 = new javax.swing.JLabel();

		setBackground(new java.awt.Color(255, 255, 255));
		setBorder(null);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		NomeLbl.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		NomeLbl.setForeground(new java.awt.Color(158, 189, 83));
		NomeLbl.setText("NOME:");

		tfNome.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
		tfNome.setForeground(new java.awt.Color(153, 153, 153));
		tfNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 189, 83), 2));

		cpfLbl.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		cpfLbl.setForeground(new java.awt.Color(158, 189, 83));
		cpfLbl.setText("CPF:");

		cpfTxtField.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
		cpfTxtField.setForeground(new java.awt.Color(153, 153, 153));
		cpfTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 189, 83), 2));

		jLabel3.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(158, 189, 83));
		jLabel3.setText("TEL.");

		telTxtField.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
		telTxtField.setForeground(new java.awt.Color(153, 153, 153));
		telTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 189, 83), 2));

		jLabel5.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(158, 189, 83));
		jLabel5.setText("EMAIL:");

		emailTxtField.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
		emailTxtField.setForeground(new java.awt.Color(153, 153, 153));
		emailTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 189, 83), 2));

		jLabel6.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(158, 189, 83));
		jLabel6.setText("ENDEREÇO:");

		ruaTxtField.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
		ruaTxtField.setForeground(new java.awt.Color(153, 153, 153));
		ruaTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 189, 83), 2));

		boletoCheckBox.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		boletoCheckBox.setForeground(new java.awt.Color(158, 189, 83));
		boletoCheckBox.setText("BOLETO");

		cartaoCheckBox.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		cartaoCheckBox.setForeground(new java.awt.Color(158, 189, 83));
		cartaoCheckBox.setText("DÉBITO AUTOMÁTICO");
		cartaoCheckBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cartaoCheckBoxActionPerformed(evt);
			}
		});

		SalvarPressed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
		SalvarPressed.setBorderPainted(false);
		SalvarPressed.setContentAreaFilled(false);
		SalvarPressed.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SalvarPressedActionPerformed(evt);
			}
		});

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));

		jLabel13.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		jLabel13.setForeground(new java.awt.Color(158, 189, 83));
		jLabel13.setText("BANCO");

		nomeCartaoTxtField.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
		nomeCartaoTxtField.setForeground(new java.awt.Color(153, 153, 153));
		nomeCartaoTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 189, 83), 2));

		jLabel15.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		jLabel15.setForeground(new java.awt.Color(158, 189, 83));
		jLabel15.setText("AGÊNCIA:");

		dataValidadeTxtField.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
		dataValidadeTxtField.setForeground(new java.awt.Color(153, 153, 153));
		dataValidadeTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 189, 83), 2));

		jLabel16.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		jLabel16.setForeground(new java.awt.Color(158, 189, 83));
		jLabel16.setText("CONTA:");
		jLabel16.setToolTipText("");

		cvcTxtField.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
		cvcTxtField.setForeground(new java.awt.Color(153, 153, 153));
		cvcTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 189, 83), 2));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel13).addComponent(jLabel15))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(dataValidadeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel16)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cvcTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 166,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(nomeCartaoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 396,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel13).addComponent(nomeCartaoTxtField,
										javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(dataValidadeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel15).addComponent(jLabel16).addComponent(cvcTxtField,
										javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jLabel17.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		jLabel17.setForeground(new java.awt.Color(158, 189, 83));
		jLabel17.setText("DATA DE NASCIMENTO:");

		datanscTF.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
		datanscTF.setForeground(new java.awt.Color(153, 153, 153));
		datanscTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 189, 83), 2));

		jLabel18.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		jLabel18.setForeground(new java.awt.Color(158, 189, 83));
		jLabel18.setText("QUEM INDICOU:");

		jcbQuemIndicou.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
		jcbQuemIndicou.setForeground(new java.awt.Color(153, 153, 153));
		jcbQuemIndicou.setMaximumRowCount(100);
		jcbQuemIndicou.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 189, 83), 2));

		jScrollPane1.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N

		TabelaSocios.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
		TabelaSocios.setForeground(new java.awt.Color(153, 153, 153));
		TabelaSocios.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null }, { null, null }, { null, null }, { null, null } },
				new String[] { "Nome", "Grau Parentesco" }));
		jScrollPane1.setViewportView(TabelaSocios);

		addDependentePressed
				.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Funcionario/Botão.png"))); // NOI18N
		addDependentePressed.setBorderPainted(false);
		addDependentePressed.setContentAreaFilled(false);

		jLabel12.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		jLabel12.setForeground(new java.awt.Color(158, 189, 83));
		jLabel12.setText("ADICIONAR DEPENDENTE(S)");

		jLabel19.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		jLabel19.setForeground(new java.awt.Color(158, 189, 83));
		jLabel19.setText("FORMA DE PAGAMENTO");

		jComboBox2.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
		jComboBox2.setForeground(new java.awt.Color(153, 153, 153));
		jComboBox2.setMaximumRowCount(4);
		jComboBox2.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "SOLTEIRO", "CASADO", "DIVORCIADO", "VIÚVO" }));
		jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 189, 83), 2));

		jLabel20.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
		jLabel20.setForeground(new java.awt.Color(158, 189, 83));
		jLabel20.setText("ESTADO CIVIL:");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(SalvarPressed, javax.swing.GroupLayout.PREFERRED_SIZE, 231,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(175, 175, 175))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(161, 161, 161)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(
												jPanel1Layout.createSequentialGroup().addComponent(addDependentePressed)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE,
																191, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(17, 17, 17)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(jPanel1Layout.createSequentialGroup().addComponent(NomeLbl)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE,
																397, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel17,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(cpfLbl,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel20,
																javax.swing.GroupLayout.Alignment.TRAILING))
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addGap(6, 6, 6)
																		.addGroup(jPanel1Layout
																				.createParallelGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						false)
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(datanscTF,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								150,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																								52, Short.MAX_VALUE)
																						.addComponent(jLabel3)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(telTxtField,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								162,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(cpfTxtField)))
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(jComboBox2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				397,
																				javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(jLabel6).addComponent(jLabel5)
																.addComponent(jLabel18))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(emailTxtField).addComponent(jLabel19)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(boletoCheckBox).addGap(18, 18, 18)
																		.addComponent(cartaoCheckBox))
																.addComponent(ruaTxtField).addComponent(jcbQuemIndicou,
																		0, 397, Short.MAX_VALUE)))))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(104, 104, 104).addComponent(
										jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(79, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(NomeLbl).addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cpfLbl).addComponent(cpfTxtField, javax.swing.GroupLayout.PREFERRED_SIZE,
										25, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3)
								.addComponent(telTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel17).addComponent(datanscTF, javax.swing.GroupLayout.PREFERRED_SIZE,
										25, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel20))
						.addGap(15, 15, 15)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(emailTxtField,
										javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(ruaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE,
										25, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel18).addComponent(jcbQuemIndicou,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18).addComponent(jLabel19)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(boletoCheckBox).addComponent(cartaoCheckBox))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(addDependentePressed))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18)
										.addComponent(jLabel12)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
						.addComponent(SalvarPressed, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void cartaoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cartaoCheckBoxActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_cartaoCheckBoxActionPerformed

	private void SalvarPressedActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SalvarPressedActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_SalvarPressedActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel NomeLbl;
	private javax.swing.JButton SalvarPressed;
	private javax.swing.JTable TabelaSocios;
	private javax.swing.JButton addDependentePressed;
	private javax.swing.JCheckBox boletoCheckBox;
	private javax.swing.JCheckBox cartaoCheckBox;
	private javax.swing.JLabel cpfLbl;
	private javax.swing.JTextField cpfTxtField;
	private javax.swing.JTextField cvcTxtField;
	private javax.swing.JTextField dataValidadeTxtField;
	private javax.swing.JTextField datanscTF;
	private javax.swing.JTextField emailTxtField;
	private javax.swing.JComboBox<String> jComboBox2;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPopupMenu jPopupMenu1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JComboBox<String> jcbQuemIndicou;
	private javax.swing.JTextField nomeCartaoTxtField;
	private javax.swing.JTextField ruaTxtField;
	private javax.swing.JTextField telTxtField;
	private javax.swing.JTextField tfNome;

	// End of variables declaration//GEN-END:variables
	public javax.swing.JLabel getNomeLbl() {
		return NomeLbl;
	}

	public void setNomeLbl(javax.swing.JLabel nomeLbl) {
		NomeLbl = nomeLbl;
	}

	public javax.swing.JButton getSalvarPressed() {
		return SalvarPressed;
	}

	public void setSalvarPressed(javax.swing.JButton salvarPressed) {
		SalvarPressed = salvarPressed;
	}

	public javax.swing.JTable getTabelaSocios() {
		return TabelaSocios;
	}

	public void setTabelaSocios(javax.swing.JTable tabelaSocios) {
		TabelaSocios = tabelaSocios;
	}

	public javax.swing.JButton getAddDependentePressed() {
		return addDependentePressed;
	}

	public void setAddDependentePressed(javax.swing.JButton addDependentePressed) {
		this.addDependentePressed = addDependentePressed;
	}

	public javax.swing.JCheckBox getBoletoCheckBox() {
		return boletoCheckBox;
	}

	public void setBoletoCheckBox(javax.swing.JCheckBox boletoCheckBox) {
		this.boletoCheckBox = boletoCheckBox;
	}

	public javax.swing.JCheckBox getCartaoCheckBox() {
		return cartaoCheckBox;
	}

	public void setCartaoCheckBox(javax.swing.JCheckBox cartaoCheckBox) {
		this.cartaoCheckBox = cartaoCheckBox;
	}

	public javax.swing.JLabel getCpfLbl() {
		return cpfLbl;
	}

	public void setCpfLbl(javax.swing.JLabel cpfLbl) {
		this.cpfLbl = cpfLbl;
	}

	public javax.swing.JTextField getCpfTxtField() {
		return cpfTxtField;
	}

	public void setCpfTxtField(javax.swing.JTextField cpfTxtField) {
		this.cpfTxtField = cpfTxtField;
	}

	public javax.swing.JTextField getCvcTxtField() {
		return cvcTxtField;
	}

	public void setCvcTxtField(javax.swing.JTextField cvcTxtField) {
		this.cvcTxtField = cvcTxtField;
	}

	public javax.swing.JTextField getDataValidadeTxtField() {
		return dataValidadeTxtField;
	}

	public void setDataValidadeTxtField(javax.swing.JTextField dataValidadeTxtField) {
		this.dataValidadeTxtField = dataValidadeTxtField;
	}

	public javax.swing.JTextField getDatanscTF() {
		return datanscTF;
	}

	public void setDatanscTF(javax.swing.JTextField datanscTF) {
		this.datanscTF = datanscTF;
	}

	public javax.swing.JTextField getEmailTxtField() {
		return emailTxtField;
	}

	public void setEmailTxtField(javax.swing.JTextField emailTxtField) {
		this.emailTxtField = emailTxtField;
	}

	public javax.swing.JComboBox<String> getjComboBox2() {
		return jComboBox2;
	}

	public void setjComboBox2(javax.swing.JComboBox<String> jComboBox2) {
		this.jComboBox2 = jComboBox2;
	}

	public javax.swing.JLabel getjLabel12() {
		return jLabel12;
	}

	public void setjLabel12(javax.swing.JLabel jLabel12) {
		this.jLabel12 = jLabel12;
	}

	public javax.swing.JLabel getjLabel13() {
		return jLabel13;
	}

	public void setjLabel13(javax.swing.JLabel jLabel13) {
		this.jLabel13 = jLabel13;
	}

	public javax.swing.JLabel getjLabel15() {
		return jLabel15;
	}

	public void setjLabel15(javax.swing.JLabel jLabel15) {
		this.jLabel15 = jLabel15;
	}

	public javax.swing.JLabel getjLabel16() {
		return jLabel16;
	}

	public void setjLabel16(javax.swing.JLabel jLabel16) {
		this.jLabel16 = jLabel16;
	}

	public javax.swing.JLabel getjLabel17() {
		return jLabel17;
	}

	public void setjLabel17(javax.swing.JLabel jLabel17) {
		this.jLabel17 = jLabel17;
	}

	public javax.swing.JLabel getjLabel18() {
		return jLabel18;
	}

	public void setjLabel18(javax.swing.JLabel jLabel18) {
		this.jLabel18 = jLabel18;
	}

	public javax.swing.JLabel getjLabel19() {
		return jLabel19;
	}

	public void setjLabel19(javax.swing.JLabel jLabel19) {
		this.jLabel19 = jLabel19;
	}

	public javax.swing.JLabel getjLabel20() {
		return jLabel20;
	}

	public void setjLabel20(javax.swing.JLabel jLabel20) {
		this.jLabel20 = jLabel20;
	}

	public javax.swing.JLabel getjLabel3() {
		return jLabel3;
	}

	public void setjLabel3(javax.swing.JLabel jLabel3) {
		this.jLabel3 = jLabel3;
	}

	public javax.swing.JLabel getjLabel5() {
		return jLabel5;
	}

	public void setjLabel5(javax.swing.JLabel jLabel5) {
		this.jLabel5 = jLabel5;
	}

	public javax.swing.JLabel getjLabel6() {
		return jLabel6;
	}

	public void setjLabel6(javax.swing.JLabel jLabel6) {
		this.jLabel6 = jLabel6;
	}

	public javax.swing.JPanel getjPanel1() {
		return jPanel1;
	}

	public void setjPanel1(javax.swing.JPanel jPanel1) {
		this.jPanel1 = jPanel1;
	}

	public javax.swing.JPanel getjPanel2() {
		return jPanel2;
	}

	public void setjPanel2(javax.swing.JPanel jPanel2) {
		this.jPanel2 = jPanel2;
	}

	public javax.swing.JPopupMenu getjPopupMenu1() {
		return jPopupMenu1;
	}

	public void setjPopupMenu1(javax.swing.JPopupMenu jPopupMenu1) {
		this.jPopupMenu1 = jPopupMenu1;
	}

	public javax.swing.JScrollPane getjScrollPane1() {
		return jScrollPane1;
	}

	public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
		this.jScrollPane1 = jScrollPane1;
	}

	public javax.swing.JComboBox<String> getJcbQuemIndicou() {
		return jcbQuemIndicou;
	}

	public void setJcbQuemIndicou(javax.swing.JComboBox<String> jcbQuemIndicou) {
		this.jcbQuemIndicou = jcbQuemIndicou;
	}

	public javax.swing.JTextField getNomeCartaoTxtField() {
		return nomeCartaoTxtField;
	}

	public void setNomeCartaoTxtField(javax.swing.JTextField nomeCartaoTxtField) {
		this.nomeCartaoTxtField = nomeCartaoTxtField;
	}

	public javax.swing.JTextField getRuaTxtField() {
		return ruaTxtField;
	}

	public void setRuaTxtField(javax.swing.JTextField ruaTxtField) {
		this.ruaTxtField = ruaTxtField;
	}

	public javax.swing.JTextField getTelTxtField() {
		return telTxtField;
	}

	public void setTelTxtField(javax.swing.JTextField telTxtField) {
		this.telTxtField = telTxtField;
	}

	public javax.swing.JTextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(javax.swing.JTextField tfNome) {
		this.tfNome = tfNome;
	}

}
