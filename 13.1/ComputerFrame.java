import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComputerFrame extends JFrame {
    JMenuBar menubar;//菜单条
    JMenu choiceGrade;//菜单 一级菜单 选择等级
    JMenuItem grade1,grade2;//二级菜单
    JTextField textOne,textTwo,textResult;
    JButton getProblem,giveAnswer;
    JLabel operatorLabel,message;//创建标签  设置操作符
    Teacher teacherzhang;//声明teacher对象 声明自制的监视器
    ComputerFrame(){
        teacherzhang =new Teacher();//为监视器分配变量
        teacherzhang.setMaxInteger(20);//设置随机出现的最大数
        setLayout(new FlowLayout());
        menubar = new JMenuBar();//为菜单条分配变量
        choiceGrade = new JMenu("选择级别");//为一级菜单分配变量并命名
        grade1 = new JMenuItem("幼儿级别");//二级菜单 等级1
        grade2 = new JMenuItem("儿童级别");//二级菜单 等级二
        grade1.addActionListener(new ActionListener() {//给等级1增加监视器设置随机产生的最大数为10
            public void actionPerformed(ActionEvent e) {
                teacherzhang.setMaxInteger(10);
            }
        });
        grade2.addActionListener(new ActionListener() {//给等级二增加监视器设置随机产生的最大数为50
            public void actionPerformed(ActionEvent e) {
                teacherzhang.setMaxInteger(50);
            }
        });
        choiceGrade.add(grade1);
        choiceGrade.add(grade2);
        menubar.add(choiceGrade);
        setJMenuBar(menubar);//将菜单条添加到JFrame中
        textOne = new JTextField(5);//创建文本框textOne（数字1）长度为5
        textTwo = new JTextField(5);//创建文本框textTwo（数字二）长度为5
        textResult = new JTextField(5);//创建文本框textResult（结果）长度为5
        operatorLabel = new JLabel("+");//创建标签operatorLabel(运算符) 设置为加号
        operatorLabel.setFont(new Font("Arial", Font.BOLD, 20));//设置标签颜色大小
        message = new JLabel("你还没有回答");//创建提示文本框
        getProblem = new JButton("获取题目");//创建获取题目按钮
        giveAnswer = new JButton("确认答案");//创建确认答案按钮
        add(textOne);//将textOne文本框装入窗口
        add(operatorLabel);//将operatorLabel标签装入窗口
        add(textTwo);//将textTwo文本框装入窗口
        add(new JLabel("="));
        add(textResult);//将textResult文本框装入窗口
        add(giveAnswer);//将确认答案按钮加入窗口
        add(message);//将提示标签加入窗口
        add(getProblem);//将获取题目按钮加入窗口
        textResult.requestFocus();//设置为有输入的焦点
        textOne.setEditable(false);//将textOne文本框设置为不可编辑
        textTwo.setEditable(false);//将textTwo文本框设置为不可编辑
        getProblem.setActionCommand("getProblem");//设置按钮getProblem的触发属性字符为"getProblem"
        textResult.setActionCommand("answer");//设置文本框giveAnswer的触发属性字符为"answer"
        giveAnswer.setActionCommand("answer");//设置按钮（JButton）giveAnswer的触发属性字符为"answer"
        teacherzhang.setJTextField(textOne, textTwo, textResult);
        teacherzhang.setJLabel(operatorLabel, message);//将operatorLabel, message两个标签传入teacherZhang中
        getProblem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherzhang.actionPerformed(e);
            }
        });//将teacherZhang注册为getProblem按钮的事件监视器
        giveAnswer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherzhang.actionPerformed(e);
            }
        });
        textResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherzhang.actionPerformed(e);
            }
        });//将teacherZhang注册为textResult文本框的事件监视器
        setVisible(true);//可见性
        validate();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//默认关闭操作 隐藏窗口后 释放资源
    }

}
