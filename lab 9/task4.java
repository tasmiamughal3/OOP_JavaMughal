class Task4{
    public static void countVowelandConsonants(String str){
        int vowel=0;
        int consonants=0;
        str=str.toLowerCase();

        for(int i=0;i<str.length();i++)
        {
            char letter=str.charAt(i);

            if((letter>='a' && letter<='z'))
            {
                if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
                {
                    vowel++;
                }
                else
                {
                    consonants++;
                }
            }
        }

        System.out.println("Total vowel: "+vowel);
        System.out.println("Total consonants: "+consonants);
    }

    public static void main(String []args){
        countVowelandConsonants("no more canal on indus river");
    }
}