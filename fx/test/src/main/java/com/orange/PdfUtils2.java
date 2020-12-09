package com.orange;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.print.DocFlavor.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class PdfUtils2 {
	/*由于博客园上传文件大小有限制，请大家把从：c/system/fonts/DENG.TTF拷到resources/fonts/目录下
	 * 先找到等线，点击进去，复制 《 等线 常规  》   这个字体 。   等线常规  就是DENG.TTF
	 * */
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
        map.put("applyNo","NEW201906172519");
        map.put("loanTerm","3");
        map.put("loanDate","2020-05-20");
        map.put("finishDate","2020-08-20");
        map.put("loanamt","25833342.25");
        map.put("amountRepaid","254323833.25");
        map.put("loanStatus", "歮靐敩龘我");
        map.put("cardNo", "赣A DN983");
        map.put("vinNo", "BY23424324");
        map.put("modelName", "2020款 运动版 1.5T 自动两驱精英型");
        map.put("mortgagePerson","中国人寿财产保险股份有限公司");
        map.put("carEquityNo", "New4234324324432432");
        Map<String,Object> o=new HashMap<String,Object>();
        o.put("dataMap",map);
		pdfout(o);
	}
	
	
	 public static void pdfout(Map<String,Object> o){
	        // 模板路径  
	        String templatePath = getTemplatePath();
	        System.out.println("模板路径："+templatePath);
	        // 生成的新文件路径  
	        String newPDFPath = "d:/test5.pdf";

	        PdfReader reader;
	        FileOutputStream out;
	        ByteArrayOutputStream bos;
	        PdfStamper stamper;
	        try {
	        	//String fontPath = getFontPath();
	        	//System.out.println("fontPath:"+fontPath);
	           // BaseFont bf = BaseFont.createFont(fontPath , BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
	            //Font FontChinese = new Font(bf, 5, Font.NORMAL);


	            
	            out = new FileOutputStream(newPDFPath);// 输出流
	            reader = new PdfReader(templatePath);// 读取pdf模板  
	            bos = new ByteArrayOutputStream();
	            stamper = new PdfStamper(reader, bos);
	            AcroFields form = stamper.getAcroFields();
	            //文字类的内容处理
	            Map<String,String> datemap = (Map<String,String>)o.get("dataMap");
	            //form.addSubstitutionFont(bf);
	            for(String key : datemap.keySet()){
	                String value = datemap.get(key);
	                form.setField(key,value);
	            }

	            stamper.setFormFlattening(true);// 如果为false，生成的PDF文件可以编辑，如果为true，生成的PDF文件不可以编辑
	            stamper.close();
	            Document doc = new Document();
	           //Font font = new Font(bf, 32);
	            PdfCopy copy = new PdfCopy(doc, out);
	            
	            doc.open();
	            PdfImportedPage importPage = copy.getImportedPage(new PdfReader(bos.toByteArray()), 1);
	            copy.addPage(importPage);
	            doc.close();

	        } catch (IOException e) {
	            System.out.println(e);
	        } catch (DocumentException e) {
	            System.out.println(e);
	        }
	 }
	 
	   /* private static String getFontPath(){
	        String path="";
	        // 1. 生产环境路径
	        ClassLoader classLoader= Thread.currentThread().getContextClassLoader();
	        java.net.URL url = (classLoader==null)?null:classLoader.getResource("/");
	        String threadCurrentPath = (url==null)?"":url.getPath();
	        // 2. 如果线程获取为null,则使用当前PdfUtils.class加载路径
	        if(threadCurrentPath == null || "".equals(threadCurrentPath.trim())){
	             path = PdfUtils2.class.getClass().getResource("/").getPath();
	        }
	        // 3.拼接字体路径
	        StringBuffer stringBuffer = new StringBuffer(path);
	        stringBuffer.append("/fonts/DENG.TTF");
	        path = stringBuffer.toString();
	        //logger.info("getFontPath threadCurrentPath: {}  path: {}",threadCurrentPath,path);
	        return path;
	    }*/
	    
	    private static String getTemplatePath(){
	        String path="";
	        // 1. 生产环境路径
	        ClassLoader classLoader= Thread.currentThread().getContextClassLoader();
	        java.net.URL url = (classLoader==null)?null:classLoader.getResource("/");
	        String threadCurrentPath = (url==null)?"":url.getPath();
	        // 2. 如果线程获取为null,则使用当前PdfUtils.class加载路径
	        if(threadCurrentPath == null || "".equals(threadCurrentPath.trim())){
	             path = PdfUtils2.class.getClass().getResource("/").getPath();
	        }
	        // 3.拼接字体路径
	        StringBuffer stringBuffer = new StringBuffer(path);
	        stringBuffer.append("/dai_wrapper1.pdf");
	        path = stringBuffer.toString();
	        //logger.info("getFontPath threadCurrentPath: {}  path: {}",threadCurrentPath,path);
	        return path;
	    }


}
