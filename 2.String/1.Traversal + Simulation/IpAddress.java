public class IpAddress {

    public String defangIPaddr(String address) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {

            char ch = address.charAt(i);

            if (ch == '.') {
                ans.append("[.]");
            } 
            else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        IpAddress obj = new IpAddress();

        String address = "192.168.0.1";

        String result = obj.defangIPaddr(address);

        System.out.println(result);
    }
}