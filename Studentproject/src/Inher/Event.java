package Inher;
class Event {
		  void start(){
			  System.out.println("Start Event");
		  }
		}
		class Sports extends Event {
		   void play() {
			   System.out.println("Play Sports");
		   }
		}
		class Hockey extends Sports{
			void show(){
				System.out.println("Show Hockey");
	         }
			  
		   public static void main(String[] args){
		      Hockey hockey = new Hockey();

		      hockey.start();
		      hockey.play();
		      hockey.show();
		   }
		}
		
