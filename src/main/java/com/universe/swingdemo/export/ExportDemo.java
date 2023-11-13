package com.universe.swingdemo.export;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExportDemo extends JFrame {
    public ExportDemo() {
        //设置显示窗口标题
        setTitle("数据库记录导入导出");
        //设置窗口显示尺寸
        setSize(400, 200);
        //置窗口是否可以关闭
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //创建JPanel对象
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(1, 3));
        //设置背景色
        jp.setBackground(Color.gray);

        //创建JButton对象
        JButton btn1 = new JButton("根据表名导出");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(ExportDemo.this, "请输入表名（多个表名用逗号分隔）", "请输入表名", 1);
                System.out.println(input);
                //do export by table name

            }
        });

        JButton btn2 = new JButton("根据SQL导出");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextArea textArea = new JTextArea(20, 30);
                JScrollPane scrollPane = new JScrollPane(textArea);
                int result = JOptionPane.showOptionDialog(ExportDemo.this, scrollPane, "请输入SQL", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
                if (result == JOptionPane.OK_OPTION) {
                    String userInput = textArea.getText();
                    System.out.println(userInput);
                } else {
                    System.out.println(textArea.getText());
                }

            }
        });

        JButton btn3 = new JButton("导入");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser("D:\\");
                //文件打开对话框
                int val = fc.showOpenDialog(ExportDemo.this);
                if (val == JFileChooser.APPROVE_OPTION) {
                    System.out.println(fc.getSelectedFile().getAbsolutePath());
                    //正常选择文件
                    // jtf.setText(fc.getSelectedFile().toString());
                } else {
                    //未正常选择文件，如选择取消按钮
                    //  jtf.setText("未选择文件");
                }
            }
        });

        jp.add(btn1);
        jp.add(btn2);
        jp.add(btn3);
        add(jp);
        setBounds(300, 200, 600, 300);
        //设置窗口是否可见
        setVisible(true);
    }

    public static void main(String[] agrs) {
        //创建一个实例化对象
        new ExportDemo();
    }
}