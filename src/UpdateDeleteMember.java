/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.*;
import javax.swing.JOptionPane;
import project.ConnectionProvider;
/**
 *
 * @author anasm
 */
public class UpdateDeleteMember extends javax.swing.JFrame {

	/**
	 * Creates new form UpdateDeleteMember
	 */
	public UpdateDeleteMember() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jButton1 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jButton2 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jTextField3 = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                jTextField4 = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                jTextField5 = new javax.swing.JTextField();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jButton5 = new javax.swing.JButton();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jTextField6 = new javax.swing.JTextField();
                jTextField7 = new javax.swing.JTextField();
                jTextField8 = new javax.swing.JTextField();
                jTextField9 = new javax.swing.JTextField();
                jLabel11 = new javax.swing.JLabel();
                jTextField10 = new javax.swing.JTextField();
                jLabel12 = new javax.swing.JLabel();
                jTextField11 = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setLocation(new java.awt.Point(520, 125));
                setUndecorated(true);

                jPanel1.setBackground(new java.awt.Color(3, 23, 48));

                jButton1.setBackground(new java.awt.Color(3, 23, 48));
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close-window-32_Red.png"))); // NOI18N
                jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(89, 166, 186));
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit-user-25.png"))); // NOI18N
                jLabel1.setText(" Update & Delete Member");

                jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(204, 204, 204));
                jLabel2.setText("Memeber ID :");

                jTextField1.setBackground(new java.awt.Color(51, 51, 51));
                jTextField1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jTextField1.setForeground(new java.awt.Color(204, 204, 204));
                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
                        }
                });

                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search23.png"))); // NOI18N
                jButton2.setText("Search");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(204, 204, 204));
                jLabel3.setText("Name");

                jTextField2.setBackground(new java.awt.Color(51, 51, 51));
                jTextField2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jTextField2.setForeground(new java.awt.Color(204, 204, 204));
                jTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField2ActionPerformed(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(204, 204, 204));
                jLabel4.setText("Father Name");

                jTextField3.setBackground(new java.awt.Color(51, 51, 51));
                jTextField3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jTextField3.setForeground(new java.awt.Color(204, 204, 204));

                jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(204, 204, 204));
                jLabel5.setText("Age");

                jTextField4.setBackground(new java.awt.Color(51, 51, 51));
                jTextField4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jTextField4.setForeground(new java.awt.Color(204, 204, 204));

                jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(204, 204, 204));
                jLabel6.setText("Gender");

                jTextField5.setBackground(new java.awt.Color(51, 51, 51));
                jTextField5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jTextField5.setForeground(new java.awt.Color(204, 204, 204));

                jButton3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update-15.png"))); // NOI18N
                jButton3.setText("update");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete-15.png"))); // NOI18N
                jButton4.setText("Delete");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jButton5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset_15.png"))); // NOI18N
                jButton5.setText("Reset");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(204, 204, 204));
                jLabel7.setText("Email");

                jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(204, 204, 204));
                jLabel8.setText("NIC");

                jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(204, 204, 204));
                jLabel9.setText("Address");

                jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(204, 204, 204));
                jLabel10.setText("Gym Time");

                jTextField6.setBackground(new java.awt.Color(51, 51, 51));
                jTextField6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jTextField6.setForeground(new java.awt.Color(204, 204, 204));

                jTextField7.setBackground(new java.awt.Color(51, 51, 51));
                jTextField7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jTextField7.setForeground(new java.awt.Color(204, 204, 204));

                jTextField8.setBackground(new java.awt.Color(51, 51, 51));
                jTextField8.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jTextField8.setForeground(new java.awt.Color(204, 204, 204));

                jTextField9.setBackground(new java.awt.Color(51, 51, 51));
                jTextField9.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jTextField9.setForeground(new java.awt.Color(204, 204, 204));

                jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jLabel11.setForeground(new java.awt.Color(204, 204, 204));
                jLabel11.setText("Mobile Number");

                jTextField10.setBackground(new java.awt.Color(51, 51, 51));
                jTextField10.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jTextField10.setForeground(new java.awt.Color(204, 204, 204));

                jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jLabel12.setForeground(new java.awt.Color(204, 204, 204));
                jLabel12.setText("Amount/month");

                jTextField11.setBackground(new java.awt.Color(51, 51, 51));
                jTextField11.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
                jTextField11.setForeground(new java.awt.Color(204, 204, 204));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 522, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(47, 47, 47)
                                                                .addComponent(jButton2)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(jLabel11)
                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addGap(34, 34, 34))
                                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField5)
                                                                        .addComponent(jTextField10))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jTextField8)
                                                                        .addComponent(jTextField7)
                                                                        .addComponent(jTextField6)
                                                                        .addComponent(jTextField9)
                                                                        .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton3)
                                                .addGap(38, 38, 38)
                                                .addComponent(jButton4)
                                                .addGap(49, 49, 49)
                                                .addComponent(jButton5)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton1)))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4)
                                        .addComponent(jButton5))
                                .addGap(22, 22, 22))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
		setVisible(false);
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField1ActionPerformed

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField2ActionPerformed

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                // TODO add your handling code here:
		setVisible(false);
		new UpdateDeleteMember().setVisible(true);
        }//GEN-LAST:event_jButton5ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
		int checkid=0;
		String id=jTextField1.getText();
		try{
			Connection con=ConnectionProvider.getCon();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select *from member where id='"+id+"';");
			while (rs.next()){
				checkid=1;
				jTextField1.setEditable(false);
				jTextField2.setText(rs.getString(2));
				jTextField3.setText(rs.getString(3));
				jTextField4.setText(rs.getString(4));
				jTextField5.setText(rs.getString(5));
				jTextField5.setEditable(false);
				jTextField6.setText(rs.getString(7));
				jTextField7.setText(rs.getString(8));
				jTextField8.setText(rs.getString(10));
				jTextField9.setText(rs.getString(9));
				jTextField9.setEditable(false);
				jTextField10.setText(rs.getString(6));
				jTextField11.setText(rs.getString(11));
			}
			if(checkid==0){
				JOptionPane.showMessageDialog(null,"Member ID does not Exist");
			}
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                // TODO add your handling code here:
		String id=jTextField1.getText();
		String name=jTextField2.getText();
		String fatherName=jTextField3.getText();
		String age=jTextField4.getText();
		String mobileNum=jTextField10.getText();
		String email=jTextField6.getText();
		String nic=jTextField7.getText();
		String address=jTextField8.getText();
		String amount=jTextField11.getText();
		try{
			Connection con=ConnectionProvider.getCon();
			PreparedStatement ps=con.prepareStatement("update member set name=?,fatherName=?,age=?,mobileNum=?,email=?,nicNum=?,address=?,amount=? where id=?");
			ps.setString(1, name);
			ps.setString(2, fatherName);
			ps.setString(3, age);
			ps.setString(4, mobileNum);
			ps.setString(5, email);
			ps.setString(6, nic);
			ps.setString(7, address);
			ps.setString(8, amount);
			ps.setString(9, id);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Successfully Updated");
			new UpdateDeleteMember().setVisible(true);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
        }//GEN-LAST:event_jButton3ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                // TODO add your handling code here:
		int a=JOptionPane.showConfirmDialog(null, "Do you really want to delete?","Select",JOptionPane.YES_NO_OPTION);
		if (a==0){
			String id=jTextField1.getText();
			try{
				Connection con=ConnectionProvider.getCon();
				Statement st=con.createStatement();
				st.executeUpdate("delete from member where id='"+id+"'");	
				JOptionPane.showMessageDialog(null, "Successfully deleted");
				setVisible(false);
				new UpdateDeleteMember().setVisible(true);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
		}
		
        }//GEN-LAST:event_jButton4ActionPerformed

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
			java.util.logging.Logger.getLogger(UpdateDeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UpdateDeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UpdateDeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UpdateDeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UpdateDeleteMember().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField10;
        private javax.swing.JTextField jTextField11;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        private javax.swing.JTextField jTextField6;
        private javax.swing.JTextField jTextField7;
        private javax.swing.JTextField jTextField8;
        private javax.swing.JTextField jTextField9;
        // End of variables declaration//GEN-END:variables
}
