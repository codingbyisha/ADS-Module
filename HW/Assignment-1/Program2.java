import java.util.Arrays;

class Program2{
    public static void main(String args[]){
		
		Program2 p = new Program2();
		
		String str = "listen";
		String str1 = "silent";
		
        System.out.println("Are "+str+" and "+str1+" anagrams? "+p.Anagram(str, str1));
		
		String str2 = " Practice makes a man perfect ";
		
		p.longestWord(str2);
		
		p.consonantsAndVowels(str2);	
	}
	
	void consonantsAndVowels(String str2){
		
		str2 = str2.toLowerCase();
		str2 = str2.replace(' ','0');
		int i =0;
		int vowel = 0;
		int consonant = 0;
		
		while(i<str2.length()){
			char ch = str2.charAt(i);
			if(ch == 'a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				vowel+=1;
			}	
			else if(ch =='0'){
				i+=1;
				continue;
			}
			else{
				consonant+=1;
			}
				
		    
			i+=1;	
		}
		
        System.out.println("Vowels: "+vowel+" , Consonants: "+consonant);
		
	}
	
	void longestWord(String str2){
		
		String a[] = str2.split(" ");
		int l=0;
		int index = 0;
		int max = 0;
		String ch ="";
		for(int i = 0;i<a.length;i++){
			ch = a[i];
			l = ch.length();
			if(l>max){
				max=l;
				index = i;
			}		
		}
		System.out.println("Longest word: "+a[index]);
	}
	
	boolean Anagram(String str, String str1){
		
		if(str.length() != str1.length())
			return false;
		
		char a[] = str.toLowerCase().toCharArray();
		char a1[] = str1.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(a1);
		
		return Arrays.equals(a1,a);
		
			
		
	}
	
	
		

	
}