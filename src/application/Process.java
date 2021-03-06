package application;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.io.Serializable;
import javax.accessibility.Accessible;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Process extends javax.swing.JFrame implements Icon, Serializable, Accessible {

    JTextField[] ProcessId;
    JTextField[] Burst;
    JTextField[] Arrival;
    JTextField[] Priority;
    JLabel[] ActionButtons;

    public Process() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProcessPanel = new javax.swing.JPanel();
        ProcessIdLabel = new javax.swing.JLabel();
        AmountComboBox = new javax.swing.JComboBox();
        AmountLabel = new javax.swing.JLabel();
        AlgorithmButton = new javax.swing.JButton();
        ArrivalLabel = new javax.swing.JLabel();
        PriorityLabel = new javax.swing.JLabel();
        AlgorithmLabel = new javax.swing.JLabel();
        AlgorithmComboBox = new javax.swing.JComboBox();
        CPUBurstLabel = new javax.swing.JLabel();
        StepCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("The Scheduler  » Process");
        setMinimumSize(new java.awt.Dimension(705, 515));
        setName("Process"); // NOI18N

        ProcessPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Process"));

        ProcessIdLabel.setText("Process ID");

        AmountComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "10" }));
        AmountComboBox.setSelectedIndex(-1);
        AmountComboBox.setToolTipText("Select the number of processes");
        AmountComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountComboBoxActionPerformed(evt);
            }
        });

        AmountLabel.setText("Amount of Process");

        AlgorithmButton.setText("Run!");
        AlgorithmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgorithmButtonActionPerformed(evt);
            }
        });

        ArrivalLabel.setText("Arrival");

        PriorityLabel.setText("Priority");

        AlgorithmLabel.setText("Select an Algorithm");

        AlgorithmComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FIFO", "Shortest-Remaining-Time-First", "Shortest Job First", "Round Robin", "Lottery" }));
        AlgorithmComboBox.setSelectedIndex(-1);
        AlgorithmComboBox.setToolTipText("Selects an algorithm to start the simulation");

        CPUBurstLabel.setText("CPU burst");

        StepCheckBox.setText("Step by Step");

        javax.swing.GroupLayout ProcessPanelLayout = new javax.swing.GroupLayout(ProcessPanel);
        ProcessPanel.setLayout(ProcessPanelLayout);
        ProcessPanelLayout.setHorizontalGroup(
            ProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProcessPanelLayout.createSequentialGroup()
                        .addComponent(AmountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AmountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProcessPanelLayout.createSequentialGroup()
                        .addComponent(ProcessIdLabel)
                        .addGap(35, 35, 35)
                        .addComponent(CPUBurstLabel)))
                .addGap(18, 18, 18)
                .addGroup(ProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProcessPanelLayout.createSequentialGroup()
                        .addComponent(AlgorithmLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlgorithmComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AlgorithmButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StepCheckBox))
                    .addGroup(ProcessPanelLayout.createSequentialGroup()
                        .addComponent(ArrivalLabel)
                        .addGap(56, 56, 56)
                        .addComponent(PriorityLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProcessPanelLayout.setVerticalGroup(
            ProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountLabel)
                    .addComponent(AmountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlgorithmLabel)
                    .addComponent(AlgorithmComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlgorithmButton)
                    .addComponent(StepCheckBox))
                .addGap(18, 18, 18)
                .addGroup(ProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProcessIdLabel)
                    .addComponent(CPUBurstLabel)
                    .addComponent(ArrivalLabel)
                    .addComponent(PriorityLabel))
                .addGap(190, 190, 190))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProcessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProcessPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AmountComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountComboBoxActionPerformed
        int amount = Integer.parseInt(AmountComboBox.getSelectedItem().toString());
        String confirmDialog = String.valueOf(JOptionPane.showConfirmDialog(null, "Register " + amount + " processes?"));
        if (confirmDialog.contains("0")) {
            ImageIcon icon = new ImageIcon(getClass().getResource("/Images/bin_closed.png"));
            ProcessId = new JTextField[amount];
            Burst = new JTextField[amount];
            Arrival = new JTextField[amount];
            Priority = new JTextField[amount];
            ActionButtons = new JLabel[amount];
            for (int i = 0; i < amount; i++) {
                ProcessId[i] = new JTextField();
                ProcessId[i].setBounds(17, (i == 0) ? 100 : 100 + (35 * i), 75, 25);
                ProcessId[i].setText(null);
                ProcessId[i].setVisible(true);
                ProcessPanel.add(ProcessId[i]);
                Burst[i] = new JTextField();
                Burst[i].setBounds(126, (i == 0) ? 100 : 100 + (35 * i), 75, 25);
                Burst[i].setText(null);
                Burst[i].setVisible(true);
                ProcessPanel.add(Burst[i]);
                Arrival[i] = new JTextField();
                Arrival[i].setBounds(223, (i == 0) ? 100 : 100 + (35 * i), 75, 25);
                Arrival[i].setText(null);
                Arrival[i].setVisible(true);
                ProcessPanel.add(Arrival[i]);
                Priority[i] = new JTextField();
                Priority[i].setBounds(323, (i == 0) ? 100 : 100 + (35 * i), 75, 25);
                Priority[i].setText(null);
                Priority[i].setVisible(true);
                ProcessPanel.add(Priority[i]);
                ActionButtons[i] = new JLabel();
                ActionButtons[i].setIcon(icon);
                ActionButtons[i].setBounds(410, (i == 0) ? 105 : 105 + (35 * i), 16, 16);
                ActionButtons[i].setVisible(true);
                ActionButtons[i].setCursor(new Cursor(HAND_CURSOR));
                ProcessPanel.add(ActionButtons[i]);
            }
            ProcessPanel.repaint();
        }
}//GEN-LAST:event_AmountComboBoxActionPerformed
    private void AlgorithmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgorithmButtonActionPerformed
        int algorithm = AlgorithmComboBox.getSelectedIndex();
        switch (algorithm) {
            case 0:
                new FIFO(ProcessId, Burst, Arrival, Priority).setVisible(true);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Selects an algorithm to start the simulation!");
                break;
        }
}//GEN-LAST:event_AlgorithmButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Process().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlgorithmButton;
    private javax.swing.JComboBox AlgorithmComboBox;
    private javax.swing.JLabel AlgorithmLabel;
    private javax.swing.JComboBox AmountComboBox;
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JLabel ArrivalLabel;
    private javax.swing.JLabel CPUBurstLabel;
    private javax.swing.JLabel PriorityLabel;
    private javax.swing.JLabel ProcessIdLabel;
    private javax.swing.JPanel ProcessPanel;
    private javax.swing.JCheckBox StepCheckBox;
    // End of variables declaration//GEN-END:variables

    public void paintIcon(Component cmpnt, Graphics grphcs, int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getIconWidth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getIconHeight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}