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
        jp.setLayout(new FlowLayout());
        //设置背景色
        jp.setBackground(Color.gray);

        //创建JButton对象
        JButton btn1 = new JButton("根据表名导出");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(jp, "请输入表名", "请输入表名", 1);
                System.out.println(input);
                //do export by table name

            }
        });

        JButton btn2 = new JButton("根据SQL导出");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btn3 = new JButton("导入");
        jp.add(btn1);
        jp.add(btn2);
        jp.add(btn3);


        add(jp, BorderLayout.CENTER);

        //设置窗口是否可见
        setVisible(true);
    }

    public static void main(String[] agrs) {
        //创建一个实例化对象
        new ExportDemo();
    }
}