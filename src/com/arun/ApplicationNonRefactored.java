package com.arun;

public class ApplicationNonRefactored {
	public void process(String[] words){
		for(int i=0; i< words.length;i++){
			String argument="";
			//reverse the characters in each string
			for(int j=words[i].length();j>0;j--){
				argument += words[i].substring(j-1, j);
			}
			System.out.println(argument);
		}
		
		//Test for two particular strings
		if(words.length==2){
			if(words[0].toLowerCase().equals("mighty") && words[1].toLowerCase().equals("mouse"))
				System.out.println("....here he comes to save the day");
		}
	}
	
	public static void main(String[] args) {
		ApplicationNonRefactored app = new ApplicationNonRefactored();
//		app.process(new String[]{"Monsoon","Season"});
		app.process(new String[]{"mighty","mouse"});
	}
}
