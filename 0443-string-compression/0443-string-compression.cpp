class Solution {
public:
    int compress(vector<char>& chars) 
    {
        int len = chars.size();
        int i =0;
        int index = 0;
        while(i<len)
        {
            char curr = chars[i];
            int count =0;
            while(i<len && chars[i]==curr)
            {
                count++;
                i++;
            }
            chars[index] = curr;
            index++;
            if(count>1)
            {
                string num = to_string(count);
                for(char c : num)
                {
                    chars[index]=c;
                    index++;
                }
            }
        }
        return index;
    }
};