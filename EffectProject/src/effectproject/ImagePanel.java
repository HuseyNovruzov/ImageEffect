/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package effectproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;




public class ImagePanel extends javax.swing.JPanel {
    private BufferedImage img = new BufferedImage(200, 200, BufferedImage.TYPE_3BYTE_BGR);
    private ButtonPanel bp = new ButtonPanel();
    private BufferedImage tempimage = new BufferedImage(200, 200, BufferedImage.TYPE_3BYTE_BGR);
    File currentFile = null;
    private int bright;
    private double pow = 1.0;
    
    public ImagePanel() {
        initComponents();
        
    }
    public void setImage(BufferedImage img){
        this.img = img;
    }
    public void setBP(ButtonPanel bp){
        this.bp = bp;
    }
    
    private BufferedImage cloneImage(BufferedImage image){
        int w = image.getWidth();
        int h = image.getHeight();
        
        BufferedImage tempimg = new BufferedImage(w, h, BufferedImage.TYPE_3BYTE_BGR);
        for(int x = 0; x<w; x++){
            for(int y = 0; y<h; y++){
                int pixel = image.getRGB(x, y);
                tempimg.setRGB(x, y, pixel);
            }
            
        }
        return tempimg;
    }
   
    @Override
    public void paintComponent(Graphics g){
        int w = img.getWidth();
        int h = img.getHeight();
        
        tempimage = cloneImage(img); 
        
        g.setColor(Color.white);
        g.fillRect(0, 0, 1250, 1000);
        for(int xx = 0; xx<w;xx++){
                for(int yy = 0; yy<h;yy++){
                    int pixel = tempimage.getRGB(xx, yy);
                    int red = (pixel >> 16) & 0x0ff;
                    int green = (pixel >> 8) & 0x0ff;
                    int blue = (pixel) & 0x0ff;
                    int R = red, G = green, B = blue;
                    if(bp.getjCheckBox1()){
                        R = (int) Math.sqrt(Math.pow(blue, 2) + red) /2;
                        G = (int) Math.sqrt(Math.pow(red, 2) + Math.sqrt(green))/2;
                        B = (int) Math.sqrt(Math.pow(red, 2) + Math.sqrt(blue))/2;
                    }
                    if(bp.getjCheckBox2()){
                        R = red;
                        G = (int) (Math.sqrt(green));
                        B = (int) (Math.sqrt(blue));
                    }
                    if(bp.getjCheckBox3()){
                        R = blue;
                        G = red;
                        B = green; 
                    }
                    if(bp.getjCheckBox4()){
                        double max = 0;
                        double min = 0;
                        max = Math.max(red, blue);
                        min = Math.min(blue, green);
                        if(max == red){
                            R = blue;
                        } 
                        if(min == green){

                            B = green;
                        }else{
                        
                            G = blue;
                        }
                    }
                     
                      
                   tempimage.setRGB(xx, yy, new Color(R, G, B).getRGB());
                }}
       if(bp.getjCheckBox5()){
            for (int xx = 1; xx < w-1; xx++){
               for (int yy = 1; yy < h-1; yy++) {
                   
                    int R = 0;
                    int G = 0;
                    int B = 0;
     
                    int pixel1 = tempimage.getRGB(xx - 1, yy - 1);
                    R += (pixel1 >> 16) & 0xff;
                    G += (pixel1 >> 8) & 0xff;
                    B += (pixel1 >> 0) & 0xff;

                    int pixel2 = tempimage.getRGB(xx, yy - 1);
                    R += (pixel2 >> 16) & 0xff;
                    G += (pixel2 >> 8) & 0xff;
                    B += (pixel2 >> 0) & 0xff;

                    int pixel3 = tempimage.getRGB(xx + 1, yy - 1);
                    R += (pixel3 >> 16) & 0xff;
                    G += (pixel3 >> 8) & 0xff;
                    B += (pixel3 >> 0) & 0xff;

                    int pixel4 = tempimage.getRGB(xx - 1, yy);
                    R += (pixel4 >> 16) & 0xff;
                    G += (pixel4 >> 8) & 0xff;
                    B += (pixel4 >> 0) & 0xff;

                    int pixel5 = tempimage.getRGB(xx, yy);
                    R += (pixel5 >> 16) & 0xff;
                    G += (pixel5 >> 8) & 0xff;
                    B += (pixel5 >> 0) & 0xff;

                    int pixel6 = tempimage.getRGB(xx + 1, yy);
                    R += (pixel6 >> 16) & 0xff;
                    G += (pixel6 >> 8) & 0xff;
                    B += (pixel6 >> 0) & 0xff;

                    int pixel7 = tempimage.getRGB(xx - 1, yy + 1);
                    R += (pixel7 >> 16) & 0xff;
                    G += (pixel7 >> 8) & 0xff;
                    B += (pixel7 >> 0) & 0xff;

                    int pixel8 = tempimage.getRGB(xx, yy + 1);
                    R += (pixel8 >> 16) & 0xff;
                    G += (pixel8 >> 8) & 0xff;
                    B += (pixel8 >> 0) & 0xff;

                    int pixel9 = tempimage.getRGB(xx + 1, yy + 1);
                    R += (pixel9 >> 16) & 0xff;
                    G += (pixel9 >> 8) & 0xff;
                    B += (pixel9 >> 0) & 0xff;

                    R /= 9;
                    G /= 9;
                    B /= 9;
                  
                    tempimage.setRGB(xx, yy, new Color(R,G,B).getRGB());
                    
            
        }
       }
       }
       
       if(bp.getjCheckBox6()){
           int[][] edgeColors = new int[w][h];
           
           
           for(int xx = 1; xx < w-1; xx++){
               for(int yy = 1; yy < h-1; yy++){

                   
                    int pixel1 = getGrayScale(tempimage.getRGB(xx - 1, yy - 1));
                    int pixel2 = getGrayScale(tempimage.getRGB(xx -1, yy));
                    int pixel3 = getGrayScale(tempimage.getRGB(xx - 1, yy + 1));
                    

                    int pixel4 = getGrayScale(tempimage.getRGB(xx, yy - 1));
                    int pixel5 = getGrayScale(tempimage.getRGB(xx, yy));
                    int pixel6 = getGrayScale(tempimage.getRGB(xx, yy + 1));
                    

                    int pixel7 = getGrayScale(tempimage.getRGB(xx + 1, yy - 1));
                    int pixel8 = getGrayScale(tempimage.getRGB(xx + 1, yy));
                    int pixel9 = getGrayScale(tempimage.getRGB(xx + 1, yy + 1));
                    
                    double gx = (pixel1 * 1 * pow) + (pixel2 * 2 * pow) + (pixel3 * 1 * pow)
                           +(pixel7 * -1 * pow) + (pixel8 * -2 * pow) + (pixel9 * -1 * pow);
                    
                    double gy = (pixel1 * 1 * pow) + (pixel3 * -1 * pow)
                            +(pixel4 * 2 * pow) + (pixel6 * -2 * pow)
                            +(pixel7 * 1 * pow) + (pixel9 * -1 * pow);

                    double gval = Math.sqrt(Math.pow(gx, 2)+ Math.pow(gy, 2));
                    int val = (int) gval;

                    edgeColors[xx][yy] = val;
               
               }
           }
           
           for (int i = 0; i < w; i++) {
             for (int j = 0; j < h; j++) {
                int edgeColor = edgeColors[i][j];
                edgeColor = (int)(edgeColor );
                edgeColor = (edgeColor << 16) | (edgeColor << 8) | edgeColor;

                tempimage.setRGB(i, j, edgeColor);
            }
        }
       }
       
     
       //Brightness
       for(int xx = 0; xx<w;xx++){
                for(int yy = 0; yy<h;yy++){
                    int pixel = tempimage.getRGB(xx, yy);
                    int red = (pixel >> 16) & 0x0ff;
                    int green = (pixel >> 8) & 0x0ff;
                    int blue = (pixel) & 0x0ff;
                    
                    int bRed = (red+red*bright/100)>255 ? 255 : (red+red*bright/100)<0 ? 0 : (red+red*bright/100);
                    int bGreen = (green+green*bright/100)>255 ? 255 : (green+green*bright/100)<0 ? 0 : (green+green*bright/100);
                    int bBlue = (blue+blue*bright/100)>255 ? 255 : (blue+blue*bright/100)<0 ? 0 : (blue+blue*bright/100);
                    
                    tempimage.setRGB(xx, yy, new Color(bRed, bGreen, bBlue).getRGB());   
                }
         }
       
       
        
        g.drawImage(tempimage, 10, 10, img.getWidth(), img.getHeight(), this);
        
    }
    
