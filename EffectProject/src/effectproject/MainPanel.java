
package effectproject;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class MainPanel extends javax.swing.JFrame {
    private BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_3BYTE_BGR);
    File file = null;
    double imageSize;
    
    
    public MainPanel() {
        initComponents();
        imagePanel1.setBP(buttonPanel1);
        buttonPanel1.setIP(imagePanel1);
        buttonPanel1.setMP(this);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel1 = new effectproject.ButtonPanel();
        imagePanel1 = new effectproject.ImagePanel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 350));
        getContentPane().add(buttonPanel1, java.awt.BorderLayout.EAST);
        getContentPane().add(imagePanel1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Save As...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       openImage();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        save(file);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        saveAs();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

 
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new MainPanel().setVisible(true);
            }
        });
    }
    
    public void openImage(){
        JFileChooser chooser = new JFileChooser("C:\\Users\\User");
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Images", "jpg", "gif", "png","jpeg");
        chooser.setFileFilter(filter);
        int response = chooser.showOpenDialog(this);
        
        if(response == JFileChooser.APPROVE_OPTION){
            file = chooser.getSelectedFile();
        }
        if(file!=null){
            try{
                image = ImageIO.read(file);
               
            }catch(IOException ex){
                System.out.println("file not found");
            }
            
            imagePanel1.setImage(image);
            this.repaint();
        }

    }
     
    public void save(File file){
        imagePanel1.save(file); 
    }
    public void saveAs(){
        if(file!=null){
            imagePanel1.saveAs();
        }
        else{
            JOptionPane.showMessageDialog(this, "No image opened yet");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private effectproject.ButtonPanel buttonPanel1;
    private effectproject.ImagePanel imagePanel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
