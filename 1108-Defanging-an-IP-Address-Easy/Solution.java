class Solution {
    public String defangIPaddr(String address) {
        String[] split = address.split("\\.");

        return split[0] + "[.]" + split[1] + "[.]" + split[2] + "[.]" + split[3];
        
    }
}