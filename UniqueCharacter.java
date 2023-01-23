class UniqueCharacter {
    public int firstUniqChar(String ch) {
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        int length=ch.length();
        for(int i=0;i<length;i++){
            System.out.println(ch.charAt(i));
            int value=count.getOrDefault(ch.charAt(i),0);
            count.put(ch.charAt(i),value+1);
        }
        for(int i=0;i<length;i++)
        {
            if(count.get(ch.charAt(i))<2)
                return i;
        }
      return -1;
    }    
}