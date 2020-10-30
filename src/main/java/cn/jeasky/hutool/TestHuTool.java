package cn.jeasky.hutool;

import cn.hutool.core.lang.Validator;
import cn.hutool.crypto.SecureUtil;
import org.junit.Test;

import java.util.Scanner;

/**
 * @program: LeetcodeProject
 * @description: HuTool工具包测试
 * @author: Jeasky
 * @create: 2020-10-30 14:40
 **/
public class TestHuTool {

    @Test
    public void testValidator(){
        String email = "jeasky@163.com";
        boolean lege = Validator.isEmail(email);
        System.out.println(lege ? email+" 格式合法" : " 格式不合法");

        boolean a = Validator.isBirthday(1997, 10, 30);
        System.out.println(a ? "今天是你的生日,生日快乐！" : "早安打工人");

        boolean b = Validator.isChinese("你好");
        System.out.println(b?"这是中文":"这不是中文");

        System.out.println(Validator.isWord("jksdsd"));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请设置用户名：");
        String userName = sc.nextLine();
        System.out.print("请设置密码：");
        String passWd = sc.nextLine();
        System.out.print("请重复密码：");
        String passWd1 = sc.nextLine();
        String after = SecureUtil.md5(passWd);
        System.out.println(after);
        System.out.println("--------------------------------");
        System.out.print("请输入用户名：");
        String user = sc.nextLine();
        System.out.print("请输入密码：");
        String pass = sc.nextLine();
        System.out.println("--------------------------------");
        if(!user.equals(userName)){
            System.out.println("不存在该用户！");
            return;
        }
        System.out.println(after.equals(SecureUtil.md5(pass)) ? "密码正确!" : "密码错误！");
    }
}
