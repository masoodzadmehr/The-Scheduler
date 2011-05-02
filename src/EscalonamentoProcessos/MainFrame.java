/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Apr 25, 2011, 6:43:32 PM
 */
package EscalonamentoProcessos;

/**
 *
 * @author flavio
 */
public class MainFrame extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        ProcessMenu = new javax.swing.JMenu();
        NewProcessMenuItem = new javax.swing.JMenuItem();
        InformationMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulator CPU Scheduling Algorithms");

        ProcessMenu.setText("Process");

        NewProcessMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        NewProcessMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Images/application_new.png"))); // NOI18N
        NewProcessMenuItem.setText("New");
        NewProcessMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewProcessMenuItemMouseClicked(evt);
            }
        });
        ProcessMenu.add(NewProcessMenuItem);

        jMenuBar1.add(ProcessMenu);

        InformationMenu.setText("Information");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Images/help.png"))); // NOI18N
        jMenuItem2.setText("Help");
        InformationMenu.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Images/information.png"))); // NOI18N
        jMenuItem3.setText("About");
        InformationMenu.add(jMenuItem3);

        jMenuBar1.add(InformationMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewProcessMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewProcessMenuItemMouseClicked
        new ProcessFrame().setVisible(true);
    }//GEN-LAST:event_NewProcessMenuItemMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu InformationMenu;
    private javax.swing.JMenuItem NewProcessMenuItem;
    private javax.swing.JMenu ProcessMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
