//使用Jmeter请求接口导出文件，在HTTP请求下添加BeanShell后置处理器编写java代码实现

import java.io.*;

public class exporting_files {
    //获取请求返回的数据，通过prev方法获取上个请求的返回
    //prev:是jmeter beanShell内置的常用对象，getResponseData():获取Http取样器的返回结果
    byte[] result = prev.getResponseData();

    public exporting_files() throws FileNotFoundException {
        // 设置文件导出存放路径及保存的文件名
        String file_name = "D:/importdd.xls";
        //使用File类打开文件
        File file = new File(file_name);
        try {
            //实例化输出流
            FileOutputStream out = new FileOutputStream(file);
            //调用流的读写方法写入数据
            out.write(result);
            //关闭流
            out.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
