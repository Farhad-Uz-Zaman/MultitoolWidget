/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

/**
 *
 * @author Adnan & Arman
 */
public class toDo extends javax.swing.JFrame {

    /**
     * Creates new form toDo
     */
    
        int  mouseX;
        int  mouseY;
        
    public toDo(int x,int y) {
        initComponents();
        this.setLocation(x,y);
       showLog_.setBackground(new java.awt.Color(255,255,255,0));
       showLog_.setText("haha");
       search_.setBackground(new java.awt.Color(255,255,255,0));
       
        
    }    
    public toDo(int i,String st) {
        initComponents();
        
       showLog_.setBackground(new java.awt.Color(255,255,255,0));
       search_.setBackground(new java.awt.Color(255,255,255,0));
       
       showLog(i,st);
       
       
        
    } 
    
    public toDo() {
        initComponents();
       // this.setLocation(x,y);
       showLog_.setBackground(new java.awt.Color(255,255,255,0));
       showLog_.setText("haha");
       search_.setBackground(new java.awt.Color(255,255,255,0));
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        newPanel_ = new javax.swing.JLabel();
        showLog_ = new javax.swing.JLabel();
        showLog_1 = new javax.swing.JLabel();
        showLog_2 = new javax.swing.JLabel();
        showLog_3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        search_ = new javax.swing.JTextField();
        drag_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_MouseClicked(evt);
            }
        });
        getContentPane().add(exit_, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 0, 35, 35));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 0, 35, 35));

        newPanel_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newPanel_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newPanel_MouseClicked(evt);
            }
        });
        getContentPane().add(newPanel_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 33, 35));

        showLog_.setForeground(new java.awt.Color(255, 255, 255));
        showLog_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        showLog_.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(showLog_, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 377, 296, 20));

        showLog_1.setForeground(new java.awt.Color(255, 255, 255));
        showLog_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        showLog_1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(showLog_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 333, 296, 20));

        showLog_2.setForeground(new java.awt.Color(255, 255, 255));
        showLog_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        showLog_2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(showLog_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 355, 296, 20));

        showLog_3.setForeground(new java.awt.Color(255, 255, 255));
        showLog_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        showLog_3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(showLog_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 399, 296, 20));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 78, 28, 28));

        search_.setForeground(new java.awt.Color(255, 255, 255));
        search_.setBorder(null);
        search_.setOpaque(false);
        getContentPane().add(search_, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 77, 262, 30));

        drag_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd/todoListFinal.png"))); // NOI18N
        drag_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drag_MouseDragged(evt);
            }
        });
        drag_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drag_MousePressed(evt);
            }
        });
        getContentPane().add(drag_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 313, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exit_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_MouseClicked
        this.dispose();
    }//GEN-LAST:event_exit_MouseClicked

    private void drag_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_drag_MousePressed

    private void drag_MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_drag_MouseDragged

    private void newPanel_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPanel_MouseClicked
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        todoPanel tdp = new todoPanel(x-mouseX, y-mouseY);
        tdp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newPanel_MouseClicked

    
    public void showLog(int i,String name){
        
        switch (i){
            case 0:
                
                showLog_1.setText(name);
                
                break;
        }
    }
    
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
            java.util.logging.Logger.getLogger(toDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(toDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(toDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(toDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new toDo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel drag_;
    private javax.swing.JLabel exit_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel newPanel_;
    private javax.swing.JTextField search_;
    private javax.swing.JLabel showLog_;
    private javax.swing.JLabel showLog_1;
    private javax.swing.JLabel showLog_2;
    private javax.swing.JLabel showLog_3;
    // End of variables declaration//GEN-END:variables
}
