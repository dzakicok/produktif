

    private void btambahActionPerformed(java.awt.event.ActionEvent evt) {
        
        txtnpm.setText("");
        txtnama.setText("");
        cmbjur.setSelectedItem("");
        if (jRadioButton1.isSelected()){
            JOptionpane.showMessageDialog(rootPane, "laki-laki");
        }else if(jRadioButton2.isSelected()){
                JOptionPane.showMessageDialog(rootPane, "wanita");
        txtalamat.setText("");
}
    //TODO add your handling code here:
   }
    
    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
}