/*
 * Created by JFormDesigner on Sat Nov 11 14:44:38 CST 2023
 */

package com.universe.swingdemo.export;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author jsliu
 */
public class ExportFrame extends JFrame {
    public ExportFrame() {
        initComponents();
    }

    private void btnExportByTableName(ActionEvent e) {
        // TODO add your code here

    }

    private void btnExportBySql(ActionEvent e) {
        // TODO add your code here

    }

    private void btnSelectImportFile(ActionEvent e) {
        // TODO add your code here

    }

    private void btnImport(ActionEvent e) {
        // TODO add your code here

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        tabbedPane1 = new JTabbedPane();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();
        textArea2 = new JTextArea();
        panel6 = new JPanel();
        btnExportByTableName = new JButton();
        panel3 = new JPanel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();
        panel7 = new JPanel();
        btnExportBySql = new JButton();
        panel4 = new JPanel();
        panel5 = new JPanel();
        btnSelectImportFile = new JButton();
        btnImport = new JButton();
        scrollPane3 = new JScrollPane();
        textArea3 = new JTextArea();

        //======== this ========
        setTitle("\u6570\u636e\u5e93\u5bfc\u5165\u3001\u5bfc\u51fa");
        setPreferredSize(new Dimension(800, 600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== tabbedPane1 ========
        {

            //======== panel2 ========
            {
                panel2.setLayout(new BorderLayout());

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(textArea2);
                }
                panel2.add(scrollPane1, BorderLayout.CENTER);

                //======== panel6 ========
                {
                    panel6.setLayout(new FlowLayout(FlowLayout.LEADING));

                    //---- btnExportByTableName ----
                    btnExportByTableName.setText("\u5f00\u59cb");
                    btnExportByTableName.addActionListener(e -> btnExportByTableName(e));
                    panel6.add(btnExportByTableName);
                }
                panel2.add(panel6, BorderLayout.NORTH);
            }
            tabbedPane1.addTab("\u5bfc\u51fa\uff08\u8868\u540d\uff09", panel2);

            //======== panel3 ========
            {
                panel3.setLayout(new BorderLayout());

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(textArea1);
                }
                panel3.add(scrollPane2, BorderLayout.CENTER);

                //======== panel7 ========
                {
                    panel7.setLayout(new FlowLayout(FlowLayout.LEADING));

                    //---- btnExportBySql ----
                    btnExportBySql.setText("\u5f00\u59cb");
                    btnExportBySql.addActionListener(e -> btnExportBySql(e));
                    panel7.add(btnExportBySql);
                }
                panel3.add(panel7, BorderLayout.NORTH);
            }
            tabbedPane1.addTab("\u5bfc\u51fa\uff08SQL\uff09", panel3);

            //======== panel4 ========
            {
                panel4.setLayout(new BorderLayout());

                //======== panel5 ========
                {
                    panel5.setLayout(new FlowLayout());

                    //---- btnSelectImportFile ----
                    btnSelectImportFile.setText("\u9009\u62e9\u6587\u4ef6");
                    btnSelectImportFile.addActionListener(e -> btnSelectImportFile(e));
                    panel5.add(btnSelectImportFile);

                    //---- btnImport ----
                    btnImport.setText("\u5f00\u59cb");
                    btnImport.setEnabled(false);
                    btnImport.addActionListener(e -> btnImport(e));
                    panel5.add(btnImport);
                }
                panel4.add(panel5, BorderLayout.NORTH);

                //======== scrollPane3 ========
                {
                    scrollPane3.setViewportView(textArea3);
                }
                panel4.add(scrollPane3, BorderLayout.CENTER);
            }
            tabbedPane1.addTab("\u5bfc\u5165", panel4);

            tabbedPane1.setSelectedIndex(0);
        }
        contentPane.add(tabbedPane1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTabbedPane tabbedPane1;
    private JPanel panel2;
    private JScrollPane scrollPane1;
    private JTextArea textArea2;
    private JPanel panel6;
    private JButton btnExportByTableName;
    private JPanel panel3;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    private JPanel panel7;
    private JButton btnExportBySql;
    private JPanel panel4;
    private JPanel panel5;
    private JButton btnSelectImportFile;
    private JButton btnImport;
    private JScrollPane scrollPane3;
    private JTextArea textArea3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public static void main(String[] args) {
        new ExportFrame().setVisible(true);
    }
}
