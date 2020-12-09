package com.orange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.xml.internal.ws.util.StringUtils;
/**
 *@Author iechenyb<br>
 *@Desc 类描述<br>
 *@CreateTime 2020年11月9日 下午4:13:38
 */
public class Test {
	static String a = "a2011,a2101,a2103,a2105,a2107,a2109,b2011,b2012,b2101,b2102,b2103,b2104,b2105,b2106,b2107,b2108,b2109,b2110,bb2011,bb2012,bb2101,bb2102,bb2103,bb2104,bb2105,bb2106,bb2107,bb2108,bb2109,bb2110,c2011,c2101,c2103,c2105,c2107,c2109,cs2011,cs2101,cs2103,cs2105,cs2107,cs2109,eb2011,eb2012,eb2101,eb2102,eb2103,eb2104,eb2105,eb2106,eb2107,eb2108,eb2109,eb2110,eg2011,eg2012,eg2101,eg2102,eg2103,eg2104,eg2105,eg2106,eg2107,eg2108,eg2109,eg2110,fb2011,fb2012,fb2101,fb2102,fb2103,fb2104,fb2105,fb2106,fb2107,fb2108,fb2109,fb2110,i2011,i2012,i2101,i2102,i2103,i2104,i2105,i2106,i2107,i2108,i2109,i2110,j2011,j2012,j2101,j2102,j2103,j2104,j2105,j2106,j2107,j2108,j2109,j2110,jd2011,jd2012,jd2101,jd2102,jd2103,jd2104,jd2105,jd2106,jd2107,jd2108,jd2109,jd2110,jm2011,jm2012,jm2101,jm2102,jm2103,jm2104,jm2105,jm2106,jm2107,jm2108,jm2109,jm2110,l2011,l2012,l2101,l2102,l2103,l2104,l2105,l2106,l2107,l2108,l2109,l2110,m2011,m2012,m2101,m2103,m2105,m2107,m2108,m2109,p2011,p2012,p2101,p2102,p2103,p2104,p2105,p2106,p2107,p2108,p2109,p2110,pg2011,pg2012,pg2101,pg2102,pg2103,pg2104,pg2105,pg2106,pg2107,pg2108,pg2109,pg2110,pp2011,pp2012,pp2101,pp2102,pp2103,pp2104,pp2105,pp2106,pp2107,pp2108,pp2109,pp2110,rr2011,rr2012,rr2101,rr2102,rr2103,rr2104,rr2105,rr2106,rr2107,rr2108,rr2109,rr2110,v2011,v2012,v2101,v2102,v2103,v2104,v2105,v2106,v2107,v2108,v2109,v2110,y2011,y2012,y2101,y2103,y2105,y2107,y2108,y2109";
	public static String getProductFromContract(String contractCode) {
		String s = "[a-zA-Z]+";
		Pattern pattern = Pattern.compile(s);
		Matcher ma = pattern.matcher(contractCode);
		if (ma.find()){
			return ma.group();
		}else{
			return null;
		}
	}
	public static void main(String[] args) {
		/**
	     * 将所有的品种信息查询出来
	     */
		/*public Map<String,List<ProductBean>> getProductList() {*/
			Map<String,List<String>> productContractMap = new LinkedHashMap<String,List<String>>();
			Map<String,String> productRealSpell = new HashMap<String,String>();
			//将品种与合约进行分离  
			List<String> contracts = Arrays.asList(a.split(","));
			if(contracts!=null){
				for(String contract:contracts){
					String productCodeRel = getProductFromContract(contract);
					if(productCodeRel!=null){
						String productCode = productCodeRel.toUpperCase();
						if(productContractMap.containsKey(productCode)){
							productContractMap.get(productCode).add(contract);
						}else{
							List<String> list = new ArrayList<String>();
							productContractMap.put(productCode, list);
							//存储品种的真实大小写
							productRealSpell.put(productCode, productCodeRel);
						}
					}
				}
			}
			Map<String,List<ProductBean>> allProduct = new LinkedHashMap<String,List<ProductBean>>();
			
			//读取主力合约信息
			/*List<MainContract> mainContracts = baseDataDao.getNewlyMainContract();
			boolean hasIne = false;//是否有能源交易所的主力合约
			for(MainContract mc :mainContracts){
				if("INE".equals(mc.getExchange())||"XINE".equals(mc.getExchange())){
					hasIne = true;
				}
			}
			if(!hasIne){
				MainContract mc = new MainContract();
				mc.setProduct("SC");
				mc.setSecuid("");//上期所的品种的主力合约尚未抓取，所以先置空。
				mc.setExchange("INE");
				mainContracts.add(mc);
			}
			if(mainContracts!=null){
				ProductBean pb = null;
				//异常情况：主力合约缺少某个或者整个交易所的主力合约都没有
				for(MainContract mc:mainContracts){//缺少某个交易所的数据
					pb = new ProductBean();
					*//**
					 * 主力合约中的品种名均是大写，此处根据合约名显示真实大小写！
					 *//*
					pb.setPc(productRealSpell.get(mc.getProduct()));//设置品种代码
					pb.setCm(mc.getSecuid());//设置主力合约
					if(!StringUtils.isEmpty(mc.getProduct())){//设置中文名
						pb.setN(Contants.PRODUCT_CODE_CHINESE_NAME_MAP.get(mc.getProduct()));
						pb.setC(productContractMap.get(mc.getProduct()));
					}
					if(allProduct.containsKey(mc.getExchange())){
						allProduct.get(mc.getExchange()).add(pb);
					}else{
						List<ProductBean> list = new ArrayList<>();
						list.add(pb);
						allProduct.put(mc.getExchange(), list);
					}
				}
			}*/
			System.out.println( productContractMap);
		
	}
	
}
	class ProductBean {
		private String n;// 品种名
		private String pc;// 品种代码
		private String cm;// 主力合约
		private List<String> c;// 品种的所有合约信息

		public String getN() {
			return n;
		}

		public void setN(String n) {
			this.n = n;
		}

		public String getPc() {
			return pc;
		}

		public void setPc(String pc) {
			this.pc = pc;
		}

		public String getCm() {
			return cm;
		}

		public void setCm(String cm) {
			this.cm = cm;
		}

		public List<String> getC() {
			return c;
		}

		public void setC(List<String> c) {
			this.c = c;
		}

	}

