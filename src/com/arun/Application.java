package com.arun;

public class Application {
	public void process(String[] words){
		reverseCharacters(words);
		
		isMightyMouse(words);
	}

	private void isMightyMouse(String[] words) {
		//Test for two particular strings
		if(words.length==2){
			if(words[0].toLowerCase().equals("mighty") && words[1].toLowerCase().equals("mouse"))
				System.out.println("....here he comes to save the day");
		}
	}

	private void reverseCharacters(String[] words) {
		for(int i=0; i< words.length;i++){
			String argument="";
			//reverse the characters in each string
			for(int j=words[i].length();j>0;j--){
				argument += words[i].substring(j-1, j);
			}
			System.out.println(argument);
		}
	}
	
	public static void main(String[] args) {
		Application app = new Application();
//		app.process(new String[]{"Monsoon","Season"});
		app.process(new String[]{"mighty","mouse"});
	}
}
