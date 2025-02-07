class Solution {
    public boolean isPalindrome(String s) {
         String newString = s.replaceAll(",","").replaceAll(" ","")
                .replaceAll(":","").replaceAll("\\.","").
                replaceAll("@","").replaceAll("#","").
                replaceAll("!","").replaceAll("_","").
                replaceAll("\"","").replaceAll("\\{","").
                replaceAll("\\[","").replaceAll("]","").
                replaceAll("}","").toLowerCase().replaceAll("'","").
                replaceAll("\\\\","").replaceAll("-","").
                replaceAll("\\?","").replaceAll(";","").
                replaceAll("\\(","").replaceAll("\\)","").
                replaceAll("`","").toLowerCase();


        StringBuilder cb = new StringBuilder();
        String result = cb.append(newString).reverse().toString();

        if(newString.equals(result)){
            return true;
        }

        return false;
    }
}