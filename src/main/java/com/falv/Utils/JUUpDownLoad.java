package com.falv.Utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;

public class JUUpDownLoad {


    public static ResponseEntity<byte[]> toDownload(HttpSession session,String src,String downloadname) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath(src);
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组    available()方法:返回数据流字节长度大小
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename="+downloadname);
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }


    //fileHtmlName 上传那个html的标签name, dir 是上传的目录
    public static void toUpload(MultipartFile fileHtmlName,HttpSession session,String dir) throws IOException {
        //用户上传的文件名
        String filename=fileHtmlName.getOriginalFilename();
        //利用UUID是32位随机数作为文件名(防止文件名重复)



        String suffix=filename.substring(filename.lastIndexOf("."));
        String UUID= java.util.UUID.randomUUID().toString();
        filename=UUID+suffix;

        ServletContext servletContext = session.getServletContext();
        String dirpath = servletContext.getRealPath(dir);
        File dirpathfile = new File(dirpath);
        if (!dirpathfile.exists()) {
            dirpathfile.mkdir();
        }
        //拼接最终的路径   File.separator 文件分隔符
        String finalPath=dirpath+File.separator+filename;
        fileHtmlName.transferTo(new File(finalPath));
        System.out.println("上传成功，文件上传至:"+finalPath);

    }
    //fileHtmlName 上传那个html的标签name, dir 是上传的目录
    public static void toUpload(MultipartFile fileHtmlName,HttpSession session,String dir,String yourfilename) throws IOException {
        //用户上传的文件名
        String filename=fileHtmlName.getOriginalFilename();
        //利用UUID是32位随机数作为文件名(防止文件名重复)



        String suffix=filename.substring(filename.lastIndexOf("."));
        String UUID= java.util.UUID.randomUUID().toString();
        filename=yourfilename+":"+UUID+suffix;

        ServletContext servletContext = session.getServletContext();

        String basePath = URLDecoder.decode(ResourceUtils.getURL("classpath:").getPath() + "upload/");
        String dirpath = basePath+dir;
        File dirpathfile = new File(dirpath);
        if (!dirpathfile.exists()) {
            dirpathfile.mkdir();
        }
        //拼接最终的路径   File.separator 文件分隔符
        String finalPath=dirpath+File.separator+filename;
        fileHtmlName.transferTo(new File(finalPath));
        System.out.println("上传成功，文件上传至:"+finalPath);



    }
}
