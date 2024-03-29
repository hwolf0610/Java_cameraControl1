
import com.github.sarxos.webcam.Webcam;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class webcamera02 extends javax.swing.JFrame {

    Webcam webcam;
    Boolean isRunning = false;
    int x, y,counter=0,num=0;

    //imageHolder
//  
//      
    /**
     * Creates new form webcamera02
     */
    public webcamera02() {
        initComponents();

//        setLocationRelativeTo(null);
        this.setLocation(300, 150);
        this.setSize(1000, 800);
        this.setTitle("Camera Connect");

        jButton1.setText("Pause");

//        Mat img = new Mat();
//        img = Imgcodecs.imread("src/car.PNG");
//        Imgcodecs.imwrite("D:\\test2.jpg", img);
        Graphics g5;
        g5 = jPanel5.getGraphics();
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("src/car.png");
        g5.drawImage(i, 20, 20, jPanel5.getWidth() - 20, jPanel5.getHeight(), this);

        webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(320, 240));
        webcam.open();
        try {
            ImageIO.write(webcam.getImage(), "JPG", new File("D:\\test3.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(webcamera02.class.getName()).log(Level.SEVERE, null, ex);
        }

        new videoFeedTaker().start();
        isRunning = true;

//        new saveimage10().start();
//        isRunning = true;

        new minus().start();
        isRunning = true;
        
        Graphics g1;
        g1 = jPanel8.getGraphics();
        int w = jPanel8.getWidth();
        int h = jPanel8.getHeight();
        g1.setColor(Color.red);
        g1.drawLine(25, h / 2 - 60, w / 2 - 60, h / 2 - 60);
        g1.drawLine(w / 2 - 60, 25, w / 2 - 60, h / 2 - 60);

        g1.drawLine(w / 2 + 60, 25, w / 2 + 60, h / 2 - 60);
        g1.drawLine(w / 2 + 60, h / 2 - 60, w - 25, h / 2 - 60);

        g1.drawLine(25, h / 2 + 60, w / 2 - 60, h / 2 + 60);
        g1.drawLine(w / 2 - 60, h / 2 + 60, w / 2 - 60, h - 25);

        g1.drawLine(w - 25, h / 2 + 60, w / 2 + 60, h / 2 + 60);
        g1.drawLine(w / 2 + 60, h / 2 + 60, w / 2 + 60, h - 25);
        g1.setColor(Color.yellow);
        g1.drawLine(25, h / 2, w - 25, h / 2);
        g1.drawLine(w / 2, 25, w / 2, h - 25);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        imageHolder1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        imageHolder3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        imageHolder2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        captureimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(38, 50, 56));
        jPanel3.setForeground(new java.awt.Color(0, 102, 153));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(38, 50, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "show video", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(38, 50, 56));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Curent Video", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());
        jPanel6.add(imageHolder1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(38, 50, 56));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compare", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setLayout(new java.awt.BorderLayout());
        jPanel7.add(imageHolder3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setBackground(new java.awt.Color(38, 50, 56));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "background subtraction Video", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel8.setLayout(new java.awt.BorderLayout());
        jPanel8.add(imageHolder2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(38, 50, 56));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "control camera", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Start/Pause");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(13, 18, 13, 18);
        jPanel2.add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Capture");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(13, 18, 13, 18);
        jPanel2.add(jButton2, gridBagConstraints);

        jPanel3.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(38, 50, 56));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(38, 50, 56));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Capture Image", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(new java.awt.BorderLayout());

        captureimage.setBackground(new java.awt.Color(38, 50, 56));
        captureimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/start.png"))); // NOI18N
        captureimage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                captureimageMouseClicked(evt);
            }
        });
        jPanel5.add(captureimage, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!isRunning) {
            new videoFeedTaker().start();
            isRunning = true;

//            new saveimage10().start();
//            isRunning = true;

            new minus().start();
            isRunning = true;
            jButton1.setText("Pause");

        } else {
            jButton1.setText("Start");
            isRunning = false;
            try {
                ImageIO.write(webcam.getImage(), "JPG", new File("D:\\test1.jpg"));

            } catch (IOException ex) {
                Logger.getLogger(webcamera02.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            ImageIO.write(webcam.getImage(), "JPG", new File("D:\\test.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(webcamera02.class.getName()).log(Level.SEVERE, null, ex);
        }
        Graphics g0;
        g0 = jPanel5.getGraphics();
        g0.drawImage(webcam.getImage(), 15, 25, jPanel5.getWidth() - 35, jPanel5.getHeight() - 35, this);

        BufferedImage img = webcam.getImage();
        int width = img.getWidth();
        int height = img.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = img.getRGB(x, y);

                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;

                //calculate average
                int avg = (r + g + b) / 3;

                //replace RGB value with avg
                p = (a << 24) | (avg << 16) | (avg << 8) | avg;

                img.setRGB(x, y, p);
            }
        }

        ///////////
//       img[i,j]=p;
//       img_2[i,j]=q;
//       forI
//               J
//               tar[i,j]=ing[]-img_2
        g0.drawImage(webcam.getImage(), 15, 25, jPanel5.getWidth() - 35, jPanel5.getHeight() - 35, this);

        Graphics g1;
        g1 = jPanel5.getGraphics();
        int w = jPanel5.getWidth();
        int h = jPanel5.getHeight();
        g1.setColor(Color.red);
        g1.drawLine(25, h / 2 - 60, w / 2 - 60, h / 2 - 60);
        g1.drawLine(w / 2 - 60, 25, w / 2 - 60, h / 2 - 60);

        g1.drawLine(w / 2 + 60, 25, w / 2 + 60, h / 2 - 60);
        g1.drawLine(w / 2 + 60, h / 2 - 60, w - 25, h / 2 - 60);

        g1.drawLine(25, h / 2 + 60, w / 2 - 60, h / 2 + 60);
        g1.drawLine(w / 2 - 60, h / 2 + 60, w / 2 - 60, h - 25);

        g1.drawLine(w - 25, h / 2 + 60, w / 2 + 60, h / 2 + 60);
        g1.drawLine(w / 2 + 60, h / 2 + 60, w / 2 + 60, h - 25);
        g1.setColor(Color.yellow);
        g1.drawLine(25, jPanel5.getHeight() / 2, jPanel5.getWidth() - 25, jPanel5.getHeight() / 2);
        g1.drawLine(jPanel5.getWidth() / 2, 25, jPanel5.getWidth() / 2, jPanel5.getHeight() - 25);

//        x = 25;
//        y = jPanel5.getHeight() / 2 - 50;
//        Toolkit t = Toolkit.getDefaultToolkit();
//        Image i = t.getImage("src/car.png");
//        g1.drawImage(i, x, y, 80, 40, this);
//        g1.drawOval(25, jPanel5.getHeight()/2-30, 25, 25);
//        Graphics g2;
//        g2 = jPanel1.getGraphics();
//        g2.setColor(Color.red);
//        g2.drawLine(25, jPanel1.getHeight() / 2 - 50, jPanel1.getWidth() - 25, jPanel1.getHeight() / 2 - 50);
//        g2.drawLine(25, jPanel1.getHeight() / 2 + 50, jPanel1.getWidth() - 25, jPanel1.getHeight() / 2 + 50);
//        g2.drawLine(jPanel1.getWidth() / 2 - 50, 25, jPanel1.getWidth() / 2 - 50, jPanel1.getHeight() - 25);
//        g2.drawLine(jPanel1.getWidth() / 2 + 50, 25, jPanel1.getWidth() / 2 + 50, jPanel1.getHeight() - 25);
//        g2.setColor(Color.yellow);
//        g2.drawLine(25, jPanel1.getHeight() / 2, jPanel1.getWidth() - 25, jPanel1.getHeight() / 2);
//        g2.drawLine(jPanel1.getWidth() / 2, 25, jPanel1.getWidth() / 2, jPanel1.getHeight() - 25);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void captureimageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_captureimageMouseClicked
        // TODO add your handling code here:
//
//        int x = evt.getX();
//        int y = evt.getY();
//        System.out.println(x + "_" + y);
//        BufferedImage img = webcam.getImage();
//        int w = img.getWidth();
//        int h = img.getHeight();
//        int[][] pixels = new int[w][h];
//
//        for (int i = 0; i < w; i++) {
//            for (int j = 0; j < h; j++) {
//                pixels[i][j] = img.getRGB(i, j);
//            }
//        }
//
////        File f = null;
////        f = new File("D:\\test1.jpg");
////        try {
////            img = ImageIO.read(f);
////        } catch (IOException ex) {
////            Logger.getLogger(webcamera02.class.getName()).log(Level.SEVERE, null, ex);
////        } 
//        System.out.println(pixels[x][y]);
//        Color c = new Color(img.getRGB(x, y));
//        System.out.println("S.No: " + "00" + " Red: " + c.getRed() + "  Green: " + c.getGreen() + " Blue: " + c.getBlue());
////        int p = img.getRGB(0, 0);
////        int r = (p >> 16) & 0xff;
////        int g = (p >> 8) & 0xff;
////        int b = p & 0xff;
////        System.out.println(r + "_" + g + "_" + b);

    }//GEN-LAST:event_captureimageMouseClicked

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
            java.util.logging.Logger.getLogger(webcamera02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(webcamera02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(webcamera02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(webcamera02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new webcamera02().setVisible(true);
            }
        });
    }

    class videoFeedTaker extends Thread {

        @Override
        public void run() {
            
            while (isRunning) {
                try {
                    Image image = webcam.getImage();
                    imageHolder1.setIcon(new ImageIcon(image));
                    counter++;
                    if(counter==20){
                        ImageIO.write(webcam.getImage(), "JPG", new File("D:\\test1.jpg"));
                        counter=0;
                    }else{continue;}                    
                    Thread.sleep(50);

                } catch (InterruptedException ex) {
                    Logger.getLogger(webcamera02.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(webcamera02.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

//    class saveimage10 extends Thread {
//
//        @Override
//        public void run() {
//
//            while (isRunning) {
//                try {
//                    Image image = webcam.getImage();
//                    BufferedImage img = webcam.getImage();
//                    int width = img.getWidth();
//                    int height = img.getHeight();
//                    for (int y = 0; y < height; y++) {
//                        for (int x = 0; x < width; x++) {
//                            int p = img.getRGB(x, y);
//
//                            int a = (p >> 24) & 0xff;
//                            int r = (p >> 16) & 0xff;
//                            int g = (p >> 8) & 0xff;
//                            int b = p & 0xff;
//
//                            //calculate average
//                            int avg = (r + g + b) / 3;
//
//                            //replace RGB value with avg
//                            p = (a << 24) | (avg << 16) | (avg << 8) | avg;
//
//                            img.setRGB(x, y, p);
//                        }
//                    }
////                    imageHolder2.setIcon(new ImageIcon(img));
//
//                    ImageIO.write(img, "JPG", new File("D:\\test10.jpg"));
//
//                    Thread.sleep(100);
//
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(webcamera02.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(webcamera02.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//        }
//    }

    class minus extends Thread {

        int[][] current;
        int[][] old;
        int[][] minus;

        @Override
        public void run() {

//            for (int i = 0; i < 4; i++) {
//                for (int j = 0; j < 4; j++) {
//                    m[i][j] = i * j;
//                }
//            }
            while (isRunning) {
                try {
//                    Image image = webcam.getImage();
                    BufferedImage img1 = webcam.getImage();
//                    File f1 = null;
//                    f1 = new File("D:\\test1.jpg");
//                    BufferedImage img1 = ImageIO.read(f1);
                    int width = img1.getWidth();
                    int height = img1.getHeight();
                    current = new int[height][width];
                    old = new int[height][width];
                    minus = new int[height][width];

                    for (int y = 0; y < height; y++) {
                        for (int x = 0; x < width; x++) {
                            int p = img1.getRGB(x, y);                           
                            int a = (p >> 24) & 0xff;
                            int r = (p >> 16) & 0xff;
                            int g = (p >> 8) & 0xff;
                            int b = p & 0xff;
                            //calculate average
                            int avg = (r + g + b) / 3;
                            //replace RGB value with avg
                            p = (a << 24) | (avg << 16) | (avg << 8) | avg;
//                             0.3R + 0.59G + 0.11B
                            current[y][x] = p;
//                            System.out.println(current[y][x]);

//                            img.setRGB(x, y, p);
                        }
                    }

                    File f2 = null;
                    f2 = new File("D:\\test1.jpg");
                    BufferedImage img2 = ImageIO.read(f2);
                    int width2 = img2.getWidth();
                    int height2 = img2.getHeight();
                    for (int y = 0; y < height2; y++) {
                        for (int x = 0; x < width2; x++) {
                            int p = img2.getRGB(x, y);
                            int a = (p >> 24) & 0xff;
                            int r = (p >> 16) & 0xff;
                            int g = (p >> 8) & 0xff;
                            int b = p & 0xff;
                            //calculate average
                            int avg = (r + g + b) / 3;
                            //replace RGB value with avg
                            p = (a << 24) | (avg << 16) | (avg << 8) | avg;
                            old[y][x] = p;
//                            System.out.println(old[y][x]);
//                            img.setRGB(x, y, p);
                        }
                    }

                    File f3 = null;
                    f3 = new File("D:\\test3.jpg");
                    BufferedImage img3 = ImageIO.read(f3);
                    int width3 = img3.getWidth();
                    int height3 = img3.getHeight();
                    for (int i = 0; i < height3; i++) {
                        for (int j = 0; j < width3; j++) {
                            int a1,a2,a3,r1,r2,r3,g1,g2,g3,b1,b2,b3;
                            a1 = (current[i][j] >> 24) & 0xff;                   a2 = (old[i][j] >> 24) & 0xff; a3=Math.abs(a1-a2);
                            r1 = (current[i][j] >> 16) & 0xff;                   r2 = (old[i][j] >> 16) & 0xff;  r3=Math.abs(r1-r2);
                            g1 = (current[i][j] >> 8) & 0xff;                    g2 = (old[i][j] >> 8) & 0xff;  g3=Math.abs(g1-g2);
                            b1 = current[i][j] & 0xff;                           b2 = old[i][j] & 0xff;         b3=Math.abs(b1-b2);
                            int avg = (r3 + g3 + b3) / 3;
//                            minus[i][j] = Math.abs(current[i][j] - old[i][j]);
                               minus[i][j] =  (a3 << 24) | (avg << 16) | (avg << 8) | avg;
//                            System.out.println(minus[i][j]);
                            img3.setRGB(j, i, minus[i][j]);
                        }
                    }

                    for (int i = 0; i < height3; i++) {
                        for (int j = 0; j < width3; j++) {
                            minus[i][j] = Math.abs(current[i][j] - old[i][j]);
                            if (i > height3 / 2 - 60 && i < height / 2 + 60 && j > width / 2 - 60 && j < width / 2 + 60) {
                                if (minus[i][j] > 10000) {
                                    num++;
                                    imageHolder3.setText("counter="+num);
                                    System.out.println(minus[i][j]);
                                    System.out.println("alert!!!");
                                   
                                }
                                
                            }
//                            System.out.println(minus[i][j]);
                            img3.setRGB(j, i, minus[i][j]);
                        }
                    }
//                    Graphics g;
//                    g=jPanel5.getGraphics();
//                    webcamera02 wc2=new webcamera02();
//                    g.drawImage(img3, 20, 20,jPanel5.getWidth(),jPanel5.getHeight(), wc2);
                    imageHolder2.setIcon(new ImageIcon(img3));

                    ImageIO.write(img3, "JPG", new File("D:\\test4.jpg"));

                    Thread.sleep(100);

                } catch (InterruptedException ex) {
                    Logger.getLogger(webcamera02.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(webcamera02.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel captureimage;
    private javax.swing.JLabel imageHolder1;
    private javax.swing.JLabel imageHolder2;
    private javax.swing.JLabel imageHolder3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