    public void setPower(double pow){
        this.pow = pow;
    }

     public static int getGrayScale(int rgb){
        int red = (rgb >> 16) & 0xff;
        int green = (rgb >> 8) & 0xff;
        int blue = (rgb >> 0) & 0xff;
        int gray = (int) ( red/9 +  green/9 + blue/9);
        return gray;
    }
    
    public void setBrightness(int value){
        this.bright = value;
    }
    public void save(File file){
        if(file!=null){
            try{
                file = new File(file + "-edit.png");
                ImageIO.write(tempimage, "png", file);
                JOptionPane.showMessageDialog(this, "Your changes saved");
                
            }catch(IOException ex){
                JOptionPane.showMessageDialog(this, "Something went wrong");
            }
        }else{
            JOptionPane.showMessageDialog(this, "No image selected yet");
        }
    
    }
   public void saveAs(){
       JFileChooser chooser = new JFileChooser("C:\\Users\\User");
       chooser.setDialogTitle("Save file");
       FileNameExtensionFilter filter = new FileNameExtensionFilter("Images","png","jpg","jpeg","gif");
       chooser.setFileFilter(filter);
       chooser.setSelectedFile(new File("edited.jpg"));
       
       int response = chooser.showSaveDialog(this);
       
       if(response == JFileChooser.APPROVE_OPTION){
           try{
               File outputfile = chooser.getSelectedFile();
               ImageIO.write(tempimage, "JPG",outputfile);
           }catch(IOException ex){
               JOptionPane.showMessageDialog(chooser, "Saving was unsuccess");
           }
       }
   
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(1200, 1400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
