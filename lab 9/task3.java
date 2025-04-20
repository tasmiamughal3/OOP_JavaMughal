class Task3{
    public static int longestUniqueSubstring(String str){
        String current="";
        int maxLength=0;
        String longest="";

        for(int i=0;i<str.length();i++)
        {
            char letter=str.charAt(i);

            if(current.contains(String.valueOf(letter)))
            {
                int index=current.indexOf(letter);
                current=current.substring(index+1);
            }
            current+=letter;
            if(current.length()>maxLength)
            {
                maxLength=current.length();
                longest=current;
            }
        }
        System.out.println("Longest : "+longest);
        return maxLength;
    }

    public static void main(String []args){
        String command="mywork";
        int output=longestUniqueSubstring(command);
        System.out.println("Longest substring no repeat = " + output);
    }
}