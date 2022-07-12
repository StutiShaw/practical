package com;
public class Animal {  
    void eat() {
		System.out.println("Eating"); }  
		}  
		class Tiger extends Animal{  
		void eat(){ 
	    System.out.println("Tiger eats meat"); }  
		}  
		class Rabbit extends Animal{ 
		void eat(){   
		System.out.println("Rabbit eats carrots"); }  
		}  
		class Frog extends Animal{
		void eat(){
		System.out.println("Frog eats grasshopper"); }  
		}  
		class Test {  
		public static void main(String[] args){  
       Animal tiger = new Animal();  
		tiger.eat();     
		Animal rabbit = new Animal();  
		rabbit.eat();  
		Animal frog = new Animal();  
		frog.eat();  
		}
	}