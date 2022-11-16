import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Teacher implements ActionListener{//创建监视器 继承接口监视器监控
    int numberOne, numberTwo;
    String operator = "";//存储运算符
    boolean isRight;//
    Random random;//生成随机数
    int maxInteger;//存储最大数
    JTextField textOne, textTwo, textResult;
    JLabel operatorLabel, message;//创建标签用来接收ComputerFrame传来的两个标签 运算符和提示

    Teacher() {
        random = new Random();//随机类 生成树
    }

    public void setMaxInteger(int n) {//设置最大整数
        maxInteger = n;
    }

    public void actionPerformed(ActionEvent e) {//重写 ActionListener接口继承的方法
        String str = e.getActionCommand();//获得e的触发字符串
        if (str.equals("getProblem")) {//如果获得的为获取题目的字符串
            numberOne = random.nextInt(maxInteger) + 1;//随机获得一个数储存到numberOne
            numberTwo = random.nextInt(maxInteger) + 1;//随机获得一个数储存到numberTwo
            double d = Math.random();
            if (d >= 0.5)
                operator = "+";
            else
                operator = "-";//将操作符随机为加 减
            textOne.setText("" + numberOne);//将数1传到textOne文本框中
            textTwo.setText("" + numberTwo);//将数2传到textTwo文本框中
            operatorLabel.setText(operator);//将操作符传到文本框中
            message.setText("请回答");//设置提示为请回答
            textResult.setText(null);//结果为空
        } else if (str.equals("answer")) {//如果获取的为确认答案的字符串
            String answer = textResult.getText();//将结果文本框里的字符存储到answer中
            try {
                int result = Integer.parseInt(answer);//字符串的转换（int）
                if (operator.equals("+")) {//和运算
                    if (result == numberOne + numberTwo)//
                        message.setText("你的回答正确");//修改设置提示标签
                    else
                        message.setText("你的回答错误");
                } else if (operator.equals("-")) {//差运算
                    if (result == numberOne - numberTwo)
                        message.setText("你的回答正确");
                    else
                        message.setText("你的回答错误");
                }
            } catch (NumberFormatException ex) {//当输入的有错误时 提醒输入数字
                message.setText("请输入数字字符");
            }
        }
    }

    public void setJTextField(JTextField... t) {//负责接收三个文本框
        textOne = t[0];
        textTwo = t[1];
        textResult = t[2];
    }

    public void setJLabel(JLabel... label) {//负责接收两个提示
        operatorLabel = label[0];
        message = label[1];
    }
}
