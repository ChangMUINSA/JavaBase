package base;

import com.sun.xml.internal.ws.wsdl.writer.document.Import;

import java.util.Date;
import base.operator.OperatorComplex;
import base.*; // “.*” 是通配符,回导入包中所有的类！

public class Package {
    public static void main(String[] args) {
        //为了更好的组织类， java提供了包机制， 用于区别类命名的命名空间
        //包的本质就是文件夹
        // package pkg1[. pkg2[. pkg3...]];
        //一般利用公司域名倒置作为包名
        //为了使用某一个包的成员， 我们需要在java程序中明确导入该包. 使用“import”语句可以完成此功能
    }
}
