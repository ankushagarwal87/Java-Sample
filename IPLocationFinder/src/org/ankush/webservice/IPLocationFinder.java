package org.ankush.webservice;

import com.cdyne.ws.IP2Geo;
import com.cdyne.ws.IP2GeoSoap;
import com.cdyne.ws.IPInformation;

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("error");
		}
		else{
			String ipAddress = args[0];
			IP2Geo ip2Geo = new IP2Geo();
			IP2GeoSoap ip2GeoSoap = ip2Geo.getIP2GeoSoap();
			IPInformation iPInformation = ip2GeoSoap.resolveIP(ipAddress,"0");
			System.out.println(iPInformation.getCountry());
		}
	}

}
