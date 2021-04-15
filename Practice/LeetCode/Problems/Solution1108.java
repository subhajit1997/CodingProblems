/*
1108. Defanging an IP Address
https://leetcode.com/problems/defanging-an-ip-address/

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
 */

class Solution1108
    public String defangIPaddr(String address) {
        char[] c=address.toCharArray();
        StringBuilder ab=new StringBuilder();
        for(int i=0;i<address.length();i++)
        {
            if(c[i]=='.')
            {
                ab.append("[.]");
            }else
            {
                ab.append(c[i]);
            }
        }
        return ab.toString();
    }
}