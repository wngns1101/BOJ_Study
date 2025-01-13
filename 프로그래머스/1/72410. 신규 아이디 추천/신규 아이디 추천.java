class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();

        StringBuilder filteredId = new StringBuilder();
        for (int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);

            if ((ch >= 'a' && ch <= 'z') ||  
                (ch >= '0' && ch <= '9') ||  
                ch == '-' || ch == '_' || ch == '.') {
                filteredId.append(ch);
            }
        }

        StringBuilder filter = new StringBuilder();
        int count = 0;
        for (int i=0; i<filteredId.length(); i++) {
            if (filteredId.charAt(i) == '.'){
                count++;
            } else {
                if (count != 0) {
                    filter.append('.');
                    count = 0;
                }
                filter.append(filteredId.charAt(i));
            }
        }
        
        if (filter.length() > 0 && filter.charAt(0) == '.') {
            filter.deleteCharAt(0);
        }
        
        if (filter.length() > 0 && filter.charAt(filter.length()-1) == '.') {
            filter.deleteCharAt(filter.length()-1);
        }
        
        if (filter.length() == 0) {
            filter.append('a');
        }
        
        if (filter.length() >= 16) {
            filter.delete(15, filter.length());
        }
        
        if (filter.length() > 0 && filter.charAt(filter.length()-1) == '.') {
            filter.deleteCharAt(filter.length()-1);
        }
        
        if (filter.length() <= 2) {
            while (filter.length() < 3) {
                filter.append(filter.charAt(filter.length()-1));
            }
        }
        
        return filter.toString();
    }
}