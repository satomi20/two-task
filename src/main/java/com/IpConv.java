package com;

import java.net.UnknownHostException;

public class IpConv {

    public static long ipToInt(String ipAddress) throws Exception {
        String[] octets = ipAddress.split("\\.");
        long result = 0;
        if (octets.length == 4){
            for (int i = 0; i < octets.length; i++) {
                int oct = Integer.parseInt(octets[i]);
                int power = 3 - i;
                result += oct * Math.pow(256, power);
                }
            }
        else {
            throw new Exception("Ошибка введенных данных");
        }
        return result;
    }

    public static String intToIp(long ip) throws UnknownHostException {
        String ipStr =
                String.format("%d.%d.%d.%d",
                        (ip >> 24 & 0xff),
                        (ip >> 16 & 0xff),
                        (ip >> 8 & 0xff),
                        (ip & 0xff)
                        );
        return ipStr;
    }

    public static void main(String[] args) throws Exception {
        long c = IpConv.ipToInt("128.32.10.0");
        String adr = IpConv.intToIp(2149583360L);
        System.out.println(adr);
        System.out.println(c);
    }

}
