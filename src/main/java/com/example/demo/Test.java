package com.example.demo;

import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Date;

@RestController
public class Test {

    @GetMapping("aaa")
    public String 赵盼盼() {
        return "张莜和张英的故事";
    }

    @GetMapping("/down")
    public String test(HttpServletResponse response) throws IOException{
        return "康雯17岁";
//        long time1 = new Date().getTime();
//        String fileName = "community_template.xlsx";
//
//        InputStream inp = this.getClass().getResourceAsStream("/templates/community_template.xlsx");
//
//        XSSFWorkbook wbs = new XSSFWorkbook(inp);
//        long time2 = new Date().getTime();
//        System.out.println(time2 - time1);
//        SXSSFWorkbook wb = new SXSSFWorkbook(wbs);
//        Font defaultFont = wb.getFontAt(0);
//        System.out.println(defaultFont.getFontHeight());
//        long time3 = new Date().getTime();
//        System.out.println(time3 - time2);
//
//        //如果是IE浏览器，则用URLEncode解析
//        fileName = URLEncoder.encode(fileName, "UTF-8");
//
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("multipart/form-data");
//        response.setHeader("Content-Disposition", "attachment;fileName=" + fileName);
//        OutputStream os = response.getOutputStream();
//        wb.write(os);
//        os.close();
//        wb.close();
    }
}
