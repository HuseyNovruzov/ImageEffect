
package effectproject;

import javax.swing.JCheckBox;

public class ButtonPanel extends javax.swing.JPanel {
    private ImagePanel ip;
    private MainPanel mp = null;
    public ButtonPanel() {
        initComponents();
    }
    public void setIP(ImagePanel ip){
        this.ip = ip;
    }
    public void setMP(MainPanel mp){
        this.mp = mp;
    }
    public boolean getjCheckBox1() {
        return jCheckBox1.isSelected();
    }

    public boolean getjCheckBox2() {
        return jCheckBox2.isSelected();
    }

    public boolean getjCheckBox3() {
        return jCheckBox3.isSelected();
    }

    public boolean getjCheckBox4() {
        return jCheckBox4.isSelected();
    }

    public boolean getjCheckBox5() {
        return jCheckBox5.isSelected();
    }

    public boolean getjCheckBox6() {
        return jCheckBox6.isSelected();
    }
    
    
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jSlider1 = new javax.swing.JSlider();

        setMinimumSize(new java.awt.Dimension(150, 300));
        setPreferredSize(new java.awt.Dimension(150, 300));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(120, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(120, 50));

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn);

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(saveBtn);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setMinimumSize(new java.awt.Dimension(120, 300));
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 300));

        jLabel1.setText("Power");
        jPanel2.add(jLabel1);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1.0d, -3.0d, 3.0d, 0.5d));
        jSpinner1.setPreferredSize(new java.awt.Dimension(49, 20));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jPanel2.add(jSpinner1);

        jCheckBox1.setText("Reverse      ");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jPanel2.add(jCheckBox1);

        jCheckBox2.setText("Roki Effect");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        jPanel2.add(jCheckBox2);

        jCheckBox3.setText("Moco Effect");
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });
        jPanel2.add(jCheckBox3);

        jCheckBox4.setText("Spicy Effect");
        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });
        jPanel2.add(jCheckBox4);

        jCheckBox5.setText("Blur Effect   ");
        jCheckBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox5ItemStateChanged(evt);
            }
        });
        jPanel2.add(jCheckBox5);

        jCheckBox6.setText("Sobel Filter");
        jCheckBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox6ItemStateChanged(evt);
            }
        });
        jPanel2.add(jCheckBox6);

        jSlider1.setMaximum(50);
        jSlider1.setMinimum(-50);
        jSlider1.setValue(0);
        jSlider1.setBorder(javax.swing.BorderFactory.createTitledBorder("Brightness"));
        jSlider1.setPreferredSize(new java.awt.Dimension(100, 46));
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jPanel2.add(jSlider1);

        add(jPanel2, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        ip.repaint();
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
       jCheckBox1.setSelected(false);
       jCheckBox2.setSelected(false);
       jCheckBox3.setSelected(false);
       jCheckBox4.setSelected(false);
       jCheckBox5.setSelected(false);
       jCheckBox6.setSelected(false);
       jSlider1.setValue(0);
       jSpinner1.setValue(1.0);  
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        ip.repaint();
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        mp.save(mp.file);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        ip.repaint();
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
        ip.repaint();
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox5ItemStateChanged
        ip.repaint();
    }//GEN-LAST:event_jCheckBox5ItemStateChanged

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        ip.setBrightness(jSlider1.getValue());
        ip.repaint();
    }//GEN-LAST:event_jSlider1StateChanged

    private void jCheckBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox6ItemStateChanged
        ip.repaint();
    }//GEN-LAST:event_jCheckBox6ItemStateChanged

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        double value = (double) jSpinner1.getValue();
        ip.setPower(value);
        ip.repaint();
    }//GEN-LAST:event_jSpinner1StateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
