package com.irevest.common.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
/**
 * 获取站点数据信息
 * @author VULCAN
 *
 */
public class CityUtil {
	 public ArrayList<String> getCity() throws ClientProtocolException, IOException{
		 
		    ArrayList<String> list=new ArrayList();
	        String cityurl="https://kyfw.12306.cn/otn/resources/js/framework/station_name.js?station_version=1.9048";
	        
	        HttpGet httpget=new HttpGet(cityurl);
	        CloseableHttpClient httPclient=HttpClients.createDefault();
	        CloseableHttpResponse Response=httPclient.execute(httpget);
	        HttpEntity entity=Response.getEntity();
	        String result=EntityUtils.toString(entity,"utf-8");
	        //System.out.println("请求结果"+result);
	        int l1=result.indexOf("'");
	        int l2=result.length();
	        String city=result.substring(l1+1, l2);
	        String[] c=city.split("@");
	        for(int i=1;i<c.length;i++) {
	            String[] cc=c[i].split("[|]");
	            //System.out.println(cc[1]+"==="+cc[2]+"===="+cc[3]+"===="+cc[4]);
                list.add(cc[1]+"##"+cc[2]+"##"+cc[3]+"##"+cc[4]);
	        }
	        return list;
	    
	    }
}
